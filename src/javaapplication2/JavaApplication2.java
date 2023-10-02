/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author szendefi.k.daniel
 */
public class JavaApplication2 {
    
    String Pakli[] = new String[22];
    
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
        
        for (int j = 0; j < Pakli.length; j++) {
            int i = 0;
            for (int k = 0; k < szinek.length; k++) {
                Pakli[j] = szinek[k] +;
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
        
    }
    
    private void kever() {
        
    }
    
    private void ezVolt() {
        System.out.printf("Ez volt: %s.", Pakli[11]);
    }
    
}
