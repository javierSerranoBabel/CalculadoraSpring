package com.helloworld.Calculadora.service.impl;

import com.helloworld.Calculadora.service.CalculadoraService;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {
    @Override
    public double sumar(double op1, double op2) {
        return op1 + op2;
    }

    @Override
    public double restar(double op1, double op2) {
        return op1 - op2;
    }

    @Override
    public double multiplicar(double op1, double op2) {
        return op1 * op2;
    }

    @Override
    public double dividir(double op1, double op2) {
        if(op2 == 0){
            // TODO: devolver infinito
            return 0;
        }
        else{
            return op1 / op2;
        }

    }
}
