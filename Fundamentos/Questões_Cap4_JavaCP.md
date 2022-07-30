4.10 Compare e contraste a instrução de seleção única if e a instrução de repetição while. Qual é a semelhança dessas duas instruções? Qual é a diferença?

A semelhança é que ambas precisam de uma condição verdadeira para realizarem as instruções, a diferença é que enquanto a if executa a instrução apenas uma vez, a while pode
executar múltiplas vezes.

4.11 Explique o que acontece quando um programa Java tenta dividir um inteiro por outro. O que acontece para a parte fracionária do cálculo? Como você 
pode evitar esse resultado?

A parte fracionária é truncada(perdida), para evitar é só utilizar um operador de coerção para o tipo float ou double em um dos valores.

4.12 Descreva as duas maneiras como as instruções de controle podem ser combinadas.

Aninhar e 

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

Inicializar as variáveis
Inserir os registros e calcular o consumo
Somar todos os consumos
Exibir o consumo de cada viagem e o total

3º Refinamento

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
    
    
