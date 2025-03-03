public class Pedido {
    
    private String id;
    private double total;
    private String clienteTipo;

    public Pedido(String id, double total, String clienteTipo) {
        this.id = id;
        this.total = total;
        this.clienteTipo = clienteTipo;
    }

    public String getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public String getClienteTipo() {
        return clienteTipo;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
