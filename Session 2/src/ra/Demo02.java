package ra;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhập a: ");
        a=Integer.parseInt(sc.nextLine());
        if(a%2==0){
            System.out.println(a+" là số chẵn");
        }else {
            System.out.println(a+" là số lẻ");
        }
    }
}
