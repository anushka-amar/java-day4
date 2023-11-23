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

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparision Computation Program");
        LineComparision l1 = new LineComparision("line1",1,2,5,6);
        double line1 = calc_length(l1);
        System.out.println(line1);
    }
}
