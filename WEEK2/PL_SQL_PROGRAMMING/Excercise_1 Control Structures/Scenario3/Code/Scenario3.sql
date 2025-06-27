BEGIN
FOR rec IN (Select c.CustomerID As custID,l.EndDate,c.Name from Customers c join Loans l on l.CustomerID=c.CustomerID) 
LOOP
if rec.EndDate BETWEEN SYSDATE and SYSDATE+30 THEN
DBMS_OUTPUT.PUT_LINE('Dear Customer Your Customer ID is :'||rec.custID||'Please clear your loan in next 30 days EndDate:'||rec.EndDate);
END IF;
END LOOP;
END;
/
SELECT * FROM Loans WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30;