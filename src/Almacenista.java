class Almacenista {
    private String nombre;
    private Almacen almacen;

    public Almacenista(String nombre, Almacen almacen) {
        this.nombre = nombre;
        this.almacen = almacen;
    }

    public void mostrarProductos() {
        System.out.println(almacen.mostrarAlmacen());
        System.out.println("Productos en el almacén gestionado por: " + nombre);
    }
}