package String;

import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b =  sc.nextInt();

        if (a>=100 && a<1000 && b>=100 && b<1000 && a!=b) {
            int aSet = a/100 + (a%100)/10*10 + (a%10)*100;
            int bSet = b/100 + (b%100)/10*10 + (b%10)*100;
            if (aSet>bSet) {
                System.out.println(aSet);
            } else {
                System.out.println(bSet);
            }
        }
    }
}
