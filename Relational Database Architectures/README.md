# Relational Database Architectures & Engineering

A production-grade compilation of relational database schemas, structural constraints, optimized multi-table querying engines, and procedural automation objects (PL/SQL). This repository acts as a systematic audit tracker for enterprise database management system (DBMS) operations and advanced lab implementations.

---

## 🛠️ Engine Core & Technical Competencies
* **SQL Core Flavors:** Oracle SQL / PL-SQL • PostgreSQL (plpgsql) • MySQL Engine Standard
* **Architectural Paradigms:** 1NF / 2NF / 3NF Normalization Rules, Referential Integrity Constraints, Entity-Relationship (ER) Translation
* **Optimization Frameworks:** Computational Indexing, Execution Path Analysis, Structural Join Minimization

---

## 📊 Database Labs & Architecture Directory

Click on any core module accordion below to expand the underlying structural source scripts.

<details>
<summary><b>📂 Module 01: Data Definition Language (DDL) Schemas [2/2 Complete]</b></summary>
<br>

| Database Architecture | Structural Matrix Highlights | Target Source Script |
| :--- | :--- | :--- |
| University Management Database | Cascading Referential Integrity (`ON DELETE CASCADE`), Type Assertions | [📂 View Schema](./01-DDL-Schemas/UniversitySchema.sql) |
| E-Commerce Ledger Schema | Transaction Constraints, Multi-Table Relationship Indexing | [📂 View Schema](./01-DDL-Schemas/ECommerceSchema.sql) |

</details>

<details>
<summary><b>📂 Module 02: Advanced Query Optimization (DML) [2/2 Complete]</b></summary>
<br>

| Analytical Objective | Complex SQL Mechanics Utilized | Target Source Script |
| :--- | :--- | :--- |
| Core Subqueries & Joins Matrix | Multi-Table `INNER/LEFT JOIN`, Nested Appraisals, Sub-Selects | [📂 View Queries](./02-DML-Queries/AdvancedQueries.sql) |
| Performance Window Functions | `RANK()`, `DENSE_RANK()`, Partitioned Analytical Segments | [📂 View Queries](./02-DML-Queries/WindowFunctions.sql) |

</details>

<details>
<summary><b>📂 Module 03: Procedural Database Objects (PL/SQL) [2/2 Complete]</b></summary>
<br>

| Procedural Component | Automated Architectural Pattern | Target Source Script |
| :--- | :--- | :--- |
| Transaction Audit Automation Ledger | Autonomous Logging, State Tracking Row-Level Triggers | [📂 View Script](./03-PLSQL-Objects/AuditTriggers.sql) |
| Dynamic Cursor Billing System | Safe Pointer Traversals, Exception Handling Blocks | [📂 View Script](./03-PLSQL-Objects/CursorBilling.sql) |

</details>

---

## 🚀 Deployment & Operational Execution
1. Initialize core system tables sequentially to preserve foreign key dependancies:
   ```sql
   @01-DDL-Schemas/UniversitySchema.sql;
   ```
2. Execute transaction querying trees or analytical window passes:
   ```sql
   @02-DML-Queries/AdvancedQueries.sql;
   ```
3. Compile the procedural triggers and cursor blocks directly onto your live instance buffer:
   ```sql
   @03-PLSQL-Objects/AuditTriggers.sql;
   ```
