package tareasis2.models;

public class Codigo {
    private String codigo1;
    private String codigo2;
    private String codigo3;
    private String codigo4;
    private String codigo5;
    private int cod_sis;

    public Codigo(String codigo1, String codigo2, String codigo3, String codigo4, String codigo5, int cod_sis) {
        this.codigo1 = codigo1;
        this.codigo2 = codigo2;
        this.codigo3 = codigo3;
        this.codigo4 = codigo4;
        this.codigo5 = codigo5;
        this.cod_sis = cod_sis;
    }

    public String getCodigo1() {
        return codigo1;
    }

    public String getCodigo2() {
        return codigo2;
    }

    public String getCodigo3() {
        return codigo3;
    }

    public String getCodigo4() {
        return codigo4;
    }
    
    public String getCodigo5() {
        return codigo5;
    }

    public int getCod_sis() {
        return cod_sis;
    }

    public void setCodigo1(String codigo1) {
        this.codigo1 = codigo1;
    }

    public void setCodigo2(String codigo2) {
        this.codigo2 = codigo2;
    }

    public void setCodigo3(String codigo3) {
        this.codigo3 = codigo3;
    }

    public void setCodigo4(String codigo4) {
        this.codigo4 = codigo4;
    }
    
    public void setCodigo5(String codigo5) {
        this.codigo4 = codigo5;
    }

    public void setCod_sis(int cod_sis) {
        this.cod_sis = cod_sis;
    }
    
}
