
package examen;

import java.util.Scanner;

public class Metodos 
{
    Scanner scan = new Scanner(System.in);
    private String Alumnos_original [][] = new String [1][9]; 
    private String Maestros_original [][] = new String [1][4]; 
    private Integer contador_alumnos = 1;
    private Integer contador_maestros = 1; 
    private int centinela = 0;
    
    public void Menu()
    {
        int opc;
        do
        {
            System.out.println("---------MENÚ---------");
            System.out.println("1.Ingresar un Alumno");
            System.out.println("2.Ingresar un Maestro");
            System.out.println("3.Listar Alumnos");;
            System.out.println("4.Listar Maestros");
            System.out.println("5.Salir");
            System.out.print("\n Ingrese su opcion: ");
            opc = scan.nextInt();
              
            switch(opc)
            {
                case 1:
                    if(centinela!=0)
                       IngresarAlumno();
                    else
                        System.out.println("\nError! Debe ingresar un maestro antes de ingresar un alumno\n");
                    break;
                case 2:
                    centinela++;
                    IngresarMaestro();
                    break;
                case 3:
                    ListarAlumnos();
                    break;
                case 4:
                    ListarMaestros();
                    break;
            }
        }
        while(opc!=6);
    }
    
    private void IngresarAlumno()
    {
        String Alumnos_esclavo [][] = new String [this.contador_alumnos][9];
        Integer n = this.contador_alumnos-1;
        
        System.out.println("\n------Ingreso de la Información del Alumno------");
        System.out.print("\nIdentidad: ");
        Alumnos_esclavo[n][0] = scan.next();
        System.out.print("Nombre: ");
        Alumnos_esclavo[n][1] = scan.next();
        System.out.print("Apellido: ");
        Alumnos_esclavo[n][2] = scan.next();
        
        do
        {
            System.out.print("Nota 1: ");
            Alumnos_esclavo[n][3] = scan.next();
            if (Integer.parseInt(Alumnos_esclavo[n][3])<0 || Integer.parseInt(Alumnos_esclavo[n][3])>100)
                System.out.println("Error! La nota ingresado no es valida");
        }
        while(Integer.parseInt(Alumnos_esclavo[n][3])<0 || Integer.parseInt(Alumnos_esclavo[n][3])>100); 
       
        do
        {
            System.out.print("Nota 2: ");
            Alumnos_esclavo[n][4] = scan.next();
            if (Integer.parseInt(Alumnos_esclavo[n][4])<0 || Integer.parseInt(Alumnos_esclavo[n][4])>100)
                System.out.println("Error! La nota ingresado no es valida");
        }
        while(Integer.parseInt(Alumnos_esclavo[n][4])<0 || Integer.parseInt(Alumnos_esclavo[n][4])>100); 
        
        do
        {
            System.out.print("Nota 3: ");
            Alumnos_esclavo[n][5] = scan.next();
            if (Integer.parseInt(Alumnos_esclavo[n][5])<0 || Integer.parseInt(Alumnos_esclavo[n][5])>100)
                System.out.println("Error! La nota ingresado no es valida");
        }
        while(Integer.parseInt(Alumnos_esclavo[n][5])<0 || Integer.parseInt(Alumnos_esclavo[n][5])>100); 

        Alumnos_esclavo[n][6] = String.valueOf(Calculo_promedio(Integer.parseInt(Alumnos_esclavo[n][3]),Integer.parseInt(Alumnos_esclavo[n][4]),Integer.parseInt(Alumnos_esclavo[n][5])));
        Alumnos_esclavo[n][7] = Mensaje(Double.parseDouble(Alumnos_esclavo[n][6]));
        
        ListarMaestros();
        Alumnos_esclavo[n][8] = AsignarMaestro();
        
        if (this.contador_alumnos!= 1)
        {
            for(int i=0; i<this.contador_alumnos-1;i++)
            {
              Alumnos_esclavo[i][0]=this.Alumnos_original[i][0];
              Alumnos_esclavo[i][1]=this.Alumnos_original[i][1];
              Alumnos_esclavo[i][2]=this.Alumnos_original[i][2];
              Alumnos_esclavo[i][3]=this.Alumnos_original[i][3];
              Alumnos_esclavo[i][4]=this.Alumnos_original[i][4];
              Alumnos_esclavo[i][5]=this.Alumnos_original[i][5];
              Alumnos_esclavo[i][6]=this.Alumnos_original[i][6];
              Alumnos_esclavo[i][7]=this.Alumnos_original[i][7];
              Alumnos_esclavo[i][8]=this.Alumnos_original[i][8];
            }
        }
        
        System.out.println("Promedio: "+ Alumnos_esclavo[n][6]);
        System.out.println("Mensaje: " +Alumnos_esclavo[n][7]);
        
        Alumnos alumnos = new Alumnos(Alumnos_esclavo[n][0], Alumnos_esclavo[n][1], Alumnos_esclavo[n][2], Integer.parseInt(Alumnos_esclavo[n][3]), Integer.parseInt(Alumnos_esclavo[n][4]), Integer.parseInt(Alumnos_esclavo[n][5]), Double.parseDouble(Alumnos_esclavo[n][6]),Alumnos_esclavo[n][7], Alumnos_esclavo[n][8]);
        this.setAlumnos_original(Alumnos_esclavo);
        this.contador_alumnos++;
        System.out.println("\n");
    }
    
    private void IngresarMaestro()
    {
        String Maestros_esclavo [][] = new String [this.contador_maestros][4];
        Integer n = this.contador_maestros-1;
        
        System.out.println("\n------Ingreso de la Información del Maestro------");
        System.out.print("\nIdentidad: ");
        Maestros_esclavo[n][0] = scan.next();
        System.out.print("Nombre: ");
        Maestros_esclavo[n][1] = scan.next();
        System.out.print("Apellido: ");
        Maestros_esclavo[n][2] = scan.next();
        System.out.print("Nombre de la Clase: ");
        Maestros_esclavo[n][3] = scan.next();
        
        if (this.contador_maestros!= 1)
        {
            for(int i=0; i<this.contador_maestros-1;i++)
            {
              Maestros_esclavo[i][0]=this.Maestros_original[i][0];
              Maestros_esclavo[i][1]=this.Maestros_original[i][1];
              Maestros_esclavo[i][2]=this.Maestros_original[i][2];
              Maestros_esclavo[i][3]=this.Maestros_original[i][3];
            }
        }
        
        Maestros maestros = new Maestros(Maestros_esclavo[n][0], Maestros_esclavo[n][1], Maestros_esclavo[n][2]);
        this.setMaestros_original(Maestros_esclavo);
        this.contador_maestros++;
        System.out.println("\n");
    }

    private void ListarMaestros()
    {
        for (int i = 0; i<this.contador_maestros-1; i++)
        {
            System.out.println("\nMaestro ["+(i+1)+"]");
            System.out.print("\nIdentidad: " +this.getMaestros_original()[i][0]);
            System.out.print("\nNombre: "+this.getMaestros_original()[i][1]);
            System.out.print("\nApellido: "+this.getMaestros_original()[i][2]);
            System.out.println("\nNombre de la Clase: "+this.getMaestros_original()[i][3]);
            System.out.println("\n");
        }
    }
    
    private double Calculo_promedio(Integer n1, Integer n2, Integer n3)
    {
        return Double.valueOf(n1+n2+n3)/3;
    }
    
    private String Mensaje(double promedio)
    {
        String Mensaje = null;
        
        if (promedio > 70)
            Mensaje = "Aprobado";
        else
            Mensaje = "Reprobado";
        
        return Mensaje;
    }
    
    private String AsignarMaestro()
    {
        boolean verificador = false;
        String identidad;
        String Nombre = null;
        
        while (verificador == false)
        {
            System.out.print("Ingrese la identidad del maestro: ");
            identidad = scan.next();
                
            for (int i = 0; i<this.contador_maestros-1; i++)
            {
                if(this.getMaestros_original()[i][0].equals(identidad))
                {
                    Nombre = this.getMaestros_original()[i][1];
                    verificador = true;
                }
            }
                
            if (verificador == false)
                System.out.println("\nError! La identidad ingreada no existe");
        }
        
        return Nombre;
    }
    
    private void ListarAlumnos()
    {  
        int i,j;
        Integer n = this.contador_alumnos-1;
        String temp[][] = new String[1][9];

        for(i=0;i<this.contador_alumnos-2;i++)
        {
            for(j=0;j<this.contador_alumnos-2;j++)
            {
                if(Double.parseDouble(this.Alumnos_original[j][6])<Double.parseDouble(this.Alumnos_original[j+1][6]))
                {
                    temp[0][0]=this.Alumnos_original[j+1][0];
                    temp[0][1]=this.Alumnos_original[j+1][1];
                    temp[0][2]=this.Alumnos_original[j+1][2];
                    temp[0][3]=this.Alumnos_original[j+1][3];
                    temp[0][4]=this.Alumnos_original[j+1][4];
                    temp[0][5]=this.Alumnos_original[j+1][5];
                    temp[0][6]=this.Alumnos_original[j+1][6];
                    temp[0][7]=this.Alumnos_original[j+1][7];
                    temp[0][8]=this.Alumnos_original[j+1][8];
                    this.Alumnos_original[j+1][0]=this.Alumnos_original[j][0];
                    this.Alumnos_original[j+1][1]=this.Alumnos_original[j][1];
                    this.Alumnos_original[j+1][2]=this.Alumnos_original[j][2];
                    this.Alumnos_original[j+1][3]=this.Alumnos_original[j][3];
                    this.Alumnos_original[j+1][4]=this.Alumnos_original[j][4];
                    this.Alumnos_original[j+1][5]=this.Alumnos_original[j][5];
                    this.Alumnos_original[j+1][6]=this.Alumnos_original[j][6];
                    this.Alumnos_original[j+1][7]=this.Alumnos_original[j][7];
                    this.Alumnos_original[j+1][8]=this.Alumnos_original[j][8];
                    this.Alumnos_original[j][0]=temp[0][0];
                    this.Alumnos_original[j][1]=temp[0][1];
                    this.Alumnos_original[j][2]=temp[0][2];
                    this.Alumnos_original[j][3]=temp[0][3];
                    this.Alumnos_original[j][4]=temp[0][4];
                    this.Alumnos_original[j][5]=temp[0][5];
                    this.Alumnos_original[j][6]=temp[0][6];
                    this.Alumnos_original[j][7]=temp[0][7];
                    this.Alumnos_original[j][8]=temp[0][8];
                }    
            }   
        }
        
        for (i = 0; i<this.contador_alumnos-1; i++)
        {
            System.out.println("\nAlumno ["+(i+1)+"]");
            System.out.print("\nIdentidad: " +this.Alumnos_original[i][0]);
            System.out.print("\nNombre: "+this.Alumnos_original[i][1]);
            System.out.print("\nApellido: "+this.Alumnos_original[i][2]);
            System.out.print("\nNota 1: "+this.Alumnos_original[i][3]);
            System.out.print("\nNota 2: "+this.Alumnos_original[i][4]);
            System.out.print("\nNota 3: "+this.Alumnos_original[i][5]);
            System.out.print("\nPromedio: "+this.Alumnos_original[i][6]);
            System.out.print("\nMensaje: "+this.Alumnos_original[i][7]);
            System.out.print("\nMaestro: "+this.Alumnos_original[i][8]);
            System.out.println("\n");
        }
    } 
    
    private String[][] getAlumnos_original() {
        return Alumnos_original;
    }

    private void setAlumnos_original(String[][] Alumnos_original) {
        this.Alumnos_original = Alumnos_original;
    }

    private String[][] getMaestros_original() {
        return Maestros_original;
    }

    private void setMaestros_original(String[][] Maestros_original) {
        this.Maestros_original = Maestros_original;
    }
}
