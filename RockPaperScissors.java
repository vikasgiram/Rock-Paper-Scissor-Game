
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random ran= new Random();
        int com, usr,cs=0,us=0;

        for(int i=0;i<5;i++){

            /* Menu of the Game */

            System.out.println("*******************");
            System.out.println("Choose One Opashion:\n0:for Paper\n1:for Rock\n2:for Scissor \n3:for Exit");
            usr=sc.nextInt();
            System.out.println("*******************");

            /* Cheak What is Entered By User */

            if(usr>4)
                System.out.println("Envalid Choice");
            else if(usr==3)
                break;
            else{
                com=ran.nextInt(3); // This is Randam Class Object which is use to Generate Random Number Bitween 0 to 2

                /* Switch Case to Compare User Input and Computer Input */

                switch(usr){
                    /* If user Enter 0 Then Check What is Computer Choice 
                    if User Won User Score are Increases by one or
                    Computer Won then Computer Sxore are Increases By one 
                    If both chouse same opection then no one will won 
                    then game is drow and not increases anyone Score */
                    case 0->{
                        System.out.println("You Chouse Paper");
                        if(com==1){
                            System.out.println("Computer Chouse Rock");
                            System.out.println("Your Won");
                            us++;
                        } 
                        else if(com==2){
                            System.out.println("Computer Chouse Scissor");
                            cs++;
                            System.out.println("Your Lose");
                        }
                        else{
                            System.out.println("Computer Also chouse Paper");
                            System.out.println("Drow");
                        }  
                    }
                    case 1->{
                        System.out.println("You Chouse Rock");
                        if(com==0){
                            System.out.println("Computer Chouse Paper");
                            cs++;
                            System.out.println("You Lose");
                        }   
                        else if(com==2){
                            System.out.println("Computer Chouse Scissor ");
                            us++;
                            System.out.println("You Won");
                        }
                        else{
                            System.out.println("Computer also Choise Rock");
                            System.out.println("Drow");
                        }
                    }
                    case 2->{
                        System.out.println("You Chouse Scissor");
                        if(com==0){
                            System.out.println("Computer Chouse Paper");
                            us++;
                            System.out.println("You Won");
                        }
                        else if(com==1){
                            System.out.println("Computer Chouse Rock");
                            cs++;
                            System.out.println("You Lose");
                        }      
                        else{
                            System.out.println("Computer also Chouse Scissor");
                            System.out.println("Drow");
                        }
                    }
                }
            }
            
        }
        /* It Cheak User Score and Computer Score And Print Final Result */
        if(us>cs)
            System.out.println("-------------------------\nFinal Result\nCongress You won\n-------------------------");
        else  
            System.out.println("-------------------------\nFinal Result\nSorry you are Lose\n-------------------------");
        sc.close();
        
    }
    
}
