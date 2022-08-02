4.10 Compare e contraste a instrução de seleção única if e a instrução de repetição while. Qual é a semelhança dessas duas instruções? Qual é a diferença?

A semelhança é que ambas precisam de uma condição verdadeira para realizarem as instruções, a diferença é que enquanto a if executa a instrução apenas uma vez, a while pode
executar múltiplas vezes.

4.11 Explique o que acontece quando um programa Java tenta dividir um inteiro por outro. O que acontece para a parte fracionária do cálculo? Como você 
pode evitar esse resultado?

A parte fracionária é truncada(perdida), para evitar é só utilizar um operador de coerção para o tipo float ou double em um dos valores.

4.13 Que tipo de repetição seria apropriado para calcular a soma dos primeiros 100 inteiros positivos? Que tipo seria apropriado para calcular a soma de um número arbitrário de inteiros positivos? 
Descreva brevemente como cada uma dessas tarefas poderia ser realizada.

Repetição por contador e repetição por sentinela, respectivamente.

4.14 Qual é a diferença entre pré-incrementar e pós-incrementar uma variável?

Pré-incrementar é aumentar o valor de uma variável antes de usá-la e pós-incrementar é aumentar o valor da variável depois de usá-la.

Para os exercícios de 4.17 a 4.20, execute cada um dos seguintes passos:
a) Leia a declaração do problema. 
b) Formule o algoritmo utilizando pseudocódigo e refinamento passo a passo de cima para baixo (top-down stepwise). 
c) Escreva um programa Java.
d) Teste, depure e execute o programa Java.
e) Processe três conjuntos completos de dados.

4.17 (Quilometragem de combustível) Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista monitorou várias viagens registrando a 
quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada os quilômetros
dirigidos e os litros de gasolina consumidos (ambos como inteiros) para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem
e imprimir a quilometragem total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. Todos os cálculos de média devem produzir
resultados de ponto flutuante. Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.

1º Refinamento

Exibir o consumo de cada viagem e o total

2º Refinamento
```
Inicializar as variáveis
Inserir os registros e calcular o consumo
Somar todos os consumos
Exibir o consumo de cada viagem e o total
````
3º Refinamento
```
Inicializar a variável de quilometragem como zero
Inicializar a variável soma de quilometragem como zero
Inicializar a variável consumo como zero
Inicializar a variável soma de consumo como zero 


Solicite que o usuário insira a quilometragem
Insira a quilometragem
Enquanto a quilometragem for maior que zero
    Solicite que o usuário insira o consumo
    Insira o consumo
    Some a quilometragem
    Some o consumo
    Solicite que o usuário insira a quilometragem
    Insira a quilometragem
    Imprimir o consumo e o total
```
Programa
~~~   
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km = 0;
        int combustivel = 0;
        double consumo = 0;
        int somaKm = 0;
        int somaCombustivel = 0;

        System.out.println("Insira a quilometragem rodada: ");
        km = input.nextInt();

        while(km > 0){
            somaKm += km;
            System.out.println("Insira a quantidade de combustivel gasto: ");
            combustivel = input.nextInt();
            somaCombustivel += combustivel;
            consumo = (double) km/combustivel;
            System.out.printf("O consumo nessa corrida foi de %.2f km por litro%n", consumo);
            System.out.printf("O total de km foi %d km%n", somaKm);
            System.out.printf("O total de combustível foi %d litros%n", somaCombustivel);
            System.out.println("Insira a quilometragem rodada\n(Para sair, insira um número menor ou igual a 0): ");
            km = input.nextInt();
        }

    }
} 
~~~
4.18 (Calculador de limite de crédito) Desenvolva um aplicativo Java que determina se um cliente de uma loja de departamentos excedeu o limite de crédito em uma conta-corrente. Para cada cliente, os seguintes dados estão disponíveis: 

a) Número de conta. 

b) Saldo no início do mês. 

c) Total de todos os itens cobrados desse cliente no mês. 

d) Total de créditos aplicados ao cliente no mês.

e) Limite de crédito autorizado.

O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial + despesas – créditos), exibir o novo saldo e determinar se o novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo limite de crédito foi excedido, o programa deve
exibir a mensagem "Limite de crédito excedido".

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numDeConta;
        int saldo;
        int itens;
        int credito;
        int limite;
        int novoSaldo;

        System.out.println("Insira o número de conta do cliente: ");
        numDeConta = input.nextInt();

        while (numDeConta != 0) {
            System.out.println("Insira o saldo inicial do cliente: ");
            saldo = input.nextInt();
            System.out.println("Insira a cobrança do cliente: ");
            itens = input.nextInt();
            System.out.println("Insira o total de crédito aplicado ao cliente: ");
            credito = input.nextInt();
            System.out.println("Insira o limite de crédito do cliente: ");
            limite = input.nextInt();
            novoSaldo = saldo + itens - credito;

            if (novoSaldo > limite){
                System.out.printf("O novo saldo é: %d\n", novoSaldo);
                System.out.println("Limite de crédito excedido");
            }
            else {
                System.out.printf("O novo saldo é: %d\n", novoSaldo);
            }
            System.out.println("Insira o número de conta do cliente: ");
            numDeConta = input.nextInt();
        }
    }
}
~~~

4.19 (Calculador de comissão de vendas) Uma grande empresa paga seu pessoal de vendas com base em comissões. O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante esse período. Por exemplo, um vendedor que realiza um total de vendas de mercadorias de R$ 5.000 em uma semana recebe R$ 200 mais 9% de R$ 5.000, um total de R$ 650. Foi-lhe fornecida uma lista dos itens vendidos por cada vendedor. Os valores desses itens são como segue:

![image](https://user-images.githubusercontent.com/80348569/182262101-9b63662e-1caf-4ef6-aa02-76a1a4dd1df1.png)

Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana e calcula e exibe os rendimentos do vendedor. Não existe nenhum limite para o número de itens que pode ser vendido.

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id;
        double valor, salario, comissao, total, salarioFinal;
        comissao = 0.09;
        salario = 200;
        total = 0;

        System.out.println("Insira o ID do item: ");
        id = input.nextInt();

        while (id > 0) {
            System.out.println("Insira o preço do item: ");
            valor = input.nextDouble();
            total += valor;
            System.out.println("Insira o ID do item (0 para sair): ");
            id = input.nextInt();
        }
        salarioFinal = salario + total * comissao;
        System.out.printf("O salário do vendedor é: %.2f\n", salarioFinal);

    }
}
~~~

4.20 (Calculador de salários) Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. A empresa paga as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40 horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana passada e o salário-hora de cada um. Seu programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar e exibir o salário bruto do empregado. Utilize a classe Scanner para inserir os dados.

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 1;
        int horasNormais = 40;
        int horasTotais = 0;
        double salarioFinal, salarioHora = 0, aumento = 1.5;

        while (cont != 4){
            System.out.printf("Insira as horas trabalhadas do %d funcionário: \n", cont);
            horasTotais = input.nextInt();
            System.out.printf("Insira o salário-hora do %d funcionário: \n", cont);
            salarioHora = input.nextDouble();
            salarioFinal = horasNormais * salarioHora + aumento * ((horasTotais - horasNormais) * salarioHora);
            System.out.printf("O salário do %d funcionário é: %.2f\n\n", cont, salarioFinal);
            cont++;
        }
    }
}
~~~

4.21 (Localize o maior número) O processo de localizar o maior valor é muito utilizado em aplicativos de computador. Por exemplo, um programa que determina o vencedor de uma competição de vendas inseriria o número de unidades vendidas por cada vendedor. O vendedor que vende mais unidades ganha a competição. Escreva um programa em pseudocódigo e, então, um aplicativo Java que aceita como entrada uma série de 10 inteiros e determina e imprime o maior dos inteiros. Seu programa deve utilizar pelo menos as três variáveis a seguir: 

a) counter: um contador para contar até 10 (isto é, monitorar quantos números foram inseridos e determinar quando todos os 10 números foram processados).

b) number: o inteiro mais recentemente inserido pelo usuário.

c) largest: o maior número encontrado até agora.

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int number = 0;
        int largest = 0;

        while (counter < 10) {
            System.out.printf("Insira o número %d: \n", counter + 1);
            number = input.nextInt();
            if (number > largest){
                largest = number;
            }
            counter++;
        }
        System.out.printf("O maior número é: %d", largest);
    }
}
~~~

4.22 (Saída no formato de tabela) Escreva um aplicativo Java que utiliza um loop para imprimir a seguinte tabela de valores:
![image](https://user-images.githubusercontent.com/80348569/182271664-efa926d8-a4a3-446d-87a4-bb0486f3792c.png)

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        System.out.printf("N\t\t10*N\t\t100*N\t\t1000*N%n");
        while (counter < 6){
            System.out.printf("%d\t\t%d\t\t\t%d\t\t\t%d%n", counter, counter * 10, counter * 100, counter * 1000);
            counter++;
        }
    }
}
~~~
4.23 (Encontre os dois números maiores) Utilizando uma abordagem semelhante àquela do Exercício 4.21, encontre os dois maiores valores entre os 10 valores inseridos. [Observação: você só pode inserir cada número uma vez.]

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int number = 0;
        int largest = 0;
        int largest2 = 0;
        int aux = 0;

        while (counter < 10) {
            System.out.printf("Insira o número %d: \n", counter + 1);
            number = input.nextInt();
            if (number > largest){
                aux = largest;
                largest = number;
            }
            largest2 = aux;
            counter++;
        }
        System.out.printf("O maior número é: %d e o segundo maior é: %d\n", largest, largest2);
    }
}
~~~
4.24 (Validando entrada de usuário) Modifique o programa na Figura 4.12 para validar suas entradas. Para qualquer entrada, se o valor entrado for diferente de 1 ou 2, continue o loop até o usuário inserir um valor correto.

~~~
import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();
            while (result != 1 && result != 2) {
                System.out.print("Re-enter result (1 = pass, 2 = fail): ");
                result = input.nextInt();
            }
            if (result == 1)
                passes = passes + 1;
            else
                        failures = failures + 1;
            studentCounter++;
        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
}
~~~

4.29 (Quadrado de asteriscos) Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e, então, exibe um quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os comprimentos de lado possíveis
entre 1 e 20.
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lado, linha = 0, coluna = 0, cont = 0;
        System.out.printf("Insira o tamanho do quadrado: ");
        lado = input.nextInt();
        linha = lado;
        while (cont < lado) {
            coluna = 0;
            while (coluna < linha) {
                System.out.printf("*\t");
                coluna++;
            }
            System.out.println("");
            cont++;
        }

    }
}
~~~

4.30 (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da direita para a esquerda. Por exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e 11611. Escreva um aplicativo que lê em um inteiro de cinco dígitos e determina se ele é ou não um palíndromo. Se o número não for de cinco dígitos, exiba uma mensagem de
erro e permita que o usuário insira um novo valor.
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inteiro, resto,soma=0,temp;

        System.out.printf("Insira um inteiro de cinco dígitos: ");
        inteiro = input.nextInt();
        while (inteiro < 10000 || inteiro > 99999) {
            System.out.printf("Insira um inteiro de cinco dígitos: \n");
            inteiro = input.nextInt();
        }

        temp = inteiro;
        while(inteiro > 0){
            resto = inteiro % 10;
            soma = (soma * 10) + resto;
            inteiro = inteiro / 10;
        }
        if(temp == soma)
            System.out.println("Palíndromo");
        else
            System.out.println("Não é palíndromo");
    }
}
~~~

4.31 (Imprimindo o equivalente decimal de um número binário) Escreva um aplicativo que insere um número inteiro que contém somente 0s e 1s (isto é, um número inteiro binário) e imprime seu equivalente decimal. [Dica: utilize os operadores de resto e divisão para pegar os dígitos do número binário um de cada vez da direita para a esquerda. No sistema de números decimais, o dígito mais à direita tem um valor posicional de 1 e o próximo dígito à esquerda um valor posicional de 10, depois 100, depois 1.000 e assim por diante. O número decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de número binário, o dígito mais à direita tem um valor posicional de 1, o próximo dígito à esquerda um valor posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal
do binário 1.101 é 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int binario, resto, soma=0, cont = 1;

        System.out.printf("Insira um binário: ");
        binario = input.nextInt();

        while(binario > 0){
            resto = binario % 10;
            soma += resto * cont;
            binario = binario / 10;
            cont *= 2;
        }
        System.out.printf("%d%n", soma);
    }
}
~~~

4.32 (Padrão de tabuleiro de damas de asteriscos) Escreva um aplicativo que utiliza apenas as instruções de saída 

System.out.print("* "); 

System.out.print(" "); 

System.out.println(); 

para exibir o padrão de tabuleiro de damas a seguir. Uma chamada de método System.out.println sem argumentos faz com que o pro-
grama gere saída de um único caractere de nova linha. [Dica: as instruções de repetição são requeridas.]

![image](https://user-images.githubusercontent.com/80348569/182286177-fac4bb4a-5bf5-41a8-a1b6-b6f123604668.png)

~~~
public class Main {
    public static void main(String[] args) {

        int cont = 8, coluna = 0;

        while (cont > 0) {
            coluna = 0;
            while (coluna < 8){
                System.out.print("* ");
                System.out.print(" ");
                coluna++;
            }
            System.out.println();
            if (cont % 2 == 0){
                System.out.print(" ");
            }
            cont--;
        }
    }
}
~~~

4.35 (Lados de um triângulo) Escreva um aplicativo que lê três valores diferentes de zero inseridos pelo usuário, determina e imprime se eles poderiam representar os lados de um triângulo.

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.printf("Lado A: \n");
        a = input.nextInt();
        System.out.printf("Lado B: \n");
        b = input.nextInt();
        System.out.printf("Lado C: \n");
        c = input.nextInt();
        if (a + b > c && b + c > a && a + c > b){
            System.out.printf("Sim\n");
        }
        else
            System.out.printf("Não\n");
    }
}
~~~
4.36 (Lados de um triângulo direito) Escreva um aplicativo que lê três inteiros diferentes de zero, determina e imprime se eles poderiam representar os lados de um triângulo direito.
~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, maior;
        System.out.printf("Lado A: \n");
        a = input.nextInt();
        maior = a;
        System.out.printf("Lado B: \n");
        b = input.nextInt();
        System.out.printf("Lado C: \n");
        c = input.nextInt();
        if (b > maior){
            maior = b;
        }
        if (c > maior){
            maior = c;
        }
        if ((a + b) > c && (b + c) > a && (a + c) > b){
            if (b == maior){
                if (maior*maior == (a*a+c*c)){
                    System.out.println("Sim");
                }
            }  else if (c == maior) {
                if (maior*maior == (a*a+b*b)){
                    System.out.println("Sim");
                }
            } else {
                if (a*a == (b*b+c*c)) {
                    System.out.println("Sim");
                }
            }
        }
        else {
            System.out.printf("Não\n");
        }
    }
}
~~~

4.37 (Fatorial) O fatorial de um inteiro não negativo n é escrito como n! (pronuncia-se “n fatorial”) e é definido como segue: 

n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n maiores ou iguais a 1)
e n! = 1 (para n = 0)

Por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.

a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu fatorial.

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, soma = 1;
        System.out.println("Insira um número para descobrir seu fatorial: ");
        n = input.nextInt();
        while (n > 0){
            soma *= n;
            n--;
        }
        System.out.printf("%d%n", soma);
    }
}
~~~

b) Escreva um aplicativo que estima o valor da constante matemática e utilizando a fórmula a seguir. Permita ao usuário inserir o número de termos a calcular. 

e = 1 + 1/1! + 1/2! + 1/3! + ...

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, fatorial = 1, termos;
        double e = 1;
        System.out.println("Quantidade de iterações: ");
        n = input.nextInt();
        termos = 0;
        while (n > 0){
            termos = n;
            fatorial = 1;
            while (termos > 0) {
                fatorial *= termos;
                termos--;
            }
            e = e + 1/(double) fatorial;
            n--;
        }
        System.out.printf("%f%n", e);
    }
}
~~~

c) Escreva um aplicativo que computa o valor de e x utilizando a fórmula a seguir. Permita ao usuário inserir o número de termos a calcular.

e^x = 1 + x/1! + + x^2/2! + x^3/3! + ...

~~~
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, fatorial = 1, termos, cont = 0, x, aux;
        double e = 1;
        System.out.println("Quantidade de iterações: ");
        n = input.nextInt();
        System.out.println("Valor de x: ");
        x = input.nextInt();
        aux = x;
        termos = 0;
        while (n > 0){
            termos = n;
            fatorial = 1;
            cont = termos;
            x = aux;
            while (termos > 0) {
                fatorial *= termos;
                termos--;
            }
            while (cont > 1){
                 x *= aux;
                 cont--;
            }
            e = e + x/(double) fatorial;
            n--;
        }
        System.out.printf("%f%n", e);
    }
}
~~~



