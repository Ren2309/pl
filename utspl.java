package RENALDI09;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class utspl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka :\n ");//masukkan angka dengan spasi
        String input = scanner.nextLine();

        String[] angka = input.split(" ");
        Set<String> angkaunik = new HashSet<>();

        for (String number : angka) {
            if (!angkaunik.add(number)) {
                System.out.println("TRUE");
                return;
            }
        }

        System.out.println("FALSE");
    }
}

