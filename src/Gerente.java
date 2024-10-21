public class Gerente extends Cargo{
    int ano_inicio;
    int ano_fim;
    public Gerente(String nome, String codigo, int idade, double salario, int ano_inicio, int ano_fim) {
        super(nome, codigo, idade, salario);
        this.ano_inicio = ano_inicio;
        this.ano_fim = ano_fim;
    }
}
