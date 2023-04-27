package org.example.ejemplo2;

public class DriverVehiculo {
    public Motocicleta() {
    }

    public Motocicleta(int centimetrosCubicos, String marca) {
        this.centimetrosCubicos = centimetrosCubicos;
        Marca = marca;
    }

    public int getCentimetrosCubicos() {
        return centimetrosCubicos;
    }

    public void setCentimetrosCubicos(int centimetrosCubicos) {
        this.centimetrosCubicos = centimetrosCubicos;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "centimetrosCubicos=" + centimetrosCubicos +
                ", Marca='" + Marca + '\'' +
                '}';
    }

    public void hacerCaballito(){
        System.out.println("Haciendo caballito para romperme un hueso");
    }


    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta marca "+ this.Marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando...");
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando con la motocicleta de "+ this.centimetrosCubicos +  "CC");

    }

    @Override
    public void frenar() {
        System.out.println("Frenando...");
    }
}
public class Main {
    public static void main(String[] args) {
        Camion camion =new Camion("Diesel", 3);
        System.out.println(camion);

        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());
        System.out.println("-------motocicleta------");
        Motocicleta moto = new Motocicleta(150,"Yamaha");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        moto.apagar();

    }
}
