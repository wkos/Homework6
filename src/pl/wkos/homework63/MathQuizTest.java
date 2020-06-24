package pl.wkos.homework63;

public class MathQuizTest {
    public static void main(String[] args) {
        System.out.println("Rozwiąż 3 zadania.");
        MathQuiz mathQuiz = new MathQuiz();
        boolean[] array = new boolean[3];
        array[0] = mathQuiz.question1();
        array[1] = mathQuiz.question2();
        array[2] = mathQuiz.question3();
        for (int i = 0; i < 3; i++)
            System.out.println("Pytanie " + (i + 1) + " - wynik: " + array[i]);
        int sumOfPoints = 0;
        for (int i = 0; i < 3; i++)
            if (array[i]) sumOfPoints++;
        System.out.print("Twój wynik: " + sumOfPoints + "/3");
    }
}
