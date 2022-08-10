# Introdução 

A herança reduz o tempo de desenvolvimento de programas. 

A superclasse direta de uma subclasse é aquela a partir da qual a subclasse é herdada. A superclasse indireta de uma subclasse está dois ou mais níveis acima da
hierarquia de classe dessa subclasse.

Na herança única, uma classe deriva de uma superclasse. Na herança múltipla, uma classe é derivada de mais de uma superclasse direta. O Java não suporta herança múltipla.

Uma subclasse é mais específica que sua superclasse e representa um grupo menor de objetos. 

Cada objeto de uma subclasse também é um objeto da superclasse dessa classe. Entretanto, um objeto de superclasse não é um objeto de subclasses de sua classe.

Um relacionamento é um representa a herança. Em um relacionamento é um, um objeto de uma subclasse também pode ser tratado como um objeto de sua superclasse.

Um relacionamento tem um representa composição. Em um relacionamento tem um, um objeto de classe contém referências a objetos de outras classes.

# Superclasses e subclasses 

Os relacionamentos de herança simples formam estruturas hierárquicas do tipo árvore — há uma superclasse em um relacionamento hierárquico com suas subclasses.

# Membros protected 

Os membros public de uma superclasse são acessíveis onde quer que o programa tenha uma referência a um objeto dessa superclasse ou de suas subclasses.

Os membros private de uma superclasse só podem ser acessados diretamente em uma declaração da superclasse. 

Os membros protected de uma superclasse têm um nível intermediário de proteção entre acesso public e private. Eles podem ser acessados por membros da superclasse, 
de suas subclasses e de outras classes no mesmo pacote.

Os membros private de uma superclasse permanecem ocultos em suas subclasses e só podem ser acessados por meio dos métodos public ou protected herdados da superclasse.

Um método sobrescrito da superclasse pode ser acessado de uma subclasse se o nome do método da superclasse for precedido por super e um ponto (.) separador.

# Relacionamento entre superclasses e subclasses

Uma subclasse não pode acessar os membros private de sua superclasse, mas pode acessar os membros não private. 

Uma subclasse pode chamar um construtor de sua superclasse usando a palavra-chave super seguida por um conjunto de parênteses que contém os argumentos do construtor
da superclasse. Isso deve aparecer como a primeira instrução no corpo do construtor da subclasse.

Um método de superclasse pode ser sobrescrito em uma subclasse para declarar uma implementação apropriada para a subclasse. 

A anotação @Override indica que um método deve sobrescrever um método da superclasse. Quando o compilador encontra um método declarado com @Override, ele compara
a assinatura do método com as assinaturas dos métodos da superclasse. Se não houver uma correspondência exata, o compilador emite uma mensagem de erro, como
“method does not override or implement a method from a supertype” (“método não sobrescreve ou implementa um método a partir de um supertipo”).

O método toString não aceita nenhum argumento e retorna uma String. O método toString da classe Object normalmente é sobrescrito por uma subclasse.

Quando um objeto é enviado para a saída utilizando o especificador de formato %s, o método toString do objeto é chamado implicitamente para obter sua representação
de String.

# Construtores em subclasses 

A primeira tarefa de um construtor de subclasse é chamar o construtor de sua superclasse direta para garantir que as variáveis de instância herdadas da superclasse
sejam inicializadas.
