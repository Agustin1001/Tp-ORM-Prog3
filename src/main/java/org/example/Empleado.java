package org.example;

import jakarta.persistence.*;

@Entity
public class Empleado extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleando;
    @Column(unique = true)
    private int nroLegajo;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int idEmpleando , long dni, int nroLegajo, double sueldo) {
        super(nombre, apellido, dni);
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
        this.idEmpleando = idEmpleando;
    }

    public int getIdEmpleando() {
        return idEmpleando;
    }

    public void setIdEmpleando(int idEmpleando) {
        this.idEmpleando = idEmpleando;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }
}
