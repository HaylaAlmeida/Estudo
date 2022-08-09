7.10 (Comissões de vendas) Utilize um array unidimensional para resolver o seguinte problema: uma empresa paga seu pessoal de vendas por comissão. O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante essa semana. Por exemplo, um vendedor que vende R$ 5.000 brutos em uma semana recebe R$ 200 mais 9% de R$ 5.000 ou um total de R$ 650. Escreva um aplicativo (utilizando um array de contadores) que determina quanto o pessoal de vendas ganhou em cada um dos seguintes intervalos (suponha que o salário
de cada vendedor foi truncado para uma quantia inteira):
~~~
a) $200–299
b) $300–399 
c) $400–499 
d) $500–599 
e) $600–699 
f) $700–799 
g) $800–899 
h) $900–999 
i) R$ 1.000 e acima
~~~
Resuma os resultados em formato tabular.
~~~
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] frequencia = new int[11];
        double comissao = 200;
        final double porcentagem = 0.09;
        double vendas = input.nextDouble();
        while (vendas >= 0) {
            comissao += vendas * porcentagem;
            if (comissao > 1000){
                ++frequencia[10];
            }
            else
                ++frequencia[(int) comissao/100];

            comissao = 200;
            vendas = input.nextDouble();
        }
        System.out.printf("%s: %18s: %n", "Faixa", "Frequência");
        for (int i = 2; i < frequencia.length; i++){
            if (i == 10){
                System.out.printf("R$1.000 e acima %9d%n", frequencia[i]);
            }
            else
                System.out.printf("R$%d-%d %15d%n", i * 100, i * 100 + 99, frequencia[i]);
        }
    }
}
~~~
7.12 (Eliminação de duplicatas) Utilize um array unidimensional para resolver o seguinte problema: escreva um aplicativo que insere cinco números, cada um entre 10 e 100, inclusive. Enquanto cada número é lido, exiba-o somente se ele não tiver uma duplicata de um número já lido. Cuide de tratar o “pior caso”, em que todos os cinco números são diferentes. Utilize o menor array possível para resolver esse pro-
blema. Exiba o conjunto completo de valores únicos inseridos depois que o usuário inserir cada valor novo.

~~~
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[5];
        int num;
        for (int i = 0; i < vetor.length; i++){
            num = input.nextInt();
            vetor[i] = num;
            if (i > 0){
                for (int j = 0; j < i; j++){
                    if (vetor[j] == vetor[i]){
                        num = input.nextInt();
                        vetor[i] = num;
                    }
                }
            }
            System.out.printf("%d%n", vetor[i]);
        }
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("%d  ", vetor[i]);
        }
    }
}
~~~
7.14 (Lista de argumento de comprimento variável) Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados para método product utilizando uma lista de argumentos de comprimento variável. Teste seu método com várias chamadas, cada uma
com um número diferente de argumentos.
~~~
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 1;
        int b = 30;
        int c = 40;
        int d = 2;

        System.out.printf("%d", product(a, b, c));

    }
    public static int product(int ... inteiros){
        int produto = 1;

        for (int numeros : inteiros){
            produto *= numeros;
        }
        return produto;
    }
}
~~~

7.15 (Argumentos de linha de comando) Reescreva a Figura 7.2 para que o tamanho do array seja especificado pelo primeiro argumento de linha de comando. Se nenhum argumento de linha de comando for fornecido, utilize 10 como o tamanho padrão do array.

~~~
public class InitArray {
    public static void main(String[] args) {

        int arrayLenght;
        if (args.length == 0)
            arrayLenght = 10;
        else
            arrayLenght = Integer.parseInt(args[0]);
        int[] array = new int[arrayLenght];


        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);

    }
}
~~~

7.16 (Usando a instrução for aprimorada) Escreva um aplicativo que usa uma instrução for aprimorada para somar os valores double passados pelos argumentos de linha de comando. [Dica: utilize o método static parseDouble da classe Double para converter uma
String em um valor double.]
~~~
public class InitArray {
    public static void main(String[] args) {

        double total = 0;
        int arrayLenght = Integer.parseInt(args[0]);
        double[] array = new double[arrayLenght];

        for (int i = 0; i < arrayLenght; i++) {
            array[i] = Double.parseDouble(args[i+1]);
        }
        for (double d : array) {
            total += d;
        }
        System.out.printf("Total: %f%n", total);
    }
}
~~~

7.17 (Jogo de dados) Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar um objeto de classe Random, uma vez para lançar o primeiro dado e novamente para lançar o segundo dado. A soma dos dois valores deve então ser calculada. Cada dado pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 2 a 12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. A Figura 7.28 mostra as 36 possíveis combinações de dois dados. Seu aplicativo deve lançar o dado 36.000.000 vezes. Utilize um array unidimensional para contar o número de vezes que cada possível soma aparece. Exiba os resultados em formato tabular.
~~~
import java.util.Random;

public class Main  {

    public static void main(String[] args) {
        int[] frequencia = new int[13];
        int dado1;
        int dado2;
        int soma = 0;
        Random lançamento = new Random();

        for (int i = 0; i < 360000; i++){
            dado1 = 1 + lançamento.nextInt(6);
            dado2 = 1 + lançamento.nextInt(6);
            soma = dado1 + dado2;
            ++frequencia[soma];
        }
        for (int i = 2; i < frequencia.length; i++){
            System.out.printf("%d: %d%n", i, frequencia[i]);
        }
    }
}
~~~

7.18 (Jogo de dados Craps) Escreva um aplicativo que executa 1.000.000 de partidas do jogo de dados craps (Figura 6.8) e responda às seguintes perguntas: 

    a) Quantos jogos são ganhos na primeira rolagem, segunda rolagem, …, vigésima rolagem e depois da vigésima rolagem? 

Cerca de 490 mil

    b) Quantos jogos são perdidos na primeira rolagem, segunda rolagem, …, vigésima rolagem e depois da vigésima rolagem?

Cerca de 510 mil

    c) Quais são as chances de ganhar no jogo de dados? [Observação: você deve descobrir que o craps é um dos jogos mais comuns de cassino. O que você supõe que isso significa?]
49%
    
    d) Qual é a duração média de um jogo de dados craps?
    
Uma jogada

    e) As chances de ganhar aumentam com a duração do jogo?
Não

7.19 (Sistema de reservas de passagens aéreas) Uma pequena companhia aérea acabou de comprar um computador para seu novo sistema automatizado de reservas. Você foi solicitado a desenvolver o novo sistema. Você escreverá um aplicativo para atribuir assentos em cada voo da companhia aérea (capacidade: 10 assentos). Seu aplicativo deve exibir as seguintes alternativas: Please type 1 for First Class e Please type 2 for Economy. [Por
favor digite 1 para Primeira Classe e digite 2 para Classe Econômica]. Se o usuário digitar 1, seu aplicativo deve atribuir assentos na primeira classe (poltronas 1 a 5). Se o usuário digitar 2, seu aplicativo deve atribuir um assento na classe econômica (poltronas 6 a 10). Seu aplicativo deve exibir um cartão de embarque indicando o número da poltrona da pessoa e se ela está na primeira classe ou na classe econômica.
Utilize um array unidimensional do tipo primitivo boolean para representar o gráfico de assentos do avião. Inicialize todos os elementos do array como false para indicar que todas as poltronas estão desocupadas. À medida que cada assento é atribuído, configure o elemento correspondente do array como true para indicar que o assento não está mais disponível. Seu aplicativo nunca deve atribuir uma poltrona que já foi reservada. Quando a classe econômica estiver lotada, seu aplicativo deve perguntar à pessoa se ela aceita ficar na primeira classe (e vice-versa). Se sim, faça a atribuição apropriada de assento. Se não, exiba a men-
sagem "Next flight leaves in 3 hours" [O próximo voo parte em 3 horas].
~~~
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean[] seats = new boolean[10];
        int choice;
        int controlFC = 0;
        int controlEC = 5;
        int choiceClass;
        System.out.println("Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica: ");
        choice = input.nextInt();

        while (choice == 1 || choice == 2) {
            if (choice == 1){
                if (controlFC < 5) {
                    seats[controlFC] = true;
                    controlFC++;
                }
                else {
                    if (controlEC < 10) {
                        System.out.println("Aceita ficar na classe econômica? 0 (Não) - 1 (Sim):");
                        choiceClass = input.nextInt();
                        if (choiceClass == 1) {
                            seats[controlEC] = true;
                            controlEC++;
                        }
                        else
                            System.out.println("O próximo voo parte em 3 horas");
                    }
                    else {
                        System.out.println("O próximo voo parte em 3 horas");
                    }
                }
            }
            else {
                if (controlEC < 10) {
                    seats[controlEC] = true;
                    controlEC++;
                }
                else {
                    if (controlFC < 5) {
                        System.out.println("Aceita ficar na classe econômica? 0 (Não) - 1 (Sim):");
                        choiceClass = input.nextInt();
                        if (choiceClass == 1) {
                            seats[controlFC] = true;
                            controlFC++;
                        }
                        else
                            System.out.println("O próximo voo parte em 3 horas");
                    }
                    else {
                        System.out.println("O próximo voo parte em 3 horas");
                    }
                }
            }
            for (int i = 0; i < seats.length; i++){
                System.out.printf("%b   ", seats[i]);
            }
            System.out.println();
            choice = input.nextInt();
        }
    }
}
~~~

TODO: Criar um método para atribuição de assentos, diminuindo a quantidade de estruturas de decisão.

7.20 (Vendas totais) Utilize um array bidimensional para resolver o seguinte problema: uma empresa tem quatro equipes de vendas (1 a 4) que vendem cinco produtos diferentes (1 a 5). Uma vez por dia, cada vendedor passa uma nota de cada tipo de produto diferente vendido. Cada nota contém o seguinte: a) O número do vendedor b) O número do produto c) O valor total em reais desse produto vendido nesse dia Portanto, cada vendedor passa entre 0 e 5 notas de vendas por dia. Suponha que as informações a partir de todas as notas durante o último mês estejam disponíveis. Escreva um aplicativo que leia todas essas informações sobre as vendas do último mês e resuma as vendas totais por vendedor e por produto. Todos os totais devem ser armazenados no array bidimensional sales. Depois de processar todas as informações do último mês, exiba os resultados em formato tabular, com cada coluna representando um vendedor particular e cada linha representando um produto particular. Some cada linha para obter o total das vendas de cada produto no último mês. Some cada coluna para obter o total de vendas por vendedor no último mês. Sua saída tabular deve incluir esses totais cruzados à direita das linhas totalizadas e na
parte inferior das colunas totalizadas.
 
~~~
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] sales = new int[5][6];
        int total;
        int totalProducts = 0;
        int totalSeller = 0;
        int dias = 2;
        while (dias > 0){
            for (int i = 1; i < 5; i++){
                for (int j = 1; j < 6; j++) {
                    total = input.nextInt();
                    sales[i][j] += total;
                }
            }
            dias--;
        }
        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 6; j++){
                totalSeller += sales[i][j];
            }
            System.out.printf("Vendedor %d - Total: %d%n", i, totalSeller);
            totalSeller = 0;
        }
        for (int i = 1; i < 6; i++){
            for (int j = 1; j < 5; j++){
                totalProducts += sales[j][i];
            }
            System.out.printf("Produto %d - Total: %d%n", i, totalProducts);
            totalProducts = 0;
        }
    }
}
~~~

