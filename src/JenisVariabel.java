/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class JenisVariabel {

    // Instance Variable
    int speed;

    // Class Variable / Static Field
    static int jumlahMahasiswa;

    // Local Variable
    void hitung() {
        int count = 0;
        System.out.println("Count: " + count);
    }

    // Parameter
    void setNama(String nama) {
        System.out.println("Nama: " + nama);
    }

    public static void main(String[] args) {
        JenisVariabel obj = new JenisVariabel();

        obj.speed = 100;
        jumlahMahasiswa = 30;

        System.out.println("Speed: " + obj.speed);
        System.out.println("Jumlah mahasiswa: " + jumlahMahasiswa);

        obj.hitung();
        obj.setNama("Budi");
    }
}
