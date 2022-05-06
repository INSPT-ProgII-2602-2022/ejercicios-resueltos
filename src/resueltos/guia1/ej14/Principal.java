
package resueltos.guia1.ej14;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        ModuloLeche ml = new ModuloLeche();
        ml.llenar(5);
        MaquinaCafe mdc = new MaquinaCafe("Oster", ml);
        
        mdc.encender();
        mdc.servirCafe(TipoCafe.LAGRIMA);
        mdc.servirCafe(TipoCafe.LAGRIMA);
        mdc.servirCafe(TipoCafe.LATTE);
        ml.llenar(4);
        mdc.servirCafe(TipoCafe.LATTE);
    }

}
