package Circulo;

import java.util.Scanner;

public class CirculoDatos {

    public static enum Atributo{
        RADIO
    }
    public double radio, area, perimetro;

 
    public double Circulo() {

        Scanner teclado = new Scanner(System.in);
        int lista = 0;

        int j = 0;
        System.out.println("Ingrese la cantidad de radios que desea mostrar: ");
        int array[] = new int[lista];
        lista = teclado.nextInt();
        for (int i = 1; i < lista; i++) {
            radio = Math.random() * 10 + 0.01;
            System.out.println("El radio del circulo: " + radio);
            area = Math.PI * Math.pow(radio, 2);;
            System.out.println("La area del circulo: " + area);
            perimetro = 2 * Math.PI * radio;
            System.out.println("El perimetro del circulo: " + perimetro);
            System.out.println("");

        }
        return 0;

    }

}
