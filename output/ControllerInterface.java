import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;

public interface ControllerInterface
{
  public void addPatientGP(PatientGP oo);
    public PatientGP createPatientGP(String Idx);
  public void killPatientGP(PatientGP patientgpxx);
 public void setregisteredWith(PatientGP patientgpx,List registeredWithxx);
   public void addregisteredWith(PatientGP patientgpx,Doctor registeredWithxx);
   public void removeregisteredWith(PatientGP patientgpx,Doctor registeredWithxx);
   public void setconsultations(PatientGP patientgpx,List consultationsxx);
   public void addconsultations(PatientGP patientgpx,Consultation consultationsxx);
   public void removeconsultations(PatientGP patientgpx,Consultation consultationsxx);
   public void setreferrals(PatientGP patientgpx,List referralsxx);
   public void addreferrals(PatientGP patientgpx,Referral referralsxx);
   public void removereferrals(PatientGP patientgpx,Referral referralsxx);
    public void addDoctor(Doctor oo);
    public Doctor createDoctor(String staffNumberx);
  public void killDoctor(Doctor doctorxx);
  public void addConsultation(Consultation oo);
    public Consultation createConsultation(Doctor doctorx);
  public void killConsultation(Consultation consultationxx);
 public void setdoctor(Consultation consultationx,Doctor doctorxx);
  public void addReferral(Referral oo);
    public Referral createReferral(Doctor referrerx);
  public void killReferral(Referral referralxx);
 public void setreferrer(Referral referralx,Doctor referrerxx);
}

