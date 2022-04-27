/**
 * Los módulos formativos son impartidos por profesores y profesoras;
 * Para el profesorado, además, se debe conocer su número de registro personal (NRP)
 * @author madrid INESTORDOYALAGUNA
 */


public class Profesor extends Persona {

    //GETTERS Y SETTERS PARA NUESTRA CLASE PROFESOR
    /**
     * @return the NRP
     */
    public String getNRP() {
        return NRP;
    }

    /**
     * @param NRP the NRP to set
     */
    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    /**
     * @return the docencia
     */
    public Modulo[] getDocencia() {
        return docencia;
    }

    /**
     * @param docencia the docencia to set
     */
    public void setDocencia(Modulo[] docencia) {
        this.docencia = docencia;
    }

    
    //ATRIBUTOS DE NUESTRA CLASE PROFESOR
    private String NRP;

    private Modulo[] docencia;

    
    //METODOS DE NUESTRA CLASE PROFESOR
    public void agregarmodulo() {
    }

    public void setNRP() {
    }
}
