package bts17;

import java.util.Scanner;

public class bt09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so fibonacci muon in");
        int number = sc.nextInt();
        if(number <= 0){
            throw new RuntimeException("So phai lon hon 0");
        }
        int a = 0, b = 1;
        System.out.println("Dãy Fibonacci gồm " + number + " số là:");
        for (int i = 1; i <= number; ++i) {
            System.out.print(a + " ");

            // Tính số Fibonacci tiếp theo
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
