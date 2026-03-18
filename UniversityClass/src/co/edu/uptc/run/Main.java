package co.edu.uptc.run;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

import co.edu.uptc.models.Student;
import co.edu.uptc.models.Teacher;
import co.edu.uptc.models.University;
import co.edu.uptc.models.Campus;
import co.edu.uptc.models.Rector;

public class Main {
    private static ArrayList<Student> studentsL = new ArrayList<>();
    private static ArrayList<Teacher> teachersL = new ArrayList<>();
    private static ArrayList<University> universityL = new ArrayList<>();
    private static ArrayList<Campus> campusesL = new ArrayList<>();
    private static ArrayList<Rector> rectorL = new ArrayList<>();
    
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        
        // Carga inicial de datos (A. CREAR REGISTROS)
        studentsL.add(new Student("Rafael", "Gomez", "12340", 3, 17));
        teachersL.add(new Teacher("Alejandro", "Zuria", "224567", "Temporal", true));
        universityL.add(new University("UPTC", "889967", "CRA 9 # 59-90", "uptc.edu.co", LocalDate.of(1953, 10, 10), true));
        campusesL.add(new Campus("San Ricardo", "334565", 520, 50.70, "Duitama"));
        rectorL.add(new Rector("213458", "Engineer", true, "Alonso", LocalDate.now()));

        do {
            System.out.println("\n--- SISTEMA UNIVERSITARIO CRUD ---");
            System.out.println("1. Consultar todos los registros (B)");
            System.out.println("2. Actualizar registros (C)");
            System.out.println("3. Eliminar registros (D)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: consultarTodo(); break;
                case 2: actualizarTodo(); break;
                case 3: eliminarTodo(); break;
                case 4: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    // --- B. CONSULTAR REGISTROS ---
    public static void consultarTodo() {
        System.out.println("\n--- RESULTADOS DE CONSULTA ---");
        for (Student s : studentsL) System.out.println("Estudiante: " + s.getFirstName() + " ID: " + s.getIdStudent());
        for (Teacher t : teachersL) System.out.println("Profesor: " + t.getFirstName() + " ID: " + t.getIdCode());
        for (University u : universityL) System.out.println("Universidad: " + u.getName() + " NIT: " + u.getNitId());
        for (Campus c : campusesL) System.out.println("Campus: " + c.getCampusName() + " ID: " + c.getIdCampus());
        for (Rector r : rectorL) System.out.println("Rector ID: " + r.getEmployeedId() + " Título: " + r.getAcademicTitle());
    }

    // --- C. ACTUALIZAR REGISTROS ---
    public static void actualizarTodo() {
        System.out.print("Ingrese ID para actualizar: ");
        String id = sc.nextLine();

        // Actualizar student
        for (Student s : studentsL) {
            if (s.getIdStudent().equals(id)) {
                System.out.print("Nuevo semestre: ");
                s.setCurrentSemester(sc.nextInt());
                System.out.println("Estudiante actualizado.");
                return;
            }
        }
        // Actualizar teacjer
        for (Teacher t : teachersL) {
            if (t.getIdCode().equals(id)) {
                System.out.print("Nuevo tipo de contrato: ");
                t.setContractType(sc.nextLine());
                System.out.println("Profesor actualizado.");
                return;
            }
        }
        // Actualizar Campus
        for (Campus c : campusesL) {
            if (c.getIdCampus().equals(id)) {
                System.out.print("Nueva capacidad: ");
                c.setCapacity(sc.nextInt());
                System.out.println("Campus actualizado.");
                return;
            }
        }
        System.out.println("ID no encontrado en ninguna entidad.");
    }

    // --- D. ELIMINAR REGISTROS ---
    public static void eliminarTodo() {
        System.out.print("Ingrese ID para eliminar: ");
        String id = sc.nextLine();

        if (studentsL.removeIf(s -> s.getIdStudent().equals(id))) {
            System.out.println("Estudiante eliminado.");
        } else if (teachersL.removeIf(t -> t.getIdCode().equals(id))) {
            System.out.println("Profesor eliminado.");
        } else if (campusesL.removeIf(c -> c.getIdCampus().equals(id))) {
            System.out.println("Campus eliminado.");
        } else {
            System.out.println("No se encontró el registro.");
        }
    }
}