public class Main {
    public static void main(String args){
        long n=10;
        long first=0;
        long second=1;
        long next;

        for(int i = 0; i < n; i++) {
            if ( i<= 1) {
                next = i;
            } else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next);
        }
    }
}
