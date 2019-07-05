import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        System.out.println("Nhap thang :");
        month = scanner.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                System.out.println("So ngay trong thang " + month + " la :31" );
                break;
            case 2:
                System.out.println("So ngay trong thang " + month + " la :28 hoac 29" );
                break;
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
                System.out.println("So ngay trong thang " + month + " la :30" );
                break;
        }
    }
}
