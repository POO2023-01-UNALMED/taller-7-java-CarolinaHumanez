package comunicacion;

public class Fabula extends Escrito{
    String ensenanza;
    String interpretacion;

    //METODOS
    public int palabrasTotales(int palabrasPagina){
        int ini=(this.getPaginas()*palabrasPagina);
        int resultado=(ini*1);
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
                            this.getEnsenanza()
                            );
        return retorno;
        
    }

    //CONSTRUCTOR
    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    //GETTERS AND SETTERS
    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    
}
