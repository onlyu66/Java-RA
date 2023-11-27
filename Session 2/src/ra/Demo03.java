package ra;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập vào 1 ký tự và kiểm tra xem nó là nguyên âm hay là phụ âm
        String kyTu;
        System.out.println("Nhập 1 ký tự bất kỳ: ");
        kyTu =  sc.nextLine();

        switch (kyTu){
            case "u":
            case "e":
            case "o":
            case "a":
            case "i":
                System.out.println(kyTu+" là nguyên âm");
                break;
            default:
                System.out.println(kyTu+" là phụ âm");
                break;
        }
    }
}
