
/**
 * Los exámenes se componen de 30 preguntas que se eligen y ordenan al azar;
 * Las preguntas tienen un enunciado y cuatro posibles respuestas, sólo una de ellas válida
 * @author madrid INESTORDOYALAGUNA
 */


public class Examen {

    
    //GETTERS Y SETTERS DE NUESTRA CLASE EXAMEN
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
     * @return the listaPreguntas
     */
    public Pregunta[] getListaPreguntas() {
        return listaPreguntas;
    }

    /**
     * @param listaPreguntas the listaPreguntas to set
     */
    public void setListaPreguntas(Pregunta[] listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }

    
    //ATRIBUTOS DE NUESTRA CLASE EXAMEN
    private String descripcion;

    private Pregunta[] listaPreguntas;

    
    //METODOS DE NUESTRA CLASE EXAMEN
    public void calificar() {
    }

    public void elegirPreguntas() {
    }

    public void ordenarPreguntas() {
    }
}
