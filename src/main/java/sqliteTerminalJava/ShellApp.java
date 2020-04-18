package sqliteTerminalJava;

import java.util.Scanner;

public abstract class ShellApp {
    
    public abstract String getGreeting();
    
    public abstract String getPrompt();

    public abstract String processInput(String input);

    public void run() {
        Scanner stdinScanner = new Scanner(System.in);
        System.out.println(this.getGreeting());
        while (true) {
            System.out.print(this.getPrompt());
            String input = stdinScanner.nextLine();
            String output = this.processInput(input);
            System.out.println(output);
        }
    }

}
