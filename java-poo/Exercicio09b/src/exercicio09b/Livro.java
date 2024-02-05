/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio09b;

/**
 *
 * @author Felipe
 */
public class Livro implements Publicacao {
    // Atributos
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Métodos
    
    public void detalhes() {
        System.out.println("Título do livro: " + this.getTitulo());
        System.out.println("Autor do livro: " + this.getAutor());
        System.out.println("Total de Páginas: " + this.getTotPaginas());
        System.out.println("Página Atual: " + this.getPagAtual());
        System.out.println("O livro está aberto?: " + this.getAberto());
        System.out.println("Quem está lendo o livro? (Leitor): " + this.getLeitor().getNome());
    }
    
    // Métodos Especiais
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    // Métodos Abstratos

    @Override
    public void abrir() {
       this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pag) {
        this.setPagAtual(pag);
    }

    @Override
    public void avancarPag() {
        if (this.getAberto()) {
            System.out.println("Avança Página Concluida");
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            System.out.println("O Livro está fechado, abra o livro para avançar.");
        }
    }

    @Override
    public void voltarPag() {
        if (this.getAberto()) {
            System.out.println("Avança Página Concluida");
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            System.out.println("O Livro está fechado, abra o livro para voltar página.");
        }
    }
    
}
