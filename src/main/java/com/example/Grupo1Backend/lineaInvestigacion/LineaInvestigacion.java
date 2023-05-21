package proyectosInvestigacion.proyectosInvestigacion.core.lineaInvestigacion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class LineaInvestigacion {

        //Atributos: Delimitador de acceso, Tipo de dato, Nombre del atrbuto
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String codigo;
    private String nombre;
}