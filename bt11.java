package bts17;

import java.util.Scanner;

public class bt11 {
    public static void main(String[] args) throws InvalidNumberException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào ngày (1-31): ");
        int day = scanner.nextInt();

        System.out.println("Nhập vào tháng (1-12): ");
        int month = scanner.nextInt();

        System.out.println("Nhập vào năm: ");
        int year = scanner.nextInt();
        if(year < 0){
            throw new InvalidNumberException("Nam k duoc be hon 0");
        }else if(month<1 || month > 12){
            throw new InvalidNumberException("Thang phai nam trong 1 -> 12");
        }
        else if(day > 0 && day < 31){
            throw new InvalidNumberException("Ngay trong thang khong duoc qua 31");
        }
        System.out.println("Ngay thang nam hop le");
    }
}
