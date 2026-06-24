import java.util.Scanner;
public class tinhgiatri {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int kq1 = (21*a) + (5*b) - 2009;
        double kq2 = (double) ((21*Math.pow(a,2)) - (5*b)) / (2009*Math.pow(b,2));
        double kq3 = (double) ((21*a) + (5*Math.pow(b,2))) / ((2009*b) + 15);
        System.out.print(kq1+ " ");
        System.out.println(String.format("%.4f",kq2));
        System.out.println(String.format("%.6f", kq3));
    }
}

/*

Cho hai số nguyên a và b, hãy tính các biểu thức:
P = 21a + 5b - 2009
Q = (21*a^2 - 5b) / (2009*b^2)
R = (21a + 5*b^2) / (2009b + 15)
Input
Hai số nguyên a, b (|a|, |b| <= 10^9), mỗi số một dòng.
Output
Dòng một là P và Q, cách nhau bởi dấu cách, Q có bốn chữ số thập phân.
Dòng hai là R, có sáu chữ số thập phân.

 */
