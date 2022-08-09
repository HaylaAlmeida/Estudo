# Estudo de caso da classe Time 

Os métodos public de uma classe também são conhecidos como os serviços public ou interface public da classe. Eles apresentam aos clientes da classe uma visualização dos
serviços fornecidos. 

Membros private de uma classe não são acessíveis aos clientes. 

O método static format da classe String é semelhante ao método System.out.printf, exceto que format retorna uma String formatada em vez de exibi-la em uma janela de 
comando.

Todos os objetos em Java têm um método toString que retorna uma representação String do objeto. O método toString é chamado implicitamente quando um objeto aparece no 
código onde uma String é necessária.

# Controlando o acesso a membros 
Os modificadores de acesso public e private controlam o acesso às variáveis e métodos de uma classe. 

O principal propósito dos métodos public é apresentar para os clientes da classe uma visualização dos serviços fornecidos. Os clientes não precisam se preocupar com a
forma como a classe realiza suas tarefas.

Variáveis private e métodos private de uma classe (isto é, os detalhes de implementação) não são acessíveis aos clientes.
# Referenciando membros do objeto atual com a referência this 

Um método de instância de um objeto utiliza implicitamente a palavra-chave this para referenciar variáveis de instância e outros métodos do objeto. A palavra-chave
this também pode ser utilizada explicitamente.

O compilador produz um arquivo separado com a extensão .class para cada classe compilada. 

Se uma variável local tiver o mesmo nome que o campo de uma classe, a variável local sombreia o campo. Você pode utilizar a referência this para referenciar o campo
sombreado explicitamente.

# Construtores sobrecarregados 

Construtores sobrecarregados permitem que objetos de uma classe sejam inicializados de diferentes maneiras. O compilador diferencia os construtores sobrecarregados
por suas assinaturas.

Para chamar um construtor de uma classe a partir de outro da mesma classe, use a palavra-chave this seguida por parênteses contendo os argumentos do construtor. Se 
utilizado, essa chamada de construtor deve aparecer como a primeira instrução no corpo do construtor.

# Construtores padrão e sem argumentos 

Se nenhum construtor for fornecido em uma classe, o compilador cria um construtor padrão. 

Se uma classe declarar construtores, o compilador não criará um construtor padrão. Nesse caso, você deve declarar um construtor sem argumento se a inicialização
padrão for necessária.

# Notas sobre os métodos Set e Get 

Os métodos set são comumente chamados de métodos modificadores porque geralmente alteram um valor. Métodos get são comumente chamados métodos acessores ou métodos
de consulta. Um método predicado testa se uma condição é verdadeira ou falsa.

# Composição 

Uma classe pode ter referências a objetos de outras classes como membros. Isso é chamado composição e, às vezes, é referido como um relacionamento tem um.

# Tipos enum 

Todos os tipos enum são tipos por referência. Um tipo enum é declarado com uma declaração enum, que é uma lista separada por vírgulas de constantes enum. 
A declaração pode incluir opcionalmente outros componentes das classes tradicionais, como construtores, campos e métodos. 

Constantes enum são implicitamente final, porque declaram constantes que não devem ser modificadas. 

Constantes enum são implicitamente static. 

Qualquer tentativa de criar um objeto de um tipo enum com um operador new resulta em um erro de compilação. 

Constantes enum podem ser utilizadas em qualquer lugar em que constantes podem ser usadas, como nos rótulos case das instruções switch e para controlar instruções
for aprimoradas.

Cada constante enum em uma declaração enum é opcionalmente seguida por argumentos que são passados para o construtor enum. 

Para cada enum, o compilador gera um método static chamado values que retorna um array das constantes do enum na ordem em que elas foram declaradas.

O método EnumSet static range recebe as primeiras e últimas constantes enum em um intervalo e retorna um EnumSet que contém todas as constantes entre essas duas 
constantes, inclusive.

# Coleta de lixo 

A Java Virtual Machine (JVM) realiza a coleta de lixo automaticamente para reivindicar a memória ocupada pelos objetos que não estão mais em uso. Quando não há mais
referências a um objeto, ele é marcado para coleta de lixo. A memória desse objeto pode ser reivindicada quando a JVM executa seu coletor de lixo.

# Membros da classe static 

Uma variável static representa informações por toda a classe, que são compartilhadas entre os objetos da classe. 

Variáveis static têm escopo de classe. Os membros public static de uma classe podem ser acessados por meio de uma referência a qualquer objeto da classe ou
qualificando o nome de membro com o nome de classe e um ponto (.). O código cliente só pode acessar os membros da classe static de uma classe private por meio dos
métodos da classe.

Membros da classe static existem assim que a classe é carregada na memória. 

Um método declarado static não pode acessar as variáveis de instância e os métodos de instância da classe, porque um método static pode ser chamado mesmo quando
nenhum objeto da classe foi instanciado. 

A referência this não pode ser utilizada em um método static.
# Importação static 

Uma declaração de importação static permite referenciar membros static importados sem o nome de classe e um ponto (.). Uma única declaração de importação static
importa um membro static e uma importação static por demanda importa todos os membros static de uma classe.

# Variáveis de instância final 

No contexto de um aplicativo, o princípio do menor privilégio afirma que deve ser concedida ao código somente a quantidade de privilégio e acesso que ele precisa para
realizar sua tarefa designada.

A palavra-chave final especifica que uma variável não é modificável. Essas variáveis devem ser inicializadas quando são declaradas ou por cada um dos construtores 
de uma classe.
# Acesso de pacote 

Se nenhum modificador de acesso for especificado para um método ou variável quando esse método ou variável é declarado em uma classe, o método ou variável é 
considerado como tendo acesso de pacote.

# Usando BigDecimal para cálculos monetários precisos 

Qualquer aplicativo que requer cálculos precisos de número de ponto flutuante sem erros de arredondamento — como aqueles em aplicações
financeiras — deve usar a classe BigDecimal (pacote java.math).

O método BigDecimal static valueOf com um argumento double retorna um BigDecimal que representa o valor exato especificado.

O método BigDecimal add adiciona o argumento BigDecimal ao BigDecimal em que o método é chamado e retorna o resultado. 

BigDecimal fornece as constantes ONE (1), ZERO (0) e TEN (10). 

O método BigDecimal pow levanta seu primeiro argumento à potência especificada em seu segundo
argumento. 

O método BigDecimal multiply multiplica o argumento BigDecimal pelo BigDecimal em que o método é chamado e retorna o resultado.

A classe NumberFormat (pacote java.text) fornece as capacidades para formatar valores numéricos como Strings específicas de localidade. O método getCurrencyInstance 
da classe static retorna um NumberFormat pré-configurado para valores de moedas específicos da localidade. O método NumberFormat realiza a formatação.

Formatação específica da localidade é uma parte importante da internacionalização — o processo de personalização dos seus aplicativos para várias localidades e 
idiomas falados dos usuários.

BigDecimal permite controlar como os valores são arredondados — por padrão, todos os cálculos são exatos e nenhum arredondamento ocorre. Se você não especifica
como arredondar valores BigDecimal e um determinado valor não pode ser representado exatamente ocorre uma ArithmeticException.

Você pode especificar o modo de arredondamento para BigDecimal fornecendo um objeto MathContext (pacote java.math) para o construtor da classe BigDecimal ao criar 
um BigDecimal. Você também pode fornecer um MathContext para vários métodos BigDecimal que realizam os cálculos. Por padrão, cada MathContext pré-configurado usa 
o assim chamado “arredondamento contábil”.

O escalonamento de um BigDecimal é o número de dígitos à direita do ponto decimal. Se você precisa de um BigDecimal arredondado para
um dígito específico, chame o método BigDecimal setScale.
