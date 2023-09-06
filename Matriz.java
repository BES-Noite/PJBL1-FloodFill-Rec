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

        if(this.pixels[x][y].getValor() != 1){
            System.out.println("[ERRO] Posição não pode ser inundada!"); // O pixel não pode ser inundado
            return;
        }

        Pilha p = new Pilha(); // Cria uma pilha para o algoritmo
        p.empilhar(pixels[x][y]); // Empilha o pixel inicial

        while(!p.vazio()){
            Pixel pixel = p.desempilhar(); // Desempilha um pixel

            if(pixel.getValor() == 1){
                pixel.setValor(2); // Define o pixel como inundado
                int i = pixel.getX();
                int j = pixel.getY();

                // Verifica e empilha os pixels vizinhos
                if(posicaoValida(i + 1, j) && this.pixels[i+1][j].getValor() == 1) p.empilhar(this.pixels[i+1][j]);
                if(posicaoValida(i - 1, j) && this.pixels[i-1][j].getValor() == 1) p.empilhar(this.pixels[i-1][j]);
                if(posicaoValida(i, j + 1) && this.pixels[i][j+1].getValor() == 1) p.empilhar(this.pixels[i][j+1]);
                if(posicaoValida(i, j - 1) && this.pixels[i][j-1].getValor() == 1) p.empilhar(this.pixels[i][j-1]);
            }
        }
    }
    public void algoritmoFloodFillFila(int x, int y){
        // Implementação do algoritmo de Preenchimento de Inundação usando uma fila (Fila)
        // Preenche regiões conectadas a partir do pixel em (x, y)

        if(!posicaoValida(x, y)){
            System.out.println("[ERRO] Posicao Invalida!"); // Posição inválida
            return;
        }

        if(this.pixels[x][y].getValor() != 1){
            System.out.println("[ERRO] Posição não pode ser inundada!"); // O pixel não pode ser inundado
            return;
        }

        Fila f = new Fila(); // Cria uma fila para o algoritmo
        f.inserir(pixels[x][y]); // Insere o pixel inicial na fila

        while(!f.vazio()){
            Pixel pixel = f.remover(); // Remove um pixel da fila

            if(pixel.getValor() == 1){
                pixel.setValor(2); // Define o pixel como inundado
                int i = pixel.getX();
                int j = pixel.getY();

                // Verifica e insere na fila os pixels vizinhos
                if(posicaoValida(i + 1, j) && this.pixels[i+1][j].getValor() == 1) f.inserir(this.pixels[i+1][j]);
                if(posicaoValida(i - 1, j) && this.pixels[i-1][j].getValor() == 1) f.inserir(this.pixels[i-1][j]);
                if(posicaoValida(i, j + 1) && this.pixels[i][j+1].getValor() == 1) f.inserir(this.pixels[i][j+1]);
                if(posicaoValida(i, j - 1) && this.pixels[i][j-1].getValor() == 1) f.inserir(this.pixels[i][j-1]);
            }
        }
    }
}

