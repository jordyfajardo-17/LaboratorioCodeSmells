package edu.uees.laboratorio;

public class Reserva {
    private final String id;
    private final Estudiante estudiante;
    private boolean cancelada;
    private boolean confirmada;

    public Reserva(String id, Estudiante estudiante) {
        this.id = id;
        this.estudiante = estudiante;
        this.cancelada = false;
        this.confirmada = false;
    }

    public String getId() {
        return id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void cancelar() {
        cancelada = true;
    }

    public void confirmar() {
        confirmada = true;
    }

    public boolean isConfirmada() {
        return confirmada;
    }
}
