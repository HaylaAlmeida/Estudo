# Observação de engenharia de software

1.1 - Utilize uma abordagem de bloco de construção para criar seus programas. 
Evite reinventar a roda — use as peças de alta qualidade existentes sempre que possível. 
Essa reutilização de software é um dos principais benefícios da programação orientada a objetos.

2.1 - Em cada nova versão Java, as APIs tipicamente contêm novos recursos que corrigem erros, aprimoram 
o desempenho ou oferecem meios melhores para realizar as tarefas. As versões mais antigas correspondentes
não são mais necessárias nem devem ser usadas. Diz-se que essas APIs estão obsoletas e podem ser removidas 
das versões Java posteriores. Muitas vezes você encontrará APIs obsoletas ao navegar na documentação API 
on-line. O compilador irá avisá-lo quando compilar o código que usa APIs obsoletas. Se você compilar o 
código com javac adotando o argumento de linha de comando -deprecation, o compilador informará quais 
recursos obsoletos você está usando. Para cada um, a documentação on-line
(http://docs.oracle.com/javase/7/docs/api/) indica e normalmente vincula o novo recurso que o substitui.

2.2 Por padrão, o pacote java.lang é importado em cada programa Java; portanto, java.lang é o único na 
Java API que não requer uma declaração import.

3.1 - O compilador Java não requer declarações import em um arquivo de código-fonte Java se o nome de classe totalmente qualificado for especificado sempre que um 
nome de classe é usado. A maioria dos programadores Java prefere o estilo de programação mais conciso que as declarações import fornecem.

3.2 - Anteceda cada variável de instância e declaração de método com um modificador de acesso. Geralmente, as variáveis de instância devem ser declaradas private e os métodos, public. Mais adiante no livro, discutiremos por que você pode querer declarar um método private.

4.1 Você não deve chamar métodos a partir de construtores. 

4.2 - A experiência tem mostrado que a parte mais difícil de resolver um problema em um computador é desenvolver o algoritmo para a
solução. Uma vez que um algoritmo correto foi especificado, produzir um programa Java normalmente é simples.

4.3 - Cada refinamento, bem como a própria parte superior, é uma especificação completa do algoritmo; somente o nível de detalhe varia.

4.4 - Muitos programas podem ser divididos logicamente em três fases: uma fase de inicialização que inicializa as variáveis do programa; uma fase de processamento que insere os valores dos dados e ajusta as variáveis do programa de maneira correspondente; e uma
fase de conclusão que calcula e insere os resultados finais.

4.5 - Termine o processo de refinamento passo a passo de cima para baixo quando tiver especificado o algoritmo de pseudocódigo em detalhes suficientes para você converter o pseudocódigo em Java. Normalmente, implementar o programa Java é então simples e direto.

4.6 - Alguns programadores não utilizam ferramentas de desenvolvimento de programa como pseudocódigo. Eles acreditam que seu objetivo final é resolver o problema em um computador e que escrever pseudocódigo só retarda a produção das saídas finais. Embora isso talvez funcione para problemas simples e conhecidos, pode levar a erros sérios e atrasos em projetos grandes e complexos.

5.1 - “Manter a coisa simples” é um bom conselho para a maior parte do código que você escreverá.

5.2 - Alguns programadores acham que break e continue violam a programação estruturada. Como os mesmos efeitos são alcançáveis
com as técnicas de programação estruturada, esses programadores não utilizam break ou continue.

5.3 - Há uma tensão entre alcançar engenharia de software de qualidade e alcançar o software de melhor desempenho. Às vezes, um desses objetivos é alcançado à custa do outro. Para todas as situações, exceto as de desempenho muito alto, aplique a seguinte regra
geral: primeiro, faça seu código simples e correto; então, torne-o rápido e pequeno, mas apenas se necessário.

6.1 - Familiarize-se com a rica coleção de classes e métodos fornecidos pela Java API (http://docs.oracle.com/javase/7/docs/ api/). Não reinvente a roda. Quando possível, reutilize as classes e métodos na Java API. Isso reduz o
tempo de desenvolvimento de programas e evita a introdução de erros.

6.2 - Para promover a capacidade de reutilização de software, todos os métodos devem estar limitados à realização de uma única tarefa
bem definida, e o nome do método deve expressar essa tarefa efetivamente.

6.3 - Se não puder escolher um nome conciso que expresse a tarefa de um método, seu método talvez tente realizar tarefas em demasia.
Divida esse método em vários menores.

6.4 - A classe Math faz parte do pacote java.lang, que é implicitamente importado pelo compilador, assim não é necessário importar a classe Math para utilizar seus métodos.

6.5 - Métodos podem retornar no máximo um valor, mas o valor retornado poderia ser uma referência a um objeto que contém muitos valores.

6.6 - Variáveis devem ser declaradas como campos da classe somente se forem utilizadas em mais de um método da classe ou se o programa deve salvar seus valores entre chamadas aos métodos da classe.

7.1 - É provável que sistemas na indústria que foram submetidos a testes extensivos ainda contenham erros. Nossa preferência por sistemas de produção robustos é capturar e tratar exceções em tempo de execução, como ArrayIndexOutOfBoundsExceptions, para garantir que um sistema continue funcionando ou falhe de maneira “elegante” e informar os desenvolvedores do sistema sobre o problema.

8.1 - Valide todos os argumentos do método antes de usá-los para definir os valores das
variáveis de instância a fim de garantir que os dados do objeto só sejam modificados se todos os argumentos forem válidos.

8.2 - Métodos declarados com o modificador de acesso private só podem ser chamados por outros métodos da classe em que os métodos private são declarados. Esses métodos são comumente chamados de métodos utilitários ou métodos auxiliares porque eles são tipicamente utilizados para suportar a operação dos outros métodos
da classe.

8.3 - Classes simplificam a programação porque o cliente só pode utilizar os métodos public de uma classe. Normalmente, esses métodos são direcionados aos clientes em vez de à implementação. Os clientes não estão cientes de, nem envolvidos em, uma implementação da classe. Eles geralmente se preocupam com o que a classe faz, mas não como a classe faz isso.

8.4 - As interfaces mudam com menos frequência que as implementações. Quando uma implementação muda, o código dependente de implementação deve alterar correspondentemente. Ocultar a implementação reduz a possibilidade de que outras partes do progra-
ma irão se tornar dependentes dos detalhes sobre a implementação da classe.

# Dica de desempenho

1.1 - Utilizar as classes e os métodos da Java API em vez de escrever suas próprias 
versões pode melhorar o desempenho de programa, porque eles são cuidadosamente escritos para executar de
modo eficiente. Isso também diminui o tempo de desenvolvimento de
programa.

5.1 - Em loops, evite cálculos para os quais o resultado nunca muda — esses cálculos em geral devem ser colocados antes do loop. Muitos
compiladores de otimização sofisticados de hoje colocarão esses cálculos fora de loops no código compilado.

7.1 - Passar referências para arrays, em vez dos próprios objetos array, faz sentido por razões de desempenho. Como tudo em Java é passado por valor, se objetos array foram passados, uma cópia de cada elemento seria passada. Para arrays grandes, isso seria perda
de tempo e consumiria armazenamento considerável para as cópias dos elementos.

# Erro comum de programação

1.1 - Os erros como divisão por zero ocorrem enquanto um programa executa, então são chamados runtime errors 
ou erros de tempo de execução. Erros de tempo de execução fatais fazem os programas serem imediatamente 
encerrados sem terem realizado seus trabalhos com sucesso. Erros de tempo de execução não fatais permitem 
que os programas executem até sua conclusão, produzindo frequentemente resultados incorretos.

2.1 - Esquecer um dos delimitadores de um comentário tradicional ou Javadoc causa um erro de sintaxe. 
Um erro de sintaxe ocorre quando o compilador encontra o código que viola as regras da linguagem do Java 
(isto é, sua sintaxe). Essas regras são semelhantes às da gramática de um idioma natural que especifica a 
estrutura da sentença. Erros de sintaxe também são chamados erros de compilador, erros em tempo de compilação
ou erros de compilação, porque o compilador os detecta ao compilar o programa. Quando um erro de sintaxe é 
encontrado, o compilador emite uma mensagem de erro. Você deve eliminar todos os erros de compilação antes 
que o programa seja compilado corretamente.

2.2 - Um erro de compilação ocorre se um nome de arquivo da classe public não for exatamente igual ao nome 
dessa classe (tanto em termos de ortografia como capitalização), seguido pela extensão .java.

2.3 - Trata-se de um erro de sintaxe se chaves não aparecerem em pares correspondentes.

2.4 - Ao tentar usar o javac, se receber uma mensagem como “bad command or filename”, “javac: command not 
found” ou “‘javac' is not recognized as an internal or external command, operable program or batch file”, 
sua instalação do software Java não foi completada corretamente. Isso indica que a variável de ambiente de
sistema PATH não foi configurada de maneira adequada. Em alguns sistemas, depois de corrigir o PATH, 
talvez seja necessário reinicializar seu computador ou abrir uma nova janela de comando para que essas 
configurações sejam aplicadas.

2.5 - A mensagem de erro do compilador “class Welcome1 is public, should be declared in a file named 
Welcome1.java” indica que o nome de arquivo não corresponde ao da classe public no arquivo ou que você 
digitou o nome de classe incorretamente ao compilar a classe.

2.6 - Dividir uma instrução no meio de um identificador ou de uma string é um erro de sintaxe.

2.7 - Todas as declarações import devem aparecer antes da primeira declaração da classe no arquivo. 
Inserir uma declaração import dentro ou depois de uma declaração de classe é um erro de sintaxe.

2.8 - Esquecer-se de incluir uma declaração import para uma classe que deve ser importada resulta em 
um erro de compilação contendo uma mensagem como “cannot find symbol”. Quando isso ocorre, verifique
se você forneceu as declarações import adequadas e se os nomes nelas estão corretos, incluindo a 
capitalização apropriada.

2.9 - Confundir o operador de igualdade, ==, com o operador de atribuição, =, pode causar um erro de lógica
ou um erro de compilação. O operador de igualdade deve ser lido como “igual a”, e o operador de atribuição,
como “obtém” ou “obtém o valor de”. Para evitar confusão, algumas pessoas leem o operador de igualdade 
como “duplo igual” ou “igual igual”.

4.1 - Colocar um ponto e vírgula depois da condição em uma instrução if ou if…else resulta em um erro de lógica em instruções if de seleção única e um erro de 
sintaxe em instruções if…else de seleção dupla (quando a parte if contém uma instrução de corpo real).

4.2 - Não fornecer, no corpo de uma instrução while, uma ação que consequentemente faz com que a condição na while torne-se falsa
normalmente resulta em um erro de lógica chamado loop infinito (o loop nunca termina).

4.3 - Utilizar o valor de uma variável local antes de ela ser inicializada resulta em um erro de compilação. Todas as variáveis locais
devem ser inicializadas antes de seus valores serem utilizados nas expressões.

4.4 - Assumir que divisão de inteiros arredonda (em vez de truncar) pode levar a resultados incorretos. Por exemplo, 7 ÷ 4, que produz
1,75 na aritmética convencional, é truncado para 1 na aritmética de inteiros, em vez de arredondado para 2.

4.5 - Omitir as chaves que delimitam um bloco pode levar a erros de lógica, como loops infinitos. Para evitar esse problema, alguns programadores incluem o corpo de cada instrução de controle dentro de chaves mesmo se o corpo contiver somente uma única instrução.

4.6 - Um operador de coerção pode ser utilizado para conversão entre tipos numéricos e primitivos, como int e double e entre tipos por referência relacionados. Aplicar
uma coerção ao tipo errado pode causar erros de compilação ou erros de tempo de execução.

4.7 - Utilizar números de ponto flutuante de uma maneira que sejam representados precisamente pode levar a resultados incorretos.

4.8 - Tentar utilizar o operador de incremento ou decremento em uma expressão diferente daquela a que um valor pode ser atribuído é
um erro de sintaxe. Por exemplo, escrever ++(x + 1) é um erro de sintaxe, porque (x + 1) não é uma variável.

5.1 - Uma vez que valores de ponto flutuante podem ser aproximados, controlar loops com variáveis de ponto flutuante pode resultar em
valores de contador imprecisos e testes de terminação imprecisos.

5.2 - Utilizar um operador relacional incorreto ou um valor final incorreto de um contador de loop na condição de continuação do loop
de uma instrução de repetição pode causar um erro fora-por-um.

5.3 - Quando uma variável de controle de uma instrução for for declarada na seção de inicialização do cabeçalho de for, utilizar a
variável de controle depois do corpo de for é um erro de compilação.

5.4 - Colocar um ponto e vírgula imediatamente à direita do parêntese direito de um cabeçalho for torna o corpo desse for uma instrução vazia. Normalmente, esse é um erro de lógica.

5.5 - Utilizar um operador relacional incorreto na condição de continuação de um loop que conta para baixo (por exemplo, utilizar i <= 1 em vez de i >= 1 em uma contagem de loop para baixo até 1) normalmente é um erro de lógica.

5.6 - Não use operadores de igualdade (!= ou ==) em uma condição de continuação de loop se a variável de controle do loop é incrementada ou decrementada por mais que 1. Por exemplo, considere o cabeçalho da instrução for (int counter = 1; counter != 10; counter += 2). O teste de continuação de loop counter!= 10 nunca torna-se falso (resultando em um loop infinito) porque counter é incrementado por 2 após cada iteração.

5.7 - Esquecer uma instrução break quando esta for necessária em um switch é um erro de lógica.

5.8 - Em expressões que utilizam o operador &&, uma condição — que chamaremos de condição dependente — pode exigir que outra condição seja verdadeira para que a avaliação da condição dependente tenha significado. Nesse caso, a condição dependente deve ser colocada após o operador && para evitar erros. Considere a expressão (i != 0) && (10 / i == 2). A condição dependente (10 / i == 2) deve aparecer após o operador && para evitar a possibilidade de divisão por zero.

6.1 - Declarar parâmetros de método do mesmo tipo como float x, y em vez de float x, float y é um erro de sintaxe — um tipo é
requerido para cada parâmetro na lista de parâmetros.

6.2 - É um erro de sintaxe dividir um literal de String em linhas. Se necessário, você pode dividir uma String em unidades menores e utilizar concatenação para formar a String desejada.

6.3 - Confundir o operador + utilizado para concatenação de string com o operador + utilizado para adição pode levar a resultados estranhos. O Java avalia os operandos de um operador da esquerda para a direita. Por exemplo, suponha que a variável inteira y tem o valor 5, a expressão "y + 2 = " + y + 2 resulta na string "y + 2 = 52", não em "y + 2 = 7", porque o primeiro valor de y (5) é concatenado para a string "y + 2 = ", em seguida o valor 2 é concatenado para a nova e maior string "y + 2 = 5". A expressão "y + 2 = " + (y + 2) produz o resultado desejado "y + 2 = 7".

6.4 - Declarar um método fora do corpo de uma declaração de classe ou dentro do corpo de um outro método é um erro de sintaxe.

6.5 - Redeclarar um parâmetro como uma variável local no corpo do método é um erro de compilação.

6.6 - Esquecer de retornar um valor em um método que deve retornar um valor é um erro de compilação. Se um tipo de retorno além de void for especificado, o método deve conter uma instrução return, que retorna um valor consistente com o tipo de retorno do método. Retornar um valor de um método cujo tipo de retorno foi declarado como void é um erro de compilação.

6.7 - Converter um valor de tipo primitivo em um outro tipo primitivo pode alterar o valor se o novo tipo não for uma promoção válida. Por exemplo, converter um valor de ponto flutuante em um valor inteiro pode introduzir erros de truncamento (perda da parte fracionária) no resultado.

7.1 - Um índice deve ser um valor int ou um valor de um tipo que pode ser promovido para int — ou seja, byte, short ou char, mas
não long; caso contrário, ocorrerá um erro de compilação.

7.2 - Em uma declaração de array, especificar o número de elementos entre os colchetes da declaração (por exemplo, int[12] c;) é um erro de sintaxe.

7.3 - Declarar múltiplas variáveis de array em uma única declaração pode levar a erros sutis. Considere a declaração int[] a, b, c;. Se a, b e c devem ser declarados como variáveis de array, então essa declaração é correta — colocar os colchetes logo depois do tipo indica que todos os identificadores na declaração são variáveis de array. Entretanto, se apenas a destina-se a ser uma variável de array,
e b e c variáveis int individuais, então essa declaração é incorreta — a declaração int a[], b, c; alcançaria o resultado desejado.

7.4 - Atribuir um valor a uma variável final depois de ela ter sido inicializada é um erro de compilação. Da mesma forma, a tentativa de acessar o valor de uma variável final antes de ela ser inicializada resulta em um erro de compilação como “variable nomeDaVariável might not have been initialized”.

7.5 - Inserir reticências indicando uma lista de argumentos de comprimento variável no meio de uma lista de parâmetros é um erro de
sintaxe. As reticências só podem ser colocadas no fim da lista de parâmetros.

7.6 - Passar um array não classificado para binarySearch é um erro de lógica — o valor retornado é indefinido.

# Boa prática de programação 

2.1 - Algumas organizações exigem que todo programa comece com um comentário que informa o objetivo e o autor 
dele, a data e a hora em que foi modificado pela última vez.

2.2 - Utilize linhas e espaços em branco para aprimorar a legibilidade do programa.

2.3 - Recue o corpo inteiro de cada declaração de classe por um “nível” entre a chave esquerda e a chave 
direita que delimitam o corpo da classe. Esse formato enfatiza a estrutura da declaração de classe e 
torna mais fácil sua leitura. Usamos três espaços para formar um nível de recuo — muitos programadores
preferem dois ou quatro espaços. Qualquer que seja o estilo que você escolher, utilize-o de modo consistente.

2.4 - IDEs em geral recuam o código para você. A tecla Tab também pode ser usada para recuar o código. Você pode configurar cada IDE
para especificar o número de espaços inseridos ao pressionar Tab.

2.5 - Recue o corpo inteiro de cada declaração de método um “nível” entre as chaves que definem o corpo do 
método. Isso faz com que a estrutura do método se destaque, tornando a declaração do método mais fácil de 
ler.

2.6 - Coloque um espaço depois de cada vírgula (,) em uma lista de argumentos para tornar os programas 
mais legíveis.

2.7 - Declara cada variável em uma declaração própria. Esse formato permite que um comentário descritivo 
seja inserido ao lado de cada ser variável que é declarado.

2.8 - Escolher nomes de variáveis significativos ajuda um programa a ser autodocumentado (isto é, pode-se
entender o programa simplesmente lendo-o em vez de ler os documentos associados ou visualizar um número 
excessivo de comentários).

2.9 - Por convenção, identificadores de nomes de variáveis iniciam com uma letra minúscula e cada palavra
no nome depois da primeira começa com uma letra maiúscula. Por exemplo, o identificador de nome da variável
firstNumber inicia a sua segunda palavra, Number, com uma letra N maiúscula. Essa convenção de nomenclatura
é conhecida como notação camelo, porque as letras maiúsculas destacam-se como corcovas desse animal.

2.10 - Coloque espaços de ambos os lados de um operador binário para legibilidade.

2.11 - Insira uma única declaração por linha em um programa para facilitar a leitura.

2.12 - Ao escrever expressões que contêm muitos operadores, consulte a tabela do operador
de precedência (Apêndice A). Confirme se as operações na expressão são realizadas na ordem que você espera.
Se, em uma expressão complexa, você não estiver seguro quanto à ordem da avaliação, utilize parênteses 
para forçar essa ordem, exatamente como você faria em expressões algébricas.

![image](https://user-images.githubusercontent.com/80348569/181184653-96067475-14d4-498d-8284-68e0f338c736.png)

3.1 - Preferimos listar as variáveis de instância de uma classe primeiro no corpo dela, assim você pode ver 
o nome e o tipo das variáveis antes de elas serem utilizadas nos métodos da classe. Você pode listar as
variáveis de instância da classe em qualquer lugar nela, fora das suas instruções de método, mas espalhar
as variáveis de instância pode resultar em um código difícil de ler.

3.2 Usar a palavra-chave this é uma prática amplamente aceita a fim de minimizar a proliferação de 
nomes de identificadores.

4.3 - Em um loop controlado por sentinela, as instruções devem lembrar o usuário do sentinela.

4.4 - Diferentemente dos operadores binários, os operadores de incremento e decremento unários devem ser colocados ao lado dos seus operandos, sem espaços no meio.

4.5 Consulte a tabela de precedência e associatividade de operadores (Anexo A) ao escrever expressões que contêm muitos operadores. Confirme se os operadores na expressão são realizados na ordem em que você espera. Se não tiver certeza da ordem de avaliação em uma expressão complexa, divida a expressão em instruções menores ou use parênteses para forçar a ordem da avaliação, exatamente como faria em uma expressão algébrica. Certifique-se de observar que alguns operadores como atribuição (=) se associam da direita para a esquerda, em vez de da esquerda para a direita.

5.1 - Para melhor legibilidade, limite o tamanho de cabeçalhos da instrução de controle a uma única linha se possível.

5.2 - Sempre inclua chaves em uma instrução do…while. Isso ajuda a eliminar ambiguidade entre a instrução while e uma instrução
do...while que contém apenas uma instrução.

5.3 - Embora cada case e o caso default em uma switch possam ocorrer em qualquer ordem, coloque o caso default por último.
Quando o caso default é listado por último, o break para esse caso não é necessário.

7.1 - Para legibilidade, declare apenas uma variável por declaração. Mantenha cada declaração em uma linha separada e inclua um
comentário que descreva a variável sendo declarada.

7.2 - Variáveis constantes também são chamadas constantes nomeadas. Frequentemente, elas tornam os programas mais legíveis que os programas que utilizam valores literais (por exemplo, 10) — uma constante identificada como ARRAY_LENGTH indica claramente seu propósito, enquanto um valor literal poderia ter diferentes significados com base em seu contexto.

7.3 - Cada palavra das constantes nomeadas que contêm múltiplas palavras deve ser separada da seguinte por um sublinhado (_) como
em ARRAY_LENGTH.

# Dica de prevenção de erro 

2.1 - À medida que você escreve novos programas ou modifica aqueles existentes, mantenha seus comentários 
atualizados com o código. Programadores muitas vezes precisam fazer alterações no código existente para 
corrigir erros ou melhorar as capacidades. Atualizar seus comentários ajuda a garantir que eles reflitam 
com precisão o que o código faz. Isso facilitará a compreensão e a modificação dos seus programas no futuro.
Programadores que usam ou atualizam código com comentários desatualizados podem fazer suposições incorretas
sobre esse código que levam a erros ou até mesmo a violações de segurança.

2.2 - Quando você digita uma chave de abertura, ou chave esquerda, {, imediatamente digite a chave de 
fechamento, ou chave direita, }, então reposicione o cursor entre elas e dê um recuo para começar a 
digitação do corpo. Essa prática ajuda a evitar erros decorrentes da ausência das chaves. Muitos IDEs 
inserem a chave direita de fechamento automaticamente quando você digita a esquerda de abertura.

2.3 - Quando o compilador reporta um erro de sintaxe, talvez ele não esteja na linha que a mensagem de erro 
indica. Primeiro, verifique a linha em que o erro foi informado. Se você não encontrar um erro nessa linha,
analise várias linhas anteriores.

2.4 - Ao tentar executar um programa Java, se receber uma mensagem como “Exception in thread ‘main' 
java.lang. NoClassDefFoundError: Welcome1”, sua variável de ambiente CLASSPATH não foi configurada 
corretamente. Em alguns sistemas, talvez seja necessário reinicializar seu computador ou abrir uma nova 
janela de comando depois de configurar a CLASSPATH.

2.5 Uma instrução longa pode se estender por várias linhas. Se uma única instrução deve ser dividida em 
várias linhas, escolha pontos de quebras naturais, como depois de uma vírgula em uma lista separada por 
vírgulas ou depois de um operador em uma expressão longa. Se uma instrução for dividida em duas ou mais 
linhas, recue todas as subsequentes até o fim da instrução.

3.1 Nunca use como controle de formato uma string inserida pelo usuário. Quando o método System.out.printf
avalia a string de controle de formato no primeiro argumento, o método executa as tarefas com base no(s) 
especificador(es) de conversão nessa string. Se a string de controle de formato fosse obtida do usuário, 
alguém mal-intencionado poderia fornecer especificadores de conversão
que seriam executados por System.out.printf, possivelmente causando uma falha de segurança.

4.1 - Em uma if…else aninhada, certifique-se de testar todos os casos possíveis.

4.2 - Use expressões do mesmo tipo para o segundo e terceiro operandos do ?: para evitar erros sutis.

4.3 - Inicialize cada contador e total, em sua declaração ou em uma instrução de atribuição. Normalmente, os totais são inicializados
como 0. Os contadores normalmente são inicializados como 0 ou 1, dependendo de como eles são utilizados.

4.4 - Ao realizar cálculos de divisão (/) ou resto (%) em que o operando à direita pode ser zero, teste e lide com isso (por exemplo, exibir
uma mensagem de erro) em vez de permitir que o erro ocorra.

4.5 - Inicializar variáveis locais quando são declaradas ajuda a evitar quaisquer erros de compilação que poderiam surgir de tentativas para utilizar variáveis não inicializadas. Embora o Java não exija que as inicializações das variáveis locais sejam incorporadas a
declarações, ele exige que variáveis locais sejam inicializadas antes de seus valores serem usados em uma expressão.

5.1 - Utilize números inteiros para controlar loops de contagem.

5.2 - Usar o valor final e o operador <= na condição de um loop ajuda a evitar erros fora-por-um. Para um loop que imprime os valores de 1 a 10, a condição de continuação do loop deve ser counter <= 10 em vez de counter < 10 (que causa um erro fora-por-um) ou counter < 11 (que é correto). Muitos programadores preferem a chamada contagem baseada em zero, em que se conta 10 vezes, counter seria inicializado como zero e o teste de continuação do loop seria counter < 10.

5.3 - Inteiros podem estourar, causando erros de lógica. Uma variável de controle de loop também pode
estourar. Escreva suas condições de loop com cuidado para evitar isso.

5.4 - Os loops infinitos ocorrem quando a condição de continuação do loop em uma instrução de repetição nunca se torna false. Para evitar essa situação em um loop controlado por contador, assegure que a variável de controle seja modificada durante cada iteração do loop a fim de que a condição de continuação do loop acabe por se tornar false. Em um loop controlado por sentinela, certifique-se de que o valor da sentinela é capaz de ser inserido.

5.5 - Embora o valor da variável de controle possa ser alterado no corpo de um loop for, evite fazê-lo assim porque essa prática pode levar a erros sutis.

5.6 - Não utilizar variáveis de tipo double (ou float) para realizar cálculos monetários precisos. A imprecisão dos números de ponto flutuante pode resultar em erros. Nos exercícios, você aprenderá a usar inteiros para realizar cálculos monetários precisos — o Java
também fornece a classe java.math.BigDecimal para esse propósito.

5.7 - Em uma instrução switch, certifique-se de testar todos os valores possíveis da expressão de controle.

5.8 - Forneça um case default nas instruções switch. Isso faz com que você se concentre na necessidade de processar condições excepcionais.

5.9 - Para clareza, evite expressões com efeitos colaterais (como atribuições) em condições. Elas podem tornar o código mais difícil de entender e levar a erros de lógica sutis.

5.10 - Expressões de atribuição (=) geralmente não devem ser utilizadas em condições. Cada condição deve resultar em um valor boolean; do contrário, ocorrerá um erro de compilação. Em uma condição, uma atribuição só irá compilar se uma expressão boolean for atribuída a uma variável boolean.

6.1 - Um método que realiza uma única tarefa é mais fácil de testar e depurar do que aquele que realiza muitas tarefas.

6.2 - Ao chamar um método que retorna um valor que indica se o método realizou sua tarefa com sucesso, certifique-se de verificar o
valor de retorno desse método e, se esse método não foi bem-sucedido, lide com a questão de forma adequada.

7.1 - Ao escrever o código para acessar um elemento do array, certifique-se de que o índice de array permanece maior ou igual a 0 e
menor que o comprimento do array. Isso evitaria ArrayIndexOutOfBoundsExceptions se seu programa estiver correto.

7.2 - A instrução for aprimorada simplifica o código iterando por um conjunto tornando o código mais legível e eliminando várias possibilidades de erro, como especificação inadequada do valor inicial da variável de controle, o teste de continuação de loop e a expressão de incremento.

7.3 - Ao comparar o conteúdo do array, sempre use Arrays.equals(array1, array2), que compara o conteúdo dos dois arrays, em vez
de array1.equals(array2), que compara se array1 e array2 se referem ao mesmo objeto array.

# Dica de portabilidade 

4.1 - Os tipos primitivos em Java são portáveis entre todas as plataformas de computador que suportam Java.

5.1 - As combinações de teclas pressionadas para inserir o fim do arquivo são dependentes do sistema.
