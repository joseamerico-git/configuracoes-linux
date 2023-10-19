package doichejunior.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import doichejunior.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
