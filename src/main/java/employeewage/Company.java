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

}
