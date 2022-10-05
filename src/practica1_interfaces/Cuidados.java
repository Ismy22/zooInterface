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
public class Cuidados implements Serializable{
    private String tipoComida;
    private String habitat;
    private float cantidadComida;
    private float costePromedio;
    private int periocidadComida;
    //Animals animal; //llamamos a la clase animals

    public Cuidados(String tipoComida, String habitat, float cantidadComida, float costePromedio, int periocidadComida){//, Animals animal) {
        this.tipoComida = tipoComida;
        this.habitat = habitat;
        this.cantidadComida = cantidadComida;
        this.costePromedio = costePromedio;
        this.periocidadComida = periocidadComida;
        //this.animal = animal;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public float getCantidadComida() {
        return cantidadComida;
    }

    public void setCantidadComida(float cantidadComida) {
        this.cantidadComida = cantidadComida;
    }

    public float getCostePromedio() {
        return costePromedio;
    }

    public void setCostePromedio(float costePromedio) {
        this.costePromedio = costePromedio;
    }

    public int getPeriocidadComida() {
        return periocidadComida;
    }

    public void setPeriocidadComida(int periocidadComida) {
        this.periocidadComida = periocidadComida;
    }

//    public Animals getAnimal() {
//        return animal;
//    }
//
//    public void setAnimal(Animals animal) {
//        this.animal = animal;
//    }
    
    
    
    
}
