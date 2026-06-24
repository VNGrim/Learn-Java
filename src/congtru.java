import java.util.Scanner;
public class congtru {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        System.out.print(a + b - c);
    }
}

/*

A + B - C
Cho ba số nguyên a, b, c, hãy tính a + b - c và in kết quả ra màn hình.
Input
Dòng một: Một số nguyên a.
Dòng hai: Hai số nguyên b và c, cách nhau bởi một dấu cách.
Với -10 <= a,b,c <= 10.
Output
Một số nguyên duy nhất là kết quả của a + b - c

*/