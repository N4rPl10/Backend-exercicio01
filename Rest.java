import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/generos")
public class GeneroController {
    @Autowired
    private GeneroService generoService;

    @GetMapping
    public List<Genero> listarGeneros() {
        return generoService.listarGeneros();
    }

    @GetMapping("/{id}")
    public Genero obterGeneroPorId(@PathVariable Long id) {
        return generoService.obterGeneroPorId(id);
    }

    @PostMapping
    public Genero adicionarGenero(@RequestBody Genero genero) {
        return generoService.adicionarGenero(genero);
    }

    @PutMapping("/{id}")
    public Genero atualizarGenero(@PathVariable Long id, @RequestBody Genero genero) {
        return generoService.atualizarGenero(id, genero);
    }

    @DeleteMapping("/{id}")
    public void deletarGenero(@PathVariable Long id) {
        generoService.deletarGenero(id);
    }
}

@RestController
@RequestMapping("/api/filmes")
public class FilmeController {
    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public List<Filme> listarFilmes() {
        return filmeService.listarFilmes();
    }

    @GetMapping("/{id}")
    public Filme obterFilmePorId(@PathVariable Long id) {
        return filmeService.obterFilmePorId(id);
    }

    @PostMapping
    public Filme adicionarFilme(@RequestBody Filme filme) {
        return filmeService.adicionarFilme(filme);
    }

    @PutMapping("/{id}")
    public Filme atualizarFilme(@PathVariable Long id, @RequestBody Filme filme) {
        return filmeService.atualizarFilme(id, filme);
    }

    @DeleteMapping("/{id}")
    public void deletarFilme(@PathVariable Long id) {
        filmeService.deletarFilme(id);
    }
}
