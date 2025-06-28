DECLARE
    CURSOR cur_customers IS
        SELECT l.customer_id, l.interest_rate, 
               c.first_name, c.last_name, c.balance,c.AGE
        FROM loans l
        JOIN customers c ON l.customer_id = c.customer_id
        WHERE c.age > 60;

BEGIN
    FOR rec IN cur_customers LOOP
        UPDATE loans
        SET interest_rate = rec.interest_rate - 1
        WHERE customer_id = rec.customer_id;

        DBMS_OUTPUT.PUT_LINE('Applied 1% discount to Customer ID: ' || rec.customer_id || 
                             ', Name: ' || rec.first_name || ' ' || rec.last_name ||
                             ', Balance: $' || rec.balance|| ', Age:' || rec.AGE);
    END LOOP;

    COMMIT;
END;
/
