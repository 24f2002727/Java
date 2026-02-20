CASE STUDY 2: Hospital Management System (Nested Classes)

 

Scenario:

Class HospitalSystem contains nested classes.

 

Requirements:

1. Nested class PatientRecord → accessible everywhere.

2. Nested class BillingSystem → accessible only in same package.

3. Nested class InternalAudit → accessible only inside HospitalSystem.

4. Nested class MedicalSupport → accessible to subclasses.

 

Questions:

a) Assign access modifiers.

b) Can InternalAudit be accessed in main() of HospitalSystem? Explain.