/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example1;
import java.util.ArrayList;
/**
 *
 * @author anzoh
 */
public class Example1 {

    /**
     * @param args the command line arguments
     * 
     * 
     */

    public static void main(String[] args) {
            
        ArrayList<DataPoint> points = new ArrayList<>();
        
        points.add(new DataPoint(3.0, 7.0, "A"));
        points.add(new DataPoint(2.0, 4.0, "B"));
        points.add(new DataPoint(5.0, 6.0, "C"));
        
        DataPoint newPoint = new DataPoint(3, 5, "unknown");
        
        double minDistance = Double.MAX_VALUE;
        DataPoint nearest = null;
       
        for(DataPoint dp : points){
            double dist = euclideanDistance(newPoint, dp);
            if(dist < minDistance){
            minDistance = dist;
                nearest = dp;
            }
        }
        
        System.out.println("Nearest label: " + nearest.label);
        
         
    }
    
    public static double euclideanDistance(DataPoint a, DataPoint b){
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
}
