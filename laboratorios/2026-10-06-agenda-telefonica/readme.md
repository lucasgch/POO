# Agenda telefônica

```mermaid
classDiagram
    directionLR
    
    class Agenda{
        - ArrayList~Contato~
        + Agenda()
        + addContato(c: Contato) boolean
        + findContato(nome: String, sobreNome: String) ArrayList~Contato~
        + removeContato(indiceContatoNaLista: int) boolean
        + addTelefone()
        + addEmail()
        + updateTelefone()
        + updateEmail()
        + toString(): String
    }
    class Contato {
        - BigInt id
        - String nome
        - String sobrenome
        - LocalDate dataNascimento
        - HashMap~String~ Telefone 
        - HashMap~String~ email
        + Contato(String nome, String sobrenome, LocalDate dtNascimento)
    }
    class Email{
        + Email(String chave, String email)
        - BigInt id
        - String email    
    }
    class Telefone{
        + Telefone(String chave, String telefone)
        - BigInt id
        - String numero    
    }
    Agenda "1" -- "0-N" Contato
    Contato "1" -- "N" Email
    Contato "1" -- "N" Telefone
    
```