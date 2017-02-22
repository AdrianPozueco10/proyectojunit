/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

/**
 *
 * @author adrianpozuecozapico
 */
public class Main {
    public static void main(String[] args) throws Excepcion {
        Salario sueldo=new Salario();
        float salarioBruto = sueldo.calculaSalarioBruto("empleado", 1200, 7);
        Salario sueldoneto=new Salario();
        float salarioNeto = sueldo.calculaSalarioNeto(salarioBruto);
        System.out.println("Salario Bruto= "+salarioBruto);
        System.out.println("Salario Neto= "+salarioNeto);
    }
}
