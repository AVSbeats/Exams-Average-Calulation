import java.util.Scanner;

public class AverageOfExams {
    public static void main(String[] args) {

        int[] scores = new int[10];

        int score = 0;
        int count = 0;
        int total = 0;

        final int QUIT = 777;
        final int MAX = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Exams Scores or " + QUIT + " To Quit: ");
        score = input.nextInt();

        while (score != QUIT) {
            scores[count] = score;
            total += scores[count];
            ++count;

            if (count == MAX) {
                score = QUIT;
            } else {
                System.out.print("Enter Next Exam score or " + QUIT + " To Quit: ");
                score = input.nextInt();
            }
        }

        System.out.println("\nThe Scores Entered were: ");
        for (int x = 0; x < count; ++x) {
            System.out.print(scores[x] + " ");
        }
        if (count != 0) {
            System.out.println("\nThe Average is " + (total * 1.0 / count));
        } else {
            System.out.println("No Scores Were Entered");
        }
        System.out.println(" "); // Space
    }
}