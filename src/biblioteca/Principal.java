package biblioteca;

public class Principal {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA DE BIBLIOTECA INICIADO ---\n");

        // Criando objetos Livro (Construtor)
        Livro livro1 = new Livro("Padrões de Projeto", "Erich Gamma");
        Livro livro2 = new Livro("Java como programar", "Deitel");

        // Demonstração de Atributo Estático
        System.out.println("\nTotal de livros cadastrados: " + Livro.getTotalLivros() + "\n");

        // Criando usuários (Herança e Construtor com super)
        Aluno aluno1 = new Aluno("João Silva", 12345);
        Professor prof1 = new Professor("Marco Maciel", "Computação");

        // Polimorfismo e Associação (Método alugar)
        System.out.println("--- ALUGUÉIS ---");
        aluno1.alugar(livro1); 
        System.out.println();
        
        prof1.alugar(livro2);
        System.out.println();

        // Sobrecarga (Renovação)
        System.out.println("--- RENOVAÇÃO ---");
        aluno1.alugar(livro1, true);
        System.out.println();

        // Testando a Interface (imprimirDados) e o Polimorfismo
        System.out.println("--- DADOS DOS OBJETOS (Interface Imprimivel) ---");
        livro1.imprimirDados();
        livro2.imprimirDados();
        System.out.println();
        
        aluno1.imprimirDados();
        System.out.println();
        
        prof1.imprimirDados();
    }
}
