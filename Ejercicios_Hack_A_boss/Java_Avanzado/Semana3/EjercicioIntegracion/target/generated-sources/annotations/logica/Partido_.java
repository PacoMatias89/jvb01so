package logica;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Equipo;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-11-23T03:17:14")
@StaticMetamodel(Partido.class)
public class Partido_ { 

    public static volatile SingularAttribute<Partido, Equipo> equipoLocal;
    public static volatile SingularAttribute<Partido, Integer> resultV;
    public static volatile SingularAttribute<Partido, Equipo> equipoVisitante;
    public static volatile SingularAttribute<Partido, Integer> resultL;
    public static volatile SingularAttribute<Partido, LocalDate> fechaPartido;
    public static volatile SingularAttribute<Partido, Long> id;

}