import java.util.Scanner;

public class StudentCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = getInput("학생 수를 입력하세요: ", scanner);
        int[] scores = new int[studentCount];

        for (int i = 0; i < studentCount; i++) {
            scores[i] = getInput("학생 " + (i + 1) + "의 성적을 입력하세요: ", scanner);
        }

        System.out.println("학생들의 성적 평균은 " + calculateAverage(scores) + "입니다.");

        scanner.close();
    }

    public static int getInput(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static double calculateAverage(int[] scores) {
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        return (double) totalScore / scores.length;
    }
}
