package org.jsfernandez.poointerfaces.imprenta;

import org.jsfernandez.poointerfaces.imprenta.modelo.*;
import static org.jsfernandez.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(new Persona("John", "mamon"),
                "Ingeniero", "Resumen laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador Fullstack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma" ),
                "Patrones de diseño: Elementos reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patron Simgleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe(new Persona("Martin", "Fowler"),
                new Persona("James", "Gosling"),
                "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
