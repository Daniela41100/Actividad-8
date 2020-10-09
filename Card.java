package act8;

public class Card {
    
    private String valor;

    private String icono;

    private String color;

    Card(String av, String ai, String ac) {
        color = ac;
        icono = ai;
        valor = av;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String ac) {
        this.color = ac;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String ai) {
        this.icono = ai;
    }

    public String getValor() {
        return valor;
    }
   
    public void setValor(String av) {
        this.valor = av;
    }

    
}