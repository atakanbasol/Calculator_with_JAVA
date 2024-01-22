public class Operation {
    public static void operation(){
        String selectedOperator = SelectOperator.selectOperator();
        int number1 = SelectNumbers.selectNumber1();
        int number2 = SelectNumbers.selectNumber2();
        int addition = Operators.sum(number1,number2);
        int substraction = Operators.subt(number1,number2);
        int multiplication = Operators.mul(number1,number2);
        int division = Operators.div(number1,number2);
        int result = 0;
        // Şimdi seçilen operatörü kullanabilirsiniz
        if (selectedOperator.equals("+")) {
            result = addition;
            System.out.println("Sonuç = " + result);
        } else if (selectedOperator.equals("-")) {
            result = substraction;
            System.out.println("Sonuç = " + result);
        } else if (selectedOperator.equals("*")) {
            result = multiplication;
            System.out.println("Sonuç = " + result);
        } else if (selectedOperator.equals("/")) {
            result = division;
            System.out.println("Sonuç = " + result);
        } else {
            // Hatalı giriş durumu
            System.out.println("Geçersiz operatör");
        }
    }
}
