Java: como programar - 10ª ed.

# 2.8 - Escreva instruções Java que realizem cada uma das seguintes tarefas:

a) Exibir a mensagem “Enter an integer: “, deixando o cursor na mesma linha.
~~~
System.out.print("Enter a integer: ");
~~~
b) Atribuir o produto de variáveis b e c para a variável a.
~~~
a = b * c;
~~~
c) Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.
~~~
// O programa executa um cálculo
~~~
# 2.10 - Supondo que x = 2 e y = 3, o que cada uma das instruções a seguir exibe?

a) System.out.printf(“x = %d%n”, x);

x = 2

b) System.out.printf(“Value of %d + %d is %d%n”, x, x, (x + x));

Value of 2 + 2 is 4

c) System.out.printf(“x =”);

x =

d) System.out.printf(“%d = %d%n”, (x + y), (y + x));

5 = 5

# 2.14 - Escreva um aplicativo que exiba os números 1 a 4 na mesma linha, com cada par de adjacentes separados por um espaço. Use as seguintes técnicas:

a) Uma instrução System.out.println. 
~~~
System.out.println("1 2 3 4");
~~~
b) Quatro instruções System.out.print.
~~~
System.out.print("1 ");
System.out.print("2 ");
System.out.print("3 ");
System.out.print("4\n");
~~~
c) Uma instrução System.out.printf.
~~~
System.out.printf("%d %d %d %d\n", 1, 2, 3, 4);
~~~
# 2.15 - Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto, diferença e quociente (divisão).
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, y, soma, produto, diferença, quociente;
        x = input.nextInt();
        y = input.nextInt();
        soma = x + y;
        produto = x * y;
        diferença = x - y;
        quociente = x % y;
        System.out.printf("Primeiro número: %d\nSegundo número: %d\n", x, y);
        System.out.printf("Soma: %d\nProduto: %d\nDiferença: %d\nQuociente: %d\n", soma, produto, diferença, quociente);
        
    }
} 
~~~
# 2.16 -  Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número maior seguido pelas palavras “is larger". Se os números forem iguais, imprima a mensagem “These numbers are equal".
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, y;
        x = input.nextInt();
        y = input.nextInt();
        if (x > y) {
            System.out.printf("%d is larger\n", x);
        }
        if (y > x) {
            System.out.printf("%d is larger\n", y);
        }
        
        if (x == y) {
            System.out.print("These numbers are equal\n");
        }
        
    }
} 
~~~

# 2.17 - Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os números menores e maiores.

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, soma, media, produto;
        x = input.nextInt();
        y = input.nextInt();
        soma = x + y;
        produto = x * y;
        media = soma/2;
        System.out.printf("Soma: %d\nProduto: %d\nMédia: %d\n", soma, produto, media);
        if (x > y) {
            System.out.printf("Maior: %d\nMenor: %d", x, y);
        }
        if (y > x){
            System.out.printf("Maior: %d\nMenor: %d\n", y, x);
        }
        if (y == x){
            System.out.printf("Iguais");
        }
    }
}
~~~

# 2.18 - Escreva um aplicativo que exiba uma caixa, uma elipse, uma seta e um losango utilizando asteriscos (*), como segue:

![image](https://user-images.githubusercontent.com/80348569/180875289-c081be8e-ffe5-4eb0-bb50-114b950c6c91.png)
~~~
public class Main {
    public static void main(String[] args) {
        System.out.println("*********\t  ***\t\t * \t\t *");
        System.out.println("*\t\t*\t*\t  *\t\t***\t\t* *");
        System.out.println("*\t\t*  *\t   *   *****   *   *");
        System.out.println("*\t\t*  *\t   * \t *\t  *\t\t*");
        System.out.println("*\t\t*  *\t   * \t *   *\t\t *");
        System.out.println("*\t\t*  *\t   * \t *\t  *\t\t*");
        System.out.println("*\t\t*  *\t   * \t *     *   *");
        System.out.println("*\t\t*\t*\t  *\t\t *\t\t* *");
        System.out.println("*********\t  ***\t\t * \t\t *");
    }
}
~~~
Saída:

![image](https://user-images.githubusercontent.com/80348569/180878536-960cd939-edcc-4b6f-81aa-f9812df11e29.png)

# 2.24 - Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro no grupo. Utilizar somentes as técnicas de programação aprendidas no capítulo.

