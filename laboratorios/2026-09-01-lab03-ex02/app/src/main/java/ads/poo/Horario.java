package ads.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    // Construtor padrão que inicializa todos atributos com zero
    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora){
        this.hora = isValidHour(hora)?hora:0;

        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora, int minuto){

        this.hora = isValidHour(hora)?hora:0;
        this.minuto = isValidMinuto(minuto)?minuto:0;
        this.segundo = 0;
    }

    public Horario(int hora, int minuto, int segundo){
        this.hora = isValidHour(hora)?hora:0;
        this.minuto = isValidMinuto(minuto)?minuto:0;
        this.segundo = isValidSegundo(segundo)?segundo:0;
    }

    public boolean isValidHour(int hora){
        if (hora >= 0 && hora <= 23){
            return true;
        }
        return false;
    }

    public boolean isValidMinuto(int minuto){
        if (minuto >= 0 && minuto <= 59){
            return true;
        }
        return false;
    }

    public boolean isValidSegundo(int segundo){
        if (segundo >= 0 && segundo <= 59){
            return true;
        }
        return false;
    }

    // Setters
    public boolean setHora(int hora){
        if (isValidHour(hora)){
            this.hora = hora;
            return true;
        }
        return false;
    }

    public boolean setMinuto(int minuto){
        if (isValidMinuto(minuto)){
            this.minuto = minuto;
            return true;
        }
        return false;
    }

    public boolean setSegundo(int segundo){
        if (isValidSegundo(segundo)){
            this.segundo = segundo;
            return true;
        }
        return false;
    }

    public int getHorarioEmSegundos(){
        return hora * 3600 + minuto * 60 + segundo;
    }

    public String getHoraPorExtenso() {
        if (this.hora == 0) {
            return "Zero horas";
        }

        int dezena = this.hora / 10;
        int unidade = this.hora % 10;
        String horaExtenso = "";

        if (dezena == 1) {
            horaExtenso = switch (unidade) {
                case 0 -> "Dez";
                case 1 -> "Onze";
                case 2 -> "Doze";
                case 3 -> "Treze";
                case 4 -> "Quatorze";
                case 5 -> "Quinze";
                case 6 -> "Dezesseis";
                case 7 -> "Dezessete";
                case 8 -> "Dezoito";
                case 9 -> "Dezenove";
                default -> "";
            };
        } else {
            if (dezena == 2) {
                horaExtenso = (unidade == 0) ? "Vinte" : "Vinte e ";
            }

            if (unidade > 0) {
                String nomeUnidade = switch (unidade) {
                    case 1 -> "uma";
                    case 2 -> "duas";
                    case 3 -> "três";
                    case 4 -> "quatro";
                    case 5 -> "cinco";
                    case 6 -> "seis";
                    case 7 -> "sete";
                    case 8 -> "oito";
                    case 9 -> "nove";
                    default -> "";
                };

                // Se for de 1 a 9, a primeira letra fica maiúscula
                if (dezena == 0) {
                    nomeUnidade = Character.toUpperCase(nomeUnidade.charAt(0)) + nomeUnidade.substring(1);
                }

                horaExtenso += nomeUnidade;
            }
        }

        horaExtenso += (this.hora == 1) ? " hora" : " horas";
        return horaExtenso;
    }

    public String getHorarioPorExtenso() {
        // Caso especial para 00:00:00
        if (this.hora == 0 && this.minuto == 0 && this.segundo == 0) {
            return "Zero horas"; // ou "Meia-noite"
        }

        java.util.List<String> partes = new java.util.ArrayList<>();

        // 1. Adiciona hora se for maior que zero
        if (this.hora > 0) {
            partes.add(getHoraPorExtenso()); // ex: "Dez horas"
        }

        // 2. Adiciona minutos se for maior que zero
        if (this.minuto > 0) {
            partes.add(getMinutoPorExtenso()); // ex: "cinco minutos"
        }

        // 3. Adiciona segundos se for maior que zero
        if (this.segundo > 0) {
            partes.add(getSegundoPorExtenso()); // ex: "dez segundos"
        }

        // Monta a frase com pontuação
        String resultado;
        if (partes.size() == 1) {
            resultado = partes.get(0);
        } else if (partes.size() == 2) {
            resultado = partes.get(0) + " e " + partes.get(1);
        } else {
            resultado = partes.get(0) + ", " + partes.get(1) + " e " + partes.get(2);
        }

        // Deixa a PRIMEIRA letra do resultado final maiúscula
        return capitalizarPrimeiraLetra(resultado);
    }

    private String capitalizarPrimeiraLetra(String texto) {
        if (texto == null || texto.isEmpty()) return texto;
        return Character.toUpperCase(texto.charAt(0)) + texto.substring(1);
    }

    String getNumeroPorExtenso(int numero){
        if (numero < 1 || numero > 59) {
            return "";
        }

        String[] unidades = {
                "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
                "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
        };

        String[] dezenas = {
                "", "", "vinte", "trinta", "quarenta", "cinquenta"
        };

        // Números de 1 a 19 já estão mapeados diretamente
        if (numero < 20) {
            return unidades[numero];
        }

        int dezena = numero / 10;
        int unidade = numero % 10;

        // Trata números de 20 a 59 (ex: 20 -> "vinte", 25 -> "vinte e cinco")
        if (unidade == 0) {
            return dezenas[dezena];
        } else {
            return dezenas[dezena] + " e " + unidades[unidade];
        }
    }

    public int getDiferencaEmSegundos(Horario horario){
        return Math.abs(horario.getHorarioEmSegundos() - this.getHorarioEmSegundos());
    }

    public String getMinutoPorExtenso() {
        if (this.minuto == 0) return "zero minutos";
        String extensao = getNumeroPorExtenso(this.minuto);
        String sufixo = (this.minuto == 1) ? " minuto" : " minutos";
        return extensao + sufixo; // Retorna ex: "cinco minutos"
    }

    public String getSegundoPorExtenso() {
        if (this.segundo == 0) return "zero segundos";
        String extensao = getNumeroPorExtenso(this.segundo);
        String sufixo = (this.segundo == 1) ? " segundo" : " segundos";
        return extensao + sufixo; // Retorna ex: "dez segundos"
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
