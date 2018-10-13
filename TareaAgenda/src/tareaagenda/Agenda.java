package tareaagenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Persona> Personas; // declarar una lista de personas

    public Agenda() {

        Personas = new ArrayList<>(); // constructor de lista de personas

    }

// metodo para agregar persona
    public void AgregarPersona(String nombre, String telefono) {

        Persona nuevo = new Persona(nombre, telefono); // inicializada la persona
        Personas.add(nuevo); // agrega a la lista de personas

    }

//metodo para mostrar las personas
    public void Mostrar() {

        for (int i = 0; i < Personas.size(); i++) {

            System.out.println(Personas.get(i).getNombre()); // el get es para acceder a la posicion y el segundo get es para imprimirlo en pantalla
            System.out.println(Personas.get(i).getTelefono());

        }
    }

    // metodo eliminar persona
    public void EliminarPersona(String nombre) {

        for (int i = 0; i < Personas.size(); i++) {

            if (nombre.equals(Personas.get(i).getNombre())) { // si el nombre en la posicion i de la lista es igual al nombre eliminar
                Personas.remove(i);

            } else {

                System.out.println("contacto no existe");
            }
        }
    }

    public void BuscarPersona(String nombre) {

        for (int i = 0; i < Personas.size(); i++) {

            if (nombre.equals(Personas.get(i).getNombre())) { // si el nombre en la posicion i de la lista es igual al nombre eliminar
                System.out.println("El contacto es " + Personas.get(i).getNombre());
            } else {

                System.out.println("contacto no existe");
            }
        }

    }

}
