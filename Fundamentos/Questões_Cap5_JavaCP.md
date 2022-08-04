5.11 (Localize o menor valor) Escreva um aplicativo que localiza o menor de vários números inteiros. Suponha que o primeiro valor lido especifica o número de valores a serem inseridos pelo usuário.
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int range, menor = 0, num;
        range = input.nextInt();
        num = input.nextInt();
        menor = num;
        for (int i = 1; i < range; i++){
            if (num < menor) {
                menor = num;
            }
            num = input.nextInt();
        }
        System.out.printf("O menor número é: %,d%n", menor);
    }
}
~~~

5.12 (Calculando o produto de números inteiros ímpares) Escreva um aplicativo que calcula o produto dos números inteiros ímpares de 1 a 15.
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long produto = 1;

        for (int i = 1; i <= 15; i += 2){
            produto *= i;

        }
        System.out.printf("O produto dos inteiros ímpares de 1 até 15 é: %,d%n", produto);
    }
}
~~~


5.13 (Fatoriais) Fatoriais costumam ser utilizados em problemas de probabilidade. O fatorial de um inteiro positivo n (escrito como n! e pronunciado como “fatorial de n”) é igual ao produto dos números inteiros positivos de 1 a n. Escreva um aplicativo que calcula os fatoriais
de 1 a 20. Utilize o tipo long. Exiba os resultados em formato tabular. Que dificuldade poderia impedir você de calcular o fatorial de 100?

Fatoriais aumentam rapidamente, logo não haveria espaço suficiente para armazenar os dígitos decorrentes de fatoriais maiores.
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long produto = 1;
        
        for (int i = 1; i <= 20; i++){
            produto *= i;
            System.out.printf("%s de %d = ", "Fatorial", i);
            System.out.printf("%,d%n", produto);
        }
    }
}
~~~

5.14 (Programa de juros compostos modificado) Modifique o aplicativo de juros compostos da Figura 5.6 para repetir os passos para taxas de juros de 5%, 6%, 7%, 8%, 9% e 10%. Utilize um loop for para variar a taxa de juros.

~~~
public class Interest {
    public static void main(String[] args) {
        double amount = 0;
        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%20s%9s %n", "Year", "Amount on deposit", "Tax");

        for (int year = 1; year <= 10; ++year) {
            for (rate = 5; rate <= 10; rate++){
                amount = principal * Math.pow(1.0 + rate/100, year);
                System.out.printf("%4d%,20.2f%,8.0f%% %n", year, amount, rate);
            }
            System.out.println();
        }
    }
}
~~~

5.15 (Programa para impressão de triângulos) Escreva um aplicativo que exibe os seguintes padrões separadamente, um embaixo do outro. Utilize loops for para gerar os padrões. Todos os asteriscos (*) devem ser impressos por uma única instrução na forma System.out. print('*'); o que faz com que os asteriscos sejam impressos lado a lado. Uma instrução na forma System.out.println(); pode ser utilizada para mover-se para a próxima linha. Uma instrução na forma System.out.print(' '); pode ser utilizada para exibir um espaço para os últimos dois padrões. Não deve haver outras instruções de saída no programa. [Dica: os dois últimos padrões requerem
que cada linha inicie com um número adequado de espaços em branco.]

![image](https://user-images.githubusercontent.com/80348569/182657209-2620e297-f757-430f-a54f-a97667709148.png)

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int linha, col;

        for (linha = 1; linha <= 10; linha++){
            for (col = 1; col <= linha; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
~~~
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int linha, col;

        for (linha = 10; linha > 1; linha--){
            for (col = linha; col >= 1; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
~~~
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int linha, col;

        for (linha = 11; linha > 1; linha--){
            for (col = linha - 1; col >= 1; col--){
                System.out.print("*");
            }
            System.out.println();
            for (col = 0; col <= 11 - linha; col++) {
                System.out.printf(" ");
            }
        }
    }
}
~~~
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int linha, col, cont = 1;

        for (linha = 10; linha > 1; linha--){
            for (col = linha; col > 1; col--){
                System.out.print(" ");
            }
            for (col = 1; col <= cont; col++){
                System.out.printf("*");
            }
            cont++;
            System.out.println();
        }
    }
}
~~~

5.16 (Gráfico de barras do programa de impressão) Uma aplicação interessante dos computadores é exibir diagramas e gráficos de barras. Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada número que é lido, seu programa deve exibir o mesmo número de asteriscos adjacentes. Por exemplo, se seu programa lê o número 7, ele deve exibir *******. Exiba as barras dos asteriscos depois de ler
os cinco números.

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        for (int j = 0; j < num; j++){
            System.out.printf("*");
        }
        System.out.println();
        for (int j = 0; j < num2; j++){
            System.out.printf("*");
        }
        System.out.println();
        for (int j = 0; j < num3; j++){
            System.out.printf("*");
        }
        System.out.println();
        for (int j = 0; j < num4; j++){
            System.out.printf("*");
        }
        System.out.println();
        for (int j = 0; j < num5; j++){
            System.out.printf("*");
        }
        System.out.println();

    }
}
~~~

5.17 (Calculando vendas) Um varejista on-line vende cinco produtos cujos preços no varejo são como a seguir: produto 1, US$ 2,98; produto 2, US$ 4,50; produto 3, US$ 9,98; produto 4, US$ 4,49 e produto 5, US$ 6,87. Escreva um aplicativo que leia uma série de pares de números como segue: a) número de produto b) quantidade vendida
Seu programa deve utilizar uma instrução switch para determinar o preço de varejo de cada produto. Você deve calcular e exibir o valor de varejo total de todos os produtos vendidos. Utilize um loop controlado por sentinela para determinar quando o programa deve parar o loop
e exibir os resultados finais.
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidade;
        int numeroDoProduto;
        double total = 0;
        double produto1 = 2.98;
        double produto2 = 4.5;
        double produto3 = 9.98;
        double produto4 = 4.49;
        double produto5 = 6.87;

        numeroDoProduto = input.nextInt();
        quantidade = input.nextInt();

        while (numeroDoProduto > 0 && quantidade > 0){
            switch (numeroDoProduto) {
                case 1:
                    total += quantidade * produto1;
                    numeroDoProduto = input.nextInt();
                    quantidade = input.nextInt();
                    break;
                case 2:
                    total += quantidade * produto2;
                    numeroDoProduto = input.nextInt();
                    quantidade = input.nextInt();
                    break;
                case 3:
                    total += quantidade * produto3;
                    numeroDoProduto = input.nextInt();
                    quantidade = input.nextInt();
                    break;
                case 4:
                    total += quantidade * produto4;
                    numeroDoProduto = input.nextInt();
                    quantidade = input.nextInt();
                    break;
                case 5:
                    total += total + quantidade * produto5;
                    numeroDoProduto = input.nextInt();
                    quantidade = input.nextInt();
                    break;
                default:
                    break;
            }
        }
        System.out.printf("Total: %.2f", total);
    }
}
~~~
5.20 (Calculando o valor de $\pi$) Calcule o valor de $\pi$ a partir de uma série infinita

![image](https://user-images.githubusercontent.com/80348569/182777718-490f991e-f90f-43cb-b7c1-54fb4b114242.png)

Imprima uma tabela que mostre o valor aproximado de $\pi$ calculando os 200.000 primeiros termos dessa série. Quantos termos você tem de utilizar antes de primeiro obter um valor que começa com 3,14159? 

584 mil termos

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 0;
        int termos = input.nextInt(), operador = 1;

        for (int i = 1; i <= termos; i += 2){
            pi += operador * (double) 4/i;
            operador *= -1;
        }
        System.out.printf("%.20f%n", pi);
    }
}
~~~
5.24 (Programa de impressão de losangos) Escreva um aplicativo que imprime a seguinte forma de um losango. Você pode utilizar instruções de saída que imprimem um único asterisco (*), um único espaço ou um único caractere de nova linha. Maximize sua utilização de repetição (com instruções for aninhadas) e minimize o número de instruções de saída.

![image](https://user-images.githubusercontent.com/80348569/182772643-737e5636-9b81-425f-81dc-e54dfb01733e.png)

~~~
public class Main {
    public static void main(String[] args) {
        int cont = 10, i, j, k, l, cont2 = 10;
        for (i = 10; i > 0; i--){
            for (j = 0; j < 10; j++){
                if (i + j == 10){
                    for (l = 0; l < cont2 - 6; l++){
                        System.out.printf(" ");
                    }
                    for (k = 0; k < 11 - cont; k++){
                        System.out.printf("*");
                    }
                    if (j < 5 && cont > 2){
                        cont -= 2;
                        cont2 -= 1;
                    }
                    else {
                        cont += 2;
                        cont2++;
                    }
                }
            }
            System.out.println();
        }
    }
}
~~~
![image](https://user-images.githubusercontent.com/80348569/182773035-bf435323-9e29-40a2-8e02-0765dd003148.png)

5.25 (Programa de impressão de losangos modificado) Modifique o aplicativo que você escreveu na Questão 5.24 para ler um número ímpar no intervalo 1 a 19 para especificar o número de linhas no losango. Seu programa então deve exibir um losango do tamanho apropriado.

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont, i, j, k, l, cont2, valor;
        valor = input.nextInt();
        cont = valor;
        cont2 = valor;
        for (i = valor; i > 0; i--){
            for (j = 0; j < valor; j++){
                if (i + j == valor){
                    for (l = 0; l < cont2 - (valor/2 + 1); l++){
                        System.out.printf(" ");
                    }
                    for (k = 0; k < (valor+1) - cont; k++){
                        System.out.printf("*");
                    }
                    if (j < valor/2 && cont > 2){
                        cont -= 2;
                        cont2 -= 1;
                    }
                    else {
                        cont += 2;
                        cont2++;
                    }
                }
            }
            System.out.println();
        }
    }
}

~~~

![image](https://user-images.githubusercontent.com/80348569/182774197-db8d32e2-5c40-4716-af10-0e7cb4836664.png) ![image](https://user-images.githubusercontent.com/80348569/182774306-70bc59ee-283d-42bd-9ffd-d9448b7a2a25.png) ![image](https://user-images.githubusercontent.com/80348569/182774351-1451cb4d-b3fb-4c9a-bef7-e36af3bdff56.png) ![image](https://user-images.githubusercontent.com/80348569/182774462-adf52e3b-3777-42ef-9c09-e8628bad13e7.png) ![image](https://user-images.githubusercontent.com/80348569/182774492-c234bc33-04fe-41cc-b187-a7f53cb36d32.png) ![image](https://user-images.githubusercontent.com/80348569/182774584-206ab9ab-4044-4d42-bd18-093baf25f9cf.png)





