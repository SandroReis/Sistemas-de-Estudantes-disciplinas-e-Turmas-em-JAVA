
import javax.swing.JOptionPane;

public class ctrPrincipal {

    private int intAOperacao = -1;
    private ctrDisciplina objACtrDisciplina;
    private limPrincipal objALimPrincipal;
    private ctrEstudante objACtrEstudante;
    private ctrTurma objACtrTurma;

    public ctrPrincipal() {
        objALimPrincipal = new limPrincipal();
        try {
            objACtrDisciplina = new ctrDisciplina();
            objACtrEstudante = new ctrEstudante();
            objACtrTurma = new ctrTurma(this);
        } catch (Exception e) {
            System.out.println("Erro na abertura de arquivo");
        }

    }

    public ctrEstudante getObjCtrEstudante() {
        return objACtrEstudante;
    }

    public ctrDisciplina getObjCtrDisciplina() {
        return objACtrDisciplina;
    }

    public void run() {
        while (true) {
            intAOperacao = objALimPrincipal.montaMenu();
            switch (intAOperacao) {
                case 1:
                    cadDisciplina();
                    break;
                case 2:
                    cadEstudante();
                    break;
                case 3:
                    cadTurma();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, objACtrDisciplina.getDisciplinas());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, objACtrEstudante.getEstudantes());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, objACtrTurma.getTurmas());
                    break;
                case 7:
                    String codigo = JOptionPane.showInputDialog(
                            "Digite o codigo da disciplina que deseja buscar:");
                    JOptionPane.showMessageDialog(null, objACtrDisciplina.getDisciplina(codigo));
                    break;
                case 8:
                    String codigoEst = JOptionPane.showInputDialog(
                            "Digite o codigo do estudante que deseja buscar:");
                    JOptionPane.showMessageDialog(null, objACtrEstudante.getEstudante(codigoEst));
                    break;
                case 9:
                    String codigoTurma = JOptionPane.showInputDialog("Digite o codigo da turma que deseja buscar:");
                    JOptionPane.showMessageDialog(null, objACtrTurma.getTurma(codigoTurma));
                    break;
                case 10:
                    finalize();
            }
        }
    }

    private boolean cadDisciplina() {
        return objACtrDisciplina.cadDisciplina();
    }

    private boolean cadEstudante() {
        return objACtrEstudante.cadEstudante();
    }

    private boolean cadTurma() {
        return objACtrTurma.cadTurma();

    }

    public void finalize() {
        try {
            objACtrEstudante.finalize();
            objACtrDisciplina.finalize();
            objACtrTurma.finalize();
        } catch (Exception e) {
            System.err.println("Erro ao fechar arquivo!");
        }
        System.exit(0);
    }
}
