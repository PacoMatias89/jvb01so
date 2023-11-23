
package logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="votaciones")
public class Votacion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int voto;
    private String partido;

    public Votacion() {
    }

    public Votacion( String partido, int voto) {
        this.voto = voto;
        this.partido = partido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
    
    public  void incrementaVoto(){
       this. voto++;
    }
    
    
    
    
    
}
