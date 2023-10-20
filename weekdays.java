package soundharya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class weekdays {
    public static void main(String[] args) throws IOException {
            int a;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the digit:");
            a=Integer.parseInt(br.readLine());
            switch (a){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("Thrusday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("satday");
                    break;
                default:
                    System.out.println("invalid digit");

            }



    }
}
