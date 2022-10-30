/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Nomina {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese el salario del empleado: ");
        float salario = Float.parseFloat(dato.nextLine());
        System.out.print("Ingrese las horas extra trabajadas: ");
        int horas_extra = Integer.parseInt(dato.nextLine());
        float valor_horas_extra;

        float valor_hora_normal = salario / 240;
 
        if (horas_extra >= 0 && horas_extra <= 40) {
            valor_horas_extra = (float) (horas_extra * valor_hora_normal * 1.25);
            System.out.println("\t ============== Informe ====================");
            System.out.println("Salario Basico    : " + salario + "$");
            System.out.println("Valor Hora Normal : " + valor_hora_normal + "$");
            System.out.println("Horas extra       : " + horas_extra);
            System.out.println("Valor Hora Extra  : " + valor_horas_extra + "$");
            System.out.println("Salario total     : " + (salario + valor_horas_extra) + "$");
        }
        else if (horas_extra > 40) {
            valor_horas_extra = (float) ((horas_extra - 30) * valor_hora_normal * 2) + (float) (30 * valor_hora_normal * 1.5);
            System.out.println("\t ============== Informe ====================");
            System.out.println("Salario Basico    : " + salario + "$");
            System.out.println("Valor Hora Normal : " + valor_hora_normal + "$");
            System.out.println("Horas extra       : " + horas_extra);
            System.out.println("Valor Hora Extra  : " + valor_horas_extra + "$");
            System.out.println("Salario total     : " + (salario + valor_horas_extra) + "$");
        }else {
            System.out.println("Error. Las horas extra deben ser un numero positivo");
        }

    }

}
