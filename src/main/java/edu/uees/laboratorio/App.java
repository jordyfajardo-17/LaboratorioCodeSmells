package edu.uees.laboratorio;

public class App {
    public static void main(String[] args) {
        ServicioTutorias servicio = new ServicioTutorias();
        Estudiante estudiante = new Estudiante("Jordy");

        System.out.println("=== CASO A ===");
        Reserva reservaA = new Reserva("R001", estudiante);
        servicio.proc(reservaA, 5);

        System.out.println("\n=== CASO B ===");
        Reserva reservaB = new Reserva("R002", estudiante);
        reservaB.cancelar();
        servicio.proc(reservaB, 5);

        System.out.println("\n=== CASO C ===");
        servicio.proc(null, 5);

        System.out.println("\n=== CASO D ===");
        Reserva reservaD = new Reserva("R004", estudiante);
        servicio.proc(reservaD, 1);
    }
}
