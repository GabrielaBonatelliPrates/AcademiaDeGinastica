package model;

/**
 *
 * @author GabrielaBonatelliPrates
 */
public class Funcionario {

    private String Nome;
    private Double Salario;
    private String Cargo;
    private Double CargaHoraria;

    public Funcionario() {
    }

    public Funcionario(String Nome, Double Salario, String Cargo, Double CargaHoraria) {
        this.Nome = Nome;
        this.Salario = Salario;
        this.Cargo = Cargo;
        this.CargaHoraria = CargaHoraria;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public Double getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(Double CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

}