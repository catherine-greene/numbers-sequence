package softserve.academy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequenceLength;
        String minSquare;
        do {
            System.out.println("Enter sequence length:");
            sequenceLength = scanner.nextLine();

        } while (!Validator.isValid(sequenceLength));
        do {
            System.out.println("Enter minimal square:");
            minSquare = scanner.nextLine();
        } while (!Validator.isValid(minSquare));

        System.out.println(SequenceGenerator.getSequence(Integer.valueOf(sequenceLength), Integer.valueOf(minSquare)));
    }
}
