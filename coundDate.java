import java.util.Scanner;

public class coundDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        int month = sc.nextInt();
        switch(month){
        case 1,3,5,7,8,10,12: 
            System.out.println("Thang " + month + "co 31 ngay");
            break;
        case 4,6,9,11:
            System.out.println("Thang " + month + " co 30 ngay" );
            break;
        case 2:
            System.out.println("Thang " + month + " co 28 hoac 29 ngay");
            break;
        }
    }
}
