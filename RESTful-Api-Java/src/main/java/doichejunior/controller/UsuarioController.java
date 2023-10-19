package doichejunior.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import doichejunior.model.Usuario;
import doichejunior.service.UsuarioService;

@RestController

public class UsuarioController {
	
	
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService userService) {
        this.usuarioService = userService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id){
        var user = usuarioService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody Usuario userToCreate){
        var userCreated = usuarioService.create(userToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId()).toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
    
}