package doichejunior.service;

import doichejunior.model.Usuario;

public interface UsuarioService {

	Usuario findById(Long id);

	Usuario create(Usuario userToCreate);

}
