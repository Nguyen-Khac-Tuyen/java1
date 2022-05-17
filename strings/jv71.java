import java.util.Scanner;

public class jv71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int answer = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                /*
                 * Gọi lệnh break để dừng vòng lặp do đã tìm thấy vị trí đầu tiên mà ký tự c
                 * xuất hiện. Nếu không có lệnh break thì kết quả của chương trình sẽ là vị trí
                 * cuối cùng mà ký tự c xuất hiện.
                 */
                answer = i;
                break;
            }
        }
        System.out.print(answer);
    }
}