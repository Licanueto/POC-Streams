import java.util.*;
import java.util.stream.*;
import java.util.ArrayList.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<Persona>();

        personas = Arrays.asList(
                    new Persona("Alberto",14,46049284),
                    new Persona("Juan",19,42948294),
                    new Persona("Pepe",30,34233324),
                    new Persona("Carlos",54,16395049));

        // Todos los cargados
        System.out.println(String.format("Todos: %s",personas.stream()
                                                             .collect(Collectors.toList())));

        // Mayores
        System.out.println(String.format("Mayores a 21: %s",personas.stream()
                                                                    .filter(persona->persona.getEdad()>21)
                                                                    .collect(Collectors.toList())));

        //Menores
        System.out.println(String.format("Menores a 18: %s",personas.stream()
                                                                    .filter(persona->persona.getEdad()<18)
                                                                    .collect(Collectors.toList())));
        // Mayores y dni > 20 millones
        System.out.println(String.format("Mayores y con DNI superior a 20mill: %s",personas.stream()
                                                                                           .filter(persona -> persona.getEdad()>21)
                                                                                           .filter(persona -> persona.getDni()>20000000)
                                                                                           .collect(Collectors.toList())));
    }
}
