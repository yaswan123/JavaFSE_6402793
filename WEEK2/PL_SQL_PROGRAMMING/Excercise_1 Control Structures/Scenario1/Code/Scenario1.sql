DECLARE
v_age NUMBER;
BEGIN
for cust in (select CustomerID, DOB from Customers) loop
v_age:=floor(MONTHS_BETWEEN(SYSDATE,cust.DOB)/12);
IF v_age>60 THEN
UPDATE Loans
SET InterestRate=InterestRate - 1
WHERE CustomerID=cust.CustomerID;
DBMS_OUTPUT.PUT_LINE('Discount applied for Customer ID: ' || cust.CustomerID || ' (Age: ' || v_age || ')');
END IF;
END LOOP;
END;