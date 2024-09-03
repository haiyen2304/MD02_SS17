package bts17;

import java.util.Arrays;
import java.util.Scanner;

public class bt05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int[] arr = {1,5,3,7,8,2,9,4};
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        boolean check = true;
        while (start<=end){
             int mid = start + (end - start)/2;
            if(arr[mid] == number){
                System.out.println(mid);
                check = false;
                break;
            }else if(arr[mid] < number){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        if(check){
            throw new RuntimeException("Phan tu khong duoc tim thay");
        }
    }
}
