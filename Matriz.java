package floodfill;

public class Matriz {
    private Pixel [][] pixels; // Matriz de pixels
    private int n; // Tamanho da matriz (n x n)

    public Matriz(int n) {
        this.n = n;
        pixels = new Pixel[this.n][this.n]; // Inicializa a matriz de pixels
    }

    public void inicializarMatriz(){
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                pixels[i][j] = new Pixel(); // Cria um novo objeto Pixel
                if(i == this.n - 1 - j){ // Verifica se está na diagonal
                    pixels[i][j].setValor(0); // Define o valor como 0 se estiver na diagonal
                }else{
                    pixels[i][j].setValor(1); // Define o valor como 1 se não estiver na diagonal
                }
                pixels[i][j].setX(i); // Define a coordenada x do pixel
                pixels[i][j].setY(j); // Define a coordenada y do pixel
            }
        }
    }

}
