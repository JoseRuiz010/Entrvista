package jo.Entrevistas.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

 import jo.Entrevistas.Model.Profesor;
import jo.Entrevistas.Repository.EntrevistaRepository;

@RestController
@RequestMapping("")
public class EntrevistaController {

	Logger logger = LoggerFactory.getLogger(EntrevistaController.class);
	
	@Autowired
	EntrevistaRepository entrevistaRepo;
	
	@GetMapping("/")
	public List<Profesor> getAllProfesor(){
		return entrevistaRepo.findAll();
	}
	@PostMapping(value = "editar/{id}")
	public Profesor getProfesorById(@PathVariable Long id, @RequestBody Profesor profesor){
		logger.info("El nombre pasado es:"+profesor.getNombre());
		Profesor p= entrevistaRepo.getReferenceById(id);
		
		p.setNombre(profesor.getNombre());
		p.setApellido(profesor.getApellido());
		p.setTelefono(profesor.getTelefono());
		p.setEmail(profesor.getEmail());
		p.setLegajo(profesor.getLegajo());
		return entrevistaRepo.save(p);
	}
	
	 
	
	/*@PutMapping(value = "/{id}")
	public Profesor editProfesorById(@PathVariable Long id){
		return entrevistaRepo.
	}*/
	
	
	
}
