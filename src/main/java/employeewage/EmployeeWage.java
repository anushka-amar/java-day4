package employeewage;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {

    private static final int WAGE_PER_HR = 20;
    private static final int FULL_TIME_HR = 8;
    private static final int PART_TIME_HR = 4;
    private static final int MAX_WORKING_HRS = 100;
    private static final int WORKING_DAYS_PER_MONTH = 20;


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

    public static int daily_emp_wage(int emp_type){

         switch (emp_type){
             case 0:
                 int d_wage = PART_TIME_HR*WAGE_PER_HR;
                 return d_wage;
             case 1:
                 d_wage = FULL_TIME_HR*WAGE_PER_HR;
                 return d_wage;
             default:
                 System.out.println("INVALID EMPLOYEE-TYPE");
                 return -1;
         }
    }

    public static void monthly_wages(int emp_type){
         int total_working_days = 0, total_work_hr=0, dailyWage = 0, total_monthly_wage=0;
         while (total_working_days<WORKING_DAYS_PER_MONTH ){


             switch (emp_type){
                 case 0:
                     dailyWage = daily_emp_wage(emp_type);
                     break;
                 case 1:
                     dailyWage = daily_emp_wage(emp_type);
                     break;
                 default:
                     System.out.println("INVALID emp_type");
             }
             total_work_hr += (emp_type == 0) ? PART_TIME_HR : FULL_TIME_HR;
             if(total_work_hr>MAX_WORKING_HRS){
                 total_work_hr -= FULL_TIME_HR;
                 break;
             }

             total_monthly_wage += dailyWage;
             total_working_days++;
         }

        System.out.println("work hr is "+ total_work_hr);

        String msg = (emp_type == 0) ? ("monthly wage of part-time emp is " + total_monthly_wage) :
                ("monthly wage of full-time emp is " + total_monthly_wage);
        System.out.println(msg);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage calculator");

        checkAtt();
        int emp_type = checkEmpType();
        int d_wage = daily_emp_wage(emp_type);
        String msg = (emp_type == 0) ? ("daily wage of part-time emp is " + d_wage) :
                ("daily wage of full-time emp is " + d_wage);
        System.out.println(msg);
        monthly_wages(emp_type);

    }
}