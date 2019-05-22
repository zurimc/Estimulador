package com.lab.sdt.service;

import java.util.ArrayList;
import java.util.List;

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
	
	public void insertarUsuario(String username) throws Exception{
	/*	Usuario user_1 = new Usuario();
		user_1.setNombre("pedro_el");
		user_1.setApellido1("mama");
		user_1.setApellido2("jdoej");
		user_1.setCalle("aduios");
		user_1.setNum("11");
		user_1.setColonia("esoerabza");
		user_1.setCodigopostal("57800");
		user_1.setIdestado(2);
		user_1.setTelefono("pedro_el");
		user_1.setEmail("pedro_el");
		user_1.setIdtipo(3);
		user_1.setCuenta("pedro_el");
		user_1.setContrasenia("pedro_el");
		user_1.setEstatus("pedro_el");
		
		insertarUsuario(user_1);*/
	}
	public void insertarUsuario(Usuario usuario)throws Exception{
		usuarioMapper.insert(usuario);
	}
}
