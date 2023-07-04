/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author Ben
 */
public class TestMain {
    
    public static void main(String[] args){
        
        Circuit c1 = Circuit.getInstance();
        Circuit c2 = Circuit.getInstance(); 
        
        Node One = new Node(); 
        Node Two = new Node();
        Node Three = new Node();
       
        System.out.println(One.toString());
        System.out.println(Two.toString());
        System.out.println(Three.toString());
        
        VoltageSource v1 = new VoltageSource (15, One, Two);
        VoltageSource v2 = new VoltageSource (7, One, Two);
        Resistor r1 = new Resistor(70.0, One, Two);
        Resistor r2 = new Resistor(55.0, Two, Three);
        
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        
        System.out.println("\nCircuit");
        
        c1.add(r1);
        c1.add(r2);
        c2.add(v1);
        c2.add(v2);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
    }
}
