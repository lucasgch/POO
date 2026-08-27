package ads.poo;

public class Pessoa{

    /**
     * Contador de Identificador estático pertencente a classe
     */
    static int ids;

    private int id;
    private String name;
    private String email;

    public Pessoa(){
        id=gerarId();
    };

    public Pessoa(String nome, String email){
        this.name = nome;
        this.email = email;
        id=gerarId();
    };

    private int gerarId(){
        ids++;
        return ids;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String nome){
        this.name=nome;
    }

    public void setEmail(String email){
        this.email=email;
    }

    @Override
    public String toString() {
        return "id: " + id + '\n' +
                "Nome: " + name + '\n' +
                "Email: " + email + '\n';
    }
}