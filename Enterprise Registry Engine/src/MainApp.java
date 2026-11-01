package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// =========================================================================
// 1. DATA LAYER / MODELS (Strictly Encapsulated Entity records)
// =========================================================================
class StudentRegistry {
    private final String studentId;
    private final String name;
    private final String courseCode;

    public StudentRegistry(String studentId, String name, String courseCode) {
        this.studentId = studentId;
        this.name = name;
        this.courseCode = courseCode;
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getCourseCode() { return courseCode; }
}

// =========================================================================
// 2. CORE CONTROLLER LAYER (State Management & Business Rules Engine)
// =========================================================================
class RegistryController {
    private final List<StudentRegistry> internalDatabase = new ArrayList<>();
    private final Map<String, String> hostelAllocations = new HashMap<>();

    public void registerNewStudent(String id, String name, String course) {
        if (id == null || id.trim().isEmpty() || name == null || name.trim().isEmpty()) {
            System.err.println("Validation Error: Registration inputs fail structural parameters.");
            return;
        }
        internalDatabase.add(new StudentRegistry(id, name, course));
        System.out.println("System Alert: Successfully cached registration node for " + name);
    }

    public void allocateHostelRoom(String studentId, String roomBlock) {
        hostelAllocations.put(studentId, roomBlock);
        System.out.println("System Alert: Assigned student ID [" + studentId + "] to Block: " + roomBlock);
    }

    public void processSystemReport() {
        System.out.println("\n==================================================");
        System.out.println("          SYSTEM COMPREHENSIVE AUDIT LEDGER       ");
        System.out.println("==================================================");
        if (internalDatabase.isEmpty()) {
            System.out.println("Ledger Status: Zero entries indexed currently.");
            return;
        }
        for (StudentRegistry student : internalDatabase) {
            String room = hostelAllocations.getOrDefault(student.getStudentId(), "UNALLOCATED");
            System.out.printf("ID: %-8s | Name: %-15s | Course: %-8s | Room Block: %-10s\n", 
                student.getStudentId(), student.getName(), student.getCourseCode(), room);
        }
        System.out.println("==================================================");
    }
}

// =========================================================================
// 3. MAIN APP GATEWAY (Console Orchestration Loop Layer)
// =========================================================================
public class MainApp {
    public static void main(String[] args) {
        RegistryController coreEngine = new RegistryController();
        Scanner inputScanner = new Scanner(System.in);
        
        // Injecting Professional Seed Records for immediate application showcase validation
        coreEngine.registerNewStudent("UU-001", "Saurabh Gupta", "MCA");
        coreEngine.allocateHostelRoom("UU-001", "Block-A");

        while (true) {
            System.out.println("\n--- ENTERPRISE REGISTRY CORE DASHBOARD ---");
            System.out.println("1. Register New Student Node");
            System.out.println("2. Process Hostel Room Allocation Pass");
            System.out.println("3. Run Full System Audit Ledger Report");
            System.out.println("4. Gracefully Shut Down Core Engines");
            System.out.print("Select Operational Command (1-4): ");
            
            String operationalSelection = inputScanner.nextLine();
            
            switch (operationalSelection) {
                case "1":
                    System.out.print("Enter Target Student ID (e.g., UU-002): ");
                    String id = inputScanner.nextLine();
                    System.out.print("Enter Full Legal Name: ");
                    String name = inputScanner.nextLine();
                    System.out.print("Enter Course Academic Code: ");
                    String course = inputScanner.nextLine();
                    coreEngine.registerNewStudent(id, name, course);
                    break;
                case "2":
                    System.out.print("Enter Student ID for Allocation: ");
                    String targetId = inputScanner.nextLine();
                    System.out.print("Assign Target Room Facility Block: ");
                    String block = inputScanner.nextLine();
                    coreEngine.allocateHostelRoom(targetId, block);
                    break;
                case "3":
                    coreEngine.processSystemReport();
                    break;
                case "4":
                    System.out.println("Safely flushing file tracking handlers... Shutdown loop completed.");
                    inputScanner.close();
                    return;
                default:
                    System.out.println("Command unrecognized. Check operational parameters.");
            }
        }
    }
}
