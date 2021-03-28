
package classes;

import java.util.Random;

/**
 *
 * @author Alinda
 */
public class ArrayBidimensional {
    //Atributos
    private int matriz[][];
    
    //Construtor
    public ArrayBidimensional(int linhas,int colunas){
        matriz = new int [linhas][colunas];
    }
    
    public void armazena(){
        Random valor = new Random();
        
        for (int i = 0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                matriz[i][j]=valor.nextInt(30);
            }
        }
        
    }
    
    public String dados(){
        String dadosMatriz="Valores armazenados na matriz\n";
        
        for (int i=0; i<matriz.length;i++){
            for (int j=0; j<matriz[i].length; j++){
                dadosMatriz+=matriz[i][j]+"\t";
            }
            dadosMatriz+="\n";
        }
        
        return dadosMatriz;
        
    }
    
    public int[] diagonalPrincipal(){
        
        int diagonal[]=new int[matriz.length];
        for (int i=0; i<matriz.length; i++){
            diagonal[i]=matriz[i][i];
        }
       return diagonal;
    }
            
     public int[] diagonalSecundaria(){
        int secundaria[]=null;
        
        if (matriz.length==matriz[0].length){
            secundaria=new int[matriz.length];
            int col=matriz.length-1;
            for (int lin=0; lin<matriz.length; lin++){
                secundaria[lin]=matriz[lin][col];
                col--;
            }
        }
        return secundaria;
    }
    
    
    
     public String dadosVetor(int vetor[],String msg){
         String dados=msg+"\n";
         for (int i=0; i<vetor.length; i++){
             dados+=vetor[i]+"\t";
         }
         return dados;
     }       
            
     
      public boolean ehQuadrada(){
        return matriz.length==matriz[0].length;
    }
  
   public int[] somaLinhasMatriz(){
       int sLinha[]=new int[matriz.length];
       
       for (int lin=0; lin<matriz.length; lin++){
           sLinha[lin]=0;
           for (int col=0; col<matriz[lin].length; col++){
               sLinha[lin]=sLinha[lin]+matriz[lin][col];
           }
       }
       
       return sLinha;
   }
   
   public int[] oQueFaco(){
       int sColuna[]=new int[matriz[0].length];
       
       for (int lin=0; lin<matriz.length; lin++){
           for (int col=0; col<matriz[lin].length; col++){
               sColuna[col]=sColuna[col]+matriz[lin][col];
           }
       }
       
       return sColuna;
   }
    
    public int somaValoresDaMatriz(){
       int soma=0;
       for (int lin=0; lin<matriz.length; lin++){
          for (int col=0; col<matriz[lin].length; col++){
               soma+=matriz[lin][col];
           }
       }
       
       return soma;
   }
            
    public boolean ehSimetrica(){
        int lin = 0;
        int col;
        boolean simetrica = true;
        while (simetrica && lin < matriz.length) {
            col = 0;
            lin = lin + 1;
            while (simetrica && col <= lin - 1) {
                simetrica = matriz[lin][col] == matriz[col][lin];
                col = col + 1;
            }
        }
        return simetrica;
    }
    
    public int[][] transposta(){
        int [][] transposta =new int[matriz[0].length][matriz.length];
        
        for (int lin=0; lin < matriz.length; lin++){
            for (int col=0; col < matriz[lin].length; col++){
                transposta[col][lin]=matriz[lin][col];
            }
        }
        
        return transposta;
    }
    
    
            
}
