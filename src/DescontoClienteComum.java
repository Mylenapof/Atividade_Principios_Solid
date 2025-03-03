public class DescontoClienteComum implements DescontoStrategy {
    @Override
    public double aplicarDesconto(Pedido pedido) {
        return pedido.getTotal() * 0.95; 
    }
}

