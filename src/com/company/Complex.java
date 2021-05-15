package com.company;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex addComplexNumbers(Complex otherNumber) {
        Complex result = new Complex();
        result.setRealPart(otherNumber.getRealPart() + this.realPart);
        result.setImaginaryPart(otherNumber.getImaginaryPart() + this.imaginaryPart);
        return result;
    }

    public Complex subtractComplexNumbers(Complex otherNumber) {
        Complex result = new Complex();
        result.setRealPart(this.realPart - otherNumber.getRealPart());
        result.setImaginaryPart(this.imaginaryPart - otherNumber.getImaginaryPart());
        return result;
    }


    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }


    public double getImaginaryPart() {
        return imaginaryPart;
    }

}
