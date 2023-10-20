package soundharya;

public class reverse {
    public static void main(String[] args) {
        String str ="hello";
        String reversedStr="hello";
        StringBuffer br=new StringBuffer(str);
        System.out.println("Reverse of given String:"+reversedStr);
        br.reverse();
        String data= br.toString();
        if (str.equals(data))
        {
            System.out.println("The String is a Palindrome");
        } else {
            System.out.println("The String is not a Palindrome");
        }


    }
}
