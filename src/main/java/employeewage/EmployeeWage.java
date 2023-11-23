package employeewage;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {


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

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage calculator");

        checkAtt();
    }
}