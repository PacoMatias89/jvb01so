
package logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="Partidos")
public class Partido implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="equipoLocal")
    private Equipo equipoLocal;
    
    @ManyToOne
    @JoinColumn(name="equipoVisitante")
    private Equipo equipoVisitante;
    
    
    private int resultV;
    
    private int resultL;
    
    private LocalDate fechaPartido;

    public Partido() {
    }

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int resultV, int resultL, LocalDate fechaPartido) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.resultV = resultV;
        this.resultL = resultL;
        this.fechaPartido = fechaPartido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getResultV() {
        return resultV;
    }

    public void setResultV(int resultV) {
        this.resultV = resultV;
    }

    public int getResultL() {
        return resultL;
    }

    public void setResultL(int resultL) {
        this.resultL = resultL;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }
    
    
    
    

    

  
    
    
    
    

  
    
    
    
    
   
    
}
