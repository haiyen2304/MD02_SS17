package bts17;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Scanner;

public class bt02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        if(n <= 0){
            throw new EmptyStackException();
        }else {
            for(int i = 0; i < n; i++){
                while (true){
                    try {
                        System.out.println("Nhập vào số");
                        arr[i] = Integer.parseInt(sc.nextLine());
                        break;
                    }catch (NumberFormatException e){
                        e.getMessage();
                    }
                }
            }
            int max =arr[0];
            for(int i = 1; i < arr.length;i++){
                if(max < arr[i]){
                    max = arr[i];
                }
            }
            System.out.println("max: "+max);
        }
    }
}
