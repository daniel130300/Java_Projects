
package practicagui;

public class Lavadora 
{
    final int carga_default = 5;
    final int precio_default = 5000;
    
    private int carga;

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public double precioFinal()
    {
        if (carga > 30)
            return precio_default+500;
        else
            return precio_default;
    }
    
    
}
