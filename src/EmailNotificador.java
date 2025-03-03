 public class EmailNotificador implements Notificador {
        @Override
        public void notificar(Pedido pedido) {
            System.out.println("Notificação por e-mail: Pedido " + pedido.getId() + " concluído.");
        }
    }
