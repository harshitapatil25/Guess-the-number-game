import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //Guess the number game
        
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber;
        do{
            System.out.println("Guess myNumber (1-100) : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("WOOHOO .. CORRECT NUMBER!!!");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Your number is too larg");
            }
            else{
                System.out.println("Your number is too small");
            }
        }while(userNumber >= 0);
        System.out.printf("My number was : ");
        System.out.println(myNumber);
    }
}