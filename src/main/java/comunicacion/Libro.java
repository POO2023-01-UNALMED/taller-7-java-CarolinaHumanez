package comunicacion;

import javax.print.DocFlavor.STRING;

public class Libro extends Escrito{
    String co_autor;
    String editorial;
    String edicion;
    String interpretacion;

    //Metodos "Abstractos"
    public int palabrasTotales(int palabrasPagina){
        return 5;
    }

    public String interpretacion (){
        return "prueba";
    }
	
	public String toString(){
        return "prueba";
    }
	

    //CONSTRUCTOR
    public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial,
            String edicion, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    //GETTERS AND SETTERS
    public String getCo_autor() {
        return co_autor;
    }

    public void setCo_autor(String co_autor) {
        this.co_autor = co_autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }


    

    
    
}
