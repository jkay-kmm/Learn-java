import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Nhap so can kiem tra : ");
        n = sc.nextInt();
        if( n %2==0)
        {
            System.out.println("Day la so chan ");
        }
        else
        {
            System.out.println("day la so le ");
        }
    }
}
