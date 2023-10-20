package soundharya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sound {
    public static void main(String[] args) throws IOException {
        int c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your age:");
        c=Integer.parseInt(br.readLine());
        switch (c){
            case 18:
                System.out.println("you have applied for driving license");
                break;
            case 25:
                System.out.println("you have passed out your university");
                break;
            case 60:
                System.out.println("you have taken retirement");
                break;
            default:
                System.out.println("wrong age provided");

        }


    }



}
