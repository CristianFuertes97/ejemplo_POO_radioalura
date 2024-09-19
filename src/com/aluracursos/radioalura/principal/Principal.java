public class Principal {
    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        cancion.setTitulo("A donde vamos");
        cancion.setCantante("Morat");
        cancion.setDuracion(3);
        cancion.setGenero("Balada Pop");

        for (int i = 0; i < 100; i++) {
            cancion.meGusta();
        }
        // indica cantidad de reproducciones
        for (int i = 0; i < 5000; i++) {
            cancion.reproducciones();
        }
        cancion.mostraDatos();
        cancion.getClasificacion();

        System.out.println("-------------------------------");
        Podcast podcast = new Podcast();
        podcast.setTitulo("Seminario Fenix");
        podcast.setNumeroEpidosdios(13);
        podcast.setMinutosPorEpisodio(6);

        for (int i = 0; i < 1000; i++) {
            podcast.meGusta();
        }
        for (int i = 0; i < 160; i++) {
            podcast.reproducciones();
        }
        podcast.mostraDatos();
        podcast.getClasificacion();
    }
}
