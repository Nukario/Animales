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

    //Declaramos los metodos "GET" que van a llenar las variables con datos que ingresemos
    public int getId(){return id;}
    public String getNombre(){return nombre;}
    public String getHabitat(){return habitat;}
    public String getTipo(){return tipo;}
    public String getMovimiento(){return movimiento;}
    public String getRuido(){return ruido;}

    /*Declaramos los metodos "SET" para que se guarden en las variables con los datos que recuperamos y
    ponemos una condicional para asegurarnos que no esten vacios ninguno de los campos a llenar */
    public boolean setId(int id){
        if(id >0){
            this.id = id;
            return true;
        }else return false;
    }
    public boolean setNombre(String nombre){
        if(nombre != null){
            this.nombre = nombre;
            return true;
        }else return false;
    }
    public boolean setHabitat(String habitat){
        if(habitat != null){
            this.habitat = habitat;
            return true;
        }else return false;
    }
    public boolean setTipo(String tipo){
        if(tipo != null){
            this.tipo = tipo;
            return true;
        }else return false;
    }
    public boolean setMovimiento(String movimiento){
        if(movimiento != null){
            this.movimiento = movimiento;
            return true;
        } else return false;
    }
    public boolean setRuido(String ruido){
        if(ruido != null){
            this.ruido = ruido;
            return true;
        }else return false;
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