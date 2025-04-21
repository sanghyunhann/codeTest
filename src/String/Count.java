package String;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            String[] strings;
            strings = str.split(" ");
            System.out.println(strings.length);

        }
    }
}