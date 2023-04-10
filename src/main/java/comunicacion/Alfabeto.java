package comunicacion;

public class Alfabeto extends Pictograma{
    String[] letras;
    String interpretacion;

    //METODOS

    public int cantidadLetras(){
        return letras.length;
    }

    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    public String toString() {
		String union = String.join(", ", this.letras);
		return (union);
    }

    //SETERS AND GETERS
    public String[] getLetras() {
        return letras;
    }
    public void setLetras(String[] letras) {
        this.letras = letras;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    //CONSTRUCTOR
    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

}