import java.util.Scanner;

public class firstEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac nhat");
        System.out.println("Cho phuong trinh dang 'a*x + b = c', hay nhap vao cac hang so: ");
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap c: ");
        double c = sc.nextDouble();

        if (a!=0){
            System.out.println("Ket qua la " + ((c-b)/a));
        }
        else if (b == c){
            System.out.println("Vo so nghiem");
        } else{
            System.out.println("Vo nghiem");
        }

    }
}
