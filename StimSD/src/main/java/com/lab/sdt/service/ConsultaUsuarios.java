package com.lab.sdt.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lab.sdt.dao.UsuarioMapper;
import com.lab.sdt.model.Usuario;


@Service
@Transactional
public class ConsultaUsuarios {

	@Autowired
	private UsuarioMapper usuarioMapper;
	
	public void insertarHistoricoDeGeneracionCodigos(String username) throws Exception{
		Usuario user_1 = new Usuario();
		user_1.setNombre("pedro_el");
		insertarUsuario(user_1);
	}
	public void insertarUsuario(Usuario usuario)throws Exception{
		usuarioMapper.insert(usuario);
	}
}
