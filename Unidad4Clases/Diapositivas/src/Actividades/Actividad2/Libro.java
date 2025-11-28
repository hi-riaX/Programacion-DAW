package Actividades.Actividad2;

public class Libro {
    // Atributos
    private String isbn;
    private String titulo;
    private String autor;
    private int anyo;
    private double precio;
    private Editorial editorial;

    // Constructores
    public Libro(){
    }
    public Libro(String titulo, String autor, String isbn, double precio, int anyo) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.anyo = anyo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public int getAnyo() {
        return anyo;
    }
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setEditorial(Editorial ed) {
        this.editorial = new Editorial();
        editorial.setAnyo(ed.getAnyo());
        editorial.setNombre( ed.getNombre());
        editorial.setCodigo(ed.getCodigo());
    }
    
}
