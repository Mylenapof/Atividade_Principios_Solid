public class Main {
    
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("123", 100.0, "VIP");
        Pedido pedido2 = new Pedido("456", 180.0, "VIP");
        Pedido pedido3 = new Pedido("789", 3200.0, "VIP");
        Pedido pedido4 = new Pedido("369", 1900.0, "VIP");
        Pedido pedido5 = new Pedido("258", 700.0, "VIP");

        DescontoStrategy descontoStrategy = new DescontoClienteVip();
        Notificador notificador = new EmailNotificador();
        PedidoRepository pedidoRepository = new PedidoRepository();

        ProcessadorDePedidos processador = new ProcessadorDePedidos(descontoStrategy, notificador, pedidoRepository);
        processador.processar(pedido1);
        processador.processar(pedido2);
        processador.processar(pedido3);
        processador.processar(pedido4);
        processador.processar(pedido5);
        
    }
}
