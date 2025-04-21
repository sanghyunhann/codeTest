import java.util.Scanner;

public class Solution01_PCCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        int quota = sum_angle / 360;
        System.out.println(sum_angle - 360 * (sum_angle / 360));
    }
}
