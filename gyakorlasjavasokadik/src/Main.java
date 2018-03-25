public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(divide(2, 0));
        } catch (OneException oneExeptions) {
            //oneException.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Stack stack = new Stack (3);

    }
    public static float divide (int a, int b) throws OneException {
        if(b == 0){
            throw new OneException("valami uzenet");
        }
        return a / b;
    }


}
