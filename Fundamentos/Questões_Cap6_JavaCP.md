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














