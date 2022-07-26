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
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5, maior, menor;
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        maior = num1;
        menor = num1;

        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        if (num4 > maior) {
            maior = num4;
        }
        if (num5 > maior) {
            maior = num5;
        }
        if (menor > num2) {
            menor = num2;
        }
        if (menor > num3) {
            menor = num3;
        }
        if (menor > num4) {
            menor = num4;
        }
        if (menor > num5) {
            menor = num5;
        }
        System.out.printf("Maior: %d\nMenor: %d", maior, menor);
    }
}
~~~

# 2.25 - Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par.

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        num1 = input.nextInt();
        if (num1 % 2 == 0){
            System.out.println("Par");
        }
        else {
            System.out.println("Ímpar");
        }
    }
}
~~~

# 2.26 - Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e imprimir o resultado.
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        num1 = input.nextInt();
        num2 = input.nextInt();
        if (num1 % num2 == 0){
            System.out.println("Múltiplo");
        }
        else {
            System.out.println("Não é múltiplo");
        }
    }
}
~~~

# 2.27 - Escreva um aplicativo que exiba um padrão de tabuleiro de damas, como mostrado a seguir:

![image](https://user-images.githubusercontent.com/80348569/180896398-148141c2-fe8e-4393-91a2-934d61c83a97.png)
~~~
public class Main {
    public static void main(String[] args) {
        System.out.println("*  *  *  *  *  *  *  *");
        System.out.println("  *  *  *  *  *  *  *  *");
        System.out.println("*  *  *  *  *  *  *  *");
        System.out.println("  *  *  *  *  *  *  *  *");
        System.out.println("*  *  *  *  *  *  *  *");
        System.out.println("  *  *  *  *  *  *  *  *");
        System.out.println("*  *  *  *  *  *  *  *");
        System.out.println("  *  *  *  *  *  *  *  *");
    }
}
~~~

# 2.28 - Escreva um aplicativo que leia a entrada a partir do usuário do raio de um círculo como um inteiro e imprima o diâmetro do círculo, circunferência e área utilizando o valor do ponto flutuante 3,14159 para pi.
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int raio;
        raio = input.nextInt();
        System.out.printf("Diâmetro: %d%nCircunferência: %.0f%nÁrea: %.0f%n ", 2 * raio, 2 * Math.PI * raio, Math.PI * raio * raio);
    }
}
~~~

# 2.29 - Escreva um aplicativo que exiba os equivalentes inteiros de algumas letras maiúsculas, minúsculas, dígitos e símbolos especiais. Mostre os equivalentes inteiros do seguinte: A B C a b c 0 1 2 $ * + / e o caractere em branco.

~~~
public class Main {
    public static void main(String[] args) {
        System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
        System.out.printf("The character %c has the value %d%n", 'B', ((int) 'B'));
        System.out.printf("The character %c has the value %d%n", 'C', ((int) 'C'));
        System.out.printf("The character %c has the value %d%n", 'a', ((int) 'a'));
        System.out.printf("The character %c has the value %d%n", 'b', ((int) 'b'));
        System.out.printf("The character %c has the value %d%n", 'c', ((int) 'c'));
        System.out.printf("The character %c has the value %d%n", '0', ((int) '0'));
        System.out.printf("The character %c has the value %d%n", '1', ((int) '1'));
        System.out.printf("The character %c has the value %d%n", '2', ((int) '2'));
        System.out.printf("The character %c has the value %d%n", '$', ((int) '$'));
        System.out.printf("The character %c has the value %d%n", '*', ((int) '*'));
        System.out.printf("The character %c has the value %d%n", '+', ((int) '+'));
        System.out.printf("The character %c has the value %d%n", '/', ((int) '/'));
        System.out.printf("The character %c has the value %d%n", ' ', ((int) ' '));
    }
}
~~~

# 2.30 - Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário, separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços.
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, dezenaMilhar, unidadeMilhar, centena, dezena, dez_mil, mil, cem, dez;
        dez_mil = 10000;
        mil = 1000;
        cem = 100;
        dez = 10;
        numero = input.nextInt();
        dezenaMilhar = numero / dez_mil;
        numero = numero % dez_mil;
        unidadeMilhar = numero / mil;
        numero = numero % mil;
        centena = numero / cem;
        numero = numero % cem;
        dezena = numero / dez;
        numero = numero % dez;
        System.out.printf("%d\t%d\t%d\t%d\t%d\n", dezenaMilhar, unidadeMilhar, centena, dezena, numero);
    }
}
~~~

# 2.31 - Utilizando apenas as técnicas de programação que aprendendidas neste capítulo, escreva um aplicativo que calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir:

![image](https://user-images.githubusercontent.com/80348569/180903011-fd9ab0dd-9fe7-485b-87b4-c656cc97094d.png)

~~~
public class Main {
    public static void main(String[] args) {
        System.out.println("number\t\tsquare\t\tcube");
        System.out.println("0\t\t\t0\t\t\t0");
        System.out.println("1\t\t\t1\t\t\t1");
        System.out.println("2\t\t\t4\t\t\t8");
        System.out.println("3\t\t\t9\t\t\t27");
        System.out.println("4\t\t\t16\t\t\t64");
        System.out.println("5\t\t\t25\t\t\t125");
        System.out.println("6\t\t\t36\t\t\t216");
        System.out.println("7\t\t\t49\t\t\t343");
        System.out.println("8\t\t\t64\t\t\t512");
        System.out.println("9\t\t\t81\t\t\t729");
        System.out.println("10\t\t\t100\t\t\t1000");
    }
}
~~~

# 2.32 - Escreva um programa que insira cinco números, além de determinar e imprimir quantos negativos, quantos positivos e quantos zeros foram inseridos.
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5, cont_pos, cont_neg, cont_0;
        cont_pos = 0;
        cont_neg = 0;
        cont_0 = 0;
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();
        if (num1 < 0){
            cont_neg = cont_neg + 1;
        }
        else if (num1 == 0) {
            cont_0 = cont_0 + 1;
        }
        else {
            cont_pos = cont_pos + 1;
        }

        if (num2 < 0){
            cont_neg = cont_neg + 1;
        }
        else if (num2 == 0) {
            cont_0 = cont_0 + 1;
        }
        else {
            cont_pos = cont_pos + 1;
        }

        if (num3 < 0){
            cont_neg = cont_neg + 1;
        }
        else if (num3 == 0) {
            cont_0 = cont_0 + 1;
        }
        else {
            cont_pos = cont_pos + 1;
        }

        if (num4 < 0){
            cont_neg = cont_neg + 1;
        }
        else if (num4 == 0) {
            cont_0 = cont_0 + 1;
        }
        else {
            cont_pos = cont_pos + 1;
        }

        if (num5 < 0){
            cont_neg = cont_neg + 1;
        }
        else if (num5 == 0) {
            cont_0 = cont_0 + 1;
        }
        else {
            cont_pos = cont_pos + 1;
        }
        System.out.printf("Positivos: %d%nNegativos: %d%nZeros: %d%n", cont_pos, cont_neg, cont_0);
    }
}
~~~
