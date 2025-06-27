CREATE OR REPLACE PROCEDURE TransferFunds (from_account IN NUMBER,to_account IN NUMBER,amount IN NUMBER
)
AS from_balance NUMBER;
BEGIN
SELECT balance INTO from_balance FROM Accounts WHERE Accountid = from_account;
IF from_balance>=amount THEN
UPDATE Accounts SET Balance=Balance-amount WHERE accountid=from_account;
UPDATE Accounts SET Balance=Balance+amount WHERE accountid=to_account;
DBMS_OUTPUT.PUT_LINE('Transfer successful.');
ELSE
DBMS_OUTPUT.PUT_LINE('Insufficient balance in source account.');
END IF;
END;
/
BEGIN
TransferFunds(2,1,500);
END;
/