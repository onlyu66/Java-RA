package ra;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class docSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhập 1 số bất kỳ từ 0 đến 10: ");
        a=Integer.parseInt(sc.nextLine());
        System.out.println(a+ " đọc là: ");
        switch (a){
            case 0:
                System.out.println("không");
                break;
            case 1:
                System.out.println("một");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bốn");
                break;
            case 5:
                System.out.println("năm");
                break;
            case 6:
                System.out.println("sáu");
                break;
            case 7:
                System.out.println("bảy");
                break;
            case 8:
                System.out.println("tám");
                break;
            case 9:
                System.out.println("chín");
                break;
            case 10:
                System.out.println("mười");
                break;
            default:
                System.out.println("out of ability");

        }
    }
}
