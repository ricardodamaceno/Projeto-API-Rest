package br.com.alura.forum.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao); //esse findBy consegue filtrar pelo nome dos atributos 
	//quando colocamos na frente dele, isso possibilita criar um filtro de pesquisa
	//nesse caso ele entrou na classe Curso e buscou pelo atributo Nome

}
