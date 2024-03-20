import javax.persistence.*;

@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @ManyToOne
    @JoinColumn(name = "genero_id", nullable = false)
    private Genero genero;

    // Getter para o id
    public Long getId() {
        return id;
    }

    // Setter para o id (geralmente não é necessário, pois o ID é gerado automaticamente)
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para o título
    public String getTitulo() {
        return titulo;
    }

    // Setter para o título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para o gênero
    public Genero getGenero() {
        return genero;
    }

    // Setter para o gênero
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
