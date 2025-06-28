DECLARE
    CURSOR due_soon_loans IS
        SELECT l.loan_id, l.customer_id, l.due_date,
               c.first_name, c.last_name
        FROM loans l
        JOIN customers c ON l.customer_id = c.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    FOR rec IN due_soon_loans LOOP
        DBMS_OUTPUT.PUT_LINE('📢 Reminder: Loan ID ' || rec.loan_id ||
                             ' for customer ' || rec.first_name || ' ' || rec.last_name ||
                             ' (Customer ID: ' || rec.customer_id || ') is due on ' ||
                             TO_CHAR(rec.due_date, 'DD-MON-YYYY'));
    END LOOP;
END;
/
