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

    public Paciente(String nombre, String apellido, long dni, Domicilio domicilio, int nroSocio, List<Turno> turnos) {
        super(nombre, apellido, dni, domicilio);
        this.nroSocio = nroSocio;
        this.turnos = turnos;
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
