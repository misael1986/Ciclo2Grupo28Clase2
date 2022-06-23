/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.unal.ciclo2grupo28clase2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase2 {

    public static void main(String[] args) {
        float e = 2.7182818284f;
        float gamma = 0.577215664901f;
        double phi = 1.61803398874989;
        float a = +1.0f;
        float X = -1.0f;
        float coordenada_1 = -2.5f;
        double const_Boltzmann = 1.3806488E-23;
        float Luz = 2.998e+8f;
        double Avogadro = +6.02214129e+23;
        float G = 6.67384e-11f;
        double Plank = 6.62606896E-34;

        boolean b = true;
        boolean bool = false;
        boolean flag = true;
        boolean bln = false;
        boolean isPrime = false;
        boolean isEven = true;
        boolean False = true;
        boolean True = False;

        char c = ' ';//NULO en Characters
        char new_line = '\n';
        char tab = '\t';
        char letra = 'a';
        char caracter = 'A';
        char value = 700;//Casteo
        char nine = '9';
        char htab = 9;
        char cero = '0';
        char at = '@';
        System.out.println("70 en char es=" + value);

        boolean isElder;
        System.out.println("Digite su edad:");//Mostrar en pantalla
        Scanner leerTeclado = new Scanner(System.in);//Leer desde teclado
        int edad = leerTeclado.nextInt();//Objeto que lea y cargue Enteros

        if (edad < 18) {
            isElder = false;
        } else {
            isElder = true;
        }

        System.out.println("Es usted mayor de edad? " + isElder);

// instanciadelobjetoScanner
        Scanner sc = new Scanner(System.in);
// leerdatosdetipobyte
        byte bi = Byte.parseByte(sc.nextLine());
// leerdatosdetiposhort
        short so = Short.parseShort(sc.nextLine());
// leerdatosdetipoint
        int in = Integer.parseInt(sc.nextLine());
        // leerdatosdetipolong
        long lo = Long.parseLong(sc.nextLine());
// leerdatosdetipofloat
        float flo = Float.parseFloat(sc.nextLine());
// leerdatosdetipodouble
        double d = Double.parseDouble(sc.nextLine());
// leerdatosdetipoboolean
        boolean boo = Boolean.parseBoolean(sc.nextLine());
// leerdatosdetipochar
        char cha = sc.nextLine().charAt(0);
    }
}
