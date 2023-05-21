package proyectosInvestigacion.proyectosInvestigacion.core.lineaInvestigacion;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LineaInvestigacionRepository extends CrudRepository <LineaInvestigacion, Long>{

    List<LineaInvestigacion> findAll();
    
}
