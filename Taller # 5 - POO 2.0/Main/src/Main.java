package Main.src;
// Ejercicio 1: Sistema de Control de Inventarios
public class Main {
   public static void main(String[] args) {




            Inventario inventario = new Inventario();

            Producto producto1 = new Producto(1, "Balon Basket", 178000);
            ProductoEspecifico producto2 = new ProductoEspecifico(2, "Zapatilla Nike Basket", 646000, "Deportes", "Nike");

            inventario.añadirProducto(producto1);
            inventario.añadirProducto(producto2);

            inventario.listarProductos();

            System.out.println("Buscar por nombre 'Balon futbol': " + inventario.buscarPorNombre("Balon Basket"));

            System.out.println("Buscar por categoría 'Deportes': " + inventario.buscarPorCategoria("Deportes"));


    }
}
