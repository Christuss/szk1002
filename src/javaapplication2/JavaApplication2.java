/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author szendefi.k.daniel
 */
public class JavaApplication2 {
    
    String Pakli[] = new String[22];
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        new JavaApplication2().indit();
    }
    
    private void indit() {
        feltolt();
        for (int i = 0; i < 3; i++) {
            kever();
            melyik();
        }
        ezVolt();
    }
    
    private void feltolt() {
        String formak[] = {"ász", "also", "felso", "x", "ix", "viii"};
        String szinek[] = {"piros", "zöld", "tök", "makk"};
        for (String e : szinek) {
            for (int i = 0; i < formak.length; i++) {
                Pakli[i] = e + "_" + formak[i];
            }
        }
        kirak();
        }
        
        
    
    
    private void kirak() {
        for (String elem : Pakli) {
            System.out.printf("%s ", elem);
        }
    }
    
    private void melyik() {
        int szam = 0;
        do {            
            System.out.println("Melyik: ");
            szam = sc.nextInt();
        } while (szam < 1 && szam > 3);
    }
    
    private void kever() {
        
    }
    
    private void ezVolt() {
        System.out.printf("Ez volt: %s.", Pakli[11]);
    }
}
    
