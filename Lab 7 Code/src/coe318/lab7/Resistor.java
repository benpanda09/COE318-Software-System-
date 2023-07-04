/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author Ben
 */
public class Resistor {
    // instance variables
    public double resistance;
    public int resistor_id; 
    private Node node1;
    private Node node2; 
    private static int resistor_num = 1; 
    
    

public Resistor (double resistance, Node node1, Node node2){
    
    if (resistance < 0){
        throw new IllegalArgumentException("Resistance cannot be negative");
    }
    
    if (node1 == null || node2 == null){
        throw new IllegalArgumentException("The 2 nodes must exist in this circuit");
    }
    this.resistance = resistance; 
    this.node1 = node1; 
    this.node2 = node2; 
    this.resistor_id = resistor_num; 
    resistor_num++; 
    
}
    public Node [] getNodes(){
        Node[] nodes = {node1, node2};
        return nodes; 
       
    }
    @Override
    public String toString(){
        return ("R"+ resistor_id + " " + node1 + " " + node2 + " " + resistance);
                
    }

    Node[] getNode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
