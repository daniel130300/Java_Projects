
package practicagui;

public class Electrodomesticos 
{
    final Integer peso_default = 5;
    final String color_default = "Blanco";
    final Character cosumo_default = 'F';
    final int precio_default = 5000;
    
    
    private String color;
    private Character consumo;
    private Integer peso; 

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public Character comprobarConsumoEnergetico()
    {
        Character minimo = 'A';
        Character maximo = 'F';
        
        if (consumo >= minimo && consumo <= maximo)
            return consumo;
        else
        {
            consumo = this.cosumo_default;
            return this.cosumo_default;
        }
            
    }
    
    public String comprobarColor()
    {
        if (color.equals("Blanco") || color.equals("Negro") || color.equals("Rojo")|| color.equals("Azul") || color.equals("Gris"))
            return color;
        else 
        {
            color = this.color_default;
            return color_default;
        }  
    }
    
    public double precioFinal()
    {
        double preciofinal = 0;
        
        if (peso == 0)
        {
            peso = this.peso_default;
        }
        
        if (peso <= 0 && peso >= 19)
            preciofinal += this.precio_default + 100;
        else if (peso >= 20 && peso <= 49)
            preciofinal += this.precio_default + 500;
        else if (peso >=50 && peso <=79)
            preciofinal += this.precio_default + 800;
        else
            preciofinal += this.precio_default + 1000;
        
        
        switch(consumo)
        {
            case 'A':
                preciofinal += 1000;
                break;
            case 'B':
                preciofinal += 800;
                break;
            case 'C':
                preciofinal += 600;
                break;
            case 'D':
                preciofinal += 500;
                break;
            case 'E':
                preciofinal += 300;
                break;
            default:
                preciofinal += 100;
        }
        
        return preciofinal;
    }
}
