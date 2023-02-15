package jo.Entrevistas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import jo.Entrevistas.Model.Profesor;

@Repository
public interface EntrevistaRepository  extends JpaRepository<Profesor,Long>{

}
