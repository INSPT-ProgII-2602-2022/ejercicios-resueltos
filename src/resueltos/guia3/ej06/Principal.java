package resueltos.guia3.ej06;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Bicicleta> bicis = new ArrayList<>();

        bicis.add(new Bicicleta("Fake", 20, 30));
        bicis.add(new BicicletaElectrica("BiciE", 16, 65, 250));
        bicis.add(new Bicicleta("UltraBike", 28, 55));
        bicis.add(new BicicletaElectrica("Elecleta", 18, 43, 350));

        Taller t = new Taller();
        System.out.println("Servicios posibles: " + t.cantServiciosPosibles(bicis));

    }

}
