package model;

/**
 *
 * @author Piaa FernanDaa
 */
public class Producto extends Object{
    private int id;
    private String nombre;
    private int precio;
    private int idTipo;

    public Producto(int id, String nombre, int precio, int idTipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.idTipo = idTipo;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    @Override
    public String toString() {
        return nombre + " {$"+precio+"}";
    }
    
}
