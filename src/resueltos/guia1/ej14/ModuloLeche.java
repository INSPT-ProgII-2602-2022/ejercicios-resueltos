package resueltos.guia1.ej14;

public class ModuloLeche {

    private final static int MAX_NIVEL = 5; 
    private int nivel;
    private TexturaLeche texturaActual;

    public ModuloLeche() {
        nivel = 0;
        texturaActual = TexturaLeche.NORMAL;
    }
    
    public void llenar(int cuanto) {
        setNivel( nivel + cuanto);
    }    
    
    public boolean estaOk(TipoCafe tc) {
        return tc.getCantLeche() <= nivel;
    }
    
    public void consumirLeche(TipoCafe tc) {
        setTexturaActual(tc.getTextura());
        setNivel( nivel - tc.getCantLeche() );
    }

    public void setNivel(int nivel) {
        if ( nivel >= 0 && nivel <= MAX_NIVEL) {
            this.nivel = nivel;
        }
        
    }
    
    private void setTexturaActual(TexturaLeche tex) {
        if (tex != null) {
            this.texturaActual = tex;
        }
    }

    @Override
    public String toString() {
        return "ModuloLeche{" + "nivel=" + nivel + ", texturaActual=" + texturaActual + '}';
    }
    
    
}
