import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
       /* String s1="java";
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);
        String s3=new String("example");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        String as1 = new String("prasad");
        String as2 = new String ("kharkar");
        as1.concat(as2);
        System.out.println(as2);
        String s1="Java";
        String s2="jaga";
        String s3="vava";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
        String s = 50+30+"Sachin"+30+30;
        System.out.println(s);
        System.out.println(Character.isUpperCase(s1.charAt(0)));
        System.out.println(Character.isUpperCase(s1.charAt(s1.length()-1)));

        String str = new String ("hello javapoint how r u");
        char[] ezlesz = new char [16];
            str.getChars(0, 16, ezlesz, 0);
            System.out.println(ezlesz);
        int index = str.indexOf("j");
        str.getChars(index, index + 10, ezlesz, 0);
        System.out.println(ezlesz);

        String number = new String("bla bla bla 446-363 bla bla bla");
        String replaceString = number.replaceAll("[0-9]","phoneNumber");
        System.out.println(replaceString);

        String Str = new String("Welcome to Tutorialspoint.com");

        System.out.print("Return Value :" );
        System.out.println(Str.substring(10) );
*/

    }

    public static Integer search (String string, Character character) {
        int index = 0;
        int counter = 0;
        while(string.indexOf(character, index) < -1) {
            index = string.indexOf(character, index) + 1;
            counter++;
        }
        return counter;
    }

}

