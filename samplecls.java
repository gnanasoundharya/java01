package soundharya;
class harya
{
    int radius;
    public double circle()
    {
        return 3.14*radius*radius;
    }
}

public class samplecls {
    public static void main(String[] args) {
        harya r=new harya();
        r.radius=34;
        System.out.println(r.circle());

    }
}
