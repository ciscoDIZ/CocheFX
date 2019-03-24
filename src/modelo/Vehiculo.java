/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
public abstract class Vehiculo implements Posicionable{
    protected String matricula;
    protected int paso;
    protected Punto posicion;
    protected Punto areaPunto1;
    protected Punto areaPunto2;

    public Vehiculo(String matricula, int paso, Punto posicion) {
        this.matricula = matricula;
        this.paso = paso;
        this.posicion = posicion;
    }
    
    public abstract void setEspacio();
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPaso() {
        return paso;
    }

    public void setPaso(int paso) {
        this.paso = paso;
    }

    public Punto getPosicion() {
        return posicion;
    }

    public void setPosicion(Punto posicion) {
        this.posicion = posicion;
    }

    public Punto getAreaPunto1() {
        return areaPunto1;
    }

    public void setAreaPunto1(Punto areaPunto1) {
        this.areaPunto1 = areaPunto1;
    }

    public Punto getAreaPunto2() {
        return areaPunto2;
    }

    public void setAreaPunto2(Punto areaPunto2) {
        this.areaPunto2 = areaPunto2;
    }
}
