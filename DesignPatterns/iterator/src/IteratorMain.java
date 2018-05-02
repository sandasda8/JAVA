
public class IteratorMain {
    public static void main(String[] args) {
        Container myContainer = new Container(7);
        myContainer.add(1);
        myContainer.add(5);
        myContainer.add(6);
        myContainer.add(3);
        myContainer.add("kiskutya");
        myContainer.add(3.6);
        myContainer.add(null);

        CustomIterator iterator = myContainer.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
