import java.util.Scanner;
 
public class Slide40 {
    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Nhap ngay can tim: ");
        day = sc.nextInt();
        switch(day)
        {
            case 1:
            System.out.println("Day la thu 2");
            break;
        case 2:
            System.out.println("Day la thu 3");
            break;
        case 3:
            System.out.println("Day la thu 4");
            break;
        case 4:
            System.out.println("Day la thu 5");
            break;
        case 5:
            System.out.println("Day la thu 6");
            break;
        case 6:
            System.out.println("Day la thu 7");
            break;
        case 7:
            System.out.println("Day la chu nhat");
            break;
        }
        sc.close();
    }
}

