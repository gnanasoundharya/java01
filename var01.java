package soundharya;
class veera {
    public int mul(int ...arr)
    {
        int m= 1;
        for(int a:arr)
            m=m*a;
        return m;

    }


}
public class var01 {
    public static void main(String[] args) {
        veera v=new veera();
        int multi=v.mul(2,34,4);
        System.out.println(multi);
  }

}
