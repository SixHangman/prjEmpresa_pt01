package Enzo.com.example.PrjEmpresa.repositories;

   import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Enzo.com.example.PrjEmpresa.entities.Departamento;


public interface DepartamentoRepository extends JpaRepository<Departamento, Long > {
	@Query("SELECT f FROM Funcionario f WHERE LOWER(f.funnome) LIKE LOWER(CONCAT('%', :funnome, '%'))")
	List<Departamento>findByNomeContaining(@Param("funnome") String funnome);
	

	}


