package utube;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int myNum = (int)(Math.random()*100);
       int userNum;
       do {
           System.out.print("Enter num (1-100): ");
           userNum = sc.nextInt();
           if(myNum == userNum) {
               System.out.println("WOHOHO....CORRECT ANS");
               break;
           }
               else if(myNum>userNum)
           {
               System.out.println("Your name is too short");
           }
               else
           {
               System.out.println("Your num is too long");
           }

       }while(userNum>=0);

        System.out.println("My num was : "+myNum);


    }
}
