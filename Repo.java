import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {
}

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {
}