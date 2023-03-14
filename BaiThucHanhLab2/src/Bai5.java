import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, i = 1;
        System.out.println("Nhap so bat ki:  ");
        n = sc.nextInt();
        while(i <= n)
        {
            sum += i;
            i++;
        }
        System.out.println("Tong cac so da nhap "+ n +" la "+sum);
    }
    }
