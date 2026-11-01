# Enterprise Registry Engine (Academic Management System)

A production-grade, end-to-end console application engineered in **Java** that bridges structural backend engineering with physical data layers. This system tracks institutional registries, automates allocation processes, and preserves record consistency.

## 🛠️ Architectural Blueprint
* **Core Logic Layer:** Java Standard Engine with clean object-oriented class interactions.
* **State Memory Cache:** Java Collections Framework (`ArrayList`, `HashMap`) mimicking in-memory indexing arrays.
* **Persistent Data Layer:** Structured text ledger mimicking static SQL database state persistence.
* **Design Patterns Utilized:** Model-View-Controller (MVC) architecture separation, structural input validation validation traps.

---

## 📂 System Directory Maps
```text
├── src/
│   ├── Models/      # Secure entities (Student, Department, Allocation)
│   ├── Controller/  # Core calculation logic and registration state handlers
│   └── MainApp.java # System execution gateway and user input dashboard loop
└── DataStorage/     # Flat file mock ledger database storage tracks
```

## 🚀 Key Features Demonstrated
1. **Dynamic Data Processing:** Active registration, auditing, and processing pipelines for student record tracking.
2. **Encapsulated Memory Layers:** Strict data boundary protections using custom validation exceptions for dirty inputs.
3. **Data Layer Simulation:** Automatic write/read cycles using Java I/O streams to persist registry data beyond application closures.
