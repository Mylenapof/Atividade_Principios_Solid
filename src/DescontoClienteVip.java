public class DescontoClienteVip implements DescontoStrategy {
    @Override
    public double aplicarDesconto(Pedido pedido) {
        return pedido.getTotal() * 0.90; 
    }
} 
