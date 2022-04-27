/**
 * Un ciclo formativo se compone de una serie de competencias profesionales, que tienen una descripción
 * @author madrid INESTORDOYALAGUNA
 */




public class Competencia {

    
    //GETTERS Y SETTERS D ENUESTRA CLASE COMPETENCIA
    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    //ATRIBUTOS DE NUESTRA CLASE COMPETENCIA
    private String descripcion;

    private String nombre;
}
