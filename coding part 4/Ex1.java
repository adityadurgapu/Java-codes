import java.util.Scanner;

class student 
{
    String name; 
    int marks;
    student(){}
        void display()
    {
        System.out.println("Student name: " + name);
        System.out.println("Marks: "+marks);
    }
}

class Ex1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int size = scanner.nextInt(); 
        scanner.nextLine();

        student[] students = new student[size];
        
        for(int i = 0; i<size ; i++) 
        {
            students[i] = new student();

            System.out.println("Enter the name of the student "+(i+1)+" : ");
            students[i].name = scanner.nextLine();

            System.out.println("Enter the marks of the student "+(i+1)+" :");
            students[i].marks = scanner.nextInt();
            scanner.nextLine();

            students[i].display();
        }
    }
}