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
