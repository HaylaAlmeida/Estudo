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












