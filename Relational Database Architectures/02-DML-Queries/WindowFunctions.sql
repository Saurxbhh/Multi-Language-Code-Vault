-- Using analytical window queries to rank student performances across sectors
SELECT 
    student_id,
    course_id,
    grade_achieved,
    DENSE_RANK() OVER (PARTITION BY course_id ORDER BY grade_achieved ASC) as class_rank
FROM Enrollments;
