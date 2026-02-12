/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author firon
 */
import java.util.Scanner;
import java.math.BigInteger;

public class MainTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahData = scan.nextInt();
        
        for (int i = 0; i < jumlahData; i++) {
            String nStr = scan.next();
            
            try {
                BigInteger angka = new BigInteger(nStr);

                boolean fit = false;

                System.out.println(nStr + " can be fitted in:");

                if (angka.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                    angka.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                    System.out.println("* byte");
                    fit = true;
                }

                if (angka.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                    angka.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                    System.out.println("* short");
                    fit = true;
                }

                if (angka.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                    angka.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    System.out.println("* int");
                    fit = true;
                }

                if (angka.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                    angka.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    System.out.println("* long");
                    fit = true;
                }

                if (!fit) {
                    System.out.println(nStr + " can't be fitted anywhere.");
                }

            } catch (Exception e) {
                System.out.println(nStr + " can't be fitted anywhere.");
            }
        }
    }
}
