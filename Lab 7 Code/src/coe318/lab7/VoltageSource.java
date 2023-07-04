/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author Ben
 */
public class VoltageSource {
 
    public double voltage; 
    public int voltage_id; 
    private Node node1; 
    private Node node2;
    private static int voltage_num = 1; 
    
    
    
    
    public VoltageSource (double voltage, Node node1, Node node2){
       
    if (voltage < 0){
        throw new IllegalArgumentException("Votlage cannot be negative");
    }
    
    if (node1 == null || node2 == null){
        throw new IllegalArgumentException("The 2 nodes must exist in this circuit");
    }
    this.voltage = voltage; 
    this.node1 = node1; 
    this.node2 = node2; 
    this.voltage_id = voltage_num; 
    voltage_num++; 
    
}
    public Node [] getNodes(){
        Node[] nodes = {node1, node2};
        return nodes; 
       
    }
    @Override
    public String toString(){
        return ("V"+ voltage_id + " " + node1 + " " + node2 + " " + "DC " + voltage);
                
    }
}
    

