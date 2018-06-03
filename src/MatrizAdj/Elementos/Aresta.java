package MatrizAdj.Elementos;

public class Aresta {

    private int id;
    private String rua;
    private int congestionamento;

    public Aresta (int id, String rua) {
        this.rua = rua;
        this.id = id;
        this.congestionamento = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getCongestionamento() {
        return congestionamento;
    }

    public void setCongestionamento(int congestionamento) {
        this.congestionamento = congestionamento;
    }
}