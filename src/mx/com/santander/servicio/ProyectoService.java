package mx.com.santander.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.santander.entidad.Proyecto;
import mx.com.santander.repositorio.ProyectoRepositorio;

@Service
public class ProyectoService {

	@Autowired
	private ProyectoRepositorio proyectoRepositorio;
	
	
	public List<Proyecto> getProyectos(){
		return (List<Proyecto>) proyectoRepositorio.findAll();
	}
	
	
}
