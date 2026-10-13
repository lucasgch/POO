# Java API Collections

## Agrupamento de objetos

Você precisa armazenar um grupo de objetos, por exemplo, uma lista de nomes de pessoas e realizar operações sobre eles, como adicionar, remover, buscar e ordenar os objetos armazenados

Se optar por um vetor, terá que lidar com as seguintes limitações:

- Tamanho fixo pode gerar desperdício de memória ou falta de espaço para novos elementos
- Não oferece métodos para manipular os elementos

## API Java Collections

- Trata-se de um conjunto de interfaces, classes e algoritmos para trabalhar com coleções
de objetos em Java
- Oferece uma forma eficiente e fácil de usar para armazenar, obter e manipular dados
agregados, como listas, conjuntos, filas e mapas

### List

Coleção ordenada e permite elementos duplicados, sendo possível acessar elementos por índice

Implementações:

- [ArrayList](./02-01-ArrayList.md)
- LinkedList
- Vector
- Stack

### Set

Segue a abstração de conjuntos matemáticos e não permite elementos duplicados e não mantém a ordem de inserção

Implementações:

- [HashSet](./02-02-Set-HashSet.md)
- LinkedHashSet
- TreeSet

### Queue

Fila que ordena elementos para serem processados posteriormente, por exemplo, FIFO (primeiro que entra é o primeiro que sai)

Implementações:

- [LinkedList](./02-03-Queue.md)
- ArrayDeque
- PriorityQueue

### Map

- Mapeia chaves para valores (também conhecido como dicionário)
- Não permite chaves duplicadas e cada chave mapeia somente um valor

Implementações:

- [HashMap](./02-04-Map.md)
- LinkedHashMap
- TreeMap
