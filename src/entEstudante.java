
import java.io.Serializable;

public class entEstudante implements Serializable {

    private String strACodigo;
    private String strANome;

    //Metodos de atribuicao
    public void setCodigo(String pCodigo) {
        strACodigo = pCodigo;
    }

    public void setNome(String pNome) {
        strANome = pNome;
    }

    public String getCodigo() {
        return strACodigo;
    }

    public String getNome() {
        return strANome;
    }
}