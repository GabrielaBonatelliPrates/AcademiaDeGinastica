package Principal;

import javax.swing.JOptionPane;
import model.Aluno;
import model.Funcionario;

/**
 *
 * @author GabrielaBonatelliPrates
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Informações do aluno:
        Aluno a1 = new Aluno("Gabriela", 6, "Feminino", 18, 1.55, 40.0);

        JOptionPane.showMessageDialog(null, "Nome: " + a1.getNome());
        JOptionPane.showMessageDialog(null, "Id: " + a1.getId());
        JOptionPane.showMessageDialog(null, "Gênero: " + a1.getGenero());
        JOptionPane.showMessageDialog(null, "Idade: " + a1.getIdade());
        JOptionPane.showMessageDialog(null, "Altura: " + a1.getAltura());
        JOptionPane.showMessageDialog(null, "Peso: " + a1.getPeso());

        // Informações do funcionário:
        Funcionario f1 = new Funcionario("Luisa", 1500.0, "Professora de ginástica", 5.0);
        JOptionPane.showMessageDialog(null, "Nome: " + f1.getNome());
        JOptionPane.showMessageDialog(null, "Salário: " + f1.getSalario());
        JOptionPane.showMessageDialog(null, "Cargo: " + f1.getCargo());
        JOptionPane.showMessageDialog(null, "Carga horária em minutos: " + f1.getCargaHoraria());

    }

}