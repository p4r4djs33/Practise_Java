import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int number = sc.nextInt();
        if (number < 2)
            System.out.println(number + " khong la so nguyen to");
        else {
            int i = 2;
            boolean check = true;
            while (i <= sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " la so nguyen to");
            else
                System.out.println(number + " khong la so nguyen to");
        }
    }

    private static int sqrt(int number) {
        return 0;
    }
}
