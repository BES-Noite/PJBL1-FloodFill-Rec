package floodfill;

import java.util.Scanner;

public class FloodFill {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Solicita ao usuário a dimensão da matriz.
        System.out.print("Digite a dimensão da matriz: ");
        int n = s.nextInt();

        // Cria uma instância da classe Matriz com a dimensão especificada.
        Matriz matriz = new Matriz(n);

        // Inicializa a matriz com valores padrão.
        matriz.inicializarMatriz();

        // Loop principal para interagir com o usuário.
        while(true){
            System.out.println("Digite:\n1 - Inundar com Pilha\n2 - Inundar com Fila\n3- Visualizar Matriz\n4- Sair");
            int opc = s.nextInt();

            if(opc == 1){
                // Reinicializa a matriz com valores padrão.
                matriz.inicializarMatriz();
                System.out.print("x: ");
                int x = s.nextInt();
                System.out.print("y: ");
                int y = s.nextInt();
                // Chama o algoritmo de Flood Fill com pilha a partir das coordenadas x e y fornecidas pelo usuário.
                matriz.algoritmoFloodFillPilha(x, y);
            }else if(opc == 2){
                // Reinicializa a matriz com valores padrão.
                matriz.inicializarMatriz();
                System.out.print("x: ");
                int x = s.nextInt();
                System.out.print("y: ");
                int y = s.nextInt();
                // Chama o algoritmo de Flood Fill com fila a partir das coordenadas x e y fornecidas pelo usuário.
                matriz.algoritmoFloodFillFila(x, y);
            }else if(opc == 3){
                // Imprime a matriz atual.
                matriz.imprimir();
            }else if(opc == 4){
                // Encerra o programa.
                System.out.println("Você saiu!");
                break;
            }else{
                // Mensagem de erro para opções inválidas.
                System.out.println("[ERRO] Opção Inválida!");
            }
        }
    }

}