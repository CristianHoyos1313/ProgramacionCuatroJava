package tareaagenda;

/**
 *
 * @author Cristian Hoyos
 */
public class TareaAgenda {

    public static void main(String[] args) {
        // TODO code application logic 

        Agenda agenda = new Agenda(); // instanciando agenda

        //llamados de los metodos y indesaccion de datos
        agenda.AgregarPersona("Cristian", "3215907238");
        agenda.AgregarPersona("juan", "3641090");
        agenda.Mostrar();
        agenda.EliminarPersona("cristian");
        agenda.Mostrar();
        // agenda.EliminarPersona("1004699559");
    }

}
