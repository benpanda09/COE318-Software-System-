/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author h36grewa
 */
public class UserMain implements UserInterface{
    String input = "";
    ArrayList <Object> circuitElement = new ArrayList<>();
    Scanner userInput = new Scanner(System.in);
    
    @Override
    public void start()
    {
        display();
        run();
    }
    
    @Override
    public void run()
    {
        while(true){
            input = userInput.nextLine().trim();
            if(input.equalsIgnoreCase("end")) 
            {
                end();
                break;
            }
            else if(input.equalsIgnoreCase("spice"))
            {
                spice();
            }
            else
            {
                String[] value = input.split(" ");
                if(value.length != 4)
                {
                    System.out.println("Please format your inputs in the proper format!");
                }
                else
                {
                    if(input.toLowerCase().startsWith("v"))
                    {
                        double voltValue;
                        Node n1 = new Node();
                        Node n2 = new Node();
                        n1.node_id = Integer.parseInt(value[1]);
                        n2.node_id = Integer.parseInt(value[2]);
                        voltValue = Double.parseDouble(value[3]);
                        VoltageSource v = new VoltageSource(voltValue, n1, n2);
                        circuitElement.add(v);
                    }
                    else if (input.toLowerCase().startsWith("r"))
                    {
                       double resistValue;
                       Node n1 = new Node();
                       Node n2 = new Node();
                       n1.node_id = Integer.parseInt(value[1]);
                       n2.node_id = Integer.parseInt(value[2]);
                       resistValue = Double.parseDouble(value[3]);
                       Resistor r = new Resistor(resistValue, n1, n2);
                       circuitElement.add(r);                              
                    }
                }
            }
            
        }
    }
    @Override
    public void display(){
        System.out.println("Enter your circuit inputs:");
    }
    
    @Override
    public void spice(){
        for(Object circuit : circuitElement){
            System.out.println(circuit);
        }  
    }
    @Override
    public void end(){
        System.out.println("All done");
    }
    
    public static void main (String[] args){
        UserMain m = new UserMain();
        m.start(); 
    }
}