package mx.com.santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.santander.entidad.Proyecto;
import mx.com.santander.servicio.ProyectoService;

@RestController
@RequestMapping(value = "/proyecto", method = RequestMethod.GET)
public class ProyectoController {

	@Autowired
	private ProyectoService proyectoService;
	
    @RequestMapping(value = "/getProyectos", method = RequestMethod.GET)
    public String getProyectos() {
    	List<Proyecto> proyectos = (List<Proyecto>) proyectoService.getProyectos();
    	StringBuilder strProyectos = new StringBuilder();
    	for (Proyecto proyecto : proyectos) {
			strProyectos.append(proyecto.getId());
			strProyectos.append("\n");
			strProyectos.append(proyecto.getNombre());
		}
        return " Listado de proyectos \n"  + strProyectos.toString();
    }
}
