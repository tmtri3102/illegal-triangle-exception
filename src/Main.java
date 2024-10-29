import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;

        do {
            System.out.print("Enter the first number: ");
            int first = in.nextInt();

            System.out.print("Enter the second number: ");
            int second = in.nextInt();

            System.out.print("Enter the third number: ");
            int third = in.nextInt();

            try {
                Triangle triangle = new Triangle(first, second, third);
                System.out.println(triangle);
            } catch (IllegalTriangleException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Consume the leftover newline character
            in.nextLine();

            // Ask for continuation
            System.out.print("Do you want to continue? (y/n): ");
            answer = in.nextLine().trim();

        } while (answer.equalsIgnoreCase("y"));

        in.close();
    }
}