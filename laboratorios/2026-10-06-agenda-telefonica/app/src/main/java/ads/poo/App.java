package ads.poo;

import ads.poo.entity.Email;
import ads.poo.entity.Telefone;

import java.text.ParseException;

public class App {

    static void main(String[] args) throws ParseException {
        menu();
        String rotuloTelefone = "Residencial";
        Telefone tel01 = new Telefone(rotuloTelefone, "554398143018");
        System.out.println(tel01);
        String rotuloTrabalho = "Coorporativo";
        Email email01 = new Email(rotuloTrabalho, "lucasgodoyjor@gmail.com");
        System.out.println(email01);
    }

    public static void menu(){
        System.out.println("""
                Agenda de Contatos
                        1 - Adicionar Contato
                        2 - Remover Contato
                        3 - Atualizar Dados do Contato (Nome/Data)
                        4 - Buscar Contato
                        5 - Listar Todos os Contatos
                        6 - Adicionar Telefone a um Contato
                        7 - Remover Telefone de um Contato
                        8 - Adicionar E-mail a um Contato
                        9 - Remover E-mail de um Contato
                        0 - Sair
                """);

        // TODO: Implementar a lógica do menu
    }
}
