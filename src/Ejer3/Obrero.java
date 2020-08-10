
package Ejer3;
public class Obrero {
    
    String nombre, cat;
    double unidad_t, unidad_l;
    //              Constructor             //

    public Obrero(String nombre, String cat, double unidad_t, double unidad_l) {
        this.nombre = nombre;
        this.cat = cat;
        this.unidad_t = unidad_t;
        this.unidad_l = unidad_l;
    }
    public double unidad_total(){
        return tarifa_tejas()+tarifa_losetas();
    }
    public double tarifa_tejas(){
        if (cat.equalsIgnoreCase("A")) {
            return  (unidad_t*2.50);
        } 
        if (cat.equalsIgnoreCase("B")) {
            return  (unidad_t*2.00);
        } 
        if (cat.equalsIgnoreCase("C")) {
            return  (unidad_t*1.50);
        } 
        return 0;
    }
          
       public double tarifa_losetas(){
        if (cat.equalsIgnoreCase("A")) {
            return  (unidad_l*2.00);
        } 
        if (cat.equalsIgnoreCase("B")) {
            return  (unidad_l*1.50);
        } 
        if (cat.equalsIgnoreCase("C")) {
            return  (unidad_l*1.00);
        } 
        return 0;
    }
    
     
    public double bonificacion(){
        
        if (unidad_total() >=1 && unidad_total() <=250){
            return 0;
        }
        if (unidad_total() >=251 && unidad_total() <=500){
            return (tarifa_losetas()*50)/100;
        }
        if (unidad_total()>=501 && unidad_total() <=1000){
            return (tarifa_losetas()*100)/100;
        }
        if (unidad_total() >1001 ){
            return (tarifa_losetas()*150)/100;
        }
        return 0;
    }
  public double seguro(){
        
        return unidad_total()-75;
    }
  public double sueldobruto(){
         return (unidad_total()-seguro()+bonificacion()); 
     }
  
    
}
