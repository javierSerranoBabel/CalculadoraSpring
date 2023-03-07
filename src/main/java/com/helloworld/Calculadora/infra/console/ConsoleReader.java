package com.helloworld.Calculadora.infra.console;

import com.helloworld.Calculadora.service.CalculadoraService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

@Component
public class ConsoleReader {
    private CalculadoraService calculadoraService;

    public ConsoleReader(CalculadoraService calculadoraService){
        this.calculadoraService = calculadoraService;
    }

    @PostConstruct
    public void init(){
        Scanner sc = new Scanner(System.in);
        double op1;
        double op2;
        int opcion = 1;
        String entradaConsola;
        String operando1String;
        String operando2String;

        while(opcion != 5){
            System.out.println("\nBienvenido a la calculadora, selecciona una operación");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Salir");

            entradaConsola = sc.next();

            try{
                opcion = Integer.parseInt(entradaConsola);
            } catch(Exception e){
                System.out.println("Opción no valida");
            }

            // TODO: no repetir codigo
            switch(opcion){
                case 1:

                    System.out.println("Ingrese el primer operando");
                    operando1String = sc.next();
                    try{
                        op1 = Double.parseDouble(operando1String);
                        System.out.println("Ingrese el segundo operando");
                        operando2String = sc.next();
                        try{
                            op2 = Double.parseDouble(operando2String);
                            System.out.printf("Resultado: %f",calculadoraService.sumar(op1,op2));
                        }
                        catch(Exception e){
                            System.out.println("Operando no válido");
                        }
                    }
                    catch(Exception e){
                        System.out.println("Operando no válido");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el primer operando");
                    operando1String = sc.next();
                    try{
                        op1 = Double.parseDouble(operando1String);
                        System.out.println("Ingrese el segundo operando");
                        operando2String = sc.next();
                        try{
                            op2 = Double.parseDouble(operando2String);
                            System.out.printf("Resultado: %f",calculadoraService.restar(op1,op2));
                        }
                        catch(Exception e){
                            System.out.println("Operando no válido");
                        }
                    }
                    catch(Exception e){
                        System.out.println("Operando no válido");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el primer operando");
                    operando1String = sc.next();
                    try{
                        op1 = Double.parseDouble(operando1String);
                        System.out.println("Ingrese el segundo operando");
                        operando2String = sc.next();
                        try{
                            op2 = Double.parseDouble(operando2String);
                            System.out.printf("Resultado: %f",calculadoraService.multiplicar(op1,op2));
                        }
                        catch(Exception e){
                            System.out.println("Operando no válido");
                        }
                    }
                    catch(Exception e){
                        System.out.println("Operando no válido");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el primer operando");
                    operando1String = sc.next();
                    try{
                        op1 = Double.parseDouble(operando1String);
                        System.out.println("Ingrese el segundo operando");
                        operando2String = sc.next();
                        try{
                            op2 = Double.parseDouble(operando2String);
                            if(op2 == 0){
                                System.out.println("El divisor no puede ser 0");
                            }
                            else{
                                System.out.printf("Resultado: %f",calculadoraService.dividir(op1,op2));
                            }

                        }
                        catch(Exception e){
                            System.out.println("Operando no válido");
                        }
                    }
                    catch(Exception e){
                        System.out.println("Operando no válido");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;


                default:
                    System.out.println("Opcion no encontrada");
                    break;
            }

        }

    }

    private double comprobarSiNumero(String n){
        double op = 0;
        try{
            op = Double.parseDouble(n);

        }
        catch(Exception e){
            System.out.println("Operando no válido");

            System.exit(1);
        }
        return op;
    }
}
