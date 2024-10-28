public class Animales{
    //Declaramos los tributos que van a llevar los animales
    private int id;
    private String nombre;
    private String habitat;
    private String tipo;
    private String movimiento;
    private String ruido;

    //Declaramos que aqui se van a llenar las variables segun al animal
    public Animales(int id, String nombre, String habitat, String tipo, String movimiento, String ruido){
        this.id = id;
        this.nombre = nombre;
        this.habitat = habitat;
        this.tipo = tipo;
        this.movimiento = movimiento;
        this.ruido = ruido;

    }

    //Declaramos nuestro metodo que va a llenar todo para cada animal
    public String capturarAnimales(){
        return
                "id: "+id+
                        "\n Nombre: "+nombre+
                        "\n habitat: "+habitat+
                        "\n Tipo: "+tipo+
                        "\n Movimiento: "+movimiento+
                        "\n Ruido: "+ruido;

    }
}