// filepath: e:\MCA Pre\PW\PW\Practice\Pattern\InvertedRightAngledTriangle.java
// package Pattern;

public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}