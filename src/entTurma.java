
import java.io.Serializable;
import java.util.*;

public class entTurma implements Serializable {

    private String strACodigoTurma;
    private String strANomeTurma;
    private String strACodigoDisciplina;
    private Vector vecAlunos;

    //Metodos de atribuicao
    public void setCodigoTurma(String pCodigo) {
        strACodigoTurma = pCodigo;
    }

    public void setNomeTurma(String pNome) {
        strANomeTurma = pNome;
    }

    public void setCodDisciplina(String pCodigo) {
        strACodigoDisciplina = pCodigo;
    }

    public void setAlunos(Vector pAlunos) {
        vecAlunos = pAlunos;
    }

    public String getCodigoTurma() {
        return strACodigoTurma;
    }

    public String getNomeTurma() {
        return strANomeTurma;
    }

    public String getCodDisciplina() {
        return strACodigoDisciplina;
    }

    public Vector getAlunos() {
        return vecAlunos;
    }
}