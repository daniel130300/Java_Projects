
package jiiii;

import java.util.Scanner;

public class Metodos 
{
    Integer contador_vendedores = 1;
    Integer contador_ventas = 1;
    Scanner scan = new Scanner(System.in);
    String vendedor_orignal [][] = new String [1][3];
    String factura_original [][] = new String [1][9];
    int centinela = 0;
    
    public void menu()
    {
        int opc;
        
        do
        {
            System.out.println("\n--------Sistema de Ventas de Vehiculos--------");
            System.out.println("1. Ingresar un nuevo vendedor");
            System.out.println("2. Realizar una venta");
            System.out.println("3. Listar Vendedores");
            System.out.println("4. Listar Ventas"); 
            System.out.println("5. Salir");
            System.out.print("\nIngrese su opcion: ");
            opc = scan.nextInt();

            switch (opc)
            {
                case 1:
                    this.centinela++;
                    Nuevo_vendedor();
                    break;
                case 2: 
                    if (centinela > 0)
                        Nueva_venta();
                    else
                        System.out.println("\nError! Debe ingresar un vendedor antes de realizar una venta");
                    break;

                case 3:
                    Listar_vendedores();
                    break;

                case 4:
                    Ordenamiento();
                    Listar_ventas();
                    break;
            }
        }
        while (opc<5);
    }
    
    public void Nuevo_vendedor()
    {
        Integer n = this.contador_vendedores - 1;
        String [][] vendedor_esclavo = new String [this.contador_vendedores][3];
        
        
        System.out.print("\n--------Ingreso de la Información del Vendedor--------");
        System.out.print("\nID: ");
        vendedor_esclavo[n][0] = scan.next();
        System.out.print("Nombre: ");
        vendedor_esclavo[n][1] = scan.next();
        System.out.print("Apellido: ");
        vendedor_esclavo[n][2] = scan.next();
        
        if (this.contador_vendedores != 1)
        {
            for(int i=0; i<this.contador_vendedores-1;i++)
            {
              vendedor_esclavo[i][0]=this.vendedor_orignal[i][0];
              vendedor_esclavo[i][1]=this.vendedor_orignal[i][1];
              vendedor_esclavo[i][2]=this.vendedor_orignal[i][2];
            }
        }
        
        Vendedor ven = new Vendedor(vendedor_esclavo[n][0],vendedor_esclavo[n][1],vendedor_esclavo[n][2]);
        this.setVendedor_orignal(vendedor_esclavo);
        this.contador_vendedores+=1;

    }
    
    public void Nueva_venta()
    {
        Integer n = this.contador_ventas - 1;
        int id;
        String [][] factura_esclava = new String [this.contador_ventas][9];
        boolean verificador = false;
      
        System.out.print("\n------------------Factura------------------");
        System.out.print("\n\n--Ingreso de la Informacion del Comprador--");
        System.out.print("\nID: ");
        factura_esclava[n][0] = scan.next();
        System.out.print("Nombre: ");
        factura_esclava[n][1] = scan.next();
        System.out.print("Apellido: ");
        factura_esclava[n][2] = scan.next();
        System.out.print("\n---Ingreso de la Informacion del Vehiculo---");
        System.out.print("\nPrecio: ");
        factura_esclava[n][3] = scan.next();
        System.out.print("Modelo: ");
        factura_esclava[n][4] = scan.next();
        System.out.print("Color: ");
        factura_esclava[n][5] = scan.next();
        factura_esclava[n][6] = String.valueOf(Double.parseDouble(factura_esclava[n][3])*0.15);
        System.out.print("Impuesto: " + factura_esclava[n][6]);
        System.out.print("\n---Informacion del Vendedor---");
            
        Listar_vendedores();
            
        while (verificador == false)
        {
            System.out.print("Ingrese el ID del vendedor que realiza la venta: ");
            id = scan.nextInt();
                
            for (int i = 0; i<this.contador_vendedores-1; i++)
            {
                if (Integer.parseInt(this.getVendedor_orignal()[i][0]) == id)
                {
                    factura_esclava[n][7] = this.getVendedor_orignal()[i][1];
                    verificador = true;
                }
            }
                
            if (verificador == false)
                System.out.println("\nError! El ID ingreado no existe");
        }
        
        factura_esclava[n][8] = String.valueOf(Double.parseDouble(factura_esclava[n][6]) + Double.parseDouble(factura_esclava[n][3]));
        System.out.print("Total: " + factura_esclava[n][8]);
        
        if (this.contador_ventas  != 1)
        {
            for(int i=0; i<this.contador_ventas-1;i++)
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
            }
        }
        
        Comprador com = new Comprador(factura_esclava[n][0], factura_esclava[n][1], factura_esclava[n][2]);
        this.setFactura_original(factura_esclava);
        this.contador_ventas +=1;
    }
    
    public void Listar_vendedores()
    {
        for (int i = 0; i<this.contador_vendedores-1; i++)
        {
            System.out.println("\nVendedor ["+(i+1)+"]");
            System.out.print("ID: " +this.getVendedor_orignal()[i][0]);
            System.out.print("\nNombre: " +this.getVendedor_orignal()[i][1]);
            System.out.print("\nApellido: "+this.getVendedor_orignal()[i][2]);
            System.out.println("\n");
        }
    }
    
    public void Listar_ventas()
    {
        for (int i = 0; i<this.contador_ventas-1; i++)
        {
            System.out.println("\nFactura" + "[" +(i+1)+ "]");
            System.out.print("\n---Informacion del Comprador---");
            System.out.print("\nID: " +this.getFactura_original()[i][0]);
            System.out.print("\nNombre: " +this.getFactura_original()[i][1]);
            System.out.print("\nApellido: " +this.getFactura_original()[i][2]);
            System.out.print("\n---Informacion del Vehiculo---");
            System.out.print("\nPrecio: " +this.getFactura_original()[i][3]);
            System.out.print("\nModelo: " +this.getFactura_original()[i][4]);
            System.out.print("\nColor: " +this.getFactura_original()[i][5]);
            System.out.print("\nImpuestos: " +this.getFactura_original()[i][6]);
            System.out.print("\nTotal: " +this.getFactura_original()[i][8]);
            System.out.print("\n---Informacion del Vendedor---");
            System.out.print("\nNombre: " +this.getFactura_original()[i][7]); 
            System.out.println("\n");
        }
    }
    
    public void Ordenamiento()
    {
        int i,j;
        String [][] temp = new String[1][9];
        
        for(i=0;i<this.contador_ventas-2;i++)
        {  
            for(j=0;j<this.contador_ventas-2;j++)
            {
                if(Double.parseDouble(this.factura_original[i][8])<Double.parseDouble(this.factura_original[j+1][8]))
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
                  this.factura_original[j+1][0]=this.factura_original[j][0];
                  this.factura_original[j+1][1]=this.factura_original[j][1];
                  this.factura_original[j+1][2]=this.factura_original[j][2];
                  this.factura_original[j+1][3]=this.factura_original[j][3];
                  this.factura_original[j+1][4]=this.factura_original[j][4];
                  this.factura_original[j+1][5]=this.factura_original[j][5];
                  this.factura_original[j+1][6]=this.factura_original[j][6];
                  this.factura_original[j+1][7]=this.factura_original[j][7];
                  this.factura_original[j+1][8]=this.factura_original[j][8];
                  this.factura_original[j][0]=temp[0][0];
                  this.factura_original[j][1]=temp[0][1];
                  this.factura_original[j][2]=temp[0][2];
                  this.factura_original[j][3]=temp[0][3];
                  this.factura_original[j][4]=temp[0][4];
                  this.factura_original[j][5]=temp[0][5];
                  this.factura_original[j][6]=temp[0][6];
                  this.factura_original[j][7]=temp[0][7];
                  this.factura_original[j][8]=temp[0][8];
                }
            }
        }  
    }

    public void setVendedor_orignal(String[][] vendedor_orignal) {
        this.vendedor_orignal = vendedor_orignal;
    }

    public void setFactura_original(String[][] factura_original) {
        this.factura_original = factura_original;
    }

    public String[][] getVendedor_orignal() {
        return vendedor_orignal;
    }

    public String[][] getFactura_original() {
        return factura_original;
    }
    
}
