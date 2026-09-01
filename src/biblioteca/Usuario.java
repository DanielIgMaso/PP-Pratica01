package biblioteca;

public abstract class Usuario implements Imprimivel {
    // Atributos (Encapsulamento com protected/private)
    protected String nome;
    private Livro livroAlugado; // Associação

    // Construtor
    public Usuario(String nome) {
        this.nome = nome;
    }

    // Método Abstrato
    public abstract int obterDiasDevolucao();

    // Métodos de comportamento
    public void alugar(Livro livro) {
        this.livroAlugado = livro;
        System.out.println(this.nome + " alugou o livro: " + livro.getTitulo());
        System.out.println("Prazo para devolução: " + obterDiasDevolucao() + " dias.");
    }

    // Sobrecarga do método alugar
    public void alugar(Livro livro, boolean renovacao) {
        this.livroAlugado = livro;
        if (renovacao) {
            System.out.println(this.nome + " RENOVOU o livro: " + livro.getTitulo());
            System.out.println("Novo prazo para devolução: " + obterDiasDevolucao() + " dias a partir de hoje.");
        } else {
            this.alugar(livro); // chama o método padrão
        }
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Livro getLivroAlugado() { return livroAlugado; }
    public void setLivroAlugado(Livro livroAlugado) { this.livroAlugado = livroAlugado; }
}
