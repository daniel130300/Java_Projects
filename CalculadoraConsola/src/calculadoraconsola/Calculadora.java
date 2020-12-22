
package calculadoraconsola;

import java.util.Scanner;

public class Calculadora {
    
    Scanner Scan = new Scanner(System.in);
    Validaciones Validar = new Validaciones();
    
    String primerNumero, segundoNumero;
    Double num1, num2;
    
    public void Menu()
    {
        char opc;
        char resp;
        do
        {
            System.out.println("\n----------CALCULADORA ----------");
            System.out.println("A.Suma");
            System.out.println("B.Resta");
            System.out.println("C.Multiplicación");
            System.out.println("D.División");
            System.out.print("\nIngrese la operación que desea realizar: ");
            opc = Scan.next().toUpperCase().charAt(0);
            opc = Validar.Validacion_Letras(opc);

            System.out.print("\nIngrese el primer número: ");
            primerNumero = Scan.next();
            num1 = Validar.Validacion_Numeros(primerNumero);
            System.out.print("Ingrese el segundo número: ");
            segundoNumero = Scan.next();
            num2 = Validar.Validacion_Numeros(segundoNumero);

            switch (opc)
            {
                case 'A':
                    this.Suma();
                    break;
                    
                case 'B':
                    this.Resta();
                    break;
                    
                case 'C':
                    this.Multiplicacion();
                    break;
                    
                default:
                    while (num2 == 0)
                    {
                        System.out.println("Error! No es posible dividir un número entre 0");
                        System.out.print("\nIngrese el segundo número: ");
                        segundoNumero = Scan.next();
                        num2 = Validar.Validacion_Numeros(segundoNumero);
                    }
                    this.Division();
                    break;
            }
            
            System.out.print("\n¿Desea realizar otra operación? [S/N]: " );
            resp = Scan.next().toUpperCase().charAt(0);
            resp = Validar.Validacion_Letras(resp); 
        }
        while (resp == 'S'); 
    }
    
    private void Suma()
    {
        System.out.println("Resultado: " + (this.num1+this.num2));
    }
    
    private void Resta()
    {
        System.out.println("Resultado: " + (this.num1-this.num2));
    }
    
    private void Multiplicacion()
    {
        System.out.println("Resultado: " + (this.num1*this.num2));
    }
    
    private void Division()
    {
        System.out.println("Resultado: " + (this.num1/this.num2));
    }
    
}
