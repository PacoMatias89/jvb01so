package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Partido;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-11-23T03:17:14")
@StaticMetamodel(Equipo.class)
public class Equipo_ { 

    public static volatile ListAttribute<Equipo, Partido> partidosVisitante;
    public static volatile ListAttribute<Equipo, Partido> partidosLocal;
    public static volatile SingularAttribute<Equipo, String> ciudad;
    public static volatile SingularAttribute<Equipo, Long> id;
    public static volatile SingularAttribute<Equipo, String> nombre;

}