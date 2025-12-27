import java.util.Scanner;
public class exam_score 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your marks in English:");
        double eng = obj.nextDouble();
        System.out.println("Enter your marks in Maths:");
        double mat = obj.nextDouble();
        System.out.println("Enter your marks in Chemistry:");
        double che = obj.nextDouble();
        System.out.println("Enter your marks in Physics:");
        double phy = obj.nextDouble();
        System.out.println("Enter your marks in Computer science:");
        double sc = obj.nextDouble();
        double final_score = (eng+mat+che+phy+sc)/5;
        System.out.println("the average score you got is "+final_score);

    }    
}
