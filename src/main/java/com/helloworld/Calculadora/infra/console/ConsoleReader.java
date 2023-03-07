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
    private double op1;
    private double op2;
    private String operando1String;
    private String operando2String;
    private  Scanner sc;

    public ConsoleReader(CalculadoraService calculadoraService){
        this.calculadoraService = calculadoraService;
    }

    @PostConstruct
    public void init(){
        sc = new Scanner(System.in);

        int opcion = 1;
        String entradaConsola;


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

            
            switch(opcion){
                case 1:
                    try{
                        getOperandos();
                        System.out.printf("Resultado: %f",calculadoraService.sumar(op1,op2));
                    }
                    catch (Exception e){
                        System.out.println("Volviendo al menu...");
                    }




                    break;
                case 2:
                    try{
                        getOperandos();
                        System.out.printf("Resultado: %f",calculadoraService.restar(op1,op2));
                    }
                    catch (Exception e){
                        System.out.println("Volviendo al menu...");
                    }
                    break;
                case 3:
                    try{
                        getOperandos();
                        System.out.printf("Resultado: %f",calculadoraService.multiplicar(op1,op2));
                    }
                    catch (Exception e){
                        System.out.println("Volviendo al menu...");
                    }
                    break;
                case 4:
                    try{
                        getOperandos();
                        System.out.printf("Resultado: %f",calculadoraService.dividir(op1,op2));
                    }
                    catch (Exception e){
                        System.out.println("Volviendo al menu...");
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
    private void getOperandos (){
        System.out.println("Ingrese el primer operando");
        operando1String = sc.next();
        try{
            op1 = Double.parseDouble(operando1String);
            System.out.println("Ingrese el segundo operando");
            operando2String = sc.next();
            try{
                op2 = Double.parseDouble(operando2String);
            }
            catch(Exception e){
                System.out.println("Segundo Operando no válido");
                throw e;
            }
        }
        catch(Exception e){
            System.out.println("Primer Operando no válido");
            throw e;
        }
    }


}
