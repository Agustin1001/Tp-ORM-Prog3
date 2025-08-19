package org.example;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Medico extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMedico;
    private int matricula;
    private long celular;
    @OneToMany
    @JoinColumn(name = "id_turno")
    private List<Turno> turnos = new ArrayList<>();
    @ManyToMany
    @JoinTable(
            name = "medico_especialidad",
            joinColumns = @JoinColumn(name = "id_medico"),
            inverseJoinColumns = @JoinColumn(name = "id_especialidad")
    )
    private List<Especialidad> listaEspecialidad = new ArrayList<>();

    public Medico() {
    }

    public Medico(String nombre, String apellido, long dni, Domicilio domicilio, int matricula, long celular, List<Turno> turnos, List<Especialidad> listaEspecialidad) {
        super(nombre, apellido, dni, domicilio);
        this.matricula = matricula;
        this.celular = celular;
        this.turnos = turnos;
        this.listaEspecialidad = listaEspecialidad;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }
}
