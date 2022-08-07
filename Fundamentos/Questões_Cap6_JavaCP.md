6.14 (Exponenciação) Escreva um método integerPower(base, exponent) que retorne o valor de 

base^exponente

Por exemplo, integerPower(3, 4) calcula 34 (ou 3 * 3 * 3 * 3). Suponha que exponent seja um inteiro não zero, positivo, e base, um inteiro. Use uma instrução for ou while para controlar o cálculo. Não utilize métodos da classe Math. Incorpore esse método a um
aplicativo que lê os valores inteiros para base e exponent e realiza o cálculo com o método integerPower.


~~~
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base = input.nextInt();
        int exp = input.nextInt();

        System.out.printf("%d%n", integerPower(base, exp));

    }

    public static int integerPower(int base, int exp){
        int total = 1;
        for (int cont = 0; cont < exp; cont++){
            total *= base;
        }
        return total;
    }
}
~~~

6.15 (Cálculos de hipotenusa) Defina um método hypotenuse que calcula a hipotenusa de um triângulo retângulo quando são dados os comprimentos dos outros dois lados. 
O método deve tomar dois argumentos do tipo double e retornar a hipotenusa como um double. Incorpore esse método a um aplicativo que lê valores para side1 e side2 e 
realiza o cálculo com o método hypotenuse. Utilize os métodos Math pow e sqrt para determinar o tamanho da hipotenusa de cada um dos triângulos na Figura 6.15. 
[Observação: a classe Math também fornece o método hypot para realizar esse cálculo.]
~~~
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double side1 = input.nextDouble();
        double side2 = input.nextDouble();

        System.out.printf("%f%n", hypotenuse(side1, side2));

    }
    public static double hypotenuse(double side1, double side2){
        double hypotenuse = Math.sqrt((Math.pow(side1, 2) + Math.pow(side2, 2)));
        return hypotenuse;
    }
}
~~~

6.16 (Múltiplos) Escreva um método isMultiple que determina um par de inteiros se o segundo inteiro for um múltiplo do primeiro. O método deve aceitar dois argumentos
inteiros e retornar true se o segundo for um múltiplo do primeiro e false caso contrário. [Dica: utilize o operador de módulo.] Incorpore esse método a um aplicativo
que insere uma série de pares inteiros (um par por vez) e determina se o segundo valor em cada par é um múltiplo do primeiro.
~~~

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int primeiroNum = input.nextInt();
        int segundoNum = input.nextInt();
        System.out.printf("%s%n", (isMultiple(primeiroNum, segundoNum) ? "Sim":"Não"));

    }
    public static boolean isMultiple(int num1, int num2){
        if (num1 % num2 == 0)
            return true;
        else
            return false;
    }
}
~~~

6.17 (Par ou ímpar) Escreva um método isEven que utiliza o operador de resto (%) para determinar se um inteiro é par. O método deve levar um argumento inteiro e
retornar true se o número inteiro for par, e false, caso contrário. Incorpore esse método a um aplicativo que insere uma sequência de inteiros (um por vez) e determina se cada um é par ou ímpar.

~~~
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        System.out.printf("%s%n", (isEven(num) ? "Sim":"Não"));

    }
    public static boolean isEven(int num1){
        if (num1 % 2 == 0)
            return true;
        else
            return false;
    }
}
~~~

6.18 (Exibindo um quadrado de asteriscos) Escreva um método squareOfAsterisks que exibe um quadrado sólido (o mesmo número de linhas e colunas) de asteriscos cujo 
lado é especificado no parâmetro inteiro side. Por exemplo, se side for 4, o método deverá exibir

![image](https://user-images.githubusercontent.com/80348569/183265008-85cbdd30-9294-41d3-ad55-d3edb1006253.png)

Incorpore esse método a um aplicativo que lê um valor inteiro para side a partir da entrada fornecida pelo usuário e gera saída dos asteriscos com o método squareOfAsterisks.

6.19 (Exibindo um quadrado de qualquer caractere) Modifique o método criado no Exercício 6.18 para receber um segundo parâmetro do tipo char chamado fillCharacter. Forme o quadrado utilizando o char fornecido como um argumento. Portanto, se side for 5
e fillCharacter for #, o método deve exibir

![image](https://user-images.githubusercontent.com/80348569/183266021-b7fcfcf2-b26e-4cee-bff1-89182fa595fc.png)

Utilize a seguinte instrução (em que input é um objeto Scanner) para ler um caractere do usuário no teclado: 

char fill = input.next().charAt(0);
~~~
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int side= input.nextInt();
        char fill = input.next().charAt(0);
        squareOfAsterisks(side, fill);

    }
    public static void squareOfAsterisks(int side, char fillCharacter){
        for (int i = 0; i < side; i++){
            for (int j = 0; j < side; j++){
                System.out.printf("%s", fillCharacter);
            }
            System.out.println();
        }
    }
}
~~~
6.20 (Área de círculo) Escreva um aplicativo que solicita ao usuário o raio de um círculo e utiliza um método chamado circleArea para calcular a área do círculo.
~~~

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        System.out.printf("Area: %f%n", circleArea(raio));


    }
    public static double circleArea(double raio){
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}
~~~

6.21 (Separando dígitos) Escreva métodos que realizam cada uma das seguintes tarefas: 
~~~
a) Calcule a parte inteiro do quociente quando o inteiro a é dividido pelo inteiro b. 
b) Calcule o resto inteiro quando o inteiro a é dividido por inteiro b.
c) Utilize métodos desenvolvidos nas partes (a) e (b) para escrever um método displayDigits que recebe um inteiro 
entre 1 e 99999 e o exibe como uma sequência de dígitos, separando cada par de dígitos por dois espaços. 
~~~
Por exemplo, o inteiro 4562 deve aparecer como

4 5 6 2

Incorpore os métodos em um aplicativo que insere um número inteiro e chama displayDigits passando para o método o número
inteiro inserido. Exiba os resultados.

~~~
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        displayDigits(num);


    }
    public static void displayDigits(int num){
        int cont = 0;
        int aux = num;
        int resto = num;
        String str = "";
        while (aux > 0){
            aux = aux/10;
            cont++;
        }
        for (int i = cont - 1; i >= 0; i--){
            aux = (int) (resto / Math.pow(10, i));
            resto = (int) (resto % Math.pow(10, i));
            str += aux + "  ";

        }
        System.out.printf("%s", str);
    }
}
~~~

6.22 (Conversões de temperatura) Implemente os seguintes métodos inteiros: 

a) O método celsius retorna o equivalente em Celsius de uma temperatura em Fahrenheit utilizando o cálculo 

celsius = 5.0 / 9.0 * (fahrenheit - 32);

b) O método fahrenheit retorna o equivalente em Fahrenheit de uma temperatura em Celsius utilizando o cálculo 

fahrenheit = 9.0 / 5.0 * celsius + 32;

c) Utilize os métodos nas partes (a) e (b) para escrever um aplicativo que permite ao usuário inserir uma temperatura em Fahrenheit e
exibir o equivalente em Celsius ou inserir uma temperatura em Celsius e exibir o equivalente em Fahrenheit.
~~~
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        double temp = input.nextDouble();
        temperature(num, temp);


    }
    public static void temperature(int num, double temp){
        double celsius = temp;
        double fahrenheit = temp;
        switch (num){
            case 1:
                celsius = (fahrenheit - 32) * 5/9;
                System.out.printf("Celsius: %.2fº%n", celsius);
                break;
            case 2:
                fahrenheit = celsius * 9/5 + 32;
                System.out.printf("Fahrenheit: %.2fº%n", fahrenheit);
                break;
            default:
                System.out.println("Número inválido inserido");
                break;
        }
    }
}
~~~







