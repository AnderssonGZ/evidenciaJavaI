package trabajos;

public class Trabajo2 {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("chevrolet","tracker","12345","blanco",5,"SOS847","colombia");

        System.out.println("Marca: "+vehiculo.getMarca());
        System.out.println("Modelo: "+vehiculo.getModelo());
        System.out.println("ID: "+vehiculo.getId());
        System.out.println("Color: "+vehiculo.getColor());
        System.out.println("Cantidad de pasajeros: "+vehiculo.getCantidadPasajeros());
        System.out.println("Matricula: "+vehiculo.getMatricula());
        System.out.println("Pais: "+vehiculo.getPais());
    }
}
