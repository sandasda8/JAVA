
public abstract class WindowDecorator implements Window {
    protected Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }

    @Override
    public void open() {
        window.open();
    }

    @Override
    public void render() {
        window.render();
    }
}
