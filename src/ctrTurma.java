
import java.util.*;
import java.io.*;

public class ctrTurma {

    private entTurma objAEntTurma;
    private limTurma objALimTurma;
    private ctrPrincipal objCtrPrincipal;
    private Vector vecATurmas = new Vector();
    private Vector vecAListaEstudantes = new Vector();
    private Vector vecAListaDisciplinas = new Vector();
    private Vector vecADadosForm = new Vector();

    public ctrTurma(ctrPrincipal pCtrPrincipal) throws Exception {
        objCtrPrincipal = pCtrPrincipal;
        objALimTurma = new limTurma();
        desserializaTurma();
    }

    public boolean cadTurma() {
        objAEntTurma = new entTurma();
        cadastra();
        objAEntTurma.setCodigoTurma((String) vecADadosForm.elementAt(0));
        objAEntTurma.setNomeTurma((String) vecADadosForm.elementAt(1));
        objAEntTurma.setCodDisciplina((String) vecADadosForm.elementAt(2));
        objAEntTurma.setAlunos((Vector) vecADadosForm.elementAt(3));
        vecATurmas.add(objAEntTurma);
        return true;
    }

    private void cadastra() {
        vecADadosForm = objALimTurma.montaForm(objCtrPrincipal.getObjCtrDisciplina().getListaDisciplinas(),
                objCtrPrincipal.getObjCtrEstudante().getListaEstudantes());
    }

    private void salva() {
    }

    public void addVetor(entTurma pTurma) {
        vecATurmas.add(pTurma);
    }

    private void serializaTurma() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("turmas.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(vecATurmas);
        objOS.flush();
        objOS.close();
    }

    private void desserializaTurma() throws Exception {
        File objFile = new File("turmas.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("turmas.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            vecATurmas = (Vector) objIS.readObject();
            objIS.close();
        }
    }

    public String getTurmas() {
        String turma = "";
        Object aux;
        for (int i = 0; i < this.vecATurmas.size(); i++) {
            aux = (entTurma) this.vecATurmas.elementAt(i);
            turma += "Codigo da turma: " + ((entTurma) aux).getCodigoTurma()
                    + "\nNome da turma: " + ((entTurma) aux).getNomeTurma()
                    + "\nCodigo da disciplina: " + ((entTurma) aux).getCodDisciplina()
                    + "\nCodigo dos Alunos: " + ((entTurma) aux).getAlunos()
                    + "\n___________\n\n";
        }
        return turma;
    }

    public String getTurma(String codigo) {
        String turma = "";
        for (int i = 0; i < vecATurmas.size(); i++) {
            Object t = vecATurmas.elementAt(i);
            if (((entTurma) t).getCodigoTurma().equals(codigo)) {
                turma += "Codigo da turma: " + ((entTurma) t).getCodigoTurma()
                        + "\nNome da turma: " + ((entTurma) t).getNomeTurma()
                        + "\nCodigo da disciplina: " + ((entTurma) t).getCodDisciplina()
                        + "\nCodigo dos Alunos: " + ((entTurma) t).getAlunos();
            }
        }
        return turma;
    }

    public void finalize() throws Exception {
        serializaTurma();
    }
}
