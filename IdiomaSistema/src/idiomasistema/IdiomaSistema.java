/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author Jessie
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Locale loc = Locale.getDefault();
    String idioma = loc.getDisplayLanguage();
        System.out.println("O idioma do seu sistema é "+idioma);
    }
    
}
