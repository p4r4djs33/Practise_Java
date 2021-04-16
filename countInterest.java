import java.util.Scanner;

public class countInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So tien gui: ");
        float money = sc.nextFloat();
        System.out.println("So thang: ");
        int month = sc.nextInt();
        System.out.println("Lai suat: ");
        float interest = sc.nextFloat();

        double sumOfMoney = 0;
        sumOfMoney = money * Math.pow((1+interest/100),month);
        System.out.println("Tong so tien lai la: "+ sumOfMoney);
    }
}
