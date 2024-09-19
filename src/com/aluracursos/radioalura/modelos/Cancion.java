public class Cancion extends Audio implements Clasificacion {
    private String cantante;
    private String genero;

// getter and setters

    public String getCantante() {
        return this.cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void getClasificacion() {
       if (getTotalReproducciones() > 300){
        System.out.println("Esta cancion es de tus favoritas");
       }else{
        System.out.println("Esta cancion no te gusta mucho");
       }
    }
}
