package ra;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Menu-----------");
        System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
        System.out.println("2. Tính chu vi và diện tích hình tam giác");
        System.out.println("3. Tính chu vi và diện tích hình tròn");
        System.out.println("Hãy nhập bài toán bạn muốn giải: ");
        int choice = Integer.parseInt((sc.nextLine()));
        switch (choice){
            case 1:
                System.out.println("Nhập chiều dài hình chữ nhật: ");
                float cd = Float.parseFloat(sc.nextLine());
                System.out.println("Nhập chiều rộng hình chữ nhật: ");
                float cr = Float.parseFloat(sc.nextLine());
                float cv = (cd+cr)*2;
                float dt = cd*cr;
                System.out.println("Chu vi hình chữ nhật "+cd+"x"+cr+" là: "+cv);
                System.out.println("Diện tích hình chữ nhật "+cd+"x"+cr+" là: "+dt);
                break;
            case 2:
                System.out.println("Nhập cạnh thứ nhất của tam giác: ");
                float a = Float.parseFloat(sc.nextLine());
                System.out.println("Nhập cạnh thứ hai của tam giác: ");
                float b = Float.parseFloat(sc.nextLine());
                System.out.println("Nhập cạnh thứ ba của tam giác: ");
                float c = Float.parseFloat(sc.nextLine());
                if(a+b>c && b+c>a && c+a>b){
                    System.out.println("Tam giác hợp lệ!");
                    float p = (a+b+c)/2;
                    double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                    System.out.println("Chu vi tam giác là: "+Math.floor(p*2*1000)/1000);
                    System.out.println("Diện tích tam giác là: "+Math.floor(s*1000)/1000);

                }else {
                    System.out.println("Tam giác không hợp lệ!");
                }
                break;
            case 3:
                System.out.println("Nhập bán kính của hình tròn: ");
                float r = Float.parseFloat(sc.nextLine());
                double pr = 2*Math.PI*r;
                double sr = Math.PI*Math.pow(r,2);
                System.out.println("Chu vi hình tròn r = "+r+" là: "+pr/Math.PI+"pi");
                System.out.println("Diện tích hình tròn r = "+r+" là: "+sr/Math.PI+"pi");
                break;
            default:
                break;
        }

    }
}
