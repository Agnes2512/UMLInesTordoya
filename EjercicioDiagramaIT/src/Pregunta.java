/**
 * os exámenes se componen de 30 preguntas que se eligen y ordenan al azar;
 * Las preguntas tienen un enunciado y cuatro posibles respuestas, sólo una de ellas válida.
 * @author madrid INESTORDOYALAGUNA
 */

public class Pregunta {

    //GETTERS Y SETTERS DE NUESTRA CLASE PREGUNTA
    /**
     * @return the enunciado
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * @param enunciado the enunciado to set
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    /**
     * @return the respuestas
     */
    public String[] getRespuestas() {
        return respuestas;
    }

    /**
     * @param respuestas the respuestas to set
     */
    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    /**
     * @return the respuestaValida
     */
    public int getRespuestaValida() {
        return respuestaValida;
    }

    /**
     * @param respuestaValida the respuestaValida to set
     */
    public void setRespuestaValida(int respuestaValida) {
        this.respuestaValida = respuestaValida;
    }

    
    //ATRIBUTOS DE NUESTRA CLASE PREGUNTA
    private String enunciado;

    private String[] respuestas;

    private int respuestaValida;
}
