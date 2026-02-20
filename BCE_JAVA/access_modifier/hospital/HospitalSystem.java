package access_modifier.hospital;

public class HospitalSystem {

    public static class PatientRecord {
        public PatientRecord() {
            System.out.println("Patient record");
        }
    }

    static class BillingSystem {
        public BillingSystem() {
            System.out.println("Billing record");
        }
    }

    private static class InternalAudit {
        public InternalAudit() {
            System.out.println("Internal audit");
        }
    }

    protected static class MedicalSupport {
        public MedicalSupport() {
            System.out.println("Medical support");
        }
    }

    public static void main(String[] args) {

        PatientRecord pr = new PatientRecord();      // ✔ allowed
        BillingSystem bs = new BillingSystem();      // ✔ same package
        InternalAudit ia = new InternalAudit();      // ✔ inside class
        MedicalSupport ms = new MedicalSupport();    // ✔ inside class
    }
}