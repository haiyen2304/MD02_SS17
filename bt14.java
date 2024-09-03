package bts17;

import java.util.Scanner;

public class bt14 {
    public static void main(String[] args) throws InvalidNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cho mang");
        int number = Integer.parseInt(sc.nextLine());
        if(number <= 0){
            throw new InvalidNumberException("Mang k duoc am hoac 0");
        }
        int[] arr = new int[number];
        int sum = 0;
        System.out.println("Nhap phan tu");
        for(int i = 0; i < arr.length;i++){
            sum += Integer.parseInt(sc.nextLine());
        }
        System.out.println("Gia tri trung binh: " + (double) sum/arr.length);
    }
}
