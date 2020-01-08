package noob.babysteps;

import java.util.Scanner;

class Quiz {
    Integer numberOfCorrectAnswers = 0;
    final Scanner scanner = new Scanner(System.in);

    public void startQuiz() {
        System.out.println("Cool Quiz!");
        spm1();
        spm2();

        endOfQuiz();
    }

    private void spm2() {
        System.out.println("Question 2: What's a better platform for quizess");
        System.out.println("A: Kahoot");
        System.out.println("B: Bash");
        System.out.println("C: Neither");
        
        final String answer = scanner.nextLine();        

        if (answer.equalsIgnoreCase("b")) {
            System.out.println("CORRECT");
            numberOfCorrectAnswers++;
        } else {
            System.out.println("You are incredibly Incorrect");
        }

        if (!answer.equalsIgnoreCase("a") && !answer.equalsIgnoreCase("b") && !answer.equalsIgnoreCase("c")) {
            System.out.println("That's not even an answer dude, answer A, B OR C...");     
        }
    }

    private void endOfQuiz() {
        System.out.println("You got " + numberOfCorrectAnswers + " Correct answers my guy");
        scanner.close();
    }

    private void spm1() {
        System.out.println("Question 1: Can you do this");
        System.out.println("A: Yes");
        System.out.println("B: No");
        System.out.println("C: I don't know");

        final String answer = scanner.nextLine();

        System.out.println("You answered " + answer);

        if (answer.equalsIgnoreCase("a")) {
            System.out.println("CORRECT");
            numberOfCorrectAnswers++;
        } else {
            System.out.println("You are incredibly Incorrect");
        }

        if (!answer.equalsIgnoreCase("a") && !answer.equalsIgnoreCase("b") && !answer.equalsIgnoreCase("c")) {
            System.out.println("That's not even an answer dude, answer A, B OR C...");
        }
    }
}
