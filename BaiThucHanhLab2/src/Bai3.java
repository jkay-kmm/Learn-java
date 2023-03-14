import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, year;
        String name, nhomtuoi;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Yeu cau nhap ten : ");
        name = scanner.nextLine();
        System.out.println("Yeu cau nhap nam : ");
        year = scanner.nextInt();
        age = 2023 - year; // 2023 la nam hien tai 
        if (age < 16) {
            nhomtuoi = "thanh nien";
        } else if (age >= 16 || age < 18) {
            nhomtuoi = "truong thanh.";
        } else {
            nhomtuoi = "gia roi kkk";
        }
         
        System.out.println("Ban " + name + " thuoc nhom" + nhomtuoi);
    }
}
