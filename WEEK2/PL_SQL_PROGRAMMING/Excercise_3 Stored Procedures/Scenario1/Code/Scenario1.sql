CREATE PROCEDURE ProcessMonthlyInterest AS
BEGIN
UPDATE Accounts SET Balance=Balance*1.01 WHERE AccountType='Savings';
DBMS_OUTPUT.PUT_LINE('Monthly interest processed for all savings accounts.');
END;
/
BEGIN
    ProcessMonthlyInterest();
END;
/