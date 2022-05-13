
package resueltos.guia2.ej01;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda a = new Agenda();
        
        
        a.agregarPersona("123456","","", new Domicilio("",0,""));
        a.agregarPersona("123457","","", new Domicilio("",0,""));
        a.agregarPersona("888888","","", new Domicilio("Calle falsa",123,"Villa Buen Codigo"));
        a.agregarPersona("123459","","", new Domicilio("",0,""));
        a.agregarPersona("123450","","", new Domicilio("",0,""));
        a.agregarPersona("123451","","", new Domicilio("",0,""));
        a.agregarPersona("888888","","", new Domicilio("",0,""));
        
        
        a.listarPersonas();
        
        System.out.println("************");
        System.out.println( a.buscarPersona("888888") );
        System.out.println( a.buscarPersona("876585656") );
        
        a.eliminarTodosLosElementosAMano();
        
        System.out.println("Despues de borrar, listamos...");
        a.listarPersonas();
        
        
        a.cantPersonas();
        a.getPersonas().size();
    }

}
