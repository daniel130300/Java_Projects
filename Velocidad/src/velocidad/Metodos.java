
package velocidad;

import java.util.Scanner;


public class Metodos 
{
    Scanner scan = new Scanner(System.in);
    Integer contador = 1; 
    
    String factura_original[][] = new String [1][13]; //Identidad Nombre Produc 1, 2, 3, 4 Cantidad 1, 2, 3, 4, Isv, Sub, Total

    public void Menu()
    {
        int opc;
        
        do
        {
            System.out.println("----------Menú--------");
            System.out.println("1.Nueva Venta");
            System.out.println("2.Listar Ventas");
            System.out.println("3.Buscar Venta");
            System.out.println("4.Salir");
            System.out.print("\n Ingrese su opción: ");
            opc = scan.nextInt(); 
            
            switch(opc)
            {
                case 1:
                    NuevaVenta();
                    break;
                case 2:
                    //Ordenamiento();
                    ListarVentas();
                    break;
                case 3:
                    BuscarVenta();
                    break;
            }
        }
        while (opc!=4);
    }
    
    
    public void NuevaVenta()
    {
        int producto;
        Integer cantidad;
        Integer acum = 0;
        Double isv;
        Double total;
        char resp = 'S';
        
        String factura_esclava[][] = new String [this.contador][13]; 
        Integer n = this.contador - 1;
        
        System.out.println("\n--------Ingreso de la Informacion del Cliente---------");
        System.out.print("Identidad: ");
        factura_esclava[n][0] = scan.next();
        System.out.print("Nombre: ");
        factura_esclava[n][1] = scan.next();
            
        while (resp == 'S')
        {
            System.out.println("\n---------Productos---------");
            System.out.println("1. Frijoles 10 Lps Libra");
            System.out.println("2. Pan 25 Lps Libra");
            System.out.println("3. Refresco 50 Lps c/u"); 
            System.out.println("4. Arroz 5 Lps Libra");
            System.out.print("\nIngrese el producto que el cliente desea llevar: ");
            producto = scan.nextInt();
        
            switch (producto)
            {
                case 1:
                    factura_esclava[n][2] = "Frijoles";
                    System.out.print("\nIngrese la cantidad que el cliente desea llevar: ");
                    cantidad = scan.nextInt();
                    acum+=(cantidad*10);
                    factura_esclava[n][3] = cantidad.toString();
                    Frijoles frijoles = new Frijoles(factura_esclava[n][2], Integer.parseInt(factura_esclava[n][3]));
                    break;
                case 2:
                   factura_esclava[n][4] = "Pan";
                   System.out.print("\nIngrese la cantidad que el cliente desea llevar: ");
                   cantidad = scan.nextInt();
                   acum+=(cantidad*25);
                   factura_esclava[n][5] = cantidad.toString();
                   Pan pan = new Pan(factura_esclava[n][4], Integer.parseInt(factura_esclava[n][5]));
                   break; 
                 case 3:
                   factura_esclava[n][6] = "Refresco";
                   System.out.print("\nIngrese la cantidad que el cliente desea llevar: ");
                   cantidad = scan.nextInt();
                   acum+=(cantidad*50);
                   factura_esclava[n][7] = cantidad.toString();
                   Refresco refresco = new Refresco(factura_esclava[n][6], Integer.parseInt(factura_esclava[n][7]));
                   break; 
                case 4:
                   factura_esclava[n][8] = "Arroz";
                   System.out.print("\nIngrese la cantidad que el cliente desea llevar: ");
                   cantidad = scan.nextInt();
                   acum+=(cantidad*5);
                   factura_esclava[n][9] = cantidad.toString();
                   Arroz arroz = new Arroz(factura_esclava[n][8], Integer.parseInt(factura_esclava[n][9]));
                   break;
            }
            System.out.print("\nDesea seguir agregando productos[S/N]: ");
            resp = scan.next().toUpperCase().charAt(0);
        }
        
        if (contador!=1)
        {
            for(int i=0; i<this.contador-1;i++)
            {
              factura_esclava[i][0]=this.factura_original[i][0];
              factura_esclava[i][1]=this.factura_original[i][1];
              factura_esclava[i][2]=this.factura_original[i][2];
              factura_esclava[i][3]=this.factura_original[i][3];
              factura_esclava[i][4]=this.factura_original[i][4];
              factura_esclava[i][5]=this.factura_original[i][5];
              factura_esclava[i][6]=this.factura_original[i][6];
              factura_esclava[i][7]=this.factura_original[i][7];
              factura_esclava[i][8]=this.factura_original[i][8];
              factura_esclava[i][9]=this.factura_original[i][9];
              factura_esclava[i][10]=this.factura_original[i][10];
              factura_esclava[i][11]=this.factura_original[i][11];
              factura_esclava[i][12]=this.factura_original[i][12];
            }
        }
        
        this.contador++;
        isv=(acum *0.15);
        total = acum + isv;
        
        factura_esclava[n][10] = acum.toString();
        factura_esclava[n][11] = isv.toString();
        factura_esclava[n][12] = total.toString();
        
        System.out.println("Subtotal: "+factura_esclava[n][10]);
        System.out.println("Impuesto: "+factura_esclava[n][11]);
        System.out.println("Total: "+factura_esclava[n][12]);
        this.setFactura_original(factura_esclava);
    }
    
    public void ListarVentas()
    {
        for (int i = 0; i<this.contador-1; i++)
        {
            System.out.println("Factura ["+(i+1)+"]");
            System.out.println("Identidad: "+this.getFactura_original()[i][0]);
            System.out.println("Nombre: "+this.getFactura_original()[i][1]);
            System.out.println("Producto: "+this.getFactura_original()[i][2]);
            System.out.println("Cantidad: "+this.getFactura_original()[i][3]);
            System.out.println("Producto: "+this.getFactura_original()[i][4]);
            System.out.println("Cantidad: "+this.getFactura_original()[i][5]);
            System.out.println("Producto: "+this.getFactura_original()[i][6]);
            System.out.println("Cantidad: "+this.getFactura_original()[i][7]);
            System.out.println("Producto: "+this.getFactura_original()[i][8]);
            System.out.println("Cantidad: "+this.getFactura_original()[i][9]);
            System.out.println("Subtotal: "+this.getFactura_original()[i][10]);
            System.out.println("I.S.V: "+this.getFactura_original()[i][11]);
            System.out.println("Total: "+this.getFactura_original()[i][12]);
        }
    }
    
    public void BuscarVenta()
    {
        String id;
        System.out.print("\nIngrese la identidad del cliente: ");
        id = scan.next();
        
        for (int i = 0; i<this.contador-1; i++)
        {
            if (this.getFactura_original()[i][0].equals(id))
            {
                System.out.println("Factura ["+(i+1)+"]");
                System.out.println("Identidad: "+this.getFactura_original()[i][0]);
                System.out.println("Nombre: "+this.getFactura_original()[i][1]);
                System.out.println("Producto: "+this.getFactura_original()[i][2]);
                System.out.println("Cantidad: "+this.getFactura_original()[i][3]);
                System.out.println("Producto: "+this.getFactura_original()[i][4]);
                System.out.println("Cantidad: "+this.getFactura_original()[i][5]);
                System.out.println("Producto: "+this.getFactura_original()[i][6]);
                System.out.println("Cantidad: "+this.getFactura_original()[i][7]);
                System.out.println("Producto: "+this.getFactura_original()[i][8]);
                System.out.println("Cantidad: "+this.getFactura_original()[i][9]);
                System.out.println("Subtotal: "+this.getFactura_original()[i][10]);
                System.out.println("I.S.V: "+this.getFactura_original()[i][11]);
                System.out.println("Total: "+this.getFactura_original()[i][12]);
            } 
        }
    }
    
   public void Ordenamiento()
    {
        int i,j;
        String [][] temp = new String[1][13];
        
        for(i=0;i<this.contador-2;i++)
        {  
            for(j=0;j<this.contador-2;j++)
            {
                if(Double.parseDouble(this.factura_original[i][12])<Double.parseDouble(this.factura_original[j+1][12]))
                {
                  temp[0][0]=this.factura_original[j+1][0];
                  temp[0][1]=this.factura_original[j+1][1];
                  temp[0][2]=this.factura_original[j+1][2];
                  temp[0][3]=this.factura_original[j+1][3];
                  temp[0][4]=this.factura_original[j+1][4];
                  temp[0][5]=this.factura_original[j+1][5];
                  temp[0][6]=this.factura_original[j+1][6];
                  temp[0][7]=this.factura_original[j+1][7];
                  temp[0][8]=this.factura_original[j+1][8]; 
                  temp[0][9]=this.factura_original[j+1][9];
                  temp[0][10]=this.factura_original[j+1][10];
                  temp[0][11]=this.factura_original[j+1][11];
                  temp[0][12]=this.factura_original[j+1][12];
                  this.factura_original[j+1][0]=this.factura_original[j][0];
                  this.factura_original[j+1][1]=this.factura_original[j][1];
                  this.factura_original[j+1][2]=this.factura_original[j][2];
                  this.factura_original[j+1][3]=this.factura_original[j][3];
                  this.factura_original[j+1][4]=this.factura_original[j][4];
                  this.factura_original[j+1][5]=this.factura_original[j][5];
                  this.factura_original[j+1][6]=this.factura_original[j][6];
                  this.factura_original[j+1][7]=this.factura_original[j][7];
                  this.factura_original[j+1][8]=this.factura_original[j][8];
                  this.factura_original[j+1][9]=this.factura_original[j][9];
                  this.factura_original[j+1][10]=this.factura_original[j][10];
                  this.factura_original[j+1][11]=this.factura_original[j][11];
                  this.factura_original[j+1][12]=this.factura_original[j][12];
                  this.factura_original[j][0]=temp[0][0];
                  this.factura_original[j][1]=temp[0][1];
                  this.factura_original[j][2]=temp[0][2];
                  this.factura_original[j][3]=temp[0][3];
                  this.factura_original[j][4]=temp[0][4];
                  this.factura_original[j][5]=temp[0][5];
                  this.factura_original[j][6]=temp[0][6];
                  this.factura_original[j][7]=temp[0][7];
                  this.factura_original[j][8]=temp[0][8];
                  this.factura_original[j][9]=temp[0][9];
                  this.factura_original[j][10]=temp[0][10];
                  this.factura_original[j][11]=temp[0][11];
                  this.factura_original[j][12]=temp[0][12];
                }
            }
        }  
    }

    public String[][] getFactura_original() {
        return factura_original;
    }

    public void setFactura_original(String[][] factura_original) {
        this.factura_original = factura_original;
    }
}
