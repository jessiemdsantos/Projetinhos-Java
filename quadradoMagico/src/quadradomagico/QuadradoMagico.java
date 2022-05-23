
package quadradomagico;

/**
 *
 * @author Jessie
 */
public class QuadradoMagico {
    public static boolean ehMagico(int [][] matriz){
        int soma1 = 0;
        int soma2 = 0;
        //Somando a primeira linha
        for (int j = 0; j <matriz[0].length; j++){
            soma1 += matriz[0][j];
        }
        //Somando as outras linhas
        for(int i = 1; i <matriz.length; i++){
            soma2 = 0;
            for (int j = 0; j <matriz[0].length; j++){
                soma2 += matriz[i][j];
            }
            if (soma2 != soma1){
                return false;
            }
                     
        } 

        //Somando as colunas
        for (int j =0; j <matriz[0].length; j++){
            soma2 = 0;
            for(int i = 0; i <matriz.length; i++){
            soma2 += matriz[i][j]; 
            }
            if (soma2 != soma1){
                return false;
            }
        }    
        //somando a primeira diagonal
        soma2 = 0;
        for(int i = 0; i <matriz.length; i++){
          soma2 += matriz[i][i];
        }   
        if (soma2 != soma1){
              return false;
        } 
        
        // somando a segunda diagonal 
        soma2 = 0;
        int i =0;
        for (int j = matriz.length -1; j >= 0; j--){ 
           soma2 += matriz[i][j];
           i++;
        }  
        if (soma2 != soma1){
            return false;
        } 
        return true;
            
    }
    public static void main(String[] args) {
       int A[][] = {{2,7,6},{9,5,1},{4,3,8}};
         
       if(ehMagico(A)){
           System.out.println("quadrado mágico");
               
        }else{
           System.out.println("quadrado não mágico");
       }
    }
    
}
