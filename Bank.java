// Nama  :Indah Nurhayati
// Kelas :2A
// NIM   :11200930000014

package Bank;

public class Bank {
    int saldo,simpanUang,ambilUang;
    public Bank(int saldo){
        this.saldo=saldo;
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp"+ saldo);
    }
    void simpanUang(int simpanUang){
        this.saldo=600000;
        System.out.println("Simpan Uang: Rp"+simpanUang);
        System.out.println("Saldo saat ini: Rp"+ saldo);
    }
    void ambilUang(int ambilUang){
        this.saldo=450000;
        System.out.println("Ambil uang: Rp"+ambilUang);
        System.out.println("Saldo saat ini: Rp"+saldo);
    }
}
