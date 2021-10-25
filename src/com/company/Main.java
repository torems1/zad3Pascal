package com.company;

public class Main {

    public static void main(String[] args) {
        Complex z=new Complex(2,2);
        Complex q=new Complex(3,3);
        z.printInAlgebraForm();
        z.printInTrigonomForm();
        q.printInAlgebraForm();
        q.printInTrigonomForm();
        z.additions(q);
        z.division(q);
        z.multiplication(q);
        z.substraction(q);
        System.out.println("z = q = "+z.equals(q));
    }
}
