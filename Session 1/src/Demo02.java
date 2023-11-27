import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        // Khởi tạo đỗi tượng scanner để
        Scanner scanner = new Scanner(System.in);
        // Nhập tên của bạn từ bàn phím in ra màn hình console chào tên của bạn
        String fullName;
        System.out.println("Mời bạn nhập vào họ và tên: ");
        fullName = scanner.nextLine();
        System.out.println("Xin chào "+ fullName + " đến với RA");

        // Nhập xuất với kiểu dữ liê int
        System.out.println("Mời bạn nhập vào tuổi");
        int age = scanner.nextInt();
        System.out.println("Năm sinh của bạn là: " + (2023-age));

        // Nhập xuất với kiểu float
        System.out.println("Mời bạn nhập vào chiều cao");
        float height = scanner.nextFloat();
        System.out.println("Chiều cao của bạn là: " + height);

    }
}
