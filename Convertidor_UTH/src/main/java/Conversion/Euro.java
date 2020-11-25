/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversion;

/**
 *
 * @author walter salez
 */
public class Euro extends Moneda{

    @Override
    public String getNombre() {
        return "Euro";
    }

    @Override
    public double geteuro() {
        return 1;
    }

    @Override
    public double getlempiras() {
        return 28.90;
    }

    @Override
    public double getdolares() {
        return 1.19;
    }
    
}
