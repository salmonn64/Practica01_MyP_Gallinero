/**
 * 
 */
public class Transformacion {
    protected Peleador personajeBase;//a quien transforme
    protected int ataqueBase;
    protected int defensaBase;

    public Transformacion(int ataqueBase,int defensaBase){
        this.personajeBase = null;
        this.ataqueBase = ataqueBase; 
        this.defensaBase = defensaBase;
    }

    public void establecerPeleadorBase(Peleador peleador){
        personajeBase = peleador;
    }

    
}
