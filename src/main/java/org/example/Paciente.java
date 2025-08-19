package org.example;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Paciente extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaciente;
    @Column(unique = true)
    private int nroSocio;
    @OneToMany
    @JoinColumn(name = "id_turno")
    private List<Turno> turnos = new ArrayList<>();

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, long dni, int idPaciente, int nroSocio) {
        super(nombre, apellido, dni);
        this.idPaciente = idPaciente;
        this.nroSocio = nroSocio;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }
}
