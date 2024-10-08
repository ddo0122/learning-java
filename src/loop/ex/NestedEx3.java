package loop.ex;

public class NestedEx3 {
    public static void main(String[] args) {
        int row = 5;
        int space = row/2;

        for (int i = 1; i <= row; i += 2) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space = space - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
