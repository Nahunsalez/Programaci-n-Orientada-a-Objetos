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
public class Dolar extends Moneda{
    @Override
    public String getNombre() {
        return "Dolar";
    }

    @Override
    public double geteuro() {
        return 0.84;
    }

    @Override
    public double getlempiras() {
        return 24.30;
    }

    @Override
    public double getdolares() {
        return 1;
    }
    
    
}
