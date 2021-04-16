import java.util.Scanner;

public class checkLunarYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf(year + " la nam nhuan");
                } else {
                    System.out.printf(year + " khong phai la nam nhuan");
                }
            } else {
                System.out.printf(year + " la nam nhuan");
            }
        } else {
            System.out.printf(year + " khong phai la nam nhuan");
        }
    }
}
