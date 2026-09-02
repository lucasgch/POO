package ads.poo;

import java.nio.charset.StandardCharsets;

public class Retangulo {

    private int altura;
    private int largura;
    private String codificacao;

    public Retangulo(int altura, int largura, String codificacao) {
        this.altura = altura;
        this.largura = largura;
        this.codificacao = codificacao;
    }

    public Retangulo() {
        this.altura = 3;
        this.largura = 4;
        codificacao = "ASCII";
    }

   public boolean setAltura(int altura){
       if (altura > 0){
           this.altura = altura;
           return true;
       }
       return false;
   }

   public boolean setLargura(int largura){
        if (largura > 0){
            this.largura = largura;
            return true;
        }
        return false;
   }

   public int getAltura(){
        return altura;
   }

   public int getLargura(){
        return largura;
   }

   public String getCodificacao(){
        return codificacao;
   }

   public int getArea(){
        return altura*largura;
   }

   public int getPerimetro(){
        return altura*largura*2;
   }

   public String toString(){

        if (codificacao.equals("ASCII")){
            String linhaInicialEFinal = String.format( "+" + "-".repeat(largura-2) + ("+%n") );
            String linhasDoMeio = String.format( "|" + " ".repeat(largura-2) +"|%n");
            return  linhaInicialEFinal + linhasDoMeio.repeat(altura-2) + linhaInicialEFinal;
        } else {
            char linhaHorizontal = '\u2500'; // ─
            char linhaVertical = '\u2502';   // │
            char cantoSuperiorEsq = '\u250C'; // ┌
            char cantoSuperiorDir = '\u2510'; // ┐
            char cantoInferiorEsq = '\u2514'; // └
            char cantoInferiorDir = '\u2518'; // ┘

            String linhaTopo = String.format("%c" + String.valueOf(linhaHorizontal).repeat(largura - 2) + "%c%n",
                    cantoSuperiorEsq, cantoSuperiorDir);

            String linhasDoMeio = String.format("%c" + " ".repeat(largura - 2) + "%c%n",
                    linhaVertical, linhaVertical);

            String linhaBase = String.format("%c" + String.valueOf(linhaHorizontal).repeat(largura - 2) + "%c%n",
                    cantoInferiorEsq, cantoInferiorDir);

            return linhaTopo + linhasDoMeio.repeat(altura - 2) + linhaBase;
        }

   }

}
