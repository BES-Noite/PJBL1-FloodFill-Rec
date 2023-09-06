package floodfill;

public class Fila {

    private Pixel [] elementos;
    private int size;
    private int inseridos;

    public Fila() {
        this.inseridos = 0;
        this.size = 5;
        this.elementos = new Pixel[this.size];
    }

    public boolean vazio(){
        return (this.inseridos == 0);
    }

    public Pixel remover(){
        if(this.inseridos == 0) return null;
        Pixel pixel = elementos[0];
        for (int i = 1; i < this.inseridos; i++) {
            elementos[i-1] = elementos[i];
        }
        this.inseridos--;
        return pixel;
    }

    public void inserir(Pixel pixel){
        if(this.inseridos == this.size){
            Pixel [] elementos_ = new Pixel[2 * this.size];
            for(int i = 0; i < this.size; i++) elementos_[i] = this.elementos[i];
            this.size *= 2;
            this.elementos = elementos_;
        }
        this.elementos[this.inseridos] = pixel;
        this.inseridos++;
    }

    public Pixel[] getElementos() {
        return elementos;
    }

    public void setElementos(Pixel[] elementos) {
        this.elementos = elementos;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getInseridos() {
        return inseridos;
    }

    public void setInseridos(int inseridos) {
        this.inseridos = inseridos;
    }



}
