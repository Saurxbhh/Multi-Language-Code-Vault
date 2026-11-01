-- =========================================================================
-- Schema Component: University Management Database Architecture
-- Objective: Showcase constraints, primary keys, foreign keys, and cascading rules
-- Engine Compatibility: Oracle SQL / PostgreSQL / MySQL Standard
-- =========================================================================

-- 1. Create Departments Table (Independent Entity)
CREATE TABLE Departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100) NOT NULL UNIQUE,
    building_location VARCHAR(50)
);

-- 2. Create Students Table (Dependent on Departments)
CREATE TABLE Students (
    student_id VARCHAR(15) PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    enrollment_date DATE DEFAULT CURRENT_DATE,
    department_id INT,
    CONSTRAINT fk_student_department 
        FOREIGN KEY (department_id) 
        REFERENCES Departments(department_id)
        ON DELETE SET NULL
);

-- 3. Create Courses Table (Dependent on Departments)
CREATE TABLE Courses (
    course_id VARCHAR(10) PRIMARY KEY,
    course_title VARCHAR(100) NOT NULL,
    credits INT NOT NULL CHECK (credits BETWEEN 1 AND 5),
    department_id INT,
    CONSTRAINT fk_course_department 
        FOREIGN KEY (department_id) 
        REFERENCES Departments(department_id)
        ON DELETE CASCADE
);

-- 4. Create Enrollments Table (Many-to-Many Bridge Entity with Composite Primary Key)
CREATE TABLE Enrollments (
    student_id VARCHAR(15),
    course_id VARCHAR(10),
    semester_code VARCHAR(10) NOT NULL,
    grade_achieved CHAR(2),
    PRIMARY KEY (student_id, course_id),
    CONSTRAINT fk_enrollment_student 
        FOREIGN KEY (student_id) 
        REFERENCES Students(student_id)
        ON DELETE CASCADE,
    CONSTRAINT fk_enrollment_course 
        FOREIGN KEY (course_id) 
        REFERENCES Courses(course_id)
        ON DELETE CASCADE
);
