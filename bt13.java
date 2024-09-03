package bts17;

import java.util.Scanner;

public class bt13 {
    public static void main(String[] args) throws InvalidNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
       StringBuilder str = new StringBuilder();
       str.append(sc.nextLine());
        if(str.isEmpty()){
            throw new InvalidNumberException("Chuoi rong");
        }
        str.reverse();

    }
}
