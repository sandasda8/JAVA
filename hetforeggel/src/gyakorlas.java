public class gyakorlas {

    public static void main(String[] args){
        ex7(args);
        ex8(args);
        ex9(args);
        ex10(args);
        ex11(args);
        ex12(args);
      /*  System.out.println(ex1(args));
        ex2(args);
        ex3(args);
        System.out.println(ex5(args));
        ex6(args);
        ex7(args);
        System.out.println(addNumber(args));
        System.out.println(takeAwayNumber(args));
        System.out.println(mult(args)); */
    }
/*
    public static int addNumber(String[] args) {
        int x,y,s;

        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        return s=x+y;
    }
    public static int takeAwayNumber(String[] args) {
        int x,y,s;

        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        return s=x-y;
    }
    public static int mult(String[] args) {
        int x,y,s;

        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        return s=x*y;
    }
    public static int asd(String[] args) {
        int x,y,z;

        double x = (3.14);
        double y = (56.33);

        double z = x + y;
        System.out.println(z);
    }
    public static int ex1(String[] args) {
        int x,s;

        x=Integer.parseInt(args[0]);
        return s=x*2;
    }

    public static int ex2(String[] args) {
        int x,y,s,z;

        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        System.out.println(z=x*y);
        System.out.println(s=(x*2) + (y*2));
        return s=x*2+y*2;
    }
    public static int ex3(String[] args) {
        int x,y,u,s,z;

        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        u=Integer.parseInt(args[2]);
        System.out.println(z=x*y*u);
        System.out.println(s=(x*2) + (y*2) + (u*2));
        return s;
    }
    public static double ex5(String[] args) {
        int x;
        x=Integer.parseInt(args[1]);
        double area = (int) (Math.PI * (x * 2));
        double circumference = 2 * Math.PI * x;
        System.out.println(circumference);
        return (int) area;
    }
    public static double ex6(String[] args) {
        int x,y,u,s,z;

        x=Integer.parseInt(args[1]);
        y=Integer.parseInt(args[2]);
        u=Integer.parseInt(args[3]);
        System.out.println(s=x*y*u);
        return u;
    }*/
    public static double ex7(String[] args) {
        int x,y,z,v,f,a;

        x=Integer.parseInt(args[1]);
        y=Integer.parseInt(args[2]);
        z = x *2 * y;
        v = z/3;
        a = x*2 + (x+x * y) /2;
        System.out.println(a);
        System.out.println(v);
        return v;
    }
    public static double ex8(String[] args) {
    int x,y,v,a;
        x=Integer.parseInt(args[1]);
        y=Integer.parseInt(args[2]);
        a = (int) (x * 2 * Math.PI) + (int) (x * Math.PI * y);
        v = (int) (3.14 * x * 2 * y) / 3;
        System.out.println(a);
        System.out.println(v);
        return a;
    }
    public static double ex9(String[] args) {
        int a=Integer.parseInt(args[0]);
        double x = Math.sqrt(3);
        double f = a * x;
        double m = (Math.pow(a, 3) * Math.sqrt(2)) /12;
        System.out.println(f);
        System.out.println(m);
        return f;
    }
    public static double ex10(String[] args) {
        int a=Integer.parseInt(args[0]);
        double x = 6 * Math.pow(a, 2);
        double y = Math.pow(a, 3);
        System.out.println(x);
        System.out.println(y);
        return x;
    }
    public static double ex11(String[] args) {
        int a=Integer.parseInt(args[0]);
        double x = Math.pow(a, 2) * 2 * Math.sqrt(3);
        double y = (Math.pow(a, 3) * Math.sqrt(2) / 3);
        System.out.println(x);
        System.out.println(y);
        return x;
    }
    public static double ex12(String[] args) {
        int a=Integer.parseInt(args[0]);
        double x = Math.pow(a, 2) * 3 * (Math.sqrt(25 + 10 * Math.sqrt(5)));
        double y = (Math.pow(a, 3) * (15 + (7 * Math.sqrt(5)))) /4;
        System.out.println(x);
        System.out.println(y);
        return x;
    }
}



