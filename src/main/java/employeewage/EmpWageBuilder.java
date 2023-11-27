package employeewage;

import java.util.Random;

public class EmpWageBuilder {
    private Company company;

    public EmpWageBuilder(Company company) {
        this.company = company;
        checkAtt();
    }

    public void checkAtt(){
        Random random = new Random();
        int att = (random.nextInt(2));

        switch (att){
            case 0:
                System.out.println("Employee at "+company.getCompanyName() +"s present");
                break;

            case 1:
                System.out.println("Employee"+company.getCompanyName() +"is absent");
                break;

            default:
                System.out.println("INVALID");
        }
    }

    public int checkEmpType(){
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


    public int daily_emp_wage(int emp_type){
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

    public void monthly_wages(){
        int total_working_days = 0, total_work_hr=0, dailyWage = 0, total_monthly_wage=0;
        int emp_type = checkEmpType();
        while (total_working_days<company.getWorkingDaysPerMonth() ){

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
            total_work_hr += (emp_type == 0) ? company.getPartTimeHours() : company.getFullTimeHours();


            total_monthly_wage += dailyWage;
            total_working_days++;
        }

        String msg = (emp_type == 0) ? ("monthly wage of part-time emp at "+ company.getCompanyName()+ " is " + total_monthly_wage) :
                ("monthly wage of full-time emp is at " +company.getCompanyName()+" is "+ total_monthly_wage);
        System.out.println(msg);
    }
}
