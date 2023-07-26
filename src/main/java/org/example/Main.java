package org.example;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //**************EJERCICIO 1**************************
        /*
// **************Declarando variables**************

        Scanner teclado=new Scanner(System.in);
        String nombre;
        String apellido;
        String edad;
        Integer numeroUsosTarjeta;
        Double montoComprasAseo;
        Double montoComprasalimentos;
        Double montoOtrosProductos;

        Double puntaje;

        //******************Inicializando variables*******************

        System.out.print("Digite su nombre: ");
        nombre= teclado.nextLine();

        System.out.print("Digite su apellido: ");
        apellido= teclado.nextLine();

        System.out.print("Digite su edad: ");
        edad= teclado.nextLine();

        System.out.print("Digite el numero de usos de la tarjeta: ");
        numeroUsosTarjeta= teclado.nextInt();

        System.out.print("Digite el monto de compras de aseo: $");
        montoComprasAseo= teclado.nextDouble();

        System.out.print("Digite el monto de compras de alimentos: $");
        montoComprasalimentos= teclado.nextDouble();

        System.out.print("Digite el monto de compras de otros productos: $");
        montoOtrosProductos= teclado.nextDouble();

        //***************proceso************************

        Double totalMontos=montoComprasAseo+montoComprasalimentos+ montoOtrosProductos;
        System.out.print("El total de lo gastado es: $"+totalMontos);

        teclado.nextLine();
        System.out.print("Digite su puntaje: ");
        puntaje= teclado.nextDouble();



        if (puntaje >=90){
            Double auxilio=(totalMontos*0.25);
            System.out.print("su auxilio es de "+auxilio);
            Double valorNeto=totalMontos-(totalMontos*0.25);
            System.out.print("El total con auxilio es: "+valorNeto);
        } else if (puntaje >=80 && puntaje <=89) {
            Double auxilio=(totalMontos*0.20);
            System.out.print("su auxilio es de "+auxilio);
            Double valorNeto=totalMontos-(totalMontos*0.20);
            System.out.print("El total con auxilio es: "+valorNeto);

        }else if (puntaje >=70 && puntaje <=79) {
            Double auxilio=(totalMontos*0.15);
            System.out.print("su auxilio es de "+auxilio);
            Double valorNeto=totalMontos-(totalMontos*0.15);
            System.out.print("El total con auxilio es: "+valorNeto);
        }else if (puntaje >=60 && puntaje <=69) {
            Double auxilio=(totalMontos*0.10);
            System.out.print("su auxilio es de "+auxilio);
            Double valorNeto=totalMontos-(totalMontos*0.10);
            System.out.print("El total con auxilio es: "+valorNeto);
        }else if (puntaje <59){
            System.out.print("No aplica descuento");
        }

*/

        //********************EJERCICIO 2 **************************
        // DECLARANDO VARIABLES********************
        String nombreUsuario;
        String apellidoUsuario;
        String cedulaUsuario;
        String ciudad;
        Integer edadUsuario;
        Integer valorBoletas;
        Integer numeroBoletas;
        // INICIALIZANDO VARIABLES************

        Scanner teclado=new Scanner(System.in);

        valorBoletas=450000;

        System.out.print("Digite su nombre: ");
        nombreUsuario= teclado.nextLine();
        System.out.print("Digite su apellido: ");
        apellidoUsuario= teclado.nextLine();
        System.out.print("Digite su cedula: ");
        cedulaUsuario= teclado.nextLine();
        System.out.print("Digite su edad: ");
        edadUsuario= teclado.nextInt();
        teclado.nextLine();
        System.out.print("Digite su ciudad: ");
        ciudad= teclado.nextLine();
        System.out.print("Digite la cantidad de boletas  desea: ");
        numeroBoletas= teclado.nextInt();
        Integer totalValorBoleta=valorBoletas*numeroBoletas;

        if (edadUsuario >= 18 && numeroBoletas<=4 ){
            System.out.println("El valor de su compra es: "+totalValorBoleta);
            System.out.print("Puede ingresar");
        }else {
            System.out.print("No puede ingresar");
        }









    }
    }
