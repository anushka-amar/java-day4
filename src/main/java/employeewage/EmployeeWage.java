package employeewage;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage calculator");

        Company company1 = new Company("walmart", 20, 8, 4, 100,20);
        EmpWageBuilder builder1 = new EmpWageBuilder(company1);
        builder1.monthly_wages();


        Company company2 = new Company("cred", 40, 8, 6, 80,25);
        EmpWageBuilder builder2 = new EmpWageBuilder(company2);
        builder2.monthly_wages();



    }
}