// 12S23048 - Grace Caldera Situmorang 

import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String studikasus, kodematakuliah, matkul, dosenpengampu, formatnamatugas, status, deadline;
        int tingkatkesulitan, harihinggawaktupengumpulan;
        double prioritas;

        studikasus = input.nextLine();
        kodematakuliah = input.nextLine();
        matkul = input.nextLine();
        dosenpengampu = input.nextLine();
        deadline = input.nextLine();
        formatnamatugas = input.nextLine();
        harihinggawaktupengumpulan = input.nextInt();
        status = input.nextLine();
        tingkatkesulitan = input.nextInt();
        prioritas = tingkatkesulitan * (1.0 / harihinggawaktupengumpulan);
        if (prioritas > 3) {
            status = "Penting!Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas >= 1.5 && prioritas < 3) {
                status = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    status = "Tugas ini relatif ringan,namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println(" prioritas :" + toFixed(prioritas,2));
        System.out.println(studikasus + "|" + kodematakuliah + "|" + matkul + "|" + dosenpengampu + "|" + harihinggawaktupengumpulan + "|" + formatnamatugas + "|" + status + "|" + tingkatkesulitan);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

