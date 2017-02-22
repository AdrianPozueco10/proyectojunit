/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

import java.util.Scanner;

/**
 *
 * @author adrianpozuecozapico
 */
public class Salario {

    //pe precio hora extra
    float pe = 20;
    float salarioBase = 0.0f;
    float salarioNeto = 0.0f;
    

    float calculaSalarioBruto(String tipo, float ventasMes, float horasExtra) throws Excepcion {
        if (tipo.equals("empleado")) {
            salarioBase = 1000;

        } else if (tipo.equals("encargado")) {
            salarioBase = 1500;

        }
        if (ventasMes > 1500) {
            salarioBase += 200;
        } else if (ventasMes<1500) {
            salarioBase += 100;
        }
        else if(ventasMes<0 ){
        throw new Excepcion("Las ventas del mes son menores que 0");
        }
        if (horasExtra > 0) {
            salarioBase = salarioBase + (20 * horasExtra);
        }
            else if (horasExtra<0){
        throw new Excepcion("Las horas extra son menos que 0");        
                    }
        

        return salarioBase;

    }
    float calculaSalarioNeto( float salarioBruto) throws Excepcion{
        if (salarioBruto<1000) {
        salarioBruto=salarioBruto;
        }
        else if (salarioBruto>1000 && salarioBruto<=1500) {
        salarioBruto= (float) (salarioBruto-salarioBruto*0.16);
                }
        else if (salarioBruto>1500){
        salarioBruto=(float) (salarioBruto-salarioBruto*0.18);
                }
        else if (salarioBruto<0){
            throw new Excepcion("El salario es menor que 0");
        }
        return salarioBruto;
        }
        
    }



