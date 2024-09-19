public class Podcast extends Audio implements Clasificacion {
    private int numeroEpidosdios;
    private int minutosPorEpisodio;

    // getters and setters
    public int getNumeroEpidosdios() {
        return this.numeroEpidosdios;
    }

    public void setNumeroEpidosdios(int numeroEpidosdios) {
        this.numeroEpidosdios = numeroEpidosdios;
    }

    public int getMinutosPorEpisodio() {
        return this.minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracion(){
        return this.minutosPorEpisodio * this.numeroEpidosdios;
    }

    @Override
    public void getClasificacion() {
        if (getCantidadMegusta() > 200){
            System.out.println("El podcast esta en la lista de favoritos");
        }else{
            System.out.println("Este podcast no te gusta mucho");
        }
    }
}
