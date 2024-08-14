
class Voo {
    private final String numeroVoo;
    private final int capacidadeTotal;
    private int assentosReservados;

    public Voo(String numeroVoo, int capacidadeTotal) {
        this.numeroVoo = numeroVoo;
        this.capacidadeTotal = capacidadeTotal;
        this.assentosReservados = 0;
    }

    public synchronized boolean reservarAssento() {
        if (assentosReservados < capacidadeTotal) {
            assentosReservados++;
            System.out.println(Thread.currentThread().getName() + " reservou um assento no voo " + numeroVoo + ". Assentos restantes: " + (capacidadeTotal - assentosReservados));
            return true;
        } else {
            System.out.println(Thread.currentThread().getName() + " não conseguiu reservar um assento no voo " + numeroVoo + ". Assentos esgotados.");
            return false;
        }
    }
}