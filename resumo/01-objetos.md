# Objetos

Item identificável, com:
    -  **Características:** - Estado - Representa as características do objeto
    -  **Comportamentos** - Representa as ações que este objeto é capaz de executar

## Como identificar objetos?

- Quais são suas características (**atributos**)?
- O que permitem fazer (**métodos**)?

- Métodos de um objeto são invocados para realizar uma computação e podem modificar os valores de seus atributos.

## Encapsulamento

Processo de esconder todos os detalhes de um objeto que não contribuem para as suas características essenciais.

- A implementação de um método pode ser alterada sem que mudar o código do objeto que o invoca.
- A **interface** de um objeto define o que ele conhece e o que ele sabe fazer, no entanto sem descrever como ele conhece ou faz.

## Classes

- A **Classe** é uma planta (projeto ou molde) que indica como os objetos deverão ser construídos.

## Abstração

Processo mental que nós seres humanos nos atemos aos aspectos mais relevantes de alguma coisa, ao mesmo tempo que ignoramos os aspectos menos importantes.

**Exemplo**: Sistema de vendas. Um carro real, tem muitos componentes, peças e comportamentos. Em um sistema de vendas de carros apenas algumas características esseciais são relevantes para o sistema: Preço, Ano, Marca, Modelo, Estado e etc..

## Modificadores de acesso

Modificadores de acesso são usados para garantir o encapsulamento.

- Geralmente, atributos de uma classe não devem ser acessados diretamente por outras classes, pois isso quebra o encapsulamento.
- Em Java modificadores de acesso são usados para indicar quais atributos e métodos de um objeto estarão visíveis aos demais objetos do sistema.

- private - poderão ser acessados somente por métodos da própria classe.
- public - poderão ser acessados por métodos de qualquer classe.

### Palavra reservada this

- Refere-se ao próprio objeto e é usado para diferenciar os atributos do objeto de variáveis locais.
- Também pode ser usado para invocar os métodos da própria classe.

## Sobrecarga de métodos

- Uma classe pode ter mais de um método com o mesmo nome, porém com assinaturas diferentes.

A assinatura do método é composta por: `public boolean cadastrarPessoa(String parametro)`

- Tipo de retorno - `boolean`
- Nome do método - `cadastrarPessoa`
- Lista de parâmetro - `String parametro`

Exemplo de sobrecarga do método:

```java
public class Data{
    private int dia, mes, ano;
    
    public void alterarData(int d){
        this.dia = d;
    }
    
    public void alterarData(int d, int m){
        this.dia = d; this.mes = m;
    }
    
    public void alterarData(int d, int m, int a){
        this.dia = d; this.mes = m; this.ano = a;
    }
}
```

## Método construtor

- Método para atribuir valores aos atributos na criação de um objeto
- Possui obrigatoriamente o mesmo nome da classe
- Não pode possuir tipo de retorno
- Pode ser sobrecarregado
- Se não for definido, a classe terá um construtor padrão vazio implícito (sem parâmetros)

Exemplo de construtor:

```java
public class Pessoa{
    private String nome, cpf;
    
    private int anoNasc;
    
    // método construtor padrão. Não possui parâmetros
    public Pessoa(){
        this.nome = ""; this.cpf = ""; this.anoNasc = 0;
    }
    
    // método construtor com 1 parâmetro
    public Pessoa(String no){
        this.nome = no; this.cpf = ""; this.anoNasc = 0;
    }

    // método construtor com 3 parâmetros
    public Pessoa(String no, String c, int a){
        this.nome = no; this.cpf = c; this.anoNasc = a;
    }

}
```

Exemplo de chamada do método construtor

```java
// invocando o método construtor padrão
Pessoa a = new Pessoa();
// invocando o método construtor com 1 parâmetro
Pessoa b = new Pessoa("Maria");
// invocando o método construtor com 3 parâmetros
Pessoa c = new Pessoa("Maria","123.456.789-00",1959);
```

## Modificador final

- Pode ser usado em atributos, métodos ou em variáveis locais
- Uma variável após ter recebido um valor, esse não poderá ser alterado
- Métodos não poderão ser sobrescritos (conceito de herança)
- Por convenção, nomes de constantes são escritos em letras **maiúsculas**

Exemplo:

```java
public class Celular{
    
    // constante com valor definido na declaração da variável
    private final String FREQUENCIA = "1800";
    
    // constante com valor definido no construtor
    private final int SERIAL;
    
    public Celular(int s){
        // atribuição de valor a constante no construtor e que não poderá ser alterado
        this.SERIAL = s;
    }
}
```

## Membros estáticos e não estáticos

### Atributos não estáticos

- Cada instância da classe terá uma cópia distinta desse atributo

Exemplo:

```java
public class Celular{
    private int total;
    public Celular(){
        this.total++;
    }
public int getTotal(){
    return this.total;
    }
}
```

### Membros de classe estáticos

- Membro de classe que pertence a classe e não a uma instância específica da classe
- Método estático não pode acessar membros não estáticos

Exemplo:

```java
public class Celular {
        private static int total = 0;
        private int creditos = 0;
        public Celular(int creditos){
        total++; this.creditos = creditos;
    }
    
    // OK
    public int getCreditos() { // não estático
        return creditos; // não estático
    }

    // OK
    public int getTotal(){ //não estático
        return total; // estático
    }

// ERRO DE SINTAXE
    public static int retornaCreditos(){ //estático
        return creditos; //não estático
    }
}
```
