public class Pato extends Animales {
    // Declaramos el metodo y en el parentesis ingresaremos todas las variables que vamos a usar
    public Pato(int id, String nombre, String habitat, String tipo, String movimiento, String ruido) {
        // El metodo "super" indica que vamos a llenar esos datos desde el metodo principal
        super(id, nombre, habitat, tipo, movimiento, ruido);
    }
}