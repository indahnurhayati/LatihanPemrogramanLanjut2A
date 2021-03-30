// Nama  :Indah Nurhayati
// Kelas :2A
// NIM   :11200930000014

package Mtk2;

public class MatematikaCanggih extends Matematika {
    //modulus
    void modulus(int a, int b){
        System.out.println("hasil modulus dari " + a + "%" + b + "=" +(a%b));
    }
    void modulus(int a, int b, int c){
        System.out.println("hasil modulus dari " + a + "%" + b + "%" + c + "=" +(a%b%c));
    }
    void modulus(double a, double b){
        System.out.println("hasil modulus dari " + a + "%" + b + "=" +(a%b));
    }
    void modulus(double a, double b, double c){
        System.out.println("hasil modulus dari " + a + "%" + b + "%" + c + "=" +(a%b%c));
    }
}
