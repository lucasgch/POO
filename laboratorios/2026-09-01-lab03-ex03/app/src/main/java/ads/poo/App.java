package ads.poo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class App {

    public static void main(String[] args) {
        Retangulo ret = new Retangulo(4,8,"ASCII");
        if (ret.getCodificacao()=="UTF8"){
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        }
        System.out.println(ret);
    }

}
