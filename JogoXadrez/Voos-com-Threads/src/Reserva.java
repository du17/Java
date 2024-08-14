
class Reserva implements Runnable {
    private final Voo voo;

    public Reserva(Voo voo) {
        this.voo = voo;
    }

    @Override
    public void run() {
        voo.reservarAssento();
    }
}