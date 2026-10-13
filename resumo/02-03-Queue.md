# Queue

Coleção que ordena elementos para serem processados posteriormente, por exemplo, FIFO (primeiro que entra é o
primeiro que sai)

```java
Queue<String> fila = new LinkedList<>();
fila.add("Juca");
fila.add("Ana");
fila.add("Maria");
String nome = fila.poll(); // Remove o primeiro elemento da fila
if (nome != null) { // Nulo se a fila estiver vazia
System.out.println(nome);
}
```

Queue é uma interface que estende Collection, algumas implementações:

- LinkedList
- ArrayDeque
- PriorityQueue
