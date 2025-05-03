package Controlador;

import Modelo.ConexionDatabase;
import Modelo.Estudiante;
import Vista.VistaEstudiante;

public class MVC {

    public static void main(String[] args) {

        ConexionDatabase.getConnection();

        //Inicializamos el modelo creando un nuevo modelo
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Guillermo");
        estudiante1.setEdad(19);

        //Inicializamos la vista
        VistaEstudiante vista = new VistaEstudiante();

        ControladorEstudiante controlador = new ControladorEstudiante(estudiante1, vista);

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Adrian");
        estudiante2.setEdad(23);
        controlador.crearEstudiante(estudiante2);

        controlador.actualizarVista();

    }

}