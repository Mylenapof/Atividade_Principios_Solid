public class ProcessadorDePedidos {
    
    private DescontoStrategy descontoStrategy;
    private Notificador notificador;
    private PedidoRepository pedidoRepository;

    public ProcessadorDePedidos(DescontoStrategy descontoStrategy, Notificador notificador, PedidoRepository pedidoRepository) {
        this.descontoStrategy = descontoStrategy;
        this.notificador = notificador;
        this.pedidoRepository = pedidoRepository;
    }

    public void processar(Pedido pedido) {
        double totalComDesconto = descontoStrategy.aplicarDesconto(pedido);
        pedido.setTotal(totalComDesconto);

        pedidoRepository.salvar(pedido);
        notificador.notificar(pedido);
    }
}
