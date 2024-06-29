package trabajos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String id;
    private String color;
    private int cantidadPasajeros;
    private String matricula;
    private String pais;

    public Vehiculo(String marca, String modelo, String id, String color, int cantidadPasajeros, String matricula, String pais) {
        this.marca = marca;
        this.modelo = modelo;
        this.id = id;
        this.color = color;
        this.cantidadPasajeros = cantidadPasajeros;
        this.matricula = matricula;
        this.pais = pais;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
