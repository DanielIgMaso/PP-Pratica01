package biblioteca;

public class Livro implements Imprimivel {
    // Atributos privados (Encapsulamento)
    private String titulo;
    private String autor;

    // Atributo Estático
    private static int totalLivros = 0;

    // Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        Livro.totalLivros++;
        System.out.println("Livro '" + this.titulo + "' cadastrado no sistema.");
    }

    // Métodos Getters e Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public static int getTotalLivros() { return totalLivros; }

    // Método da interface
    public void imprimirDados() {
        System.out.println("Livro: " + this.titulo + " | Autor: " + this.autor);
    }
}
