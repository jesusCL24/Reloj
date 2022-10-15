public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Reloj() {
    }

    public void visualizar() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    public void tic() {
        segundo++;
        if (segundo == 60) {
            segundo = 00;
            minuto++;
            if (minuto == 60) {
                minuto = 00;
                hora++;
                if (hora == 24) {
                    hora = 00;
                }
            }
        }
    }
}
