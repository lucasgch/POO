package ads.poo;

public class LivroNaoConstaNoEmprestimo extends RuntimeException {
    public LivroNaoConstaNoEmprestimo(String message) {
        super(message);
    }
}
