package doichejunior.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import doichejunior.model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
