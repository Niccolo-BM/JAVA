package Main.src;

public class ProductoEspecifico extends Producto {
    private String categoria;
    private String marca;

    public ProductoEspecifico(int id, String nombre, double precio, String categoria, String marca) {
        super(id, nombre, precio);
        this.categoria = categoria;
        this.marca = marca;
    }

    public String getCategoria() {
        return this.categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "ProductoEspecifico{" + "id: " + getId() + ", nombre: " + getNombre() + ", precio: $" + getPrecio()
                + ", categoria: " + categoria + ", marca: " + marca + '}';
    }
}

