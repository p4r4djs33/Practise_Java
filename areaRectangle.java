import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        width = sc.nextFloat();
        System.out.println("Nhap chieu dai: ");
        height = sc.nextFloat();
        System.out.println("Dien tich hinh vuong la: " + (width*height));
    }
}
