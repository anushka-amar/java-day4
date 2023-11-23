package employeewage;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {

    private static final int WAGE_PER_HR = 20;
    private static final int FULL_TIME_HR = 8;
    private static final int PART_TIME_HR = 4;

     public static void checkAtt(){
        Random random = new Random();
        int att = (random.nextInt(2));

        switch (att){
            case 0:
                System.out.println("Employee is present");
                break;

            case 1:
                System.out.println("Employee is absent");
                break;

            default:
                System.out.println("INVALID");
        }
    }

    public static int checkEmpType(){
         Random random = new Random();
         int emp_type = random.nextInt(2);

         switch (emp_type){
             case 0:
                 return 0;
             case 1:
                 return 1;
             default:
                 return -1;
         }

    }

    public static void daily_emp_wage(int emp_type){

         switch (emp_type){
             case 0:
                 System.out.println("Daily wage of part-time emp is: "+ PART_TIME_HR*WAGE_PER_HR);
                 break;
             case 1:
                 System.out.println("Daily wage of full-time emp is: "+ FULL_TIME_HR*WAGE_PER_HR);
                 break;
             default:
                 System.out.println("INVALID EMPLOYEE-TYPE");
         }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage calculator");

        checkAtt();
        int emp_type = checkEmpType();
        daily_emp_wage(emp_type);

    }
}