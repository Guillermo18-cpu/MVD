
package mvc;

import Controlador.ControladorEstudiante;
import Modelo.Estudiante;
import Vista.VistaEstudiante;


public class MVC {


    public static void main(String[] args) {
        
        //Inicializamos el modelo creando un nuevo modelo
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Guillermo");
        estudiante1.setEdad(19);
        
        
        //Inicializamos la vista
        VistaEstudiante vista = new VistaEstudiante();
        
        ControladorEstudiante controlador = new ControladorEstudiante(estudiante1, vista);
        controlador.actualizarVista();
        
    }
    
}
