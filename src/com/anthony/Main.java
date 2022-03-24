package com.anthony;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Modificadores de acceso en la herencia

Los miembros publicos y por defecto se heredan */

class Poligono {

    private int ancho;

    private int altura;

    public int getAncho() {
        return ancho;
    }

    public int getAltura() {
        return altura;
    }

    private void setAncho(int a) {
        this.ancho = a;
    }

    private void setAltura(int b) {
        this.altura = b;
    }

    public void set_atributos (int a, int b) {
        setAncho(a);
        setAltura(b);
    }
}

class Rectangulo extends Poligono {
    public int area() {
        return (getAncho() * getAltura());
    }
}

class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader (isr);

        Rectangulo recta;

        recta= new Rectangulo();

        System.out.print("Primer valor entero: ");

        int s1 = Integer.parseInt(br.readLine());

        System.out.print("Segundo valor entero: ");

        int s2 = Integer.parseInt(br.readLine());

        recta.set_atributos(s1,s2);

        System.out.print("AREA DEL RECTANGULO: " + recta.area() );

    }}

