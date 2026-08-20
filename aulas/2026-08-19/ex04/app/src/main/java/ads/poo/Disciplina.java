package ads.poo;

public class Disciplina {

    private String name;
    private String curso;
    private String codigo;
    private int cargaHorariaTotal;
    private int cargaHorariaPresencial;
    private int cargaHorariaEAD;

    public void setCargaHorariaTotal(int cargaTotal){
        this.cargaHorariaTotal=cargaTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHorariaTotal() {
        return cargaHorariaTotal;
    }

    public int getCargaHorariaPresencial() {
        return cargaHorariaPresencial;
    }

    public int getCargaHorariaEAD() {
        return cargaHorariaEAD;
    }

    public void setCargaHorariaPresencial(int cargaPresencial) {
        this.cargaHorariaPresencial = cargaPresencial;
    }

    public void setCargaHorariaEAD(int cargaEAD) {
        this.cargaHorariaEAD = cargaEAD;
    }
}
