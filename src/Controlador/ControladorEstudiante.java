package Controlador;

import Modelo.Estudiante;
import Vista.VistaEstudiante;

public class ControladorEstudiante {

    private Estudiante modelo;
    private VistaEstudiante vista;

    public void setNombre(String nombre) {
        modelo.setNombre(nombre);
    }

    public String getNombre() {
        return modelo.getNombre();
    }

    public void setEdad(int edad) {
        modelo.setEdad(edad);
    }

    public int getEdad() {
        return modelo.getEdad();
    }

    public void actualizarVista() {

    }
}