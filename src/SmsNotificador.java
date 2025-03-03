public class SmsNotificador implements Notificador {
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("Notificação por SMS: Pedido " + pedido.getId() + " concluído.");
    }
}
