/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1_interfaces;

import java.io.Serializable;

/**
 *
 * @author Ismael
 */
public class Especialidad implements Serializable{
    private String nombreEspecialidad;
    private float salarioMedio;
    private float extraPeligroso;

    public Especialidad(String nombreEspecialidad, float salarioMedio, float extraPeligroso) {
        this.nombreEspecialidad = nombreEspecialidad;
        this.salarioMedio = salarioMedio;
        this.extraPeligroso = extraPeligroso;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public float getSalarioMedio() {
        return salarioMedio;
    }

    public void setSalarioMedio(float salarioMedio) {
        this.salarioMedio = salarioMedio;
    }

    public float getExtraPeligroso() {
        return extraPeligroso;
    }

    public void setExtraPeligroso(float extraPeligroso) {
        this.extraPeligroso = extraPeligroso;
    }
    
    
}
