# Modelagem UML

Para cada um dos exercícios abaixo, crie um diagrama UML com associações de herança.

- Você pode criar as classes que julgar necessário.
- Cada classe deve ter pelo menos um atributo e um método

É necessário pensar em um contexto de domínio para o problema. Exemplos: Escola, biblioteca, transporte, zoológico.

## Escola: Aluno professor, coordenador, diretor

```mermaid
    classDiagram
        direction LR
        class Escola {
            - id: long
            - nome: String
            - endereco: String
            - telefone: String
            - cursos: ArrayList<Curso>
            - coordenador: Coordenador
            - diretor: Diretor
            + Escola()
            + adicionarCurso()
            + removerCurso()
        }
        
        class Curso {
            - id: long
            - nome: String
            - turmas: ArrayList<Turma>
            - coordenador: Coordenador
            + Curso()
            + adicionarTurma()
            + removerTurma()
        }
        
        class Disciplina {
            - id: long
            - nome: String
        }

        class Turma {
            - id: long
            - dataInicio: LocalDate
            - dataFim: LocalDate
            - professores: ArrayList<Professor>
            - alunos: ArrayList<Aluno>
        }
        
        class Aluno {
            - idPessoa: long
            - codMatricula: long
        }
        
        class Professor {
            - salario: bigDecimal
        }
        
        class Coordenador {
            - ano: int
        }
        
        class Coordenadorias {
            
        }
        
        class Diretor {
            - gratificacao: bigDecimal
        }
        
        class Pessoa {
            - id: long
            - nome: String
        }

        Pessoa <|-- Professor
        Pessoa <|-- Aluno
        
        Coordenadorias "1" -- "1" Curso
        
        Professor <|-- Coordenador
        Professor <|-- Diretor
        
        Escola "1" *-- "1..N" Curso
        Escola "1" o-- "1" Diretor
        Curso "1" *-- "1..N" Turma
        Curso "1" o-- "1" Coordenador
        
        Turma "1" o-- "1..N" Disciplina
        Disciplina "1" o-- "1..N" Aluno
        Disciplina "1" o-- "1..3" Professor
```        

## Livro, revista, jornal, gibi

```mermaid
    classDiagram
        direction LR
        
        class Produto {
            - id: long
            - ano: int
            - título: String
            - preco: double
        }
        
        class Livro {
            - isbn: String
            - autor: String
            - editora: String
            - paginas: int
            - capitulos: int
        }
        
        class Periodico {
            - issn: String
        }
        
        class Revista {
            - segmento: String
        }
        
        class Jornal {
            - cadernos: int
            - jornalistaResponsavel: String
            - editor: String
        }
        
        class Gibi {
            - ilustrador: String
        }
        
        class ItemPedido {
            - dataPedido: LocalDate
            - produto: Produto
            - valor: double
        }
        
        class Pedido {
            produtos: ArrayList~ItemPedido~
        }

        Produto <|-- Livro
        Produto <|-- Periodico

        Periodico <|-- Gibi
        Periodico <|-- Jornal
        Periodico <|-- Revista
            
        Pedido "1" *-- "1..N" ItemPedido
        ItemPedido "1" o-- "1" Produto
```

## Carro, avião, barco, caminhão

```mermaid
    classDiagram
        direction LR
        
        class Veiculo {
            - id: long
            - anoDeFabricacao: int
            - velocidadeMaxima: double
            - balas: int
            + acelerar() boolean
            + frear() boolean
            + atirar() boolean
        }      
        
        class Carro {
            - id: long
            - marca: String
            - modelo: String
            - cor: String
            + correr()
        }
        
        class Aviao{
           - id: long
           - modelo: String
           - tripulantes: int
           - bombas: int
           + voar()
           + jogarBomba()
        }
        
        class Caminhao {
            - id: long
            - modelo: String
            - carga: double
            + andar()
            + carregar()
            + descarregar()
            
        }

        Veiculo <|-- Carro
        Veiculo <|-- Aviao
        Veiculo <|-- Caminhao
```

## Gato, cachorro, arara, galinha, baleia, tubarão

```mermaid
    classDiagram
        direction LR
        class Animal {
            - id: long
            - nome: String
            - cor: String
            - sexo: String
            + comer(): void
        }
        
        class Cachorro {
            - id: long
            - raca: String
            + latir():
        }
        class Gato {
            - id: long
            + miar()
        }
        class Arara {
            - id: long
            + voar() void
        }
        class Galinha {
            - id: long
            + ciscar() void
        }
        class Baleia {
            - id: long
            + nadar() void
        }
        
        Animal <|-- Cachorro
        Animal <|-- Gato
        Animal <|-- Arara
        Animal <|-- Galinha
        Animal <|-- Baleia
```