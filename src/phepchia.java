import java.util.Scanner;
public class phepchia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println(String.format("%.2f", a / 3)); //String.format: Giới hạn số chữ số thập phân
    }
}

/*

Cho một số nguyên a, hãy tính B = a / 3 và in kết quả ra màn hình.

 */