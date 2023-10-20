package soundharya;
class jani {
    public int mul(int... arr) {
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            a = a * arr[i];
        }
        {
            return a;
        }
    }
}

public class var02 {
    public static void main(String[] args) {
        jani j=new jani();
        int mul=j.mul(2,4,6,7,3);
        System.out.println(mul);
    }
}
