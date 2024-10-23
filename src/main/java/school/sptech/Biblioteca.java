package school.sptech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;

    public Biblioteca() {
    }

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (livro !=null && (livro.getTitulo()!=null && livro.getTitulo().isBlank())&&(livro.getAutor()!=null && livro.getAutor().isBlank())&&(livro.getDataPublicacao()!=null)) {
            Livro novoLivro = new Livro();
            livros.add(novoLivro);
            System.out.println("Livro criado!");
        }
    }

    public void removerLivroPorTitulo(String titulo){
    List<Livro> listaLivro = new ArrayList<>();
        for (Livro livroDaVez : livros){
            if (livroDaVez.getTitulo().equalsIgnoreCase(titulo)){
                listaLivro.remove(livroDaVez);
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livroDaVez : livros) {
            if (livroDaVez.getTitulo().equalsIgnoreCase(titulo) && (livroDaVez.getTitulo() != null && !livroDaVez.getTitulo().isBlank())) {
                return livroDaVez;
            }
        }
        return null;
    }

    public Integer contarLivros(){
        livros.size();
        return livros.size();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
