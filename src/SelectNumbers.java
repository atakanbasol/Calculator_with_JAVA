import java.util.Scanner;

public class SelectNumbers {
    public static int selectNumber1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin = ");
        int num1 = scanner.nextInt();
        return num1;
    }
    public static int selectNumber2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("İkinci sayıyı girin = ");
        int num2 = scanner.nextInt();
        return num2;
    }
}
