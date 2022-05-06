package resueltos.guia1.ej14;

public enum TipoCafe {
    
    EXPRESSO(3, 0, null),
    LATTE(2, 2, TexturaLeche.ESPUMOSA),
    LAGRIMA(1, 3, TexturaLeche.LIQUIDA);

    private TipoCafe(int cantAgua, int cantLeche, TexturaLeche textura) {
        this.cantAgua = cantAgua;
        this.cantLeche = cantLeche;
        this.textura = textura;
    }
    
    private int cantAgua;
    private int cantLeche;
    private TexturaLeche textura;

    public int getCantLeche() {
        return cantLeche;
    }

    public TexturaLeche getTextura() {
        return textura;
    }
    
    
}
