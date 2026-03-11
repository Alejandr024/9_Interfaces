/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro;

/**
 *
 * @author Alejandro <alej3839@gmail.com>
 */
public class Tutor implements FCT{

    private String nombre;
    private String apellido;
    private String instituto;
    private String ciclo;
    private AlumnoSegundo[] alumno;
    private String modulo;
    private double distancia;
    private String[] empresas;

    public Tutor(String nombre, String apellido, String instituto, String ciclo, AlumnoSegundo[] alumno, String modulo, double distancia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.instituto = instituto;
        this.ciclo = ciclo;
        this.alumno = alumno;
        this.modulo = modulo;
        this.distancia = distancia;
        this.empresas= new String[0];
    }
    
    
    
    
    @Override
    public void asignarEmpresa(AlumnoSegundo alumno, String empresa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String obtenerEmpresa(AlumnoSegundo alumno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setInstituto(String instituto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getDistanciaCentro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setDistanciaCentro(double distancia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}//end class