package linecomparision;


import java.text.DecimalFormat;

public class LineComparision {

    private double x1,y1,x2,y2;
    private String L_name;

    public LineComparision(String L_name, double x1, double y1, double x2, double y2){
        this.L_name = L_name;
        this.x1 = x1;
        this.y1 = x2;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static double calc_length(LineComparision l){

        DecimalFormat df = new DecimalFormat("#.##");
        double result = Math.sqrt(Math.pow((l.x2-l.x1), 2) - Math.pow((l.y2-l.y1),2));
        return Double.parseDouble(df.format(result));
    }

    public static void equality(double line1, double line2){

        Double l1 = Double.valueOf(line1);
        Double l2 = Double.valueOf(line2);

        boolean res = l1.equals(l2);

       String message = res ? "lines are equal" : "lines are unequal";
        System.out.println("message");
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        LineComparision l1 = new LineComparision("line1",1,2,5,6);
        LineComparision l2 = new LineComparision("line2",3,4,8,9);

        double line1 = calc_length(l1);
        double line2 = calc_length(l2);
        System.out.println("Length of line1 is: " +line1);
        System.out.println("Length of line2 is: " +line2);

        equality(line1, line2);

    }
}
