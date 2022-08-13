# Introdução

O polimorfismo permite escrever programas que processam objetos que compartilham a mesma superclasse como se todos fossem objetos da superclasse; isso pode simplificar 
a programação.

Com polimorfismo, podemos projetar e implementar sistemas que são facilmente extensíveis. As únicas partes de um programa que devem ser alteradas para acomodar 
as novas classes são aquelas que exigem conhecimento direto das novas classes que você adiciona à hierarquia.

# Demonstrando um comportamento polimórfico 

Quando o compilador encontra uma chamada de método feita por meio de uma variável, ele determina se o método pode ser chamado verificando
o tipo de classe da variável. Se essa classe contém a declaração adequada de método (ou herda um), a chamada é compilada. Em tempo de execução, o tipo do objeto que
a variável referencia determina o método real a utilizar.

Classes e métodos abstratos 

Classes abstratas não podem ser usadas para instanciar objetos, porque elas são incompletas. 

O propósito principal de uma classe abstrata é fornecer uma superclasse apropriada a partir da qual outras classes podem herdar e, assim, compartilhar um design comum.

As classes que podem ser utilizadas para instanciar objetos são chamadas classes concretas. Essas classes fornecem implementações de cada método que elas declaram
(algumas implementações podem ser herdadas).

Programadores costumam escrever código do cliente que usa apenas superclasses abstratas para reduzir as dependências do código do cliente para tipos específicos de 
subclasse.

As classes abstratas às vezes constituem vários níveis da hierarquia. 

Uma classe abstrata normalmente contém um ou mais métodos abstratos. 

Métodos abstratos não fornecem implementações. 

Uma classe que contém métodos abstratos deve ser declarada como uma classe abstract. Cada subclasse concreta deve fornecer implementações de cada um dos métodos
abstratos da superclasse.

Os construtores e métodos static não podem ser declarados abstract. 

Variáveis abstratas da superclasse podem conter referências a objetos de qualquer classe concreta derivada da superclasse. Os programas em geral utilizam essas 
variáveis para manipular objetos de subclasse polimorficamente. 

O polimorfismo é particularmente eficaz para implementar sistemas em camadas de software.

# Estudo de caso: sistema de folha de pagamento utilizando polimorfismo 

Um designer de hierarquia pode exigir que cada subclasse concreta forneça uma implementação adequada dos métodos incluindo um método abstract em uma superclasse.

A maioria das chamadas de método é resolvida em tempo de execução, com base no tipo de objeto que está sendo manipulado. Esse processo é conhecido como vinculação
dinâmica ou vinculação tardia.

Uma variável de superclasse pode ser usada para chamar apenas os métodos declarados na superclasse. 

O operador instanceof determina se um objeto tem o relacionamento é um com um tipo específico. 

Cada objeto no Java conhece sua própria classe e pode acessá-la pelo método Object, que retorna um objeto do tipo Class (pacote java. lang).

O relacionamento é um se aplica apenas entre a subclasse e suas superclasses, não vice-versa.

# Métodos e classes final

Um método que é declarado final em uma superclasse não pode ser sobrescrito em uma subclasse. 

Métodos declarados private são implicitamente final, porque você não pode sobrescrevê-los em uma subclasse.

Métodos que são declarados static são implicitamente final.

Uma declaração do método final nunca pode mudar, assim todas as subclasses utilizam a mesma implementação do método; e chamadas a métodos final são resolvidas em
tempo de compilação — isso é conhecido como vinculação estática.

O compilador pode otimizar os programas removendo as chamadas para os métodos final e colocando seu código expandido em linha em cada local de chamada do método.

Uma classe que é declarada final não pode ser estendida. 

Todos os métodos em uma classe final são implicitamente final.

# Criando e utilizando interfaces

Uma interface especifica quais operações são permitidas, mas não como elas são realizadas. 

A interface Java descreve um conjunto de métodos que podem ser chamados em um objeto. 

Uma declaração de interface começa com a palavra-chave interface. 

Todos os membros de interface devem ser public e as interfaces não podem especificar nenhum detalhe de implementação, como declarações de método concreto e variáveis 
de instância.

Todos os métodos declarados em uma interface são implicitamente métodos public abstract e todos os campos são implicitamente public, static e final.

Para utilizar uma interface, uma classe concreta deve especificar que ela implementa a interface e deve declarar cada método de interface com a assinatura 
especificada na declaração de interface. Uma classe que não implementa todos os métodos da interface deve ser declarada abstract.

Implementar uma interface é como assinar um contrato com o compilador que afirma: “Irei declarar todos os métodos especificados pela interface” ou “irei declarar
minha classe abstract”.

Em geral, uma interface é utilizada quando classes díspares (isto é, não relacionadas) precisam compartilhar métodos e constantes comuns. Isso permite que objetos 
de classes não relacionadas sejam processados polimorficamente — objetos de classes que implementam a mesma interface podem responder às mesmas chamadas de método.

Você pode criar uma interface que descreve a funcionalidade desejada e, então, implementar a interface em quaisquer classes que requerem essa funcionalidade.

Uma interface é geralmente utilizada em lugar de uma classe abstract quando não há implementação padrão a herdar — isto é, nenhuma variável de instância e nenhuma
implementação de método padrão.

Como ocorre com classes public abstract, interfaces são, em geral, tipos public, portanto, normalmente são declaradas em arquivos próprios com o mesmo nome da 
interface e com a extensão .java no nome do arquivo.

O Java não permite que subclasses herdem de mais de uma superclasse, mas permitem que uma classe herde de uma superclasse e implemente mais de uma interface.

Todos os objetos de uma classe que implementam múltiplas interfaces têm o relacionamento é um com cada tipo de interface implementado.

Uma interface pode declarar constantes. As constantes são implicitamente public, static e final.

# Melhorias na interface Java SE 8 

No Java SE 8, uma interface pode declarar métodos default — isto é, métodos public com implementações concretas que especificam como uma operação deve ser realizada.

Quando uma classe implementa uma interface, a classe recebe as implementações concretas default da interface se ela não sobrescrevê-las. 

Para declarar um método default em uma interface, simplesmente coloque a palavra-chave default antes do tipo de retorno do método e forneça um corpo de método completo.

Ao melhorar uma interface existente com métodos default — quaisquer classes que implementaram a interface original não irão violá-la — ela simplesmente receberá as
implementações do método padrão.

Com métodos padrão, você pode declarar implementações comuns de métodos nas interfaces (em vez de classes abstract), o que lhe dá mais flexibilidade para projetar
suas classes.

A partir do Java SE 8, as interfaces agora podem incluir métodos public static. 

A partir do Java SE 8, qualquer interface que contém um único método é conhecida como interface funcional. Há muitas dessas interfaces ao longo de todas as APIs Java.

Interfaces funcionais são usadas extensivamente com novas capacidades lambda do Java SE 8. Como veremos, lambdas fornecem uma notação
abreviada para criar métodos anônimos.
