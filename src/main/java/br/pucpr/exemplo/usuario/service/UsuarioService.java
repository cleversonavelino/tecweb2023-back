package br.pucpr.exemplo.usuario.service;

import br.pucpr.exemplo.cliente.model.entity.*;
import br.pucpr.exemplo.cliente.repository.*;
import br.pucpr.exemplo.usuario.model.entity.*;
import br.pucpr.exemplo.usuario.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public void excluir(Integer id) {
        usuarioRepository.deleteById(id);
    }


}
