import java.util.Scanner;
public class timchuso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n%10 + " " + n/10);
    }
}

/*

TÌM CHỮ SỐ
Nhập vào một số nguyên a có 2 chữ số. Tìm chữ số hàng đơn vị và chữ số hàng chục của số nguyên a.
INPUT
1 số nguyên a (10 <= a <= 99)
OUTPUT
Chữ số hàng đơn vị và chữ số hàng chục trên một dòng, cách nhau bởi dấu cách.

 */
