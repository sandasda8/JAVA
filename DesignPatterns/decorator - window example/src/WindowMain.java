
public class WindowMain {
    public static void main(String[] args) {
        Window w = new HorizontalScroll(new VerticalScroll(new BasicWindow()));
        w.render();
    }

}
