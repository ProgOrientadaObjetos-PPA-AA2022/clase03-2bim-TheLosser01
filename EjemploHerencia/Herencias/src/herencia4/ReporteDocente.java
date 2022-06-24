/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;
    
    public ReporteDocente(String codigo) {
        super(codigo);
    }

    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }

    public void establecerPromedioSueldos(double pS) {
        promedioSueldos = pS;
        for (int i = 0; i < lista.size() ; i++) {
            
            promedioSueldos = promedioSueldos + lista.get(i).getSueldo();
            
        }

    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    public void establecerLista(ArrayList<Docente> lis) {
        lista = lis;
    }
    
    @Override
    public String toString() {
        
        String cadena;
        
        cadena = String.format("Reporte Docente\n");
        
        for (int i = 0; i < lista.size() ; i++) {
            
            cadena = String.format("%s\n"
                    + "%s\n"
                    + "Codigo: %s\n"
                    + "Promedio Docente: %.2f\n", 
                    cadena, lista.get(i), 
                    obtenerCodigo(), 
                    obtenerPromedioSueldos());
            
        }
        
        return cadena;
    }

    
}
