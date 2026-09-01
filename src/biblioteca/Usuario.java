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
    public boolean alugar(Livro livro) {
        if (this.livroAlugado != null) {
        System.out.println(this.nome + " já possui o livro '" + this.livroAlugado.getTitulo() + "' em mãos.");
        return false;
        }
        if (livro.getDisponivel() == false) {
            System.out.println("O livro '" + livro.getTitulo() + "' não está disponível no momento.");
            return false;
        }
        this.livroAlugado = livro;
        livro.setDisponivel(false);
        System.out.println(this.nome + " alugou o livro: " + livro.getTitulo());
        System.out.println("Prazo para devolução: " + obterDiasDevolucao() + " dias.");
        return true;
        }

    // Sobrecarga do método alugar
    public boolean alugar(Livro livro, boolean renovacao) {
        if (renovacao) {
            if (this.livroAlugado == null || !this.livroAlugado.equals(livro)) {
                System.out.println(this.nome + " não pode renovar um livro que não está em sua posse.");
                return false;
            }

            System.out.println(this.nome + " RENOVOU o livro: " + livro.getTitulo());
            System.out.println("Novo prazo para devolução: " + obterDiasDevolucao() + " dias a partir de hoje.");
            return true;
        } else {
            return this.alugar(livro); // chama o método padrão
        }
    }

    public void devolver() {
    if (this.livroAlugado == null) {
        System.out.println(this.nome + " não tem nenhum livro para devolver.");
        return;
    }
    System.out.println(this.nome + " devolveu o livro: " + this.livroAlugado.getTitulo());
    this.livroAlugado.setDisponivel(true);
    this.livroAlugado = null;
}

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Livro getLivroAlugado() { return livroAlugado; }
    public void setLivroAlugado(Livro livroAlugado) { this.livroAlugado = livroAlugado; }
}
