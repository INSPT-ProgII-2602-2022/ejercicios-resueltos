package resueltos.guia3.ej06;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class BicicletaElectrica extends Bicicleta {

    private final int CANT_POT_MAX = 400;
    private int potencia;

    public BicicletaElectrica(String marca, int rodado, int cantKms, int potencia) {
        super(marca, rodado, cantKms);
        this.potencia = potencia;
    }

    @Override
    public boolean cumpleRequisitos() {
        // PUNTO C:
        return this.potencia < CANT_POT_MAX && super.cumpleRequisitos();
        // PUNTO B:
        //return this.potencia < CANT_POT_MAX;
    }

}
