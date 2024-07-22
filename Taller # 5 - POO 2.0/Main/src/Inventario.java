package Main.src;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;//Aca se almacenaran los productos

    public Inventario() {
        this.productos = new ArrayList<>(); // se inicia la lsita de productos (constructor)
    }

    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }
    public void listarProductos() {
        for (Producto producto : productos) {
        }
    }
    public void borrarProducto(int id) {
        productos.removeIf(producto -> producto.getId() == id); //Esto elimina un producto seleccionado por ID
    }

    public Producto buscarPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public ArrayList<Producto> buscarPorCategoria(String categoria) {   // buscar productos por categotias
        ArrayList<Producto> resultados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto instanceof ProductoEspecifico) {
                ProductoEspecifico productoEspecifico = (ProductoEspecifico) producto;
                if (productoEspecifico.getCategoria().equalsIgnoreCase(categoria)) {
                    resultados.add(productoEspecifico);
                }
            }
        }
        return resultados;
    }
}

