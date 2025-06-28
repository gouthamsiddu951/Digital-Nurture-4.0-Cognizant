DECLARE
    CURSOR cur_balance IS
        SELECT customer_id, balance,LOAN_ID,DUE_DATE
        FROM customers
        WHERE balance > 10000;

BEGIN
    FOR rec IN cur_balance LOOP
        UPDATE customers
        SET isVIP = 'TRUE'
        WHERE customer_id = rec.customer_id;

        DBMS_OUTPUT.PUT_LINE('Promoted to VIP: Customer ID ' || rec.customer_id|| ', Intrest_rate '|| rec.Intrest_rate || ', Due_date is '||rec.Due_date );
    END LOOP;

    COMMIT;
END;
/
