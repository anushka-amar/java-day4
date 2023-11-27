package employeewage;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {
    public static int daily_emp_wage(int emp_type, Company company){
         int pwage=0, fwage=0;
         switch (emp_type){
             case 0:
                pwage= company.getPartTimeHours()*company.getWagePerHour();
                 return pwage;
             case 1:
                fwage= company.getFullTimeHours()*company.getWagePerHour();
                 return fwage;
             default:
                 System.out.println("INVALID EMPLOYEE-TYPE");
                 return -1;
         }
    }

    public static void monthly_wages(int emp_type, Company company){
         int total_working_days = 0, total_work_hr=0, dailyWage = 0, total_monthly_wage=0;
         while (total_working_days<company.getWorkingDaysPerMonth() ){


             switch (emp_type){
                 case 0:
                     dailyWage = daily_emp_wage(emp_type, company);
                     break;
                 case 1:
                     dailyWage = daily_emp_wage(emp_type, company);
                     break;
                 default:
                     System.out.println("INVALID emp_type");
             }
             total_work_hr += (emp_type == 0) ? company.getPartTimeHours() : company.getFullTimeHours();


             total_monthly_wage += dailyWage;
             total_working_days++;
         }

        String msg = (emp_type == 0) ? ("monthly wage of part-time emp at "+ company.getCompanyName()+ " is " + total_monthly_wage) :
                ("monthly wage of full-time emp is at " +company.getCompanyName()+" is "+ total_monthly_wage);
        System.out.println(msg);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage calculator");

        Company company1 = new Company("walmart", 20, 8, 4, 100,20);

        company1.checkAtt();
        daily_emp_wage(company1.checkEmpType(), company1);
        monthly_wages(company1.checkEmpType(), company1);

        Company company2 = new Company("cred", 40, 8, 6, 80,25);


    }
}