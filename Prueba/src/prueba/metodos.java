
package prueba;

import java.util.Scanner;

public class metodos 
{
    Validaciones Validar = new Validaciones();
    Scanner scan = new Scanner(System.in);
    Integer contador = 1;
    String [][] matriz_original = new String [1][13]; //identidad nombre 4 productos maximo con sus cantidades son 8 campos y subtotal impuesto total
            
    public void Menu()
    {
        String opc;
        int op;
        
        do
        {
            System.out.print("\n----------Menú----------");
            System.out.print("\n1.Realizar compra. \n2.Enlistar todas las compras. \n3.Buscar una compra. \n4.Salir.");
            System.out.print("\nIngrese su opcion: ");
            opc = scan.next();
            op = Validar.Validacion_Numeros(opc);
            switch (op)
            {
                case 1: 
                    NuevaCompra();
                    break;

                case 2:
                    EnlistarCompras();
                    break;

                case 3: 
                    BuscarCompras();
                    break;   
            }
        }
        while (op < 4);
    }
    
    public void NuevaCompra()
    {
        Integer n = this.contador -1;
        String [][] matriz_esclava = new String [this.contador][13];
        String produc;
        int producto;
        char resp;
        Integer acum = 0;
        Double isv;
        Double total;
        Integer cantidad;
        String cant;
        if (this.contador==1)
        {
            System.out.print("\n----------Información del Cliente----------");
            System.out.print("\nIngrese la identidad:");
            matriz_esclava[n][0]=scan.next();
            System.out.print("\nIngrese el nombre:");
            matriz_esclava[n][1]=scan.next().toUpperCase();
            
            do
            {   
                System.out.print("\n----------Informacion de la Venta----------");
                System.out.print("\n1.Frijoles 10 lps libra \n2.Pan 25 lps C/U \n3.Refresco 50 LPS C/U \n4.Arroz 5 lps libra");
                System.out.print("\nIngrese el producto que el cliente desea llevar: ");
                produc = scan.next();
                producto = Validar.Validacion_Numeros(produc);
                
                switch (producto)
                {
                    case 1:
                        matriz_esclava[n][2] = "Frijoles";
                        System.out.print("\nIngrese la cantidad que el cliente desea llevar: ");
                        cant = scan.next();
                        cantidad = Validar.Validacion_Numeros(cant);
                        acum += 10*cantidad;
                        matriz_esclava[n][3] = cantidad.toString();
                        break;
                    case 2:
                        matriz_esclava[n][4] = "Pan";
                        System.out.print("\nIngrese la cantidad que el cliente desea llevar: ");
                        cant = scan.next();
                        cantidad = Validar.Validacion_Numeros(cant);
                        acum += 25*cantidad;
                        matriz_esclava[n][5] = cantidad.toString();   
                        break;
                    case 3: 
                        matriz_esclava[n][6] = "Refresco";
                        System.out.print("\nIngrese la cantidad que el cliente desea llevar: ");
                        cant = scan.next();
                        cantidad = Validar.Validacion_Numeros(cant);
                        acum += 50*cantidad;
                        matriz_esclava[n][7] = cantidad.toString(); 
                        break;
                    case 4:
                        matriz_esclava[n][8] = "Arroz";
                        System.out.print("\nIngrese la cantidad que el cliente desea llevar: ");
                        cant = scan.next();
                        cantidad = Validar.Validacion_Numeros(cant);
                        acum += 5*cantidad;
                        matriz_esclava[n][9] = cantidad.toString(); 
                        break;
                }
                
                System.out.print("\nDesea continuar agregando productos a la venta [S/N]: ");
                resp = scan.next().toUpperCase().charAt(0);
                
            }while(resp == 'S');
            
            isv = acum*0.15;
            total = acum + isv;
            
            matriz_esclava[n][10] = acum.toString();
            matriz_esclava[n][11] = isv.toString();
            matriz_esclava[n][12] = total.toString();
            
            System.out.println("Subtotal: " +matriz_esclava[n][10]);
            System.out.println("ISV: "+matriz_esclava[n][11]);
            System.out.println("Total: "+matriz_esclava[n][12]);
            
            this.matriz_original = matriz_esclava;
        }
        else
        {  
            for(int i=0; i<this.contador-1;i++)
            {
              matriz_esclava[i][0]=this.matriz_original[i][0];
              matriz_esclava[i][1]=this.matriz_original[i][1];
              matriz_esclava[i][2]=this.matriz_original[i][2];
              matriz_esclava[i][3]=this.matriz_original[i][3];
              matriz_esclava[i][4]=this.matriz_original[i][4];
              matriz_esclava[i][5]=this.matriz_original[i][5];
              matriz_esclava[i][6]=this.matriz_original[i][6];
              matriz_esclava[i][7]=this.matriz_original[i][7];
              matriz_esclava[i][8]=this.matriz_original[i][8];
              matriz_esclava[i][9]=this.matriz_original[i][9];
              matriz_esclava[i][10]=this.matriz_original[i][10];
              matriz_esclava[i][11]=this.matriz_original[i][11];
              matriz_esclava[i][12]=this.matriz_original[i][12];
            }
            
            System.out.print("\n----------Información del Cliente----------");
            System.out.print("\nIngrese la identidad:");
            matriz_esclava[n][0]=scan.next();
            System.out.print("\nIngrese el nombre:");
            matriz_esclava[n][1]=scan.next().toUpperCase();
            
            do
            {
                System.out.print("\n----------Informacion de la Venta----------");
                System.out.print("\n1.Frijoles 10 lps libra \n2.Pan 25 lps C/U \n3.Refresco 50 LPS C/U \n4.Arroz 5 lps libra");
                System.out.print("\nIngrese el producto que el cliente desea llevar: ");
                produc = scan.next();
                producto = Validar.Validacion_Numeros(produc);

                switch (producto)
                {
                    case 1:
                        matriz_esclava[n][2] = "Frijoles";
                        System.out.print("\nIngrese la cantidad que el cliente desea llevar: ");
                        cant = scan.next();
                        cantidad = Validar.Validacion_Numeros(cant);;
                        acum += 10*cantidad;
                        matriz_esclava[n][3] = cantidad.toString();
                        break;
                    case 2:
                        matriz_esclava[n][4] = "Pan";
                        System.out.print("\nIngrese la cantidad que el cliente desea llevar: ");
                        cant = scan.next();
                        cantidad = Validar.Validacion_Numeros(cant);
                        acum += 25*cantidad;
                        matriz_esclava[n][5] = cantidad.toString();   
                        break;
                    case 3: 
                        matriz_esclava[n][6] = "Refresco";
                        System.out.print("\nIngrese la cantidad que el cliente desea llevar: ");
                        cant = scan.next();
                        cantidad = Validar.Validacion_Numeros(cant);
                        acum += 50*cantidad;
                        matriz_esclava[n][7] = cantidad.toString(); 
                        break;
                    case 4:
                        matriz_esclava[n][8] = "Arroz";
                        System.out.print("\nIngrese la cantidad que el cliente desea llevar: ");
                        cant = scan.next();
                        cantidad = Validar.Validacion_Numeros(cant);
                        acum += 5*cantidad;
                        matriz_esclava[n][9] = cantidad.toString(); 
                        break;
                }  
                System.out.print("\nDesea continuar agregando productos a la venta [S/N]: ");
                resp = scan.next().toUpperCase().charAt(0);
                
            }while(resp == 'S');
            
            isv = acum*0.15;
            total = acum + isv;
            
            matriz_esclava[n][10] = acum.toString();
            matriz_esclava[n][11] = isv.toString();
            matriz_esclava[n][12] = total.toString();
            
            System.out.println("Subtotal: " +matriz_esclava[n][10]);
            System.out.println("ISV: "+matriz_esclava[n][11]);
            System.out.println("Total: "+matriz_esclava[n][12]);
           
            this.matriz_original = matriz_esclava; //Iguala el tamaño del vector
        }
        
        this.contador+=1;
    }
    
    public void EnlistarCompras()
    {
        for(int i=0;i<this.contador-1;i++)
        {
            System.out.println("Factura ["+(i+1)+"]");
            System.out.println("Nombre: "+this.matriz_original[i][0]);
            System.out.println("Apellido: "+this.matriz_original[i][1]);
            System.out.println("Producto 1: "+this.matriz_original[i][2]);
            System.out.println("Cantidad: "+this.matriz_original[i][3]);
            System.out.println("Producto 2: "+this.matriz_original[i][4]);
            System.out.println("Cantidad: "+this.matriz_original[i][5]);
            System.out.println("Producto 3: "+this.matriz_original[i][6]);
            System.out.println("Cantidad: "+this.matriz_original[i][7]);
            System.out.println("Producto 4: "+this.matriz_original[i][8]);
            System.out.println("Cantidad: "+this.matriz_original[i][9]);
            System.out.println("Subtotal: " +this.matriz_original[i][10]);
            System.out.println("ISV: " +this.matriz_original[i][11]);
            System.out.println("Total: "+this.matriz_original[i][12]);
        }
    }
    
    public void BuscarCompras()
    {
        String busqueda;
        
        System.out.print("\nIngrese el nombre del cliente a buscar: ");
        busqueda = scan.next().toUpperCase();
        for(int i=0;i<this.contador-1;i++)
        {
            if(matriz_original[i][1].equals(busqueda))
            {
                System.out.println("Factura ["+(i+1)+"]");
                System.out.println("Identidad: "+this.matriz_original[i][0]);
                System.out.println("Nombre: "+this.matriz_original[i][1]);
                System.out.println("Producto 1: "+this.matriz_original[i][2]);
                System.out.println("Cantidad: "+this.matriz_original[i][3]);
                System.out.println("Producto 2: "+this.matriz_original[i][4]);
                System.out.println("Cantidad: "+this.matriz_original[i][5]);
                System.out.println("Producto 3: "+this.matriz_original[i][6]);
                System.out.println("Cantidad: "+this.matriz_original[i][7]);
                System.out.println("Producto 4: "+this.matriz_original[i][8]);
                System.out.println("Cantidad: "+this.matriz_original[i][9]);
                System.out.println("Subtotal: " +this.matriz_original[i][10]);
                System.out.println("ISV: " +this.matriz_original[i][11]);
                System.out.println("Total: "+this.matriz_original[i][12]);
            }
        }
    }
}
