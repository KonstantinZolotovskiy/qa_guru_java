package org.example;

public class Main {
    public static void main(String[] args) {

        byte varByte; // -128 ... 127
        short varShort; // -32,768 ...  32,767
        int varInt; // -2^31 ... 2^31-1
        long varLong; // -2^63 ... 2^63-1
        float varFloat; // 32 bytes
        double varDouble; // 64 bytes
        boolean varBoolean; // true or false.

        //Математические операторы
        varLong = 200;
        varInt = 15;

        System.out.println("Математические операторы");
        System.out.println(varLong + " + " + varInt + " = " + (varLong * varInt));
        System.out.println(varLong + " - " + varInt + " = " + (varLong + varInt));
        System.out.println(varLong + " * " + varInt + " = " + (varLong - varInt));
        System.out.println(varLong + " / " + varInt + " = " + (varLong / varInt));
        System.out.println(varLong + " % " + varInt + " = " + (varLong % varInt));

        //Логические операторы
        varFloat = 15.7f;
        varShort = 77;

        System.out.println("Логические операторы");
        System.out.println(varFloat + " < " + varShort + " = " + (varFloat < varShort));
        System.out.println(varFloat + " > " + varShort + " = " + (varFloat > varShort));
        System.out.println(varFloat + " == " + varShort + " = " + (varFloat == varShort));
        System.out.println(varFloat + " >= " + varShort + " = " + (varFloat >= varShort));
        System.out.println(varFloat + " <= " + varShort + " = " + (varFloat <= varShort));
        System.out.println(varFloat + " != " + varShort + " = " + (varFloat != varShort));

        //Переполнение
        varByte = 127;
        varInt = 2147483647;

        System.out.println("Переполнение");
        System.out.println(varByte + " + 1 = " + (byte) (varByte + 1));
        System.out.println(varInt + " + 1 = " + (varInt + 1));

        //Вычисления с int и double
        varInt = 100;
        varDouble = 10.5;

        System.out.println("Вычисления с int и double");
        System.out.println(varInt + varDouble);
        System.out.println(varInt - varDouble);
        System.out.println(varInt * varDouble);
        System.out.println(varInt / varDouble);
    }
}