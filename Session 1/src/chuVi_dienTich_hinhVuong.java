import java.util.Scanner;

public class chuVi_dienTich_hinhVuong {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh hình vuông");
        float a = scanner.nextFloat();
        float chuVi = a*4;
        float dienTich = a*a;
        System.out.println("Chu vi hình vuông cạnh " + a + " là: " + chuVi);
        System.out.println("Diện tích hình vuông cạnh " + a + " là: " + dienTich);
    }
}
