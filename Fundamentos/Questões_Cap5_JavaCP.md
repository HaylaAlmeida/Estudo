5.5 Descreva os quatro elementos básicos de repetição controlada por contador.

inicialização; condiçãoDeLoop; contador
   instrução
   
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
