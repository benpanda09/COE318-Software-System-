/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author Ben
 */
public class Node {
    // instance variables
    public int node_id;
    private static int next_id = 0;
    
    // constructor
public Node(){
    this.node_id = next_id;
    next_id ++; // id starts at zero, adds 1 
    }    
    

@Override
public String toString(){
    return ("" + node_id); 
    }
}

