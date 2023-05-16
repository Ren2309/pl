package RENALDI09;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Bismillah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka :\n" );//masukkan angka dengan spasi

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        Set<String> Angka = new HashSet<>();
        boolean hasDuplicates = false;
        for (String angka : numbers) {
            if (Angka.contains(angka)) {
                hasDuplicates = true;
                break;
            } else {
                Angka.add(angka);
            }
        }


        System.out.println(hasDuplicates ? "TRUE" : "FALSE");
    }
}


