class Employee {
    int id;
    String name;
    double salary;

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("");
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 101;
        emp1.name = "Aditya";
        emp1.salary = 50000.0;

        Employee emp2 = new Employee();
        emp2.id = 102;
        emp2.name = "Priya";
        emp2.salary = 60000.0;

        emp1.display();
        emp2.display();
    }
}