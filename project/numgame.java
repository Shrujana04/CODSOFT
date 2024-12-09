import java.util.*;
public class numgame 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int chances=8;
       double final_score=0;
       int max,min;
       boolean play_again=true;
       boolean guessres=false;
       System.out.println("Hey welcome to number game!!");
       while(play_again)
       {
           int random_num=getrand(1,100);
           //boolean guessres=false;
           for(int i=0;i<chances;i++)
           {
               System.out.println("chance"+(i+1)+": enter your guess number:");
               int userinput=sc.nextInt();
               if(userinput==random_num)
               {
                   guessres=true;
                   System.out.println("Hurray your guess is correct!!");
                   final_score++;
                   break;
               }
               else if(userinput>random_num)
                {
                    System.out.println("your input is too high");
                }
               else
               {
                   System.out.println("your input is too low");
               }   
           }
       
           if(guessres==false)
           {
               System.out.println("you lost!! Try again");
               System.out.println("The random number is:"+random_num);
           }
           System.out.println("Do you want to play again(Y/N):");
           String choice=sc.next();
           play_again=choice.equalsIgnoreCase("y");
           
       }
        System.out.printf("your Final score is :%.2f",final_score); 
        System.out.println(" ");
        System.out.println("Thanks for playing!");
       
             sc.close();
             System.exit(0);
          
      
    }
      public static int getrand(int min,int max)
      {
          return (int)(Math.random()*(max-min+1)+min);
      }
}
