class Almacen {
    private Producto[] productos;
    private int cantidadProductos;

    public Almacen(int capacidad) {
        this.productos = new Producto[capacidad];
        this.cantidadProductos = 0;
    }

    public void agregarProducto(Producto producto) {
        if (cantidadProductos < productos.length) {
            productos[cantidadProductos++] = producto;
        } else {
            System.out.println("Almacen lleno, no se pueden agregar más productos.");
        }
    }

    public String mostrarAlmacen() {
        StringBuilder sb = new StringBuilder("Almacen:\n");

        for (int i = 0; i < cantidadProductos; i++) {
            sb.append(productos[i].toString()).append("\n");
        }
        return sb.toString();
    }
}