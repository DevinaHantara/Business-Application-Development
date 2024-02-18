import java.text.BreakIterator;
import java.util.Scanner;

public class TugasBAD1 {

    static Integer nilai;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true){
        System.out.println("Masukkan Nilaimu: ");
        int nilai = scanner.nextInt();

        if (nilai >= 90 && nilai <=100){
            System.out.println("Hasil: A");
            System.out.println("Predikat: High Distinction");
            break;

        } else if (nilai >= 85 && nilai <=89) {
            System.out.println("Hasil: A-");
            System.out.println("Predikat: High Distinction");
            break;

        } else if (nilai >= 80 && nilai <=84) {
            System.out.println("Hasil: B+");
            System.out.println("Predikat: High Distinction");
            break;

        } else if (nilai >= 75 && nilai <=79) {
            System.out.println("Hasil: B");
            System.out.println("Predikat: Distinction");
            break;

        } else if (nilai >= 70 && nilai <=74) {
            System.out.println("Hasil: B-");
            System.out.println("Predikat: Distinction");
            break;

        } else if (nilai >= 65 && nilai <=69) {
            System.out.println("Hasil: C");
            System.out.println("Predikat: Pass");
            break;

        } else if (nilai >= 50 && nilai <=64) {
            System.out.println("Hasil: D");
            System.out.println("Predikat: Near Pass");
            break;

        } else if (nilai >= 0 && nilai <=49) {
            System.out.println("Hasil: E");
            System.out.println("Predikat: Fail");
            break;

        } else {
            System.out.println("Nilai error, silahkan isi kembali");
            }
        }
    }   
}