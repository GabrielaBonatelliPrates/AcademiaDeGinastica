package model;

/**
 *
 * @author GabrielaBonatelliPrates
 */
public class Aluno {

    private String nome;
    private int id;
    private String genero;
    private int idade;
    private Double altura;
    private Double peso;

    public Aluno() {
    }

    public Aluno(String nome, int id, String genero, int idade, Double altura, Double peso) {
        this.nome = nome;
        this.id = id;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

}