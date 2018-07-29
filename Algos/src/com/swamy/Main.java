package com.swamy;

import java.util.Scanner;

import com.swamy.binary.IntegerToBinaryString;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer value to be converted");
        int n = scanner.nextInt();
        // convert int to binary str
        System.out.println(IntegerToBinaryString.intToBinaryStr(n));

        // convert int to binary str
        System.out.println("Enter integer value to be converted");
        String binStr = scanner.next();
        System.out.println(IntegerToBinaryString.binaryStrToBInt(binStr));

        scanner.close();

    }

}
