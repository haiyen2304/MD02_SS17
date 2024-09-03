package bts17;

import java.text.ParseException;
import java.util.Scanner;

public class bt06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so chia");
        int chia = sc.nextInt();
        System.out.println("Nhap vao so bi chia");
        int soBiChia = sc.nextInt();
        try {
            System.out.println("Phep chia 2 so: " + devide(chia,soBiChia));
        }catch (InvalidNumberException e){
            System.err.println(e.getMessage());
        }
    }
    public static double devide (int a, int b) throws InvalidNumberException {
        if( a == 0){
            throw new InvalidNumberException("So chia khong duoc bang 0");
        }
        return a%b;
    }
}
