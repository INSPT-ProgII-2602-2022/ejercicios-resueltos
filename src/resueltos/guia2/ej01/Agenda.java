package resueltos.guia2.ej01;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Persona> personas;
    
    public Agenda() {
        this.personas = new ArrayList<>();
    } 
            

    public void listarPersonas() {
        // Con FOR
//        for (int i = 0; i < personas.size(); i++) {
//            Persona p = personas.get(i);
//            System.out.println(p);   
//        }
        // Con FOREACH
        for (Persona p : this.personas) {
            System.out.println(p);
        }          
    }

    public Persona devolverUltimo() {
        Persona p = null;
        if ( !personas.isEmpty() ) {
            p = personas.get(personas.size() - 1);
        }
        return p;
    }

    public Persona buscarPersona(String DNI) {
        int i = 0;
        Persona pEncontrada = null;
        Persona p;
        while (i < this.personas.size() && pEncontrada == null) {
            p = this.personas.get(i);
            if (p.getDNI().equals(DNI)) {
                pEncontrada = p;
            } else {
                i++;
            }
        }
        return pEncontrada;
    }

    public boolean agregarPersona(String DNI, String nom, String ape, Domicilio dom) {
        boolean sePuedeAgregar = buscarPersona(DNI) == null;
        if (sePuedeAgregar){
            this.personas.add(new Persona(DNI, nom, ape, dom)); 
        }
        return sePuedeAgregar;
        
    }

    public Persona removerPersona(String DNI) {
        Persona p = buscarPersona(DNI);
        this.personas.remove(p);
        return p;
    }

    public boolean modificarDomicilio(String DNI, Domicilio dom) {
        Persona p = buscarPersona(DNI);
        boolean sePuede = p != null;
        
        if ( sePuede ) {
            p.setDomicilio(dom);
        }
        
        return sePuede;        
    }

    public void eliminarTodosLosElementosAMano() {
        while(!personas.isEmpty()) {
            personas.remove(0);
        }
    }
    
    public int cantPersonas () {
        return personas.size();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    
    
}
