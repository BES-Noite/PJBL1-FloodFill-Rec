# PJBL1-FloodFill-Rec
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">

<div align="center">

 <br>
     Este é o primeiro projeto da matéria Resolução de Problemas Estruturados em Computação, realizado pela equipe 9, compostos por: <br><br>
     Bruno Crema 👨🏼‍💻 <br>
     João Elias Fadel 👨🏻‍💻 <br>
     João Victor Ferreira 👨🏽‍💻 <br>
     Lohine Mussi 👩🏻‍💻 
     
## FloodFill
<br> 

![image](https://github.com/BES-Noite/PjBL1-FloodFill/assets/91105011/64d5db3c-e065-487d-a5d4-98a864afa66e)



Flood Fill (ou preenchimento de inundação) é um algoritmo que tem como objetivo alterar a
informação de nós (nodes) que estão conectados. Esse algoritmo é utilizado na ferramenta “balde”
de softwares de desenho (como paint) e pode ser utilizado também em jogos como Go e Campo
Minado para determinar quais posições serão limpas.
A proposta desta atividade é a implementação do algoritmo Flood Fill de forma simplificada,
utilizando Pilha e Fila para armazenamento dos pixels. 

## Algoritmo FloodFill
Este repositório contém uma implementação do algoritmo Flood Fill utilizando 5 classes: <br>

### FloodFill
O programa FloodFill é uma aplicação interativa que permite ao usuário criar uma matriz e realizar operações de preenchimento de matriz usando os algoritmos de Flood Fill com pilha ou fila. Ele também oferece a funcionalidade de visualizar a matriz atual e sair do programa quando desejado.  <br>
### Matriz
 A classe Matriz é responsável por representar uma matriz de pixels e implementar os algoritmos de Flood Fill com pilha e fila para inundar áreas da matriz.  <br>
 ### Pixel 
A classe Pixel representa um elemento individual em uma matriz de pixels e é usada pelo programa Flood Fill. Essa classe é usada para representar os pixels na matriz durante as operações de Flood Fill, onde os valores dos pixels podem ser modificados para indicar áreas inundadas ou vazias. Ela facilita a manipulação e o gerenciamento das informações associadas a cada pixel na matriz.<br>
###Pilha
A classe Pilha é uma estrutura de dados que representa uma pilha (stack) em programação. Ela é utilizada para armazenar elementos em um formato "Last-In, First-Out" (LIFO), onde o último elemento inserido é o primeiro a ser removido. Essa classe é fundamental para implementar a funcionalidade de algoritmo de Flood Fill com pilha, permitindo que os pixels a serem processados sejam rastreados de acordo com o princípio LIFO da pilha. <br>
### Fila
A classe Fila é uma estrutura de dados que representa uma fila (queue) em programação. Ela é utilizada para armazenar elementos em um formato "First-In, First-Out" (FIFO), onde o primeiro elemento inserido é o primeiro a ser removido. Essa classe é fundamental para implementar a funcionalidade de algoritmo de Flood Fill com fila, permitindo que os pixels a serem processados sejam rastreados de acordo com o princípio FIFO da fila. 


## Funcionamento do projeto 
1- O programa começa solicitando ao usuário a dimensão da matriz. <br>
2- Uma matriz é criada com a dimensão especificada e é inicializada com valores padrão. <br>
3- O programa entra em um loop principal que permite ao usuário escolher entre várias opções:<br>
Inundar a matriz usando o algoritmo de Flood Fill com pilha.<br>
Inundar a matriz usando o algoritmo de Flood Fill com fila.<br>
Visualizar a matriz atual.<br>
Sair do programa.<br>
4- Quando o usuário escolhe inundar a matriz com pilha ou fila, ele é solicitado a fornecer as coordenadas (x, y) a partir das quais deseja iniciar o preenchimento da matriz.<br>
5- O algoritmo de Flood Fill correspondente é executado a partir das coordenadas fornecidas pelo usuário, preenchendo as áreas conectadas na matriz.<br>
6- Quando o usuário escolhe visualizar a matriz, o programa exibe a matriz atual no console.<br>
7- Se o usuário escolher sair, o programa encerra a execução com uma mensagem de saída.<br>
8- O programa continua a executar até que o usuário escolha sair, permitindo que o usuário realize várias operações na matriz.<br>
![image](https://github.com/BES-Noite/PJBL1-FloodFill-Rec/assets/91105011/3ba658fe-cff5-4672-a973-9db55c4f0c63)
![image](https://github.com/BES-Noite/PJBL1-FloodFill-Rec/assets/91105011/89798863-87d7-4358-b6cf-ddb441e3fbe1)




## Uso 
Para utilizar o projeto, siga os passos abaixo:

</div>

1. Clone o repositório para o seu computador:
>```git clone https://github.com/seu-nome-de-usuário/flood-fill.git> ```

2. Compile e execute a classe Main:
>```javac src/Main.java>```

3. Siga as instruções no console para interagir com o algoritmo Flood Fill e ver seus resultados.

