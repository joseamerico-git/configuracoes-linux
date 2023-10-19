package doichejunior.service.impl;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import doichejunior.model.Usuario;
import doichejunior.repository.UsuarioRepository;
import doichejunior.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private final UsuarioRepository usuarioRepository;

	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public Usuario findById(Long id) {

		Optional<Usuario> user = usuarioRepository.findById(id);
		return user.orElseThrow(NoSuchElementException::new);
	}

	@Override
	public Usuario create(Usuario userToCreate) {
		return usuarioRepository.save(userToCreate);

	}

}
