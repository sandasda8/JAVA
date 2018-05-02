
public class VerticalScroll extends WindowDecorator {
    public VerticalScroll(Window window) {
        super(window);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("with Vertical scrollbar");
    }

    @Override
    public void render() {
        super.render();
        System.out.println("with Vertical scrollbar");
    }
}
