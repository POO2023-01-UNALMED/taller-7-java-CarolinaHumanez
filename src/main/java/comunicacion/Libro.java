package comunicacion;

public class Libro extends Escrito{
    String co_autor;
    String editorial;
    String edicion;
    String interpretacion;

    //METODOS
    public int palabrasTotales(int palabrasPagina){
        int ini=(this.getPaginas()*palabrasPagina);
        int resultado=(ini*2);
        return resultado;
    }

    public String interpretacion (){
        return this.interpretacion;
    }
	
	public String toString(){
        String retorno = (this.getOrigen()+"\n"+
                            this.getTitulo()+"\n"+
                            this.getAutor()+"\n"+
                            this.getPaginas()+"\n"+
                            this.getCo_autor()+"\n"+
                            this.getEditorial()+"\n"+
                            this.getEdicion()
                            );
        return retorno;
        
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
