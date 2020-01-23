
import javax.swing.*;
import java.util.*;

public class limTurma {

    private String strACodigoTurma;
    private String strANomeTurma;
    private String strACodDisciplina;
    private Vector vecAAlunosSelecionados = new Vector();
    private Vector vecADadosForm = new Vector();

    public Vector montaForm(Vector vecDiscip, Vector vecAlunos) {
        montaFormDadosTurma();
        montaFormDadosDisciplina(vecDiscip);
        vecADadosForm.add(strACodigoTurma);
        vecADadosForm.add(strANomeTurma);
        vecADadosForm.add(strACodDisciplina);
        montaFormDadosEstudante(vecAlunos);
        return vecADadosForm;
    }

    private void montaFormDadosTurma() {
        strACodigoTurma = JOptionPane.showInputDialog("Digite o codigo da turma");
        strANomeTurma = JOptionPane.showInputDialog("Digite o nome da turma");
    }

    private void montaFormDadosDisciplina(Vector vecDiscip) {
        String discip = "";
        for (int i = 0; i < vecDiscip.size(); i++) {
            discip += ((entDisciplina) vecDiscip.elementAt(i)).getCodigo();
            discip += "\n";
        }
        strACodDisciplina = JOptionPane.showInputDialog("Digite o codigo da disciplina. Escolha entre: \n" + discip);
    }

    private void montaFormDadosEstudante(Vector vecAlunos) {
        String alunoSel, alunos = "";
        for (int i = 0; i < vecAlunos.size(); i++) {
            alunos += ((entEstudante) vecAlunos.elementAt(i)).getCodigo();
            alunos += "\n";
        }
        while (true) {
            alunoSel = JOptionPane.showInputDialog("Digite o codigo do aluno ou S para sair. \nEscolha entre: \n" + alunos);
            if (alunoSel.equalsIgnoreCase("S")) {
                break;
            }
            vecAAlunosSelecionados.add(alunoSel);
        }
        vecADadosForm.add(vecAAlunosSelecionados);
    }
}
