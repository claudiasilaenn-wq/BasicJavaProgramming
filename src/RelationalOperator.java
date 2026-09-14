/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class RelationalOperator {
    public static void main(String[] args) {

        int a = 5;

        boolean ok = (a == 5);

        System.out.println("a == 5 : " + ok);

        boolean r1 = (5 > 3) && (7 < 10);
        boolean r2 = (5 < 3) || (7 < 10);
        boolean r3 = !(5 > 3);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
    }
}
