import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/**
 * Write a description of class Emparejador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Emparejador
{
    // Guarda los alumnos.
    private ArrayList<Alumno> alumnos;
    /**
     * Constructor for objects of class Emparejador
     */
    public Emparejador()
    {
        alumnos = new ArrayList<>();
        listaAlumnos();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void listaAlumnos()
    {
       Alumno alumno1 = new Alumno("Adrián","Adeva","Tranche",1);
       alumnos.add(alumno1);
       Alumno alumno2 = new Alumno("Francisco Javier","Aller","Gonzaléz",2);
       alumnos.add(alumno2);
       Alumno alumno3 = new Alumno("Noelia","Álvarez","Prieto",3);
       alumnos.add(alumno3);
       Alumno alumno4 = new Alumno("Manuel","Barrionuevo","Pérez",4);
       alumnos.add(alumno4);
       Alumno alumno5 = new Alumno("José Antonio","Bóveda","del Rio",5);
       alumnos.add(alumno5);
       Alumno alumno6 = new Alumno("Ignacio","de la Viuda","Crespo",6);
       alumnos.add(alumno6);
       Alumno alumno7 = new Alumno("David","Encina","Maestro",7);
       alumnos.add(alumno7);
       Alumno alumno8 = new Alumno("Kevin","Felix","Nañez",8);
       alumnos.add(alumno8);
       Alumno alumno9 = new Alumno("Daniel","Fernández","Diez",9);
       alumnos.add(alumno9);
       Alumno alumno10 = new Alumno("Javier","Fernández","González",10);
       alumnos.add(alumno10);
       Alumno alumno11 = new Alumno("Jesús","Fernández","Rincón",11);
       alumnos.add(alumno11);
       Alumno alumno12 = new Alumno("Francisco José","Fuentes","Álvarez",12);
       alumnos.add(alumno12);
       Alumno alumno13 = new Alumno("David","García","Juárez",13);
       alumnos.add(alumno13);
       Alumno alumno14 = new Alumno("Rubén","García","Serrano",14);
       alumnos.add(alumno14);
       Alumno alumno15 = new Alumno("David","González","Álvarez",15);
       alumnos.add(alumno15);
       Alumno alumno16 = new Alumno("Víctor","López","Beltrán",16);
       alumnos.add(alumno16);
       Alumno alumno17 = new Alumno("Sandra","Lora","García",17);
       alumnos.add(alumno17);
       Alumno alumno18 = new Alumno("Víctor","Melcón","Diez",18);
       alumnos.add(alumno18);
       Alumno alumno19 = new Alumno("Francisco José","Menéndez","Pouso",19);
       alumnos.add(alumno19);
       Alumno alumno20 = new Alumno("Álvaro","Pérez","Bayón",20);
       alumnos.add(alumno20);
       Alumno alumno21 = new Alumno("Daniel","Pradera","San José",21);
       alumnos.add(alumno21);
       Alumno alumno22 = new Alumno("Gabriel","Prieto","Mediavilla",22);
       alumnos.add(alumno22);
       Alumno alumno23 = new Alumno("Miguel Ángel","Robles","González",23);
       alumnos.add(alumno23);
       Alumno alumno24 = new Alumno("Adán","Sánchez","Manzano",24);
       alumnos.add(alumno24);
       Alumno alumno25 = new Alumno("Verónica","Serrano","García",25);
       alumnos.add(alumno25);
       Alumno alumno26 = new Alumno("Anibal","Tascón","González",26);
       alumnos.add(alumno26);
    }
    
    /**
     * Empareja a los alumnos de dos en dos, en caso de ser impares
     */
    public void creaGrupos(){
        ArrayList<Alumno> copia = new ArrayList<>();
        copia = (ArrayList)alumnos.clone();
        Collections.shuffle(copia);
        Iterator<Alumno> it = copia.iterator();
        int par = 0;
        String muestraGrupo = "Grupo ";
        String num = "";
        String nombres = "";        
        while(it.hasNext()){            
            Alumno alumno = it.next();
            if(par < 2){
                if( alumno.getIdentificador() < 10){
                    num+= "0" + alumno.getIdentificador();
                }
                else{
                    num+= alumno.getIdentificador();
                }
            }
            nombres+= " " + alumno. getApellido1() + " " + alumno.getApellido2() + ", " + alumno.getNombre() +" -";
            par++;
            if(par > 1 && copia.size() != 2){
                for(Alumno alum: alumnos){
                    String numAlum = "" + alum.getIdentificador();
                    String nombreAlum = alum.getNombre();
                    String ape1Alum = alum.getApellido1();
                    if(num.contains(numAlum) && nombres.contains(nombreAlum) && nombres.contains(ape1Alum)){
                        alum.setGrupo(num);
                    }
                }               
                par = 0;
                System.out.println(muestraGrupo + num + ":" + nombres + "|");
                num = "";
                nombres = "";
            }
            it.remove();
        }
    }
    
    /**
     * Busca los componentes de un grupo
     */
    public void buscaGrupo(String grupo){
       System.out.println("Al grupo " + grupo + " pertenecen:");
       for(Alumno alum: alumnos){
             if(alum.getGrupo().equals(grupo)){
                  System.out.println(alum. getApellido1() + " " + alum.getApellido2() + ", " + alum.getNombre());
             }
       }
    }
}
