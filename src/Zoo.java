// Declaramos el import del scanner, una utileria que nos permitira capturar lo que escribamos
import java.util.Scanner;
// Declaramos la clase principal
public class Zoo {
    // Declaramos el metodo principal que va a ejecutar todo el programa
    public static void main(String[] args) {
        // Declaramos el scanner con el nombre de sc y la funcion de system.in para que capture datos
        Scanner sc = new Scanner(System.in);
        //declaramos la funcion opc (opcion) para el ciclo del menu
        int opc;
        /* Declaramos un nuevo objeto "Willy" que va a usar la clase delfin como base como un nuevo objeto
         y despues procedemos a llenar los datos que llevara, lo gris solo es referencia, solo se ponen
         los datos en el orden que necesitamos, por ejemplo asi (1,"Willy","Mar - Oceano","cetaceos","Silvido")
         yo le agregue el enter para que fuera mas facil distinguirlos y el intellij agrego las letras grises para que
         sea mas claro
        */
        Delfin Willy=new Delfin(
                1,
                " Willy ",
                " Mar - Ocean ",
                " Cetáceos ",
                " Nadar ",
                " Silvido ");
        Perro Kripto =new Perro(
                2,
                " Kripto ",
                " Tierra - Ciudad ",
                " Canino ",
                " Correr en 4 patas ",
                " Ladrido ");
        Pato Scrooge =new Pato(
                3,
                " Scrooge ",
                " Lago - Tierra ",
                " Ave ",
                " Nadar ",
                " Graznar ");
        //Creamos el ciclo que nos dara un menu los \n sirven como un "enter" para dar espacio
        do{
            System.out.println("ingrese que animal quiere ver \n 1- Delfin \n 2- Perro \n 3- Pato \n 4- Salir");
            //Declaramos que opc va a recibir sus datos de "sc.nextInt();
            opc = sc.nextInt();
            //Creamos una condicional "if" para cada posible opcion del menu
        if(opc==1){
            //Declaramos que va a imprimir el nombre del nuevo objeto "Willy" y que va a llenar el metodo "capturarAnimales" llenando todo automaticamente
            System.out.println(Willy.capturarAnimales());
        }else if(opc==2){
            System.out.println(Kripto.capturarAnimales());
        }else if(opc==3){
            System.out.println(Scrooge.capturarAnimales());
        }//Declaramos la opcion para cerrar el ciclo manualmente
        else if(opc==4){
            System.out.println("finalizando programa");
        }
        }//Declaramos que el ciclo se va a seguir ejecutando hasta que ingresemos la opcion igual o diferente a 4
        while(opc!=4);

    }
}
