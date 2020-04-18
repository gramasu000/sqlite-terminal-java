# sqlite-terminal-java
A SQL Terminal Application (using SQLite-Java)

## Description
This is a terminal application that, when running, will connect to an on-disk or memory database file and will allow you to query said database from console.
Type in SQL commands in the prompt and get an output.

## Dependencies

 - Java Virtual Machine (version 13)

## To Run the App

On a Linux system, run the command

```
./gradlew run -q --console='plain'
```

The `--console='plain'` will hide gradle subtask messages, unless there is an error.
The `-q` will hide the gradle progress bar.
This will make the program compile and run (like `javac` and `java` commands) without gradle print statements.

On a Windows system, run `gradlew.bat` batch file instead. I assume the `-q` and `--console='plain'` options still work.
