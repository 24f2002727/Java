CASE STUDY 3: Employee Payroll System (Cross-Package)

 

Scenario:

Package company contains class Employee.

 

Variables:

1. companyName → accessible everywhere

2. basicSalary → accessible in subclasses only

3. deptCode → accessible in same package only

4. bankPassword → accessible only inside Employee

 

Methods:

1. display() → everywhere

2. calculateSalary() → subclasses + same package

3. generateSlip() → same package only

4. verifyBankDetails() → class only

 

Questions:

a) Choose correct access modifiers.

b) Which members are inherited?