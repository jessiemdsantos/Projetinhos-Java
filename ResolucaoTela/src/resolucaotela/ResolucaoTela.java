/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author beesh
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
    int larg = (int) tela.getWidth();
    int alt = (int)tela.getHeight();
        System.out.println("A resolução da tela é " +larg + " x " +alt);
    }
    
}
