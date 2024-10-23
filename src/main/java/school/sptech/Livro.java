package school.sptech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private LocalDate dataPublicacao;
    private List<Avaliacao> avaliacoes;

    public Livro() {
    }

    public Livro(String titulo, String autor, LocalDate dataPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(String descricao, Double qtdEstrelas){
        if (descricao!=null&&!descricao.isBlank()&&(qtdEstrelas >=0 && qtdEstrelas <=5)) {
            Avaliacao novaAvaliacao = new Avaliacao();
            avaliacoes.add(novaAvaliacao);
            System.out.println("Avaliação criada!");
        }
    }

    public Double calcularMediaAvaliacoes(){
        Double total = 0.0;
        Double media = 0.0;
        if (avaliacoes.isEmpty()){
                return 0.0;
            } else{
                for (int i = 0; i < avaliacoes.size(); i++){
                    total += avaliacoes.get(i).getQtdEstrelas();
                media = total / avaliacoes.size();
                }
            }
        return media;
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

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", dataPublicacao=" + dataPublicacao +
                ", avaliacoes=" + avaliacoes +
                '}';
    }
}
