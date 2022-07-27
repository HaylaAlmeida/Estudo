![image](https://user-images.githubusercontent.com/80348569/181137390-e3fc912f-99a6-48d5-9400-da74023b755c.png)


# Variáveis de instância

Armazenam dados para cada objeto. Também chamado de atributos

# Declaração de variável de instância

private String name;

# Declaração de classe

public class Account {

}

As palavras-chave public e private são modificadores de acesso. 

Cada declaração de classe contém a palavra-chave class seguida imediatamente pelo nome da classe, nesse caso, Account.

# Identificadores e nomeadores usando a notação camelo

Nomes de classes, de método e de variável são identificadores e, por convenção, todos usam o mesmo esquema de nomeação com a notação camelo (iniciam com uma letra 
minúscula e cada palavra no nome depois da primeira começa com uma letra maiúscula). Também por convenção, os nomes de classe começam com uma letra maiúscula, e os de 
métodos e de variáveis iniciam com uma letra minúscula.

# Métodos

public void setName(String name) – Esta linha é o cabeçalho do método 

{

this.name = name; // Armazena o nome

}

O tipo de retorno do método especifica a qualidade dos dados que o método retorna ao chamador depois de realizar
sua tarefa. O tipo de retorno void indica que setName executará uma tarefa, mas não retornará nenhuma informação ao seu
chamador.

O método setName recebe um parâmetro do tipo String - que representa o nome que será passado para o método como um argumento

Os parâmetros são declarados em uma lista de parâmetros que está localizada entre os parênteses que seguem o nome do método no título dele. Quando existem múltiplos
parâmetros, cada um é separado do seguinte por uma vírgula. Cada parâmetro deve
especificar um tipo (nesse caso, String) seguido por um nome da variável (nesse caso, name).

# Parâmetros são variáveis locais

Variáveis declaradas no corpo de um método específico (como main) são variáveis locais que somente podem ser utilizadas 
nele. Cada método só pode acessar suas próprias variáveis locais, não aquelas dos outros. Quando esse método terminar, 
os valores de suas variáveis locais são perdidos. Os parâmetros de um método também são variáveis locais dele.

# Corpo do método setName

Se um método contiver uma variável local com o mesmo nome de uma variável de instância, o corpo desse método irá referenciar a variável 
local em vez da variável de instância. Nesse caso, diz-se que a variável local simula a variável de instância no corpo do método. 
O corpo do método pode usar a palavra-chave this para referenciar a variávelde instância simulada explicitamente

# Método getName da classe Account

O método tem uma lista vazia de parâmetros, então não exige informações adicionais para realizar sua tarefa. 
Ele retorna uma String. Quando um método que especifica um tipo de retorno diferente de void é chamado e conclui sua tarefa, 
ele deve retornar um resultado para seu chamador.

# Classe AccountTest que cria e usa um objeto da classe Account
~~~
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account();

        System.out.printf("O nome inicial é: %s%n", myAccount.getName());

        System.out.println("Insira um nome: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("O nome do objeto myAccount é: %s%n", myAccount.getName());
    }
}
~~~

# Instância de um objeto - palavra-chave new e construtores

A variável myAccount é inicializada com o resultado da expressão de criação de instância de 
classe new Account(). A palavra-chave new estabelece um novo objeto da classe especificada — nesse caso, 
Account. Os parênteses à direita de Account são necessários. Esses parênteses em combinação com um nome de classe 
representam uma chamada para um construtor, que é semelhante a um método, mas é chamado implicitamente 
pelo operador new para inicializar as variáveis de instância de um objeto quando este é criado.


















