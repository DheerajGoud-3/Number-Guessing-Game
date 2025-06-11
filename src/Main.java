import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int myNum = (int)(Math.random()*100);
        int userNum = 0;

        do{
            System.out.println("Guess my number (1-100):");
            userNum = sc.nextInt();

            if (userNum == myNum){
                System.out.println("WOOHOO!!! YOU GOT THE CORRECT NUMBER");
                break;
            }

            else if(userNum > myNum){
                System.out.println("Your num is too large");
            }

            else {
                System.out.println("Your num is too small");
                }

        } while (userNum>=0);

        System.out.print("My Num is: ");
        System.out.println(myNum);

    }
}