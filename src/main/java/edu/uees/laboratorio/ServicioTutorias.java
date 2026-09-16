package edu.uees.laboratorio;

public class ServicioTutorias {
    private static final int HORAS_MINIMAS_CONFIRMACION = 2;

    public void confirmarReserva(Reserva reserva, int horasAnticipacion) {

        if (reserva == null) {
            return;
        }

        if (reserva.getEstudiante() == null) {
            return;
        }

        if (reserva.isCancelada()) {
            return;
        }

        if (horasAnticipacion < HORAS_MINIMAS_CONFIRMACION) {
            return;
        }

        reserva.confirmar();
        System.out.println("Reserva confirmada");
    }
}