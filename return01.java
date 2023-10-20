package soundharya;

public class return01 {
    public static int add(int a, int b) {
        int c=a+b;
        return c;
            }
    public static int sub(int a, int b) {
        int d=a-b;
        return d;}

    public  int sub(int x, int y, int z,int t) {
        int s=x-y-z-t;
        return s;
    }

    public static int mul(int p, int q) {
        int w=p*q;
        return w;
    }

    public static void main(String[] args) {
        int i=add(20,67);
        int j=sub(90,45);
        return01 obj=new return01();
        obj.sub(34,45,78,59);
        int m=mul(67,35);
        System.out.println(i);
        System.out.println(j);
        System.out.println(m);
    }
}
