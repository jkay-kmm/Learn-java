import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // tinh tong , hieu , tich , thuong, chia lay du cua hai so 
         Scanner sc = new Scanner(System.in);
         int a , b  ;
    // int tong = 0  ;
    // int hieu = 0  ;
    // int tich = 0 ;
    // float thuong = 0 ;
    // int phanDu = 0;
    System.out.println("Nhap vao so thu nhat bat ky : ");
    System.out.println("Nhap vao so thu hai bat ky : ");
         a = sc.nextInt();
         b = sc.nextInt();
         int tong = a + b;
     System.out.println(a + " + " + b + " = " + tong);
      
     int hieu = a  - b ;
     System.out.println(a + " - " + b + " = " + hieu);
      
     int tich = a  * b;
     System.out.println( a  + " * " + b + " = " + tich);
      
     float thuong = (float) a / b;
     System.out.println(a + " / " + b+ " = " + thuong );
           
      
     int phanDu = a % b;
     System.out.println(a + " % " + b + " = " + phanDu);
      
    // Su dung cac toan tu so sanh de so sanh hai so do 
     System.out.println("ket qua so sanh bang hai so " + a + " và " + 
             b+ " là " + (a == b));
     System.out.println("ket qua so sanh khong bang hai so " + a + " và " + 
             b + " là " + (a != b));
     System.out.println("ket qua so sanh lon hon  hai so " + a + " và " + 
             b + " là " + (a > b));
     System.out.println("ket qua so sanh lon hon hoac bang hai so" + a + " và " + 
             b + " là " + (a >= b));
     System.out.println("ket qua nho hon hai so " + a + " và " + 
             b + " là " + (a < b));
     System.out.println("ket qua nho hon hoac bang hai so " + a + " và " + 
             b + " là " + (a <= b));
 }

}


