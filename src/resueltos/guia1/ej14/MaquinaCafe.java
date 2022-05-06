package resueltos.guia1.ej14;

public class MaquinaCafe {

    private String marca;
    private boolean encendida;
    private ModuloAgua moduloAgua;
    private ModuloLeche moduloLeche;

    public MaquinaCafe(String marca, ModuloLeche ml) {
        this.marca = marca;
        this.encendida = false;
        this.moduloAgua = new ModuloAgua();
        this.moduloLeche = ml;
    }
    
    public void encender() {
        encendida = true;
    }
    

    public void servirCafe(TipoCafe t) {
        String mensaje;
        if (encendida) {
            moduloAgua.calentarAgua();
            if (moduloAgua.estaOk()) {
                if (moduloLeche.estaOk(t)) {
                    moduloLeche.consumirLeche(t);
                    mensaje = "El café " + t + " se ha servido correctamente";
                } else {
                    mensaje = "No alcanza la leche";
                }
            } else {
                mensaje = "Modulo de agua con problemas";
            }
        } else {
            mensaje = "Máquina apagada";
        }
        System.out.println(mensaje);
    }
}
