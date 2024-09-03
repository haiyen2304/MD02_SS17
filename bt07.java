package bts17;

import java.util.Scanner;

public class bt07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1=0;
        int number2 =0;
        while (true){
            try {
                System.out.println("Nhap vao so thu 1");
                 number1 = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap vao so thu 2");
                 number2 = Integer.parseInt(sc.nextLine());
                 break;
            }catch (Exception e){
                System.err.println("So nhap khong hop le");
            }
        }
        int max = Math.max(number1, number2);
        System.out.println("Max: "+max);
    }
}
