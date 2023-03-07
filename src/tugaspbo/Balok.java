/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo;

/**
 *
 * @author HP
 */
public class Balok implements MenghitungBidang {
    public int panjang,lebar,tinggi;
    
    @Override
    public void luas() {
        return panjang*lebar*tinggi;
    }

    @Override
    public void keliling() {
        System.out.println("Keliling");
    }
    
}
