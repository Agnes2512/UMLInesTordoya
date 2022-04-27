
/**
 * Los alumnos y alumnas de Ciclos Formativos a Distancia se matriculan de varios módulos formativos al año;
 * Los módulos formativos son impartidos por profesores y profesoras que pondrán los contenidos del módulo a disposición de los alumnos y alumnas; 
 * Para superar un módulo hay que hacer una tarea y un examen que se calificarán de uno a diez, y sacar en ambos casos una puntuación superior a cinco.
 * @author InesTordoyaLaguna 
 */


public class Alumno extends Persona {

    /**
     * Getters y setters de nuestra clase Alumno
     */
    
    /**
     * @return the notamedia
     */
    public double getNotamedia() {
        return notamedia;
    }

    /**
     * @param notamedia the notamedia to set
     */
    public void setNotamedia(double notamedia) {
        this.notamedia = notamedia;
    }

    /**
     * @return the matricula
     */
    public Modulo[] getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(Modulo[] matricula) {
        this.matricula = matricula;
    }
    //ATRIBUTOS DE NUESTRA CLASE ALUMNO
    private double notamedia;

    private Modulo[] matricula;

    
    //MÉTODOS DE NUESTRA CLASE ALUMNO
    public void emitirCertificado() {
    }

    public double calcularNotaMedia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void matricular() {
    }
}
