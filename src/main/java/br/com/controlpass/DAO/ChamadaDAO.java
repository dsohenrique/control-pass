package br.com.controlpass.DAO;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;

import br.com.controlpass.common.dao.BaseDAO;
import br.com.controlpass.model.Chamada;
import br.com.controlpass.model.Usuario;

public interface ChamadaDAO extends BaseDAO<Chamada> {

	@Query("Select c from Chamada c " +
		   "JOIN c.aluno a " +
		   "JOIN a.usuario u " +
		   "WHERE u.cpf = :cpfAluno")
	public List<Chamada> findBy(@Param("cpfAluno") int cpfAluno);
	
}
