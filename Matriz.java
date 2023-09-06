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
    public void imprimir(){
        for (int i = 0; i < this.n; i++) {
            System.out.print("[");
            for (int j = 0; j < this.n; j++) {
                if(j < this.n - 1) System.out.print(pixels[i][j].getValor() + ", "); // Imprime o valor do pixel
                else System.out.print(pixels[i][j].getValor()); // Imprime o valor do pixel (último elemento na linha)
            }
            System.out.println("]");
        }
    }
    public boolean posicaoValida(int x, int y){
        return (x >= 0 && x < this.n && y >=0 && y < this.n); // Verifica se uma posição (x, y) é válida na matriz
    }

    public void algoritmoFloodFillPilha(int x, int y){
        // Implementação do algoritmo de Preenchimento de Inundação usando uma pilha (Pilha)
        // Preenche regiões conectadas a partir do pixel em (x, y)

        if(!posicaoValida(x, y)){
            System.out.println("[ERRO] Posicao Invalida!"); // Posição inválida
            return;
        }

}
