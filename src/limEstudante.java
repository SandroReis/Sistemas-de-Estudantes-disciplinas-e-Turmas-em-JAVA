
import javax.swing.*;

public class limEstudante {

    public String[] montaForm() {
        String aDadosForm[] = new String[2];
        aDadosForm[0] = JOptionPane.showInputDialog("Digite o codigo do aluno");
        aDadosForm[1] = JOptionPane.showInputDialog("Digite o nome do aluno");
        return aDadosForm;
    }
}