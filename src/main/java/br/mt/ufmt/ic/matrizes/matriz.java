package br.mt.ufmt.ic.matrizes;

public class Matriz {
    private int[][] matriz;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.matriz = new int[linhas][colunas];
    }

    public void setElemento(int linha, int coluna, int valor) {
        if (this.linhas <= linha || this.colunas <= coluna) {
            throw new IllegalArgumentException("Linha ou coluna fora do intervalo");
        }
        this.matriz[linha][coluna] = valor;
    }

    public Boolean eQuadrada(){
        return this.linhas == this.colunas;
    }

    public int getElemento(int linha, int coluna) {
        return this.matriz[linha][coluna];
    }

    public int getLinhas() {
        return this.linhas;
    }

    public int getColunas() {
        return this.colunas;
    }

    public String toString() {
        String resultado = "";
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                resultado += this.getElemento(i, j) + " ";
            }
            resultado += "\n";
        }
        return resultado;
    }

    public int somatorio(){
        int soma= 0
        for (int i = 0; i <= this.linhas; i++) {
            for (int j = 0; i <= this.colunas; j++) {
              soma += this.matriz[i][j]
}


    };
    return soma;
}
}
