
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    // Guarda el nombre del alumno
    private String nombre;
    // Guarda el primer apellido del alumno
    private String ape1;
    // Guarda el segundo apellido del alumno
    private String ape2;
    //Identifica al alumno
    private int ident;
    //Identifica al grupo
    private String grupo;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, String ape1, String ape2, int ident)
    {
       this.nombre = nombre;
       this.ape1 = ape1;
       this.ape2 = ape2;
       this.ident = ident;
       grupo = "";
    }

    /**
     * Metodo que devuelve el nombre 
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Metodo que devuelve el nombre 
     */
    public String getApellido1()
    {
        return ape1;
    }

    /**
     * Metodo que devuelve el nombre 
     */
    public String getApellido2()
    {
        return ape2;
    }

    /**
     * Metodo que devuelve el grupo al que pertenece el alumno 
     */
    public String getGrupo()
    {
        return grupo;
    }

    /**
     * Metodo que cambia el grupo al que pertenece el alumno 
     */
    public void setGrupo(String numGrup)
    {
        grupo = numGrup;
    }

    /**
     * Metodo que devuelve el nombre 
     */
    public int getIdentificador()
    {
        return ident;
    }
}
