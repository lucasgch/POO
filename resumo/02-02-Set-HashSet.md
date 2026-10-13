# Set

Coleção que não permite elementos duplicados

```java
HashSet<String> conjuntoCidades = new HashSet<>();
conjuntoCidades.add("São José");
conjuntoCidades.add("Palhoça");
conjuntoCidades.add("Florianópolis");
conjuntoCidades.add("São José"); // Tenta adicionar o elemento "São José" novamente
// Imprime os elementos do conjunto.
// Note que "São José" aparece apenas uma vez, pois conjuntos não permitem elementos duplicados
conjuntoCidades.forEach(IO::println);
// Removendo todos elementos
conjuntoCidades.clear();
```

## Criando um ArrayList a partir de um HashSet

```java
HashSet<String> conjuntoCidades = new HashSet<>();
conjuntoCidades.add("São José");
conjuntoCidades.add("Palhoça");
conjuntoCidades.add("Florianópolis");
// Criando um ArrayList a partir de um HashSet
ArrayList<String> listaCidades = new ArrayList<>(conjuntoCidades);
// Lista permite elementos duplicados, então "São José" pode ser adicionado novamente
listaCidades.add("São José");
// Criando um HashSet a partir de um ArrayList
HashSet<String> conjuntoCidades2 = new HashSet<>(listaCidades);
// Note que "São José" aparece apenas uma vez, pois conjuntos não permitem elementos duplicados
conjuntoCidades2.forEach(IO::println);
```
