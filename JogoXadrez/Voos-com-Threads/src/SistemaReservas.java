import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SistemaReservas {
    public static void main(String[] args) {
        Voo voo = new Voo("AB123", 10);

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 15; i++) {
            executor.submit(new Reserva(voo));
        }

        executor.shutdown();

        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("Processamento de reservas concluído.");
    }
}