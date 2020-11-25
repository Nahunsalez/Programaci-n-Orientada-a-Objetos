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
public class Lempira extends Moneda{

    @Override
    public String getNombre() {
        return "Lempira";
    }

    @Override
    public double geteuro() {
        return 0.035;
    }

    @Override
    public double getlempiras() {
        return 1;
    }

    @Override
    public double getdolares() {
        return 0.041;
    }
    
}
