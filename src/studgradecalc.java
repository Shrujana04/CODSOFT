import java.util.*;
public class studgradecalc 
{
    public static void main(String[] args) 
    {
        int num,marks,total=0;
        double avgper;
        char grade;
        Scanner sc=new Scanner(System.in);
        System.out.println("-----------------Student Grade Calculator--------------");
        System.out.println("Enter number of subjects:");
        num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter marks of subject"+(i+1)+":");
            marks=sc.nextInt();
            total+=marks;
        }
        avgper=(double)total/num;
        if(avgper>=90)
        {
            grade='O';
        }
        else if(avgper>=80)
        {
            grade='A';
        }
        else if(avgper>=70)
        {
            grade='B';
        }
        else if(avgper>=60)
        {
            grade='C';
        }
        else if(avgper>=50)
        {
            grade='D';
        }
        else if(avgper>=40)
        {
            grade='E';
        }
        else
        {
            grade='F';
        }
        
        System.out.println("Total marks obtained is: "+total);
        System.out.println("Average percentage gained is: "+avgper);
        System.out.println("Grade: "+grade);
    }
}
