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
public class Coche extends Vehiculo{
    private boolean frenoMano;
    private boolean arranque;

    public Coche(boolean frenoMano, boolean arranque, String matricula, int paso, Punto posicion) {
        super(matricula, paso, posicion);
        this.frenoMano = frenoMano;
        this.arranque = arranque;
    }

    public boolean isFrenoMano() {
        return frenoMano;
    }

    public void setFrenoMano(boolean frenoMano) {
        this.frenoMano = frenoMano;
    }

    public boolean isArranque() {
        return arranque;
    }

    public void setArranque(boolean arranque) {
        this.arranque = arranque;
    }

    @Override
    public void setEspacio() {
        this.areaPunto1 = new Punto(this.posicion.x + 20, this.posicion.y + 20);
        this.areaPunto2 = new Punto(this.posicion.x - 20, this.posicion.y - 20);
    }
    
    @Override
    public double getX() {
        return posicion.getX();
    }

    @Override
    public double getY() {
        return posicion.getY();
    }

    @Override
    public void setX(double x) {
        posicion.setX(x);
    }

    @Override
    public void setY(double y) {
        posicion.setY(y);
    }
    
}
