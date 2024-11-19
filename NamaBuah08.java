import java.util.Scanner;

public class NamaBuah08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] buah = {"Semangka", "Apel", "Pisang", "Mangga", "Anggur"};

        
        System.out.println("============");
        System.out.println("-Nama buah-");
        System.out.println("============");

        for (String buahnama : buah) {
            System.out.println("- " + buahnama);  
        }
       
    }
    
}
