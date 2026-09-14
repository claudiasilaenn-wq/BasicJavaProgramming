/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class UnaryOperator {
    public static void main(String[] args) {

        int x = 10;

        // Compound assignment
        x += 5;

        System.out.println("x = " + x);

        // Dampak tipe data
        double d = 10.0 / 3;
        int i = 10 / 3;

        System.out.println("double = " + d);
        System.out.println("int = " + i);

        // Math utility
        double p = Math.pow(2, 3);
        double s = Math.sqrt(64);

        System.out.println("Power = " + p);
        System.out.println("Square root = " + s);
    }
}
