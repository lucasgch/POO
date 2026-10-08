package ads.poo;

import ads.poo.entity.Email;
import ads.poo.entity.RotuloEmail;
import ads.poo.entity.RotuloTelefone;
import ads.poo.entity.Telefone;

import java.text.ParseException;

public class App {

    static void main(String[] args) throws ParseException {
        RotuloTelefone casa = new RotuloTelefone("Residencial");
        Telefone tel01 = new Telefone(casa, "554398143018");
        System.out.println(tel01);
        RotuloEmail trabalho = new RotuloEmail("Coorporativo");
        Email email01 = new Email(trabalho, "lucasgodoyjor@gmail.com");
        System.out.println(email01);
    }
}
