package com.company;

public class Main {

    public static void main(String[] args) throws IncorrectDataEntryException {
        DataInputOutput inputOutput = new DataInputOutputConsole();
        DataVerification verification = new DataVerificationArabicRomanNumber();
        ConverterNumber convertNumber = new RomeToArabicNumberConverter();
        Calc calc = new Calculon();
        Calculator calculator = new Calculator(inputOutput, verification, convertNumber, calc);
        calculator.start();
    }
}
