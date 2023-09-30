import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, aC, lantai, ketersediaanteknologi, gudang;
        int kapasitasgudang, jumlahbukusaatini, skor;

        namagudang = input.nextLine();
        kapasitasgudang = input.nextInt();
        jumlahbukusaatini = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        skor = (int) ((double) jumlahbukusaatini / kapasitasgudang * 100);
        if (skor >= 40) {
            gudang = "gudang elit";
        } else {
            if (skor < 40 && skor >= 25) {
                gudang = "gudang standar";
            } else {
                if (skor < 25) {
                    gudang = "gudang peningkatan";
                }
            }
        }
        System.out.println(namagudang + "|" + kapasitasgudang + "|" + jumlahbukusaatini + "|" + aC + "|" + lantai + "|" + ketersediaanteknologi + "|" + skor + "|" + gudang);
    }
}
