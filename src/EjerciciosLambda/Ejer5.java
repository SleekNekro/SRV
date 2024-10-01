package EjerciciosLambda;


import java.util.List;

record Producto(String nombre, int precio) {}

interface Accion{
    void hacerAccion(Producto producto);
}
interface Filtro2{
    boolean pasaElFiltro(Producto p);
}

class Almacen {
    void paraCadaProducto(Accion accion, Filtro2 filtro2){
        for (Producto p: productos){
            if (filtro2.pasaElFiltro(p)) {
                accion.hacerAccion(p);
            }
        }
    }

    List<Producto> productos;

    Almacen(List<Producto> productos) { this.productos = productos; }
}


public class Ejer5 {
    public static void main(String[] args) {

        Almacen almacen = new Almacen(List.of(new Producto("lapiz", 5), new Producto("boli", 6), new Producto("libro", 10)));

    }
}