
package nutricionista49.entidades;


public class DietaComida {
    
    private int idDietaComida;
    private Comida comida;
    private Dieta dieta;
    private boolean estado;

    public DietaComida() {
    }

    public DietaComida(Comida comida, Dieta dieta, boolean estado) {
        this.comida = comida;
        this.dieta = dieta;
        this.estado = estado;
    }

    public DietaComida(int idDietaComida, Comida comida, Dieta dieta, boolean estado) {
        this.idDietaComida = idDietaComida;
        this.comida = comida;
        this.dieta = dieta;
        this.estado = estado;
    }
    
    

    public int getIdDietaComida() {
        return idDietaComida;
    }

    public void setIdDietaComida(int idDietaComida) {
        this.idDietaComida = idDietaComida;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
    
    
}
