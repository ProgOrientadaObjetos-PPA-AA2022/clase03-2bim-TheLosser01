/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    private double promedioEdades;
    private ArrayList<Policia> lista;

    public ReportePolicia(String codigo) {
        super(codigo);
    }

    public double getPromedioEdades() {
        return promedioEdades;
    }

    public void setPromedioEdades(double promedioEdades) {
        for (int i = 0; i < lista.size(); i++) {

            promedioEdades = promedioEdades + lista.get(i).getEdad();

        }

    }

    public ArrayList<Policia> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Policia> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {

        String cadena;

        cadena = String.format("Reporte Policia\n");

        for (int i = 0; i < lista.size(); i++) {

            cadena = String.format("%s\n"
                    + "%s\n"
                    + "Codigo: %s\n"
                    + "Promedio Docente: %.2f\n",
                    cadena, lista.get(i),
                    obtenerCodigo(),
                    getPromedioEdades());

        }

        return cadena;
    }

}
