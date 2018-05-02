
public class Container implements CustomIterable {
    private Object[] objects;
    private int capacity;
    private int size;

    public Container(int capacity) {
        this.capacity = capacity;
        size = 0;
        objects = new Object[capacity];
    }

    public void add(Object object) {
        if (size < capacity) {
            objects[size++] = object;
        } else {
            System.out.println("ArrayOutOfBounds, bitch!");
        }
    }

    public int size() {
        return size;
    }

    public Object getObject(int index) {
        if (index < size && index > -1) {
            return objects[index];
        } else {
            return "No result at this index! Get lost!";
        }

        /*
        if (index > 0 && index <= size) {
            return objects[index-1];
        } else {
            return "No result! Get lost!";
        }
        */
    }

    public class ContainerIterator implements CustomIterator {
        int pointer = -1;

        @Override
        public boolean hasNext() {
            return pointer < (size - 1);
        }

        @Override
        public Object next() {
            return objects[++pointer];
        }
    }

    @Override
    public CustomIterator getIterator() {
        return new ContainerIterator();
    }
}
