import java.util.Scanner;

public class SelectOperator {
    public static String selectOperator(){
        String[] operators = {"+","-","*","/"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("+\n-\n*\n/");
        System.out.print("Yapmak istediğiniz işlemi seçiniz = ");
        String opt = scanner.nextLine();
        return opt;
    }
}
