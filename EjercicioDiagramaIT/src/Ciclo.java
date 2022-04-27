/**
 * Un ciclo formativo se compone de una serie de competencias profesionales, que tienen una descripción y que, a su vez,
 * están formadas por uno o varios módulos, que tienen un nombre, y un número de horas;
 * Cuando un alumno o alumna supera los módulos correspondientes a una capacidad se le certifica esa capacidad;
 * Cuando se han superado todos los módulos (y por tanto se han adquirido todas las competencias profesionales) se  prueba el ciclo;
 * Cuando un alumno o alumna finaliza el ciclo se emite un certificado de competencias a su nombre donde aparece la descripción de 
 * las competencias que forman el ciclo y la nota media obtenida;
 * Si un alumno o alumna no termina de cursar el ciclo completo puede pedir un certificado que acredite las competencias que sí tenga adquiridas.
 * @author MADRID INESTORDOYALAGUNA
 */


public class Ciclo {

    
    //GETTERS Y SETTERS DE NUESTRA CLASE CICLO
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
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the listaCompetencias
     */
    public Competencia[] getListaCompetencias() {
        return listaCompetencias;
    }

    /**
     * @param listaCompetencias the listaCompetencias to set
     */
    public void setListaCompetencias(Competencia[] listaCompetencias) {
        this.listaCompetencias = listaCompetencias;
    }
//ATRIBUTOS DE NUESTRA CLASE CICLO
    private String nombre;

    private String descripcion;

    private int horas;

    private int year;

    private Competencia[] listaCompetencias;
}
