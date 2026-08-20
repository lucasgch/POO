package ads.poo;

public class Character {
    private String name;
    private String classe;
    private int str;
    private int dex;
    private int vit;
    private int mag;

    public void setName(String name){
        this.name = name;
    }

    public void setClasse(String classe){
        this.classe = classe;
    }

    public void setStr(int str){
        this.str = str;
    }

    public void setDex(int dex){
        this.dex = dex;
    }

    public void setVit(int vit){
        this.vit = vit;
    }

    public void setMag(int mag){
        this.mag = mag;
    }

    public String getName(){
        return name;
    }

    public String getClasse(){
        return classe;
    }

    public int getStr() {
        return str;
    }

    public int getDex() {
        return dex;
    }

    public int getVit() {
        return vit;
    }

    public int getMag() {
        return mag;
    }
}
