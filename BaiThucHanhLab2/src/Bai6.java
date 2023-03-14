import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , temp = 0;
        int giaiThua = 1;
        do {
            System.out.println("Nhap mot so bat ky : ");
            n = sc.nextInt();
        } while ((n <= 0) || (n > 10));
        while (temp <= n) {
            giaiThua *= temp;
            temp++;
        }
        System.out.println(n + "! = " + giaiThua);
    }
    }