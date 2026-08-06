public class Media {

    public static void main(String[] args) {

        double media = 0;
        double nota1 = 0;
        double nota2 = 0;

        boolean entradaValida = false;

        if (args.length != 2) {
            System.out.println("Por favor, forneça exatamente dois argumentos.");
            return;
        } else {
            try {
                nota1 = Double.parseDouble(args[0]);
                nota2 = Double.parseDouble(args[1]);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, forneça apenas números válidos.");
                return;
            }
        }

        media = Math.round( (nota1 + nota2) / 2.0 );
        String resultado = (media >= 6) ? "aprovado" : "reprovado";
        System.out.println("A média das notas é: " + String.format("%.2f", media) + ". Você foi "+ resultado + ".");

    }

}
