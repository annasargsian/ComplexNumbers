package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Complex complex = new Complex(2, 3);
        Complex secondComplex = new Complex(3, 4);

        Complex complexResult = complex.addComplexNumbers(secondComplex);
        Complex complexSecondResult = complex.subtractComplexNumbers(secondComplex);

        System.out.println(complexResult.getRealPart() + "  -It is a real part after addition");
        System.out.println(complexResult.getImaginaryPart() + "i" + "  -It is imaginary part after addition");
        System.out.println(complexSecondResult.getRealPart() + "  -It is a real part after subtraction");
        System.out.println(complexSecondResult.getImaginaryPart() + "i" + "  -It is a imaginary part after subtraction");

    }
}
