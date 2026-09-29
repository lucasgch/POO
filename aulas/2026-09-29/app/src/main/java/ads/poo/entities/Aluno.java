package ads.poo.entities;

public class Aluno{
    private String name;
    private String email;
    private Endereco endereco;
    
    public Aluno(String name, String email, Endereco endereco){
        this.name = name;
        this.email = email;
        this.endereco = endereco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
}