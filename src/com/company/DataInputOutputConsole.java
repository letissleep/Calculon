package com.company;
import java.util.Scanner;

public class DataInputOutputConsole implements DataInputOutput {
    private Scanner scanner = new Scanner(System.in);

    private String dataInput(String s) {
        System.out.println(s);
        return scanner.nextLine();
    }

    @Override
    public String input() {
        return dataInput("Ввод: ");
    }

    @Override
    public void output(String out) {
        System.out.println("Результат: " + out);
    }
}
