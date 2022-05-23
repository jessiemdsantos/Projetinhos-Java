/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author beesh
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, result;
        n1 = 4;
        n2 = 8;
        result =(n1>n2)? n1:n2;
        System.out.println(result);
        
        String nome1 = "Jessica";
        String nome2 = "Jessica";
        String nome3 = new String ("Jessica");
        String r, res, resu;
        r = (nome1==nome2)? "Igual":"Diferente";
        System.out.println(r);
        res = (nome1==nome3)? "Igual":"Diferente";
        System.out.println(res);
        resu = (nome1.equals(nome3))? "Igual":"Diferente";
        System.out.println(resu);
        
    }
    
}
