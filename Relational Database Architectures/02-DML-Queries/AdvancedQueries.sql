-- =========================================================================
-- Component: Advanced DML, Subqueries, and Complex JOIN Operations
-- Objective: Demonstrate multi-table intersection, groupings, and data aggregation
-- Compatibility: Oracle SQL / PostgreSQL / MySQL Standard
-- =========================================================================

-- 1. Insert Seed Data for Verification
INSERT INTO Departments VALUES (1, 'Computer Science', 'Block A');
INSERT INTO Departments VALUES (2, 'Information Technology', 'Block B');

INSERT INTO Students VALUES ('MCA001', 'Saurabh', 'Gupta', 'saurabh@uttranchal.edu', '2026-08-01', 1);
INSERT INTO Students VALUES ('MCA002', 'Amit', 'Sharma', 'amit@uttranchal.edu', '2026-08-01', 2);

INSERT INTO Courses VALUES ('CS101', 'Data Structures', 4, 1);
INSERT INTO Courses VALUES ('IT102', 'Database Management', 4, 2);

INSERT INTO Enrollments VALUES ('MCA001', 'CS101', 'SEM1', 'A');
INSERT INTO Enrollments VALUES ('MCA001', 'IT102', 'SEM1', 'B');

-- 2. Complex Query 1: Fetch complete Student Profile matching Departments and Courses (Multi-Table JOIN)
SELECT 
    s.student_id,
    CONCAT(s.first_name, ' ', s.last_name) AS full_name,
    d.department_name,
    c.course_title,
    e.grade_achieved
FROM Students s
INNER JOIN Departments d ON s.department_id = d.department_id
INNER JOIN Enrollments e ON s.student_id = e.student_id
INNER JOIN Courses c ON e.course_id = c.course_id
ORDER BY s.student_id;

-- 3. Complex Query 2: Aggregate Count of Students enrolled per Department utilizing Subqueries
SELECT 
    d.department_name,
    d.building_location,
    (SELECT COUNT(*) FROM Students s WHERE s.department_id = d.department_id) AS total_enrolled_students
FROM Departments d;

-- 4. Complex Query 3: Identify Courses with high credit weightings using nested filtration
SELECT course_id, course_title, credits 
FROM Courses 
WHERE credits >= (SELECT AVG(credits) FROM Courses);
