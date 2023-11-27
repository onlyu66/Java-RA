package exercises;

import java.util.Scanner;

public class inHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============MENU===========");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Hãy chọn lựa chọn của bạn: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Nhập chiều dài: ");
                int cd = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập chiều rộng: ");
                int cr = Integer.parseInt(sc.nextLine());
                for (int j = 1; j <= cr; j++) {
                    for (int i = 1; i <= cd; i++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                // break;
            default:
                break;
        }
    }
}
