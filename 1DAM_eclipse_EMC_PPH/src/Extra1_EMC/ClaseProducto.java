package Extra1_EMC;

public class ClaseProducto {

private String nombre;
private int precio;

public ClaseProducto(String nombre, int precio) {
this.nombre = nombre;
this.precio = precio;
}

public String getNombre() {
return nombre;
}

public int getPrecio() {
return precio;
}
}