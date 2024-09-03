package bts17;

import java.util.Scanner;

public class bt08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhap vao 1 so nguyen");
            int number = sc.nextInt();
            checkSnt(number);
        }catch (InvalidNumberException e){
            System.err.println(e.getMessage());
        }
    }
    private static void checkSnt(int n) throws InvalidNumberException {
        if(n < 2){
            throw new InvalidNumberException("so Khong duoc be hon 2");
        }
        boolean check = true;
        for(int i =2; i < n; i++){
            if(n % i == 0){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("La so nguyen to");
        }else {
            System.out.println("K phai snt");
        }
    }
}
