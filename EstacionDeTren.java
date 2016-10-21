
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstacionDeTren
{
    
   private MaquinaDeTickets maquina1;
   private MaquinaDeTickets maquina2;
   private int dineroTotal;

    
     
    public EstacionDeTren()
    {
      maquina1 = new MaquinaDeTickets(300);
      maquina2 = new MaquinaDeTickets(200);
      dineroTotal = 0;
     
    }

    
    public void imprimirDineroTotal()
    {
         dineroTotal = maquina1.obtenerTotal();
         dineroTotal = dineroTotal + maquina2.obtenerTotal();
        System.out.println(dineroTotal);
        
    }
   
}
