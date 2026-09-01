package biblioteca;

public class Aluno extends Usuario {
    private int matricula;

    public Aluno(String nome, int matricula) {
        super(nome); // Chama o construtor da superclasse
        this.matricula = matricula;
    }

    // Sobrescrita do método abstrato
    public int obterDiasDevolucao() {
        return 7;
    }

    // Sobrescrita do método da interface
    public void imprimirDados() {
        System.out.println("ALUNO | Nome: " + super.nome + " | Matrícula: " + this.matricula);
        if (this.getLivroAlugado() != null) {
            System.out.println("  -> Possui livro alugado: " + this.getLivroAlugado().getTitulo());
        } else {
            System.out.println("  -> Nenhum livro alugado no momento.");
        }
    }

    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }
}
