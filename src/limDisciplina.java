
import javax.swing.*;

public class limDisciplina {
        
    
    public String[] montaForm() {
        String aDadosForm[] = new String[2];
        aDadosForm[0] = JOptionPane.showInputDialog("Digite o codigo da disciplina");
        aDadosForm[1] = JOptionPane.showInputDialog("Digite o nome da disciplina");
        return aDadosForm;
    }
    
    
    

}
