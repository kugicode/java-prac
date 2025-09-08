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
//    public static double euclidean2D(double x1, double y1, double z1, double x2, double y2, double z2) {
//        double dx = x1 - x2;
//        double dy = y1 - y2;
//        double dz = z1 - z2;
//        double sum = dx * dx + dy * dy + dz * dz;
//        return Math.sqrt(sum);
//        
//        
//    }
    public static void main(String[] args) {
//        double result = euclidean2D(1, 2, 3, 4, 6, 9);
//        System.out.println(result);
//    DataPoint d1 = new DataPoint(1, 2,"first");
//    System.out.println(d1.x);
    ArrayList<DataPoint> point = new ArrayList();
    
    point.add(new DataPoint(1, 2, "first"));
    point.add(new DataPoint(2, 3, "second"));
    point.add(new DataPoint(4, 5, "third"));
    
    //loop thorough the DataPoint!
    for(DataPoint pt : point){
    System.out.println("x: " + pt.x + " y: " + pt.y + " label: " + pt.label );
    }
    }
    
}
