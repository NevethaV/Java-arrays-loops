import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String[] questions = {
            "What is the capital of France?",
            "Who painted the Mona Lisa?",
            "What is the largest planet in our solar system?"
        };
        String[] options = {
            "A) Paris  B) London  C) Rome",
            "A) Michelangelo  B) Leonardo da Vinci  C) Pablo Picasso",
            "A) Jupiter  B) Saturn  C) Earth"
        };
        String[] answers = {"A", "B", "A"};
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]); 
            System.out.println(options[i]);
            System.out.print("Enter your answer (A, B, or C): ");
            String userAnswer =a.next().toUpperCase(); 

            // Check user's answer
            if (userAnswer.equals(answers[i])) { 
                System.out.println("Correct!"); 
                score++; 
            } else {
                System.out.println("Incorrect. The correct answer is: " + answers[i]);             }
            System.out.println();
        }
        System.out.println("Your final score is: " + score + "/" + questions.length);
    }
}
