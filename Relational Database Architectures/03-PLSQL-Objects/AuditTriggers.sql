-- =========================================================================
-- Component: Procedural PL/SQL Automation Engine
-- Objective: Demonstrate Row-Level Auditing, Automated Logging, and State Tracking
-- Compatibility: Standard Oracle PL/SQL Engine / PostgreSQL plpgsql Adaptation
-- =========================================================================

-- 1. Establish an autonomous Audit Ledger Table
CREATE TABLE Student_Audit_Log (
    log_id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    student_id VARCHAR(15),
    action_performed VARCHAR(20),
    timestamp_logged TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    modified_by_user VARCHAR(50)
);

-- 2. Generate a PL/SQL Row-Level Trigger to track student profile disruptions automatically
CREATE OR REPLACE TRIGGER trg_student_audit_engine
AFTER INSERT OR UPDATE OR DELETE ON Students
FOR EACH ROW
DECLARE
    v_action VARCHAR(20);
BEGIN
    IF INSERTING THEN
        v_action := 'INSERTION';
        INSERT INTO Student_Audit_Log (student_id, action_performed, modified_by_user)
        VALUES (:NEW.student_id, v_action, USER);
    ELSIF UPDATING THEN
        v_action := 'UPDATE';
        INSERT INTO Student_Audit_Log (student_id, action_performed, modified_by_user)
        VALUES (:NEW.student_id, v_action, USER);
    ELSIF DELETING THEN
        v_action := 'DELETION';
        INSERT INTO Student_Audit_Log (student_id, action_performed, modified_by_user)
        VALUES (:OLD.student_id, v_action, USER);
    END IF;
END;
/
