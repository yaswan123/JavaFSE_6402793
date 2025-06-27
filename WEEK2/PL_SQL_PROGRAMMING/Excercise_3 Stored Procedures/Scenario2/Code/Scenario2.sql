CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (p_Department IN Employees.Department%TYPE,p_BonusPct   IN NUMBER) AS
v_updated_count NUMBER:=0;
BEGIN
UPDATE Employees
SET Salary=Salary+Salary*p_BonusPct/100
WHERE Department=p_Department;
v_updated_count:=SQL%ROWCOUNT;
IF v_updated_count=0 THEN
DBMS_OUTPUT.PUT_LINE('No employees found in department "' || p_Department || '".');
ELSE
DBMS_OUTPUT.PUT_LINE(v_updated_count || ' employee(s) updated in department "' || p_Department || '" by ' || p_BonusPct || '%.');
END IF;
END;
/
begin
    UpdateEmployeeBonus(0.5,'IT');
end;
/

SELECT * FROM Employees WHERE Department = 'IT';