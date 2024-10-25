import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Livro {
    private String livros;
    private String autores;
    private int anoDeLançamento;

    public Livro(String livros, String autores, int anoDeLançamento) {
        this.livros = livros;
        this.autores = autores;
        this.anoDeLançamento = anoDeLançamento;
    }

    public String getLivros() {
        return livros;
    }

    public void setLivros(String livros) {
        this.livros = livros;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public int getAnoDeLançamento() {
        return anoDeLançamento;
    }

    public void setAnoDeLançamento(int anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }

    @Override
    public String toString() {
        return "Livro  " + this.livros + ", Autor: " + this.autores +  ", Ano de Lançamento: " + this.anoDeLançamento;

    }

    public static void main(String[] args) {
        ArrayList<Livro> livros1 = new ArrayList<>();
        livros1.add(new Livro(" A menina que roubava livros", "Markus Zusak", 2005));
        livros1.add(new Livro("pequeno príncipe", "Antoine de Saint-Exupéry" , 1943));
        livros1.add(new Livro("As vantagens de ser invisível", "Stephen Chbosky" , 2012));

        System.out.print("Livros Cadastrados: ");
        for (Livro livro : livros1) {
            System.out.println(livro);
        }
    }
}
