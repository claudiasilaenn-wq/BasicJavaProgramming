/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class TipeDataNonPrimitive {

    static class Demo {
        int a, b;

        Demo(int a, int b) {
            this.a = a;
            this.b = b;
        }

        int addition() {
            return a + b;
        }
    }

    interface Operasi {
        int tambah(int a, int b);
    }

    static class Kalkulator implements Operasi {
        public int tambah(int a, int b) {
            return a + b;
        }
    }

    public static void main(String[] args) {

        Demo demo = new Demo(10, 20);

        String s1 = "Hello";
        String s2 = new String("Java");

        int[] arr = {1, 2, 3};
        double[] arr2 = {1.1, 2.2};

        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Addition: " + demo.addition());
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("Array: " + arr[0]);
        System.out.println("Array double: " + arr2[0]);
        System.out.println("Tambah: " + kalkulator.tambah(5, 10));
    }
}
