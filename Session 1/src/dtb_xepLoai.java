import java.util.Scanner;

public class dtb_xepLoai { public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm Toán");
        float toan = scanner.nextFloat();
        System.out.println("Nhập điểm Lý");
        float ly = scanner.nextFloat();
        System.out.println("Nhập điểm Hóa");
        float hoa = scanner.nextFloat();
        System.out.println("Nhập điểm Văn");
        float van = scanner.nextFloat();
        System.out.println("Nhập điểm Anh");
        float anh = scanner.nextFloat();


        String xepLoai = "";
        if (toan >=0 && toan<=10){
            if (ly >=0 && ly<=10){
                if (hoa >=0 && hoa<=10){
                    if (van >=0 && van<=10){
                        if (anh >=0 && anh<=10){
                            float dtb = (toan+ly+hoa+van+anh)/5;
                            System.out.println("Điểm trung bình: " + dtb);=
                            if (dtb>=0 && dtb<5){
                                xepLoai = "Yếu";
                            } else if (dtb>=5 && dtb <6.5) {
                                xepLoai = "Trung bình";
                            } else if (dtb>=6.5 && dtb<8) {
                                xepLoai = "Khá";
                            } else if (dtb>=8 && dtb<9) {
                                xepLoai = "Giỏi";
                            } else {
                                xepLoai = "Xuất sắc";
                            }
                            System.out.println("Xếp loại: " + xepLoai);

                        } else {
                            System.out.printf("Điểm anh phải ở thang điểm 10");
                        }
                    } else {
                        System.out.printf("Điểm văn phải ở thang điểm 10");
                    }
                } else {
                    System.out.printf("Điểm hóa phải ở thang điểm 10");
                }
            } else {
                System.out.printf("Điểm lý phải ở thang điểm 10");
            }
        } else {
            System.out.printf("Điểm toán phải ở thang điểm 10");
        }
    }
}
