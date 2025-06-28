package Ex3;

import java.util.*;

public class divisao {
    public static void main(String[] args) {
        int divisor = 0;
        int dividendo = 0;

        Scanner scanner = new Scanner(System.in);
       
        do {
            try {
                System.out.println("digite o valor do dividendo");
                dividendo = scanner.nextInt();

                System.out.println("digite o valor do divisor");
                divisor = scanner.nextInt();

                System.out.println("resultado = " + dividendo/(divisor * 1.0));

            } catch (ArithmeticException e) {
                System.out.println("erro aritmético detectado, não faça mais isso");
            } catch (InputMismatchException e) {
                System.out.println("erro de valor, digite apenas valores numericos inteiros");
            }
        } while (divisor != 0);
       
        scanner.close();
    }
}
