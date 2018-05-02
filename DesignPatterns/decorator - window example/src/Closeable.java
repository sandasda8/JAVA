
public class Closeable extends WindowDecorator {
    public Closeable(Window window) {
        super(window);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Now closeable.");
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Now closeable.");
    }

    public void close() {
        System.out.println("Window closed.");
    }
}
