package sqliteTerminalJava;

public class SQLShellApp extends ShellApp {

    public String getGreeting() {
        return "Test Run";
    }

    public String getPrompt() {
        return ">";
    }

    public String processInput(String input) {
        return input;
    }

}
