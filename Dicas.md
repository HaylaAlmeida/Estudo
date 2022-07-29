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

# Dica de desempenho

1.1 - Utilizar as classes e os métodos da Java API em vez de escrever suas próprias 
versões pode melhorar o desempenho de programa, porque eles são cuidadosamente escritos para executar de
modo eficiente. Isso também diminui o tempo de desenvolvimento de
programa.

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

# Dica de portabilidade 

4.1 - Os tipos primitivos em Java são portáveis entre todas as plataformas de computador que suportam Java.
