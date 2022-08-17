# Fundamentos de caracteres e strings 

O valor de um literal de caractere é seu valor inteiro em Unicode. As strings podem incluir letras, dígitos e caracteres especiais como +, -, *, / e $. Uma string no 
Java é um objeto da classe String. Os literais de String são frequentemente referidos como objetos e escritos entre aspas duplas em um programa.

# Classe String 

Objetos String são imutáveis — depois de criado, o conteúdo dos caracteres não pode ser alterado. 

O método String length retorna o número de caracteres em uma String. 

O método String charAt retorna o caractere em uma posição específica. 

O método String regionMatches compara partes de duas strings quanto à igualdade.

O método String equals testa quanto à igualdade. O método retorna true se o conteúdo de Strings for igual e false, caso contrário.

O método equals utiliza uma comparação lexicográfica para Strings.

Quando valores de tipo de dados primitivos são comparados com ==, o resultado é true se ambos os valores forem idênticos. Quando as referências são comparadas com ==,
o resultado é true se ambas referenciarem o mesmo objeto.

O Java trata todos os literais de string com o mesmo conteúdo como um único objeto String. 

O método String equalsIgnoreCase realiza uma comparação de string que não diferencia maiúsculas e minúsculas. 

O método String compareTo utiliza uma comparação lexicográfica e retorna 0 se as Strings são iguais, um número negativo se a string que chama compareTo for menor
que o argumento String e um número positivo se a string que chama compareTo for maior do que o argumento String.

Os métodos String startsWith e endsWith determinam se uma string inicia ou termina com os caracteres especificados, respectivamente. 

O método String indexOf localiza a primeira ocorrência de um caractere ou uma substring em uma string. O método String lastIndexOf localiza a última ocorrência de
um caractere ou uma substring em uma string.

O método String substring copia e retorna parte de um objeto string existente. 

O método de String concat concatena dois objetos string e retorna um novo objeto string. 

O método String replace retorna um novo objeto string que substitui cada ocorrência em uma String do seu primeiro argumento de caractere pelo seu segundo argumento
de caractere.

String toUpperCase retorna uma nova string com letras maiúsculas nas posições em que a string original tinha letras minúsculas. O método String toLowerCase retorna
uma nova string com letras minúsculas nas posições em que a string original tinha letras maiúsculas.

O método String trim retorna um novo objeto string em que todos os caracteres de espaço em branco (por exemplo, espaços, nova linha e tabulações) foram removidos
do início ao fim de uma string.

O método String toCharArray retorna um array char contendo uma cópia dos caracteres da string.

O método static valueOf da classe String retorna seu argumento convertido em uma string.

# Classe StringBuilder 

A classe StringBuilder fornece construtores que permitem que StringBuilders sejam inicializados sem caracteres e tenham uma capacidade inicial de 16 caracteres, 
sem caracteres e uma capacidade inicial especificada no argumento de inteiro; ou com uma cópia dos caracteres do argumento String e uma capacidade inicial que é
o número de caracteres no argumento de String mais 16.

O método StringBuilder length retorna o número de caracteres atualmente armazenados em um StringBuilder. O método StringBuilder capacity retorna o número
de caracteres que podem ser armazenados em um StringBuilder sem alocar mais memória.

O método StringBuilder ensureCapacity garante que um StringBuilder tenha pelo menos a capacidade especificada. O método setLength aumenta ou diminui o comprimento
de um StringBuilder.

O método StringBuilder charAt retorna o caractere no índice especificado. O método setCharAt define o caractere na posição especificada. O método StringBuilder 
getChars copia os caracteres no StringBuilder para o array de caracteres passado como um argumento.

Os métodos sobrecarregados append de StringBuilder adicionam valores de tipo primitivo, array de caracteres, String, Object ou CharSequence ao final de um 
StringBuilder.

Os métodos insert sobrecarregados de StringBuilder inserem tipo primitivo, array de caracteres e valores String, Object ou CharSequence em qualquer posição em um
StringBuilder.

# Classe Character

O método Character isDefined determina se um caractere está no conjunto de caracteres Unicode.

O método Character isDigit determina se um caractere é um dígito Unicode definido. 

O método Character isJavaIdentifierStart determina se um caractere pode ser usado como o primeiro caractere de um identificador de Java.

O método Character isJavaIdentifierPart determina se um caractere pode ser utilizado em um identificador.

O método Character isLetter determina se um caractere é uma letra. O método Character isLetterOrDigit determina se um caractere é uma letra ou um dígito.

O método Character isLowerCase determina se um caractere é uma letra minúscula. O método Character isUpperCase determina se um caractere é uma letra maiúscula.

O método Character toUpperCase converte um caractere em seu equivalente em maiúsculas. O método Character toLowerCase converte um caractere em seu equivalente em minúsculas.

O método Character digit converte seu argumento caractere em um inteiro no sistema de números especificado por seu argumento inteiro radix. O método Character forDigit converte seu argumento inteiro digit em um caractere no sistema de números especificado por seu argumento inteiro radix.

O método Character charValue retorna o char armazenado em um objeto Character. O método Character toString retorna uma representação String de um Character.

# Tokenização de Strings 

O método split da classe String tokeniza uma String com base no delimitador especificado como um argumento e retorna um array de Strings contendo os tokens.

# Expressões regulares, classe Pattern e classe Matcher 

Expressões regulares são sequências de caracteres e símbolos que definem um conjunto de strings. Elas são úteis para validar entrada e assegurar que os dados estão 
em um formato particular.

O método String matches recebe uma string que especifica a expressão regular e corresponde ao conteúdo do objeto String em que é chamado com a expressão regular. 
O método retorna um boolean indicando se a correspondência foi ou não bem-sucedida.

Uma classe de caracteres é uma sequência de escape que representa um grupo de caracteres. Cada classe de caracteres localiza um único caractere na string que estamos
tentando localizar com a expressão regular.

Um caractere de palavra (\w) é qualquer letra (em maiúsculas ou minúsculas), qualquer dígito ou o caractere sublinhado. 

Um caractere de espaço em branco (\s) é um espaço, uma tabulação, um retorno de carro, uma nova linha ou um avanço de formulário. 

Um dígito (\d) é qualquer caractere numérico. 

Para localizar um conjunto de caracteres que não tem uma classe de caracteres predefinida, utilize os colchetes, []. Os intervalos podem ser representados colocando-se
um traço (-) entre dois caracteres. Se o primeiro caractere entre colchetes for "^", a expressão aceitará qualquer caractere diferente desses indicados.

Quando o operador de expressão regular "*" aparece em uma expressão regular, o programa tenta combinar zero ou mais ocorrências da subexpressão que imediatamente
precedem o "*".

O operador "+" tenta localizar uma ou mais ocorrências da subexpressão que o precede.

O caractere "|" permite uma correspondência da expressão à sua esquerda ou direita. 

Parênteses ( ) são utilizados para agrupar partes da expressão regular. • Os sinais de asterisco (*) e de adição (+) são formalmente chamados de quantificadores. 

Um quantificador só afeta a subexpressão imediatamente depois dele. 

O ponto de interrogação quantificador (?) localiza zero ou uma ocorrência da expressão que ele quantifica. 

Um conjunto de chaves contendo um número ({n}) localiza exatamente n ocorrências da expressão que ele quantifica. Incluir uma vírgula depois do número entre chaves 
localiza pelo menos n ocorrências.

Um conjunto de chaves que contém dois números ({n,m}) localiza entre n e m ocorrências da expressão que ele qualifica. • Quantificadores são gananciosos — eles incluem
o maior número possível de ocorrências que puderem quando a correspondência é bem-sucedida. Se um quantificador for seguido por um ponto de interrogação (?), o
quantificador torna-se relutante, identificando o menor número de ocorrências possível, contanto que a correspondência seja bem-sucedida.

O método String replaceAll substitui o texto em uma string pelo novo texto (o segundo argumento) onde quer que a string original coincida com uma expressão regular
(o primeiro argumento).

Escapar um caractere especial de expressão regular com uma \ instrui o mecanismo de correspondência de expressão regular a localizar o caractere real, em oposição ao
que ele representa em uma expressão regular.

O método String replaceFirst substitui a primeira ocorrência de uma correspondência de padrão e retorna uma nova string na qual os caracteres apropriados foram
substituídos.

O método String split divide uma string em substrings em qualquer local que corresponde com uma expressão regular especificada e retorna um array de substrings.

A classe Pattern representa uma expressão regular.

A classe Matcher contém um padrão de expressão regular e uma CharSequence em que pesquisar. 

CharSequence é uma interface que permite acesso de leitura a uma sequência de caracteres. Tanto String como StringBuilder implementam essa interface, assim eles
podem ser usados com a classe Matcher.

Se uma expressão regular vai ser utilizada apenas uma vez, o método Pattern matches estático aceita uma string que especifica a expressão regular e uma CharSequence
na qual realiza a correspondência. Esse método retorna um boolean que indica se o objeto de pesquisa corresponde à expressão regular.

Se uma expressão regular vai ser utilizada mais de uma vez, é mais eficiente utilizar o método Pattern compile para criar um objeto Pattern específico para essa
expressão regular. Esse método recebe uma string que representa o padrão e retorna um novo objeto Pattern.

O método Pattern matcher recebe uma CharSequence a pesquisar e retorna um objeto Matcher. O método Matcher matches realiza a mesma tarefa que o método Pattern matches,
mas sem argumentos.

O método Matcher find tenta localizar uma parte do objeto de pesquisa para o padrão de pesquisa. Cada chamada para esse método inicia no ponto em que a última chamada
terminou, assim múltiplas correspondências podem ser localizadas.

O método Matcher lookingAt executa o mesmo que o find, exceto que sempre começa desde o início do objeto de pesquisa e sempre localizará a primeira correspondência
se houver alguma.

O método Matcher group retorna a string do objeto de pesquisa que reconhece o padrão de pesquisa. A string retornada é aquela que correspondeu da última vez a 
uma chamada find ou lookingAt.
