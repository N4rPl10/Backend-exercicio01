import javax.persistence.*;
import java.util.List;

@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
    private List<Filme> filmes;

    // Getter para o id
    public Long getId() {
        return id;
    }

    // Setter para o id (geralmente não é necessário, pois o ID é gerado automaticamente)
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a lista de filmes
    public List<Filme> getFilmes() {
        return filmes;
    }

    // Setter para a lista de filmes
    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
}
