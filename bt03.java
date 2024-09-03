package bts17;

public class bt03 {
    public static void main(String[] args) {
        int sum =0;
        Integer[] arr = {1,2,3,null,4,7};
        for (Integer integer : arr) {
            try {
                sum += integer;
            } catch (NullPointerException e) {
                System.err.println("So ban nhap k phai la so");
            }
        }
        System.out.println("Tong: "+sum);
    }
}
