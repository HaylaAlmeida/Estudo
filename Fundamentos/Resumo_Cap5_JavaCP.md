# Repetição controlada por contador 

A repetição controlada por contador requer uma variável de controle, o valor inicial da variável de controle, o incremento pelo qual a variável de controle é modificada
a cada passagem pelo loop (também conhecido como cada iteração do loop) e a condição de continuação do loop, que determina se um loop deve continuar.

Você pode declarar uma variável e inicializá-la na mesma instrução.

# Instrução de repetição for 

A instrução while pode ser utilizada para implementar qualquer loop controlado por contador. 

A instrução for especifica todos os detalhes do contador — repetição controlada no cabeçalho. 

Quando a instrução for começa a ser executada, sua variável de controle é declarada e inicializada. Se inicialmente a condição de continuação do loop for verdadeira, o
corpo será executado. Depois de executar o corpo do loop, a expressão de incremento é executada. Então, o teste de continuação do loop é realizado novamente para 
determinar se o programa deve continuar com a próxima iteração do loop.

 O formato geral da instrução for é 
~~~
for (inicialização; condiçãoDeContinuaçãoDoLoop; incremento) 
    instrução
 ~~~     
onde a expressão inicialização nomeia a variável de controle do loop e fornece seu valor inicial, condiçãoDeContinuaçãoDoLoop é a condição que determina se o
loop deve continuar executando e incremento modifica o valor da variável de controle, para que a condição de continuação do loop por fim se torne falsa. Os dois
pontos e vírgulas no cabeçalho for são necessários.

A maioria das instruções for pode ser representada com instruções while equivalentes como a seguir: 
~~~
inicialização;

while (condiçãoDeContinuaçãoDoLoop) {

   instrução 
   incremento;
   
}
~~~
Em geral, as instruções for são utilizadas para repetição controlada por contador e as instruções while, para repetição controlada por sentinela. 

Se a expressão de inicialização no cabeçalho for declarar a variável de controle, esta só poderá ser utilizada nessa instrução for — ela não existirá fora da instrução
for.

As expressões em um cabeçalho for são opcionais. Se a condiçãoDeContinuaçãoDoLoop for omitida, o Java irá supor que ela sempre é verdadeira, criando assim um loop 
infinito. Pode-se omitir a expressão inicialização se a variável de controle for inicializada antes do loop. Pode-se omitir a expressão incremento se o 
incremento fosse calculado com instruções no corpo do loop ou se nenhum incremento fosse necessário.

A expressão incremento em uma instrução for atua como se ela fosse uma instrução independente no fim do corpo de for. 

Uma instrução for pode contar para baixo utilizando um incremento negativo — isto é, um decremento. Se a condição de continuação do loop for inicialmente false, 
o corpo da instrução for não executa.

# Exemplos com a estrutura for 

O especificador de formato %4s gera saída para uma String em um tamanho de campo de 4 — isto é, printf exibe o valor com pelo menos 4 posições de caractere. Se o
valor a ser enviado para a saída for menor do que a largura de 4 posições de caractere, o valor é alinhado à direita no campo por padrão. Se a largura tiver um
valor maior do que 4 posições de caractere, o tamanho do campo é expandido para acomodar o número apropriado de caracteres. Para alinhar o valor à esquerda,
utilize um número inteiro negativo para especificar o tamanho do campo.

Math.pow(x, y) calcula o valor de x elevado à y-ésima potência. O método recebe dois argumentos double e retorna um valor double. 

O flag de formatação vírgula (,) em especificador de formato indica que um valor de ponto flutuante deve ser gerado com um separador de agrupamento. O separador
real utilizado é específico à localidade do usuário (isto é, país). Nos Estados Unidos, o número terá vírgulas que separam cada três dígitos e um ponto decimal que 
separa a parte fracionária do número, como em 1,234.45.

O . em um especificador de formato indica que o número inteiro à direita é a precisão do número.

# Instrução de repetição do…while 

A instrução do…while é semelhante à instrução while. No while, o programa testa a condição de continuação do loop no início do loop, antes de executar seu corpo; se a
condição for falsa, o corpo nunca será executado. A instrução do…while testa a condição de continuação do loop depois de executar o corpo do loop; portanto, o corpo 
sempre executa pelo menos uma vez.

# A estrutura de seleção múltipla switch 

A instrução switch realiza diferentes ações com base nos valores possíveis de uma expressão integral (um valor constante do tipo byte, short, int ou char, mas não 
long) ou uma String.

A instrução switch consiste em um bloco que contém uma sequência de rótulos case e um caso default opcional. Em um switch, o programa avalia a expressão de controle e 
compara seu valor com cada rótulo case. Se ocorrer uma correspondência, o programa executará as instruções para esse case.

Listar casos consecutivamente sem instruções entre eles permite aos casos executar o mesmo conjunto de instruções. 

Cada valor que você deseja testar em um switch deve ser listado em um rótulo case separado. 

Cada case pode ter múltiplas instruções, e essas não precisam ser colocadas entre chaves. 

As instruções de um case geralmente terminam com uma instrução break que termina a execução do switch. 

Sem as instruções break, toda vez que ocorre uma correspondência nas instruções switch, as instruções para esse caso e casos subsequentes são executadas até que uma
instrução break ou o fim do switch seja encontrado.

Se não ocorrer nenhuma correspondência entre o valor da expressão controladora e um rótulo case, o caso default opcional é executado. Se não ocorrer nenhuma 
correspondência e o switch não contiver um caso default, o controle de programa simplesmente continua com a primeira instrução depois do switch.

# Instruções break e continue 

A instrução break, quando executada em um while, for, do…while ou switch, ocasiona a saída imediata dessa instrução. 

A instrução continue, quando executada em while, for ou do…while, pula as instruções do corpo remanescentes do loop e passa para a próxima iteração. Nas instruções
while e do…while, o programa avalia o teste de continuação do loop imediatamente. Em uma instrução for, a expressão incremento é executada, então o programa avalia o
teste de continuação do loop.

# Operadores lógicos 

As condições simples são expressas em termos dos operadores relacionais >, <, >= e <= e os operadores de igualdade == e !=, e cada expressão testa apenas uma condição.

Os operadores lógicos permitem-lhe formar condições complexas combinando condições simples. Os operadores lógicos são && (E condicional), || (OU condicional), 
& (E lógico booleano), | (OU inclusivo lógico booleano), ^ (OU exclusivo lógico booleano) e ! (NÃO lógico).

Para assegurar que duas condições são verdadeiras, utilize o operador && (E condicional). Se uma ou as duas condições simples forem falsas, a expressão inteira será falsa.

Para assegurar que uma das duas ou ambas as condições são verdadeiras, utilize o operador || (OU condicional), que é avaliado como verdadeiro se uma das ou ambas as 
condições simples forem verdadeiras.

Uma condição que usa os operadores && ou || utiliza a avaliação em curto-circuito — elas só são avaliadas até que se conheça se a condição é verdadeira ou é falsa.

Os operadores & e | funcionam de forma idêntica aos operadores && e ||, mas sempre avaliam ambos os operandos. • Uma condição simples que contém o operador OU exclusivo lógico booleano (^) é true se e somente se um de seus operandos for true e o outro for false. Se os dois operandos forem true ou ambos forem false, a condição inteira é false. Também é garantido que esse operador avaliará seus dois operandos.

O operador unário ! (NÃO lógico) “inverte” o valor de uma condição.
