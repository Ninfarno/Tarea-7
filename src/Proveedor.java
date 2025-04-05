class Proveedor {
    private String nombre;
    private String codigo;
    private String direccion;

    public Proveedor(String nombre, String codigo, String direccion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Proveedor: " + nombre + " | Codigo: " + codigo + "| Direccion: " + direccion;
    }
}