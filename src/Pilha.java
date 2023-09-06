package floodfill.src;

public class Pilha {

    private Pixel [] elementos;
    private int size;
    private int inseridos;

    public Pilha() {
        this.inseridos = 0;
        this.size = 5;
        this.elementos = new Pixel[this.size];
    }

    public boolean vazio(){
        return (this.inseridos == 0);
    }

    public Pixel desempilhar(){
        if(this.inseridos == 0) return null;
        this.inseridos--;
        return elementos[this.inseridos];
    }

    public void empilhar(Pixel pixel){
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

