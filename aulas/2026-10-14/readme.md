# Modelagem UML

Para cada um dos exercícios abaixo, crie um diagrama UML com associações de herança.

- Você pode criar as classes que julgar necessário.
- Cada classe deve ter pelo menos um atributo e um método

É necessário pensar em um contexto de domínio para o problema. Exemplos: Escola, biblioteca, transporte, zoológico.

## Escola: Aluno professor, coordenador, diretor

```mermaid
    classDiagram
        directionLR
        class Escola {
            id: long
            nome: String
            endereco: String
            telefone: String
            cursos: ArrayList<Curso>
            coordenador: Coordenador
            diretor: Diretor
        }
        
        class Curso {
            - id: long
            - nome: String
            - turmas: ArrayList<Turma>
            - coordenador: Coordenador
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
            - id: long
            - nome: String
            - codMatricula: long
        }
        
        class Professor {
            - id: long
            - nome: String
        }
        
        class Coordenador {
            - salario: bigDecimal
        }
        class Diretor {
            - salario: bigDecimal
        }
        
        Professor <|-- Coordenador
        Professor <|-- Diretor
        
        Escola "1" *-- "1..N" Curso
        Escola "1" *-- "1" Coordenador
        Curso "1" *-- "1..N" Turma
        
        Turma "1" o-- "1..N" Disciplina
        Disciplina "1" o-- "1..N" Aluno
        Disciplina "1" o-- "1..3" Professor
```        

## Livro, revista, jornal, gibi

```mermaid
    classDiagram
        directionLR
        
        class Livro {
            - id: long
            - título: String
            - autor: String
            - editora: String
            - ano: int
            - paginas: int
        }
        
        class Revista {
            - id: long 
        }
        
        class Jornal {
            - id: long
        }
        
        class Gibi {
            - id: long
        }
            
```

## Carro, avião, barco, caminhão

```mermaid
    classDiagram
        directionLR
        
        class MeioDeTransporte{
            - id: long
            - anoDeFabricacao: int
        }      
        
        class Carro {
            - id: long
            - marca: String
            - modelo: String
            - cor: String 
        }
        
        class Aviao{
          - id: long
           - modelo: String
        }
        
        class Caminhao {
            - id: long
            - modelo: String
        }
        
        MeioDeTransporte <|-- Carro
        MeioDeTransporte <|-- Aviao
        MeioDeTransporte <|-- Caminhao
```

## Gato, cachorro, arara, galinha, baleia, tubarão

```mermaid
    classDiagram
        directionLR
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