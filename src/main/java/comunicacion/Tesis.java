package comunicacion;

public class Tesis extends Escrito {
    String idea;
    String[] argumentos;
    String conclusion;
    String referencias;
    String interpretacion;

    //METODOS

    public int palabrasTotales(int palabrasPagina){
        int ini=(this.getPaginas()*palabrasPagina);
        int resultado=(ini*5);
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
                            this.getIdea()+"\n"+
                            this.getArgumentos().length+"\n"+
                            this.getConclusion()+"\n"+
                            this.getReferencias()
                            );
        return retorno;
        
    }

    //CONSTRUCTOR
    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos,
            String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    //GETERS AND SETTERS
    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    
    
}
