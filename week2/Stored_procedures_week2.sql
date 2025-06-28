CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    -- Update all savings accounts by increasing the balance by 1%
    UPDATE accounts
    SET balance = balance + (balance * 0.01)
    WHERE LOWER(account_type) = 'savings';

    COMMIT;  -- Commit the changes
END;
/
EXEC ProcessMonthlyInterest;
select * from ACCOUNTS