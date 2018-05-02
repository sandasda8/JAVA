
public class BasicWindow implements Window {

    @Override
    public void open() {
        System.out.println("Opened.");
    }

    @Override
    public void render() {
        System.out.println("Rendered.");
    }
}
