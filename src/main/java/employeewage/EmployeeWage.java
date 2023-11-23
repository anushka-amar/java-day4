package employeewage;

import java.util.Scanner;

public class EmployeeWage {
    private String name;
    private int age;

    public EmployeeWage(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printEmpDetails(){
        System.out.println("Name: "+name+", Age: "+age);
    }
    public static void main(String[] args) {

        System.out.println("Welcome to employeeWage calculator");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name and age");
        String name = sc.nextLine();
        int age = sc.nextInt();
        EmployeeWage emp = new EmployeeWage(name, age);
        emp.printEmpDetails();
    }
}