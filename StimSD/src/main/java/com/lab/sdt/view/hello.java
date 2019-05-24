package com.lab.sdt.view;



import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import java.io.Serializable;

import com.lab.sdt.util.MensajeG;
import com.lab.sdt.service.ConsultaUsuarios;



@ManagedBean
@ViewScoped
public class hello implements Serializable {
 
private static final long serialVersionUID = 1L;
 
@ManagedProperty("#{consultaUsuarios}")
private ConsultaUsuarios consultaUsuarios;



private String name = "1";

private String apellido = "2";

private String resultado ="";

@PostConstruct
public void init(){
	
}

public void muestra() {
	try {
	consultaUsuarios.insertarUsuario("pedro");
	MensajeG.mostrar("se muestra", FacesMessage.SEVERITY_WARN);
	}catch(Exception e) {
		MensajeG.mostrar(e.toString(), FacesMessage.SEVERITY_WARN);
	}
	
	setResultado("Prueba base de datos");
	
	
}


public String getResultado() {
	return resultado;
}

public void setResultado(String resultado) {
	this.resultado = resultado;
}



public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
}