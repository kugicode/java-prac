/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example1;

/**
 *
 * @author anzoh
 */
public class DataPoint {
    public double x;
    public double y;
    public double z;
    public String label;
    
    //constructor for 2D!
    public DataPoint(double x, double y, String label){
        this.x = x;
        this.y = y;
        this.label = label;
    }
    
    public DataPoint(double x, double y, double z, String label){
        this.x = x;
        this.y = y;
        this.z = z;
        this.label = label;
        
    }

}