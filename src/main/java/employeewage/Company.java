package employeewage;

import java.util.Random;

public class Company {
    private String companyName;
    private int wagePerHour;
    private int fullTimeHours;
    private int partTimeHours;
    private int maxWorkingHours;
    private int workingDaysPerMonth;

    public Company(String companyName, int wagePerHour, int fullTimeHours, int partTimeHours, int maxWorkingHours, int workingDaysPerMonth) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.fullTimeHours = fullTimeHours;
        this.partTimeHours = partTimeHours;
        this.maxWorkingHours = maxWorkingHours;
        this.workingDaysPerMonth = workingDaysPerMonth;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getFullTimeHours() {
        return fullTimeHours;
    }

    public int getPartTimeHours() {
        return partTimeHours;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public int getWorkingDaysPerMonth() {
        return workingDaysPerMonth;
    }


    public void checkAtt(){
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
}
