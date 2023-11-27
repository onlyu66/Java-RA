package ra;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args){
        // Khai báo biến kiểu dữ liệu hay dùng, nhập xuất
        Scanner scanner = new Scanner(System.in);



        // Nhập xuất với kiểu dữ liê int
        System.out.println("Mời bạn nhập vào tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Năm sinh của bạn là: " + (2023-age));

        // Nhập xuất với kiểu float
        System.out.println("Mời bạn nhập vào chiều cao");
        float height = Float.parseFloat(scanner.nextLine());
        System.out.println("Chiều cao của bạn là: " + height);

        String fullName;
        System.out.println("Mời bạn nhập vào họ và tên: ");
        fullName = scanner.nextLine();
        System.out.println("Xin chào "+ fullName + " đến với RA");
    }
}
