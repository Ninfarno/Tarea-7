public class Cliente {

    private String nombre;
    private String imms;


    public Cliente(String nombre, String imms) {
        this.nombre = nombre;
        this.imms = imms;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImms() {
        return imms;
    }

    public void setImms(String imms) {
        this.imms = imms;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre +
                "| Imms: " + imms;
    }
}
