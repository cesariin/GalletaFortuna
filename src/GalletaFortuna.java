import java.util.Random;

public class GalletaFortuna {
    private String[] mensajes;

    public GalletaFortuna() {
        mensajes = new String[]{
                "La motivación es la clave del éxito.",
                "Sé perseverante en la búsqueda de tus sueños.",
                "No tengas miedo de los cambios.",
                "Aprovecha al máximo las oportunidades.",
                "El futuro es lo que tú quieras hacer de él.",
                "Nunca dejes de aprender.",
                "La constancia es la clave del triunfo.",
                "Encuentra la creatividad en todo lo que hagas.",
                "No dudes en compartir tus sueños con otros.",
                "Sigue tu intuición y confía en ti mismo."
        };
    }

    public String obtenerMensajeAleatorio() {
        Random rand = new Random();
        int indice = rand.nextInt(mensajes.length);
        return mensajes[indice];
    }

    public static void main(String[] args) {
        GalletaFortuna galleta = new GalletaFortuna();
        String mensaje = galleta.obtenerMensajeAleatorio();
        System.out.println("Tu mensaje de la fortuna es: " + mensaje);
    }
}