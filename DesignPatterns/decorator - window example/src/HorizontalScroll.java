
public class HorizontalScroll extends WindowDecorator {

    public HorizontalScroll(Window window) {
        super(window);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("with Horizontal scrollbar.");
    }

    @Override
    public void render() {
        super.render();
        System.out.println("with Horizontal scrollbar.");
    }
}
