import java.util.Date;
import java.time.LocalDate;

/** clase Principal **/

public class Principal
{
    public static void main(String[] args)
    {
        Date d = new Date();
        System.out.printf("Fecha del sistema: %td/%tm/%tY %n",d,d,d);

        LocalDate fechaNacimientoAlejandra = LocalDate.of(2004, 8, 9);
        Estudiante Alejandra = new Estudiante("Alejandra", fechaNacimientoAlejandra);
        Alejandra.setNotaMateria1(4.5);
        Alejandra.setNotaMateria2(5.0);
        Alejandra.setNotaMateria3(3.2);

        System.out.println("Nombre de la/el estudiante: "+ Alejandra.getNombre());
        System.out.println("Fecha de nacimiento: "+ Alejandra.getFechaNacimiento());
        System.out.println("Nota 1: "+ Alejandra.getNotaMateria1());
        System.out.println("Nota 2: "+ Alejandra.getNotaMateria2());
        System.out.println("Nota 3: "+ Alejandra.getNotaMateria3());
        System.out.println("Promedio: "+ Alejandra.getPromedio());
        System.out.println("El/la estudiante tiene " + Alejandra.getEdad() + " años.");

        System.out.println();
        LocalDate fechaNacimientoKarolina = LocalDate.of(2006, 3, 11);
        Estudiante Karolina = new Estudiante("Karolina", fechaNacimientoKarolina);
        Karolina.setNotaMateria1(3.0);
        Karolina.setNotaMateria2(5.0);
        Karolina.setNotaMateria3(4.5);

        System.out.println("Nombre de la/el estudiante: "+ Karolina.getNombre());
        System.out.println("Fecha de nacimiento: "+ Karolina.getFechaNacimiento());
        System.out.println("Nota 1: "+ Karolina.getNotaMateria1());
        System.out.println("Nota 2: "+ Karolina.getNotaMateria2());
        System.out.println("Nota 3: "+ Karolina.getNotaMateria3());
        System.out.println("Promedio: "+ Karolina.getPromedio());
        System.out.println("El/la estudiante tiene " + Karolina.getEdad() + " años.");

        System.out.println();
        LocalDate fechaNacimientoJordy = LocalDate.of(1997, 11, 6);
        Estudiante Jordy = new Estudiante("Jordy", fechaNacimientoJordy);
        Jordy.setNotaMateria1(3.5);
        Jordy.setNotaMateria2(3.0);
        Jordy.setNotaMateria3(2.5);

        System.out.println("Nombre de la/el estudiante: "+ Jordy.getNombre());
        System.out.println("Fecha de nacimiento: "+ Jordy.getFechaNacimiento());
        System.out.println("Nota 1: "+ Jordy.getNotaMateria1());
        System.out.println("Nota 2: "+ Jordy.getNotaMateria2());
        System.out.println("Nota 3: "+ Jordy.getNotaMateria3());
        System.out.println("Promedio: "+ Jordy.getPromedio());
        System.out.println("El/la estudiante tiene " + Jordy.getEdad() + " años.");

        System.out.println();
        LocalDate fechaNacimientoSofia = LocalDate.of(2006, 2, 17);
        Estudiante Sofia = new Estudiante("Sofia", fechaNacimientoSofia);
        Sofia.setNotaMateria1(3.0);
        Sofia.setNotaMateria2(5.0);
        Sofia.setNotaMateria3(4.5);

        System.out.println("Nombre de la/el estudiante: "+ Sofia.getNombre());
        System.out.println("Fecha de nacimiento: "+ Sofia.getFechaNacimiento());
        System.out.println("Nota 1: "+ Sofia.getNotaMateria1());
        System.out.println("Nota 2: "+ Sofia.getNotaMateria2());
        System.out.println("Nota 3: "+ Sofia.getNotaMateria3());
        System.out.println("Promedio: "+ Sofia.getPromedio());
        System.out.println("El/la estudiante tiene " + Sofia.getEdad() + " años.");

        System.out.println();
        LocalDate fechaNacimientoJose = LocalDate.of(2004, 4, 6);
        Estudiante Jose = new Estudiante("Jose", fechaNacimientoJose);
        Jose.setNotaMateria1(3.9);
        Jose.setNotaMateria2(4.8);
        Jose.setNotaMateria3(4.2);

        System.out.println("Nombre de la/el estudiante: "+ Jose.getNombre());
        System.out.println("Fecha de nacimiento: "+ Jose.getFechaNacimiento());
        System.out.println("Nota 1: "+ Jose.getNotaMateria1());
        System.out.println("Nota 2: "+ Jose.getNotaMateria2());
        System.out.println("Nota 3: "+ Jose.getNotaMateria3());
        System.out.println("Promedio: "+ Jose.getPromedio());
        System.out.println("El/la estudiante tiene " + Jose.getEdad() + " años.");
    }
}
