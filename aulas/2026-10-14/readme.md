# Modelagem UML

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
