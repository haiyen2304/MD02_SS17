package bts17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class bt04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
        String str  = sc.nextLine();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < str.length();i++){
            try {
                arr.add(Integer.parseInt(String.valueOf(str.charAt(i))));
            }catch (Exception e){
                System.out.println("Day k phai la so nguyen, tu dong chuyen ve khong");
                arr.add(0);
            }
        }
        for (Integer i:arr){
            System.out.println(i);
        }
    }
}
