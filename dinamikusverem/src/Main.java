public class Main {
    public static void main(String[] args) {
        DynamicStack dynamic = new DynamicStack();
        dynamic.push(1);
        dynamic.push(2);
        dynamic.push(3);
        dynamic.push(4);
        dynamic.push(5);
        dynamic.push(6);
        dynamic.push(7);
        dynamic.push(8);
        dynamic.push(9);
        System.out.println(dynamic.getSize());
        System.out.println(dynamic.toString());
        dynamic.pop();
        System.out.println(dynamic.getSize());
        System.out.println(dynamic.isEmpty());
        System.out.println(dynamic.getSize());
        System.out.println(dynamic.toString());
    }
}
