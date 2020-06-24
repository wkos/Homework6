package pl.wkos.homework63;

import java.util.Scanner;

public class MathQuiz {
    boolean question(String ask, int result) {
        System.out.println(ask);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt() == result;
    }

    boolean question1() {
        return question("Jaki jest wynik mnożenia 3*5?", 15);
    }

    boolean question2() {
        return question("Jakie jest pole kwadratu o boku 12?", 144);
    }

    boolean question3() {
        return question("Jaki jest pierwiastek kwadratowy z liczby 15129?", 123);
    }
}
