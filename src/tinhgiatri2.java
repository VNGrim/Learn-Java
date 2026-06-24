import java.util.Scanner;
public class tinhgiatri2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double kq1 = (double) ((21*Math.pow(a,2)) + (5*Math.pow(b,2))) / ((2009*Math.pow(c,2)) + 15);
        double kq2 = (double) (Math.sqrt(Math.pow(a,2) - 2*b)) / ((3*Math.pow(c,2)) + 4);
        System.out.print(String.format("%.4f",kq1) + " " + String.format("%.4f",kq2));
    }
}

/*

Cho ba số nguyên a, b và c hãy tính các biểu thức:
P = (21*a^2 + 5*b^2) / (2009*c^2 + 15)
Q = (sqrt(a^2 - 2b)) / (3*c^2 + 4)
Input
Ba số nguyên a, b, c (|a|,|b|,|c| <= 10^9) trên cùng một dòng, cách nhau bởi dấu cách.
Output
P và Q trên một dòng, cách nhau bởi dấu cách, có bốn chữ số thập phân.

 */