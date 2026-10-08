package ads.poo.entity;

public class Email {

    private final String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    private String email;
    private final RotuloEmail rotulo;

    public Email(String rotulo, String email) {
        if (rotulo == null ) {
            this.rotulo = new RotuloEmail("");
        } else {
            this.rotulo = new RotuloEmail(rotulo);
        }
        if (email == null || !email.matches(eR) ) {
            email = "";
        }
        this.email = email.toLowerCase();
    }

    public Email(RotuloEmail rotulo, String email){
        this.rotulo = rotulo;
        if (email == null || !email.matches(eR) ) {
            email = "";
        }
        this.email = email.toLowerCase();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Todo - formatar email
    @Override
    public String toString() {
        return email;
    }
}
