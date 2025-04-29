
import java.util.Scanner;

public class Letter {
    private String from;
    private String to;
    private StringBuilder body;

    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        this.body = new StringBuilder();
    }

    public void addLine(String line) {
        body.append(line).append("\n");
    }

    public String getText() {
        return "Dear " + to + ":\n\n" + body.toString() + "\nSincerely,\n\n" + from;
    }
}

public class EX4_E3_15 {
    public static void printLetter(Letter letter) {
        System.out.println(letter.getText());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sender's name: ");
        String from = scanner.nextLine();
        System.out.print("Enter recipient's name: ");
        String to = scanner.nextLine();

        Letter letter = new Letter(from, to);

        System.out.println("Enter the body of the letter (type 'END' to finish):");
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("END")) {
                break;
            }
            letter.addLine(line);
        }

        System.out.println("\nGenerated Letter:\n");
        printLetter(letter);

        scanner.close();
    }
}
