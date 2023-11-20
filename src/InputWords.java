import java.util.Scanner;

public class InputWords {

    public InputWords() {
    }

    public static void inputWords() {
        Scanner scan = new Scanner(System.in);
        boolean shouldStop = false;
        Counter counter = new Counter();
        System.out.println("Start typing!");
        while (!shouldStop) {
            String currentLine = scan.nextLine();
            shouldStop = counter.addRow(currentLine);
        }


        System.out.println("Stop was entered! " + "Shutting off");
        System.out.println("You wrote: " + counter.countCharacters() + " characters!" + "\n"
                + "You wrote: " + counter.countRows() + " rows" + "\n" + " You wrote " + counter.countWords() + " words!" + "\n"
                + " and " + counter.longestWord() + " was your longest word! ");
    }

}
