import java.util.Scanner;
public class nghichdao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double kq = (double) 1/a;
        System.out.println(String.format("%.5f", kq));
    }
}


/*

Cho một số thực a, hãy tính B = 1/a và in kết quả ra màn hình với năm chữ số thập phân.

 */