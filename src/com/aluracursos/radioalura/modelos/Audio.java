public class Audio {
    private String titulo;
    private int duracion;
    private int totalReproducciones;
    private int cantidadMegusta;

    // getters and setters
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getTotalReproducciones() {
		return this.totalReproducciones;
	}

	public void setTotalReproducciones(int totalReproducciones) {
		this.totalReproducciones = totalReproducciones;
	}

	public int getCantidadMegusta() {
		return this.cantidadMegusta;
	}

	public void setCantidadMegusta(int cantidadMegusta) {
		this.cantidadMegusta = cantidadMegusta;
	}

    // Metodos

    public void meGusta(){
        this.cantidadMegusta++;
    }
    
    public void reproducciones(){
        this.totalReproducciones++;
    }

    public void mostraDatos(){
        System.out.println("Titulo del audio: "+ titulo);
        System.out.println("Duracion del audio: "+ getDuracion() +" min");
        System.out.println("Total de reproducciones: "+ getTotalReproducciones());
        System.out.println("Total de me gusta: " + cantidadMegusta);
    }
}
