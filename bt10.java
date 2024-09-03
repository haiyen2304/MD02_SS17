package bts17;

import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Nhap ban kinh");
                double number = Double.parseDouble(sc.nextLine());
                inBanKinh(number);
                break;
            }catch (InvalidNumberException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static void inBanKinh(double num) throws InvalidNumberException {
        if(num < 0){
            throw new InvalidNumberException("Khong duoc be hon 0");
        }
        System.out.println("Dien tich: " + Math.PI*Math.pow(num,2));
    }
}
