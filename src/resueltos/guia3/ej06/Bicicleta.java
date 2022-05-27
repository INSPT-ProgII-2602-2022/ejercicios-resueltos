package resueltos.guia3.ej06;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Bicicleta {

    public final int CANT_KMS_MAX = 50;
    private String marca;
    private int rodado;
    private int cantKms;

    public Bicicleta(String marca, int rodado, int cantKms) {
        this.marca = marca;
        this.rodado = rodado;
        this.cantKms = cantKms;
    }

    public boolean cumpleRequisitos() {
        return this.cantKms < CANT_KMS_MAX;
    }

    public int getCantKms() {
        return cantKms;
    }

}
