package comunicacion;

public class Periodico extends Escrito{
    String fecha;
    String primicia;
    String interpretacion;

    //METODOS
    public int palabrasTotales(int palabrasPagina){
        int ini=(this.getPaginas()*palabrasPagina);
        int resultado=(ini*10);
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
                            this.getFecha()+"\n"+
                            this.getPrimicia()
                            );
        return retorno;
        
    }

    //Constructor
    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,
            String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    //GETTERS AND SETTERS
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    

    
}
