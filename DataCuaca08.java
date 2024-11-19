import java.util.Scanner;

public class DataCuaca08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] suhu= new double[5][12];

        suhu[0][0] = 25.0; // JANUARI
        suhu[1][1] = 21.0; // FEBRUARI
        suhu[1][2] = 19.5; // MARET
        suhu[2][3] = 18.0; // APRIL
        suhu[2][4] = 16.0; // MEI
        suhu[3][5] = 20.0; // JUNI
        suhu[3][6] = 30.0; // JULI
        suhu[4][7] = 19.0; // AGUSTUS
        suhu[4][8] = 17.5; // SEPTEMBER
        suhu[4][9] = 22.0; // OKTOBER
        suhu[4][10] = 26.0; // NOVEMBER
        suhu[4][11] = 25.5; // DESEMBER

        System.out.println("Suhu rata-rata pada bulan Juni: " + suhu[3][5]);
    }
}