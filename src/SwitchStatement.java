/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class SwitchStatement {
    public static void main(String[] args) {

        int month = 8;
        String name;

        switch (month) {
            case 1:
                name = "January";
                break;

            case 8:
                name = "August";
                break;

            default:
                name = "Invalid";
                break;
        }

        System.out.println(name);
    }
}
