package resueltos.guia3.ej06;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Taller {

    /* 
        Solo se brinda servicios a aquellas
        bicicletas de menos de 50kms recorridos y
        bicicletas eléctricas de hasta 400w y menos de
        50 kms recorridos, como el resto de las bicicletas
     */
    public int cantServiciosPosibles(ArrayList<Bicicleta> bicis) {
        int contador = 0;
        for (Bicicleta bici : bicis) {
            if (bici.cumpleRequisitos()) {
                contador++;
            }
        }
        return contador;
    }
}
