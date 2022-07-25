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
2.15 - Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto, diferença e quociente (divisão).
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
