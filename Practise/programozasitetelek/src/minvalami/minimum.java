package minvalami;

public class minimum {
    public static void main(String[] args){
        System.out.println(args);
        int[] nums = stringArrayToIntArray(args);
    }

    public static int[] stringArrayToIntArray(String[] args) {
        int[] szamok = new int [args.length];

        for (int i=0; i<args.length; i++){
            szamok[i] = Integer.parseInt(args[i]);
            System.out.println(args[i]);
        }
        return szamok;
    }
}
