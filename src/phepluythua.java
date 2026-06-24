/*
Luỹ thừa:
- Math.pow(a,b) - Trả về double, số lớn có thể mất chính xác hoặc tràn
- BigInteger - Dùng cho số mũ lớn
 */
/*Math.pow(a,b)
VD:
- double kq = Math.pow(2,4) => kq = 16.(0);
- int kq = (int) Math.pow(2,4) => kq = 16;
 */
/*BigInteger
import java.math.BigInteger; - Khai báo thư viện
VD:
- BigInteger a = a.pow(2); => a = a^2;
 */
import java.util.Scanner;
import java.math.BigInteger;
public class phepluythua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        System.out.println(a.pow(2));
        System.out.println(a.pow(5));
    }
}

/*

Cho một số nguyên a, hãy tính B1 = a^2, B2 = a^5 và in kết quả ra màn hình.
Input
Một số nguyên a (|a| <= 10^9)
Output
Hai số nguyên lần lượt là kết quả của B1 và B2, mỗi số trên một dòng.

 */