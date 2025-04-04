package Extra1_EMC;
import java.util.*;
public class Extra1 {

public static void main(String[] args) {
Scanner Datos = new Scanner(System.in); //Scanner
ArrayList<ClaseProducto> Productos = new ArrayList<ClaseProducto>(); //ArrayList del objeto producto
boolean activo = true;
int PrecioTotal = 0;
while (activo) {
int Tecla = Menu(Datos); //Metodo para poner una tecla
switch (Tecla) {
case 1: //Crea el objeto y lo añade a la lista
ClaseProducto crearproducto = GenerarProducto(Datos);
Productos.add(crearproducto);
break;
case 2:
System.out.println("TICKET DE LA COMPRA");
for (ClaseProducto recorrido : Productos) {
PrecioTotal += recorrido.getPrecio();
System.out.println(recorrido.getNombre()+"|"+recorrido.getPrecio());
}
System.out.println("-------------------");
System.out.println("El precio es " + PrecioTotal + "€");
System.out.println("-------------------");
break;
case 3:
System.out.println("De acuerdo, no se preocupe.");
activo = false;
break;
default:
System.out.println("Error, no se ha seleccionado una opción");
}
}

}

public static int Menu(Scanner Datos) {
System.out.println("Bienvenido a mi tienda\n¿Que va a querer?");
System.out.println("1-'Quiero comprar este producto'");
System.out.println("2-'Queria pasar mis productos por caja'");
System.out.println("3-'Solo pasaba a ver productos y ya'");

int tecla = Datos.nextInt();
return tecla;
}

public static ClaseProducto GenerarProducto(Scanner Datos) {
Random R = new Random();
System.out.println("Inserta el producto que quiera comprar");
String NombreProducto = Datos.nextLine();
Datos.nextLine();
int Precio = R.nextInt(100) + 1; // Generar precios aleatorios
ClaseProducto productonuevo = new ClaseProducto(NombreProducto, Precio);
return productonuevo;
}
}