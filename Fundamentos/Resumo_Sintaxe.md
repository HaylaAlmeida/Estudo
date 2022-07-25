# Comentários

//

/* */

Javadoc - //** */

# Declarando uma classe

public class Welcome1 {

}

Uma classe public deve ser inserida em um arquivo com um nome na forma NomeDaClasse.java, assim a classe Welcome1 é armazenada no arquivo Welcome1.java.

### Por convenção, os nomes de classes iniciam com uma letra maiúscula e apresentam a letra inicial de cada palavra que eles incluem em maiúscula (por exemplo, SampleClassName).

# Declarando um método

public static void main(String[] args) {

}

Parênteses após main indica bloco de construção chamado método.

Os métodos realizam tarefas e podem retornar informações quando as completam. A palavra-chave void indica que esse método não retornará nenhuma informação.

# Saída

System.out.println("Hello, World!");

ou

System.out.printf("%s%n%s%n", "Hello,", "World!"); // Saída formatada

# Entrada
~~~
import java.util.Scanner;

public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      
      int x; 
      int y;
      
      x = input.nextInt();
      
      y = input.nextInt();
      
      System.out.printf("Primeiro numero: %d\nSegundo numero: %d", x, y);
}
~~~
Variável é uma posição na memória no qual um valor pode ser armazenado e utilizado posteriormente. Todas as variáveis em Java devem ser declaradas com um nome e um tipo.

Os dados do Scanner podem prover do teclado ou de um arquivo. Deve-se especificar a origem dos dados.

A palavra-chave new significa criação de um objeto.

O sinal de igual (=) indica inicialização. Também indica atribuição.

# Condicional
~~~
if (condição) {
      
      instrução;

}
~~~
