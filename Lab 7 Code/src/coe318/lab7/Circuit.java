
package coe318.lab7;
import java.util.ArrayList;




public class Circuit {
    
    ArrayList <Resistor> resistors; 
    ArrayList <VoltageSource> voltagesource;
    
    private static Circuit instance = null; 
    
    public static Circuit getInstance(){
        if(instance == null){
        instance = new Circuit();
        }
        return instance; 
    }
    private Circuit(){
        this.resistors = new ArrayList<Resistor>(); 
        this.voltagesource = new ArrayList<VoltageSource>();
        
    }
    public void add(Resistor r){
        this.resistors.add(r);
    }
    
    public void add(VoltageSource v){
        this.voltagesource.add(v);
    }
    
    @Override
    public String toString(){
        String circuit1 = new String();
        String circuit2 = new String();
        
        for (int i = 0; i<this.resistors.size(); i++){
            circuit1 += this.resistors.get(i).toString() + "\n";
    }
        for (int j = 0; j < this.voltagesource.size(); j++){
            circuit2 += this.voltagesource.get(j).toString() + "\n";
        }
    return (circuit1 + circuit2 );
}
}
