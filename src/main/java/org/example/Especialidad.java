package org.example;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "especialidades")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecialidad;

    @Column(nullable = false, length = 100)
    private String denominacion;

    @ManyToMany(mappedBy = "especialidades")
    private List<Medico> listaMedicos = new ArrayList<>();

    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String denominacion) {
        this.idEspecialidad = idEspecialidad;
        this.denominacion = denominacion;
    }

    public Especialidad(int idEspecialidad, String denominacion, Medico medico) {
        this.idEspecialidad = idEspecialidad;
        this.denominacion = denominacion;
        this.listaMedicos.add(medico);
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(List<Medico> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }

    public void agregarMedico(Medico medico) {
        this.listaMedicos.add(medico);
    }

    public void eliminarMedico(Medico medico) {
        if(this.listaMedicos != null) {
            this.listaMedicos.remove(medico);
        }
    }
}
