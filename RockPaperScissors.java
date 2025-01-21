import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String args[]) {
        int computer;
        int user;
        String outcome="";
        int goAgain=1;
        Scanner keyboard=new Scanner(System.in);
        while(goAgain==1){
        computer=(int)(Math.random()*3)+1;
        System.out.println("Enter your choice, Rock=1 Paper=2 Scissors=3");
        user=keyboard.nextInt();
    
        if(user==computer){
            outcome="Draw";
        }
        else if (user==1){
            if(computer==2){
                outcome="Loss";
            }
            else if(computer==3){
                outcome="Win";
            }
        }
        else if (user==2){
            if(computer==1){
                outcome="Win";
            }
            else if(computer==3){
                outcome="Loss";
            }
        } 
        else if (user==3){
            if(computer==1){
                outcome="Loss";
            }
            else if(computer==2){
                outcome="Win";
            }
        }
        System.out.println(outcome);
        System.out.println("Go again? 1=Yes, 2=No");
        goAgain=keyboard.nextInt();
        }
    }
}