# ArrayList

Armazena objetos em um vetor, cujo tamanho aumenta automaticamente

```java
// Criando uma lista de objetos da classe String
ArrayList<String> lista = new ArrayList<>();
// Método add adiciona um elemento no final da lista
lista.add("POO");
lista.add("IFSC");
String nome = lista.get(1); // Obtém elemento na posição 1
int total = lista.size(); // Obtém o total de elementos na coleção
// Criar uma lista a partir de um vetor
String[] nomes = {"Maria", "Juca", "Pedro"};
ArrayList<String> lista2 = new ArrayList<>(Arrays.asList(nomes));
// Criar um vetor a partir de uma lista
String[] vetor = lista.toArray(new String[0]);
```

## Iterando sobre os elementos e removendo elementos

```java
ArrayList<Pessoa> pessoas = new ArrayList<>();
pessoas.add(new Pessoa("Ana", 40));
pessoas.add(new Pessoa("Juca", 30));
pessoas.add(new Pessoa("Maria", 25));
for(Pessoa elemento: pessoas){ // Usando for-each para percorrer a lista
System.out.println(elemento);
}
// Usando forEach com lambda
pessoas.forEach(elemento -> System.out.println(elemento));
// Usando forEach com referência de método
pessoas.forEach(System.out::println);
// Removendo elemento caso atenda a uma condição
pessoas.removeIf(elemento->elemento.getNome().equals("Juca"));
```
