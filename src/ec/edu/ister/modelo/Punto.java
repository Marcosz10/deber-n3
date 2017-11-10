package ec.edu.ister.modelo;

/**
 * @Instituto Rumiñahui
 * @author Ariel
 */
public class Punto {

    private String puntox1;
    private String puntox2;
    

    public Punto() {
    }

    public Punto(String puntox1, String puntx2 ) {
        this.puntox1 = puntox1;
        this.puntox2 = puntx2;
        
    }

    

    /**
     * @return the puntox1
     */
    public String getPuntox1() {
        return puntox1;
    }

    /**
     * @param puntox1
     */
    public void setPuntox1(String puntox1) {
        this.puntox1 = puntox1;
    }

    /**
     * @return the puntox2
     */
    public String getPuntox2() {
        return puntox2;
    }

    /**
     * @param puntox2
     */
    public void setPuntox2(String puntox2) {
        this.puntox2 = puntox2;
    }

    

    @Override
    public String toString() {
        return "Puntox1: " + getPuntox1()+ "\nPuntox2:" + puntox2 + ""
                ;
    }
    
    

}
