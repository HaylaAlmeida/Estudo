# Módulos de programa em Java

Os métodos são declarados dentro de classes. Em geral, as classes são agrupadas em pacotes para que possam ser importadas e reutilizadas. 

Os métodos permitem modularizar um programa separando suas tarefas em unidades autocontidas. As instruções em um método são escritas somente uma vez e permanecem ocultas
de outros métodos.

Usar os métodos existentes como blocos de construção para criar novos programas é uma forma de reutilização de software que permite evitar repetição de código dentro de 
um programa.

# Métodos static, campos static

Uma chamada de método especifica o nome do método a ser chamado e fornece os argumentos que o método chamado requer para realizar sua tarefa. Quando a chamada de método 
é concluída, o método retorna um resultado, ou simplesmente o controle, ao seu chamador.

Uma classe pode conter métodos static para realizar tarefas comuns que não exigem um objeto da classe. Quaisquer dados que um método static poderia requerer para realizar
suas tarefas podem ser enviados ao método como argumentos em uma chamada de método. Um método static é chamado especificando o nome da classe em que o método é 
declarado seguido por um ponto (.) e pelo nome do método, como em NomeDaClasse.nomeDoMétodo(argumentos)

Todos os objetos de uma classe compartilham uma cópia dos campos static da classe. As variáveis de classe e as variáveis de instância representam os campos de uma classe.

Quando você executa a Java Virtual Machine (JVM) com o comando java, a JVM carrega a classe especificada e utiliza esse nome de classe para invocar o método main. 
É possível especificar argumentos de linha de comando adicionais que a JVM passará para o seu aplicativo.

Você pode colocar um método main em cada classe que declara — somente o método main na classe que você utiliza para executar o aplicativo
será chamado pelo comando java.

# Declarando métodos com múltiplos parâmetros

Quando um método é chamado, o programa faz uma cópia dos valores de argumento do método e os atribui aos parâmetros correspondentes do método. Quando o controle do
programa retorna ao ponto em que método foi chamado, os parâmetros do método são removidos da memória.

Um método pode retornar no máximo um valor, mas o valor retornado poderia ser uma referência a um objeto que contém muitos valores. 

Variáveis devem ser declaradas como campos de uma classe somente se forem utilizadas em mais de um método da classe ou se o programa deve salvar seus valores entre 
chamadas aos métodos da classe.

Se um método tiver mais de um parâmetro, os parâmetros serão especificados como uma lista separada por vírgulas. Deve haver um argumento na chamada de método para 
cada parâmetro na declaração do método. Além disso, cada argumento deve ser consistente com o tipo do parâmetro correspondente. Se um método não aceitar argumentos, 
a lista de parâmetros ficará vazia.

Strings podem ser concatenadas com o operador +, o que posiciona os caracteres do operando direito no final daqueles no operando esquerdo.

Cada objeto e valor primitivos no Java podem ser representados como uma String. Quando um objeto é concatenado com uma String, ele é convertido em uma String e então 
as duas Strings são concatenadas.

Se um boolean for concatenado com uma String, a palavra “true” ou “false” é utilizada para representar o valor boolean. 

Todos os objetos em Java têm um método especial chamado toString que retorna uma representação String do conteúdo do objeto. Quando um objeto é concatenado com uma
String, a JVM chama implicitamente o método toString do objeto a fim de obter a representação string do objeto.

Pode-se dividir grandes literais String em várias Strings menores e colocá-las em múltiplas linhas de código para melhorar a legibilidade, depois remontar as Strings 
utilizando concatenação.

# Notas sobre a declaração e utilização de métodos
Há três maneiras de chamar um método — utilizar o próprio nome de um método para chamar um outro método da mesma classe; utilizar uma variável que contém uma 
referência a um objeto, seguido por um ponto (.) e o nome do método para chamar um método do objeto referenciado; e utilizar o nome da classe e um ponto (.)
para chamar um método static de uma classe.

Há três maneiras de retornar o controle a uma instrução que chama um método. Se o método não retornar um resultado, o controle retornará quando o fluxo do programa 
alcançar a chave direita de fechamento do método ou quando a instrução return; for executada. Se o método retornar um resultado, a instrução return expressão;
avalia a expressão e então imediatamente retorna o valor resultante ao chamador.

# Pilhas de chamadas de método e quadros de pilha 

As pilhas são conhecidas como estruturas de dados do tipo último a entrar, primeiro a sair (last-in, first-out –— LIFO) — o último item inserido na pilha é o 
primeiro item que é removido dela.

Um método chamado deve saber como retornar ao seu chamador, portanto o endereço de retorno do método de chamada é colocado na pilha de chamadas de método quando o 
método for chamado. Se uma série de chamadas de método ocorrer, os sucessivos endereços de retorno são empilhados na ordem “último a entrar, primeiro a sair”, de 
modo que o último método a executar será o primeiro a retornar ao seu chamador.

A pilha de chamadas de método contém a memória para as variáveis locais utilizadas em cada invocação de um método durante a execução de um programa. Esses dados são
conhecidos como registro de ativação ou quadro de pilha da chamada de método. Quando uma chamada de método é feita, o quadro de pilha para ela é colocado na pilha
de chamadas de método. Quando o método retorna ao seu chamador, a sua chamada do registro de ativação é retirada da pilha e as variáveis locais não são mais conhecidas
para o programa.

Se mais chamadas de método forem feitas do que o quadro de pilha pode armazenar na pilha de chamadas de método, ocorre um erro conhecido como estouro de pilha. 
O aplicativo compilará corretamente, mas sua execução causa um estouro de pilha.

# Promoção e coerção de argumentos 
A promoção de argumentos converte o valor de um argumento para o tipo que o método espera receber no parâmetro correspondente. 

Regras de promoção se aplicam a expressões que contêm valores de dois ou mais tipos primitivos e a valores de tipo primitivo passados como argumentos para os métodos. 
Cada valor é promovido para o tipo “mais alto” na expressão. Em casos em que as informações podem ser perdidas por causa da conversão, o compilador Java exige que se 
utilize um operador de coerção para forçar explicitamente que a conversão ocorra.

# Estudo de caso: geração segura de números aleatórios

Objetos da classe SecureRandom (pacote java.security) podem produzir valores aleatórios não determinísticos.

O método nextInt SecureRandom gera um valor aleatório.

A classe SecureRandom fornece uma outra versão do método nextInt que recebe um argumento int e retorna um valor a partir de 0, mas sem incluí-lo, até o valor do argumento.

Números aleatórios em um intervalo podem ser gerados com int number = valorDeDeslocamento + randomNumbers.nextInt(fatorDeEscalonamento);
onde valorDeDeslocamento especifica o primeiro número no intervalo desejado de inteiros consecutivos e fatorDeEscalonamento especifica quantos números estão no intervalo.

Os números aleatórios podem ser escolhidos a partir de intervalos de inteiro não consecutivos, como em int number = valorDeDeslocamento + diferençaEntreValores * randomNumbers.nextInt(fatorDeEscalonamento); onde valorDeDeslocamento especifica o primeiro número no intervalo de valores, diferençaEntreValores representa a diferença entre números consecutivos na sequência e fatorDeEscalonamento especifica quantos números estão no intervalo.

# Estudo de caso: um jogo de azar; apresentando tipos enum 

Um tipo enum é introduzido pela palavra-chave enum e um nome de tipo. Como com qualquer classe, as chaves ({ e }) delimitam o corpo de uma declaração enum. Entre as chaves há uma lista de constantes enum, cada uma representando um valor único separado por vírgula. Os identificadores em uma enum devem ser únicos. Pode-se atribuir variáveis de um tipo enum somente a constantes do tipo enum.

Constantes também podem ser declaradas como variáveis private static final. Essas constantes, por convenção, são declaradas com todas as letras maiúsculas fazendo com que elas se destaquem no programa.

# Escopo das declarações 

O escopo é a parte do programa em que uma entidade, como uma variável ou um método, pode ser referida pelo seu nome. Diz-se que essa entidade está “no escopo” para essa parte do programa.

O escopo de uma declaração de parâmetro é o corpo do método em que a declaração aparece. • O escopo de uma declaração de variável local é do ponto em que a declaração aparece até o final desse bloco. 

O escopo de uma declaração de variável local que aparece na seção de inicialização do cabeçalho de uma instrução for é o corpo da instrução for e as outras expressões no cabeçalho.

O escopo de um método ou campo de uma classe é o corpo inteiro da classe. Isso permite que os métodos da classe utilizem nomes simples para chamar os outros métodos da classe e acessem os campos da classe.

Qualquer bloco pode conter declarações de variável. Se uma variável local ou um parâmetro em um método tiver o mesmo nome de um campo, este permanece sombreado até que o bloco termine a execução.

# Sobrecarga de método 

O Java permite métodos sobrecarregados em uma classe, desde que os métodos tenham diferentes conjuntos de parâmetros (determinados pelo número, ordem e tipo de parâmetros).

Métodos sobrecarregados são distinguidos por suas assinaturas — combinações dos nomes e número, tipos e ordem dos parâmetros dos méto-
dos, mas não pelos tipos de retorno.
