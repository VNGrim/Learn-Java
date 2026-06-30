import java.util.Scanner;
public class chiatao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int hs = sc.nextInt();
        System.out.print(t/hs + " " + (t-(t/hs)*hs));
    }
}

/*

CHIA TÁO
Cho số học sinh của một lớp (HS) và số táo trong rổ (T). Hãy chia đều số táo cho tất cả học sinh trong lớp. Hỏi mỗi bạn sẽ được bao nhiêu quả táo? Còn dư lại bao nhiêu quả?
Input

Hai số nguyên trên một dòng, cách nhau bởi dấu cách theo thứ tự là T và HS (0 < T, HS < 10^9).
Output

Là số táo mỗi học sinh được chia và số táo còn dư trên cùng một dòng, cách nhau bởi dấu cách.

 */
