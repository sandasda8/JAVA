
public class Main {

    public static void main(String[] args){
        /*int index = 0;
        while (true && index <= 30) {
            System.out.println(asd1(index));
            index++;
        }*/
        asd(20000);
        //System.out.println(asd2(20));
    }

    static void asd(int a)  {
        long first=0;
        long second=1;
        long next;

        for(int i = 0; i < a; i++) {
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

    public static long asd1 (int n)
    {
        if (n == 0) {
            return 0;
        }
        if (n<= 2) {
            return 1;
        } else {

            long fibTerm = asd1(n - 1) + asd1(n - 2);
            return fibTerm;

        }
    }

    public static long asd2 (int n) {
            long[] answer = new long[n];
            answer[0] = 0;
            answer[1] = 1;
            for (int i = 2; i < answer.length; i++ ) {
                answer[i] = answer[i - 1] + answer[i - 2];
            }
            return answer[n - 1];
    }

    //
}
