-- PL/SQL Cursor block to process outstanding ledgers safely
DECLARE
    CURSOR student_cursor IS SELECT student_id, email FROM Students;
    v_id Students.student_id%TYPE;
    v_email Students.email%TYPE;
BEGIN
    OPEN student_cursor;
    LOOP
        FETCH student_cursor INTO v_id, v_email;
        EXIT WHEN student_cursor%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('Processing Notification Node for: ' || v_id || ' -> ' || v_email);
    END LOOP;
    CLOSE student_cursor;
END;
/
