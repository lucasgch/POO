package ads.poo.entity;

public class Email {

    private static final String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    private String email;
    private String rotulo;

    public Email(String rotulo, String email) {
        this.rotulo = rotulo;
        this.email = "";
        setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.matches(eR)) {
            this.email = email.toLowerCase();
            return true;
        }
        return false;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    // Todo - formatar email
    @Override
    public String toString() {
        return email;
    }
}
