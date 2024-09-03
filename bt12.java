package bts17;

import java.util.Scanner;

public class bt12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhap so thu 1");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap so thu 2");
            int num2 = Integer.parseInt(sc.nextLine());
            System.out.println("Ucln"+ findGCD(num1,num2));
        }catch (InvalidNumberException e){
            System.err.println(e.getMessage());
        }
    }
    public static int findGCD(int a, int b) throws InvalidNumberException {
        if(a == 0 && b ==0){
            throw new InvalidNumberException("2 so k duoc bang 0");
        }
        // Đảm bảo a là số lớn hơn b để thuật toán Euclid hoạt động chính xác
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
