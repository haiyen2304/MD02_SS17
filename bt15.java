package bts17;

import java.util.Scanner;

public class bt15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhap canh a");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap canh b");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap canh c");
            int c = Integer.parseInt(sc.nextLine());
            checkAbc(a,b,c);
        }catch (IllegalTriangleException e){
            System.err.println(e.getMessage());
        }
    }
    private static void checkAbc(int a, int b, int c) throws IllegalTriangleException {
        if(a<0 || b<0 || c<0){
            throw new IllegalTriangleException("Khong dc be hon 0");
        }
        if((a+b)<c || (a+c)<b || (c+b) <a){
            throw new IllegalTriangleException("Tong 2 canh phai lon hon canh con lai");
        }
    }
}
