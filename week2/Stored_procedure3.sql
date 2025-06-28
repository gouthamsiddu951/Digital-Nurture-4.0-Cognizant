CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account_id IN NUMBER,
    p_to_account_id   IN NUMBER,
    p_amount          IN NUMBER
) IS
    v_from_balance accounts.balance%TYPE;
BEGIN
    -- Get balance of source account
    SELECT balance INTO v_from_balance
    FROM accounts
    WHERE account_id = p_from_account_id;

    -- Check if sufficient balance exists
    IF v_from_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account.');
    END IF;

    -- Deduct from source account
    UPDATE accounts
    SET balance = balance - p_amount
    WHERE account_id = p_from_account_id;

    -- Add to destination account
    UPDATE accounts
    SET balance = balance + p_amount
    WHERE account_id = p_to_account_id;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Transferred ' || p_amount || ' from Account ' || p_from_account_id || ' to Account ' || p_to_account_id);
END;
/
EXEC TransferFunds(1, 2, 2000);

SELECT * from ACCOUNTS