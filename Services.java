import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {
    @Autowired
    private GeneroRepository generoRepository;

    public List<Genero> listarGeneros() {
        return generoRepository.findAll();
    }

    public Genero obterGeneroPorId(Long id) {
        return generoRepository.findById(id).orElse(null);
    }

    public Genero adicionarGenero(Genero genero) {
        return generoRepository.save(genero);
    }

    public Genero atualizarGenero(Long id, Genero genero) {
        genero.setId(id);
        return generoRepository.save(genero);
    }

    public void deletarGenero(Long id) {
        generoRepository.deleteById(id);
    }
}

@Service
public class FilmeService {
    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> listarFilmes() {
        return filmeRepository.findAll();
    }

    public Filme obterFilmePorId(Long id) {
        return filmeRepository.findById(id).orElse(null);
    }

    public Filme adicionarFilme(Filme filme) {
        return filmeRepository.save(filme);
    }

    public Filme atualizarFilme(Long id, Filme filme) {
        filme.setId(id);
        return filmeRepository.save(filme);
    }

    public void deletarFilme(Long id) {
        filmeRepository.deleteById(id);
    }
}
