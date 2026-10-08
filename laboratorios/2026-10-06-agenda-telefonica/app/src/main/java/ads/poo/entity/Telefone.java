package ads.poo.entity;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {

    private Long id;
    private String numero;
    private RotuloTelefone rotulo;
    private String mask = null;

    public Telefone(RotuloTelefone rotulo, String numero) throws ParseException {
        this.rotulo = rotulo;
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public RotuloTelefone getRotulo() {
        return rotulo;
    }

    public void setRotulo(RotuloTelefone rotulo) {
        this.rotulo = rotulo;
    }

    /**
     * Calcula máscara para o número de telefone pela quantidade de dígitos
     * Casos de uso:
     * 13 Numero de celular com ddi: (55) (43) 998143018
     * 12 Numero fixo com ddi (55) (43) 33233333
     * 11 Numero de celular (43) 998143018
     * 10 Numero fixo (43) 33233333
     * Demais casos (XX) Seguido pelos demais dígitos
     */
    private void calculaMascara(){
        int size = this.numero.length();
        if (size==0){
            this.mask=null;
            return;
        }

        String mascara = switch (size) {
            case 10 -> "(##) ####-####";
            case 11 -> "(##) #####-####";
            case 12 -> "+## (##) ####-####";
            case 13 -> "+## (##) #####-####";
            default -> "(##) "+"#".repeat(size-2);
        };
        this.mask=mascara;
    }

    private String formataTelefone(String valor){
        calculaMascara();
        String resultado = "";
        try {
            MaskFormatter mask = new MaskFormatter(this.mask);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public String toString() {
        return formataTelefone(this.numero);
    }
}
