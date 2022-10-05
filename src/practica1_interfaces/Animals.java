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
public class Animals implements Serializable{
    
    private String especie;
    private String raza;
    private float peso;
    private String name;

    public Animals(String especie, String raza, float peso, String name) {
        this.especie = especie;
        this.raza = raza;
        this.peso = peso;
        this.name = name;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    
    
}
