/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    private double promedioMatriculas;
    private ArrayList<Estudiante> lista;

    public ReporteEstudiante(String codigo) {
        super(codigo);
    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public void establecerPromedioMatriculas(double pM) {
        promedioMatriculas = pM;
        for (int i = 0; i < lista.size(); i++) {

            promedioMatriculas = promedioMatriculas + lista.get(i).getMatricula();

        }
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public void establecerLista(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {

        String cadena;

        cadena = String.format("Reporte Estudiante\n");

        for (int i = 0; i < lista.size(); i++) {

            cadena = String.format("%s\n"
                    + "%s\n"
                    + "Codigo: %s\n"
                    + "Promedio Matriculas: %.2f\n",
                    cadena, lista.get(i),
                    obtenerCodigo(),
                    obtenerPromedioMatriculas());

        }

        return cadena;
    }

}
