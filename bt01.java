package bts17;

import java.util.Scanner;

public class bt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        while (true){
            try{
                System.out.println("Nhap vao so a");
                a = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap vao so b");
                b = Integer.parseInt(sc.nextLine());
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
