package ManipulaMatriz;

import java.util.Random;

public class MatrizDeInteiros {
    /*Declaração de variaveis privadas da classe*/
    private int matriz[][];

    /* Construtor da classe */
    public MatrizDeInteiros(int linha, int coluna) {
        matriz = new int[linha][coluna];
    }

    /* Setar os valores da matriz de forma randomica */
    public void setMatriz() {
        Random valor = new Random();
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[lin].length; col++) {
                 matriz[lin][col] = valor.nextInt(10);
            }
        }
    }
    /*Retorno de total de colunas*/    
    public int getTotCol(){
        return matriz[1].length;
    }
    
    /*Retorno de total de linhas*/
    public int getTotLin(){
        return matriz.length;
    }
    
    /*Retornar os valores que estão na variavel matriz*/
    public int[][] getMatriz() {
        return matriz;
    }
  
    public boolean ehQuadrada(){
        return matriz[1].length==matriz.length;
    }
}