# Estrutura de sequência

A estrutura de sequência está incorporada ao Java. A não ser que seja instruído de outra forma, o computador executa as instruções Java uma depois da outra na 
ordem em que elas são escritas — isto é, em sequência.

# Instruções de seleção

O Java contém três tipos de instruções de seleção. A instrução if realiza uma ação (seleciona), se uma condição for verdadeira, ou pula a ação, se a condição for falsa.
A instrução if…else realiza uma ação se uma condição for verdadeira e uma ação diferente se a condição for falsa. A instrução switch realiza uma de muitas ações
diferentes, dependendo do valor de uma expressão.

A instrução if é uma instrução de seleção única porque seleciona ou ignora uma única ação (um único grupo de ações). A instrução if…else é chamada instrução de seleção
dupla porque seleciona entre duas ações diferentes (ou grupos de ações). A instrução switch é chamada de instrução de seleção múltipla porque seleciona entre muitas ações
diferentes (ou grupos de ações).

# Instruções de repetição

O Java fornece três instruções de repetição (também chamadas de iteração ou instruções de loop) que permitem que programas executem instruções repetidamente, contanto que
uma condição (chamada de condição de continuação do loop) permaneça verdadeira. As instruções de repetição são while,do…while, for e instruções for aprimoradas.

As instruções while e for realizam a ação (ou grupo de ações) no seu corpo zero ou mais vezes — se a condição de continuação de loop for inicialmente falsa, a ação 
(ou grupo de ações) não será executada. A instrução do…while realiza a ação (ou grupo de ações) no seu corpo uma ou mais vezes.

# Instrução if

A instrução if é uma instrução de controle de uma única entrada e uma única saída.

# Instrução if... else

A instrução if... else permite especificar uma ação a realizar quando a condição é verdadeira e uma ação diferente quando a condição é falsa.

# Instruções if…else aninhadas 

Um programa pode testar múltiplos casos colocando instruções if…else dentro de outras instruções if…else para criar instruções if…else aninhadas.

# Blocos 

A instrução if normalmente espera somente uma instrução no seu corpo. Para incluir várias instruções no corpo de uma if (ou no corpo de um else de uma instrução if…else), inclua as instruções dentro de chaves. As instruções contidas em um par de chaves (como o corpo de um método) formam um bloco. Um bloco pode ser colocado em qualquer lugar em um método em que uma única instrução pode ser colocada.

# Operador condicional (?:)

O Java fornece o operador condicional (?:), que pode ser utilizado no lugar de uma instrução if...else. O operador condicional é o único operador ternário do Java (isto é, um operador que recebe três operandos). Juntos, os operandos e o símbolo ?: formam uma expressão condicional. O primeiro operando (à esquerda do ?) é uma expressão boolean (isto é, uma condição que é avaliada como um valor boolean — true ou false), o segundo operando (entre o ? e :) é o valor da expressão condicional se a expressão boolean for true e o terceiro operando (à direita do :) é o valor da expressão condicional se a expressão boolean for avaliada como false. Por exemplo, a instrução

System.out.println(studentGrade >= 60 ? "Passed" : "Failed");

imprime o valor do argumento da expressão condicional de println. A expressão condicional nessa instrução é avaliada para a string "Passed" se a expressão boolean studentGrade >= 60 for verdadeira e para a string "Failed" se a expressão boolean for falsa. 

# Instrução de repetição while

Uma instrução de repetição while permite especificar que um programa deve repetir uma ação enquanto alguma condição permanece verdadeira.

# Repetição controlada por contador 

A repetição controlada por contador utiliza uma variável chamada contador (ou variável de controle) para controlar o número de vezes que um conjunto de instruções é executado.

A repetição controlada por contador costuma ser chamada de repetição definida, porque o número de repetições é conhecido antes de o loop começar a executar.

Um total é uma variável utilizada para acumular a soma de vários valores. Variáveis utilizadas para armazenar totais normalmente são inicializadas como zero antes de serem utilizadas em um programa.

A declaração de uma variável local deve aparecer antes de a variável ser utilizada nesse método. Uma variável local não pode ser acessada fora do método em que é declarada.

Quando a divisão de um inteiro por outro resulta em um número fracionário, a parte fracionária do cálculo é truncada.

# Repetição controlada por sentinela 

Na repetição controlada por sentinela, um valor especial chamado de valor de sentinela (também chamado de valor de sinal, valor fictício ou valor de flag) é utilizado para indicar o “fim da entrada de dados”.

Deve-se escolher um valor de sentinela que não possa ser confundido com um valor aceitável de entrada. 

O refinamento passo a passo de cima para baixo é essencial para o desenvolvimento de programas bem estruturados. 

Para realizar um cálculo de ponto flutuante com valores inteiros, faça a coerção (conversão) de um dos números inteiros para o tipo double. 

O Java sabe como avaliar somente expressões aritméticas nas quais os tipos dos operandos são idênticos. Para assegurar isso, o Java realiza uma operação chamada de promoção em operandos selecionados.

O operador de coerção unário é formado colocando-se parênteses em torno do nome de um tipo.

# Operadores de atribuição compostos 

Os operadores de atribuição compostos abreviam expressões de atribuição. 

Instruções da forma 

variável = variável operador expressão;

em que operador é um dos operadores binários +, - *, / ou %, podem ser escritas na forma 

variável operador= expressão;

# Operadores de incremento e decremento

O operador de incremento unário, ++, e operador de decremento unário, ––, adicionam 1 ao, ou subtraem 1 do, valor de uma variável numérica.

O operador de decremento ou incremento que é prefixado a uma variável é o operador de incremento de prefixo ou decremento de prefixo, respectivamente. O operador de incremento ou decremento que é pós-fixado a uma variável é o operador de incremento pós-fixo ou decremento
pós-fixo, respectivamente.

Utilizar o operador de pré-incremento ou pré-decremento para adicionar ou subtrair 1 é conhecido como pré-incrementar ou pré-decrementar, respectivamente. Pré-incrementar (ou pré-decrementar) uma variável faz com que a variável seja incrementada ou decrementada por 1; então o novo valor da variável é utilizado na expressão em que ela aparece.

Utilizar o operador de incremento ou decremento pós-fixo para adicionar ou subtrair 1 é conhecido como pós-incrementar ou pós-decrementar, respectivamente. Pós-incrementar ou pós-decrementar a variável faz com que seu valor seja utilizado na expressão em que ele aparece; então o valor da variável é incrementado ou decrementado por 1.

Ao incrementar ou decrementar uma variável em uma instrução isolada, o pré-incremento ou o pós-incremento têm o mesmo efeito, assim como o pré-decremento ou o pós-decremento.






