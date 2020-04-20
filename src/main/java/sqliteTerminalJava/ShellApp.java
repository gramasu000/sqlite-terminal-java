package sqliteTerminalJava;

import java.util.Scanner;
import java.util.NoSuchElementException;

public abstract class ShellApp {
    
    protected abstract String getPrompt();

    protected abstract String processInput(String input);

    protected abstract void begin();

    protected abstract void end();

    public void run() {
        Scanner stdinScanner = new Scanner(System.in);
        this.begin();
        System.out.print(this.getPrompt());
        String input = stdinScanner.nextLine();
        String output = ""; 
        while (!input.equals("quit")) {
            try {
                output = this.processInput(input);
                System.out.println(output);
            } catch (Exception e) {
                output = e.toString();
                System.out.println(output);
            }

            try {
                System.out.print(this.getPrompt());
                input = stdinScanner.nextLine();
            } catch (Exception e) {
                output = e.toString();
                System.out.println(output);
                break;
            }
        }
        this.end();
    }

}
