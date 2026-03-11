package simulacro;

import java.util.Arrays;

public class AlumnoPrimero extends Alumno {

    private String[] modulos;

    private int curso;

    public AlumnoPrimero(String nombre, String apellido, String instituto, String ciclo) {
        super(nombre, apellido, instituto, ciclo);
        curso = 1;
        modulos = new String[0];
    }

    public void addModulo(String modulo) {
        String [] arrayAux= Arrays.copyOf(getModulos(), getModulos().length+1);
        
        arrayAux[arrayAux.length-1]= modulo;
        modulos=arrayAux;
        System.out.println("El modulo " + modulo + " ha sido agregado.");
    }

    public void mostrarModulos() {
        System.out.println("Modulos matriculados del alumno de 1ºDAW " + getNombre() + " " + getApellido() + ": " + Arrays.toString(getModulos()) + ".");
    }

    public void superarModulo(String modulo) {
        String[] arrayAux = new String[0];
        if (getModulos()[buscar(modulo)] == modulo) {
            for (int i = 0; i < arrayAux.length; i++) {
                if (!modulo.equals(modulos[i])) {
                    arrayAux[i] = getModulos()[i];
                }
            }
        }
        modulos = arrayAux;

        if (getModulos().length == 0) {
            System.out.println("El alumno ha superado todos los modulos.");
        } else {
            System.out.println("El alumno ha superado el modulo " + modulo + ". Al alumno le faltarian los siguientes modulos");
            System.out.println(Arrays.toString(getModulos()));
        }
    }

    int buscar(String modulo) {
        int indice = -1;
        for (int i = 0; i < getModulos().length && indice == -1; i++) {
            if (getModulos()[i].equals(modulo)) {
                indice = i;
                break;
            }
        }
        if (indice == -1) {
            System.out.println("No estas matriculado en el modulo " + modulo);
        }
        return indice;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * @return the modulos
     */
    public String[] getModulos() {
        return modulos;
    }

}
