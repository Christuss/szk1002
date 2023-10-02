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
            kirak();
            melyik();
        }
        ezVolt();
    }
    
    private void feltolt() {
        String formak[] = {"ász", "also", "felso", "x", "ix", "viii"};
        String szinek[] = {"piros", "zöld", "tök", "makk"};
        int i = 0;
        for (String ertek : szinek) {
            for (int j = 0; i < 22 && j < formak.length; j++) {
                Pakli[i++] = ertek + "_" + formak[j];
            }
        }
    }
        
        
    
    
    private void kirak() {
        for (String elem : Pakli) {
            System.out.printf("%s ", elem);
        }
    }
    
    private void melyik() {
        int szam = 0;
        do {            
            System.out.print("Melyik: ");
            szam = sc.nextInt();
        } while (szam < 1 && szam > 3);
        kirak(szam);
    }
    
    private void kever(int i) {
        String ujPakli[] = new String[22];
        switch (i) {
            case 1:
                ujPakli[1-7] = Pakli[20-(i-1)*3];
                ujPakli[7-14] = Pakli[19-(i-1)*3];
                ujPakli[14-21] = Pakli[21-(i-1)*3];
                break;
            case 2:
                ujPakli[1-7] = Pakli[21-(i-1)*3];
                ujPakli[7-14] = Pakli[19-(i-1)*3];
                ujPakli[14-21] = Pakli[20-(i-1)*3];
                break;
            case 3:
                ujPakli[1-7] = Pakli[19-(i-1)*3];
                ujPakli[7-14] = Pakli[21-(i-1)*3];
                ujPakli[14-21] = Pakli[20-(i-1)*3];
                break;
        }
        Pakli = ujPakli;
    }
    
    private void ezVolt() {
        System.out.printf("Ez volt: %s.", Pakli[11]);
    }
}
    
