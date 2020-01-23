
import javax.swing.*;

public class limPrincipal {

    public int montaMenu() {
        int escolha = -1;
        String escolhaInformada = "";
        do {
            try {
                escolhaInformada
                        = JOptionPane.showInputDialog(
                                "Escolha uma opção do menu:\n"
                                + "[1] Adicionar disciplina\n"
                                + "[2] Adicionar estudante\n"
                                + "[3] Adicionar turma\n"
                                + "[4] Listar disciplinas\n"
                                + "[5] Listar estudantes\n"
                                + "[6] Listar turmas\n"
                                + "[7] Consultar disciplina\n"
                                + "[8] Consultar estudante\n"
                                + "[9] Consultar turma\n"
                                + "[10] Finalizar");
                escolha = Integer.parseInt(escolhaInformada);
            } catch (Exception exc) {
            }
        } while ((escolha < 1) || (escolha > 10));
        return escolha;
    }
}
