import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;

import java.lang.*;
import java.lang.reflect.*;
import java.util.StringTokenizer;
import java.io.*;



class PatientGP
  implements SystemTypes
{
  private String Id = ""; // internal
  private String nhsNumber = ""; // internal
  private String name1 = ""; // internal
  private String name2 = ""; // internal
  private int dob = 0; // internal
  private String addr1 = ""; // internal
  private String addr2 = ""; // internal
  private String postcode = ""; // internal
  private boolean isMale = false; // internal
  private List registeredWith = new Vector(); // of Doctor
  private List consultations = new Vector(); // of Consultation
  private List referrals = new Vector(); // of Referral

  public PatientGP()
  {
    this.Id = "";
    this.nhsNumber = "";
    this.name1 = "";
    this.name2 = "";
    this.dob = 0;
    this.addr1 = "";
    this.addr2 = "";
    this.postcode = "";
    this.isMale = false;

  }



  public void setId(String Id_x) { Id = Id_x;  }


  public static void setAllId(List patientgps,String val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setId(patientgpx,val); } }


  public void setnhsNumber(String nhsNumber_x) { nhsNumber = nhsNumber_x;  }


  public static void setAllnhsNumber(List patientgps,String val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setnhsNumber(patientgpx,val); } }


  public void setname1(String name1_x) { name1 = name1_x;  }


  public static void setAllname1(List patientgps,String val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setname1(patientgpx,val); } }


  public void setname2(String name2_x) { name2 = name2_x;  }


  public static void setAllname2(List patientgps,String val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setname2(patientgpx,val); } }


  public void setdob(int dob_x) { dob = dob_x;  }


  public static void setAlldob(List patientgps,int val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setdob(patientgpx,val); } }


  public void setaddr1(String addr1_x) { addr1 = addr1_x;  }


  public static void setAlladdr1(List patientgps,String val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setaddr1(patientgpx,val); } }


  public void setaddr2(String addr2_x) { addr2 = addr2_x;  }


  public static void setAlladdr2(List patientgps,String val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setaddr2(patientgpx,val); } }


  public void setpostcode(String postcode_x) { postcode = postcode_x;  }


  public static void setAllpostcode(List patientgps,String val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setpostcode(patientgpx,val); } }


  public void setisMale(boolean isMale_x) { isMale = isMale_x;  }


  public static void setAllisMale(List patientgps,boolean val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setisMale(patientgpx,val); } }


  public void setregisteredWith(List registeredWithxx) { registeredWith = registeredWithxx;
    }
 
  public void addregisteredWith(Doctor registeredWithxx) { registeredWith.add(registeredWithxx);
    }
 
  public void removeregisteredWith(Doctor registeredWithxx) { Vector _removedregisteredWithregisteredWithxx = new Vector();
  _removedregisteredWithregisteredWithxx.add(registeredWithxx);
  registeredWith.removeAll(_removedregisteredWithregisteredWithxx);
    }

  public static void setAllregisteredWith(List patientgps,List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().setregisteredWith(patientgpx, _val); } }

  public static void addAllregisteredWith(List patientgps,Doctor _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().addregisteredWith(patientgpx, _val); } }


  public static void removeAllregisteredWith(List patientgps,Doctor _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().removeregisteredWith(patientgpx, _val); } }


  public static void unionAllregisteredWith(List patientgps, List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().unionregisteredWith(patientgpx, _val); } }


  public static void subtractAllregisteredWith(List patientgps, List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().subtractregisteredWith(patientgpx, _val); } }


  public void setconsultations(List consultationsxx) { consultations = consultationsxx;
    }
 
  public void addconsultations(Consultation consultationsxx) { consultations.add(consultationsxx);
    }
 
  public void removeconsultations(Consultation consultationsxx) { Vector _removedconsultationsconsultationsxx = new Vector();
  _removedconsultationsconsultationsxx.add(consultationsxx);
  consultations.removeAll(_removedconsultationsconsultationsxx);
    }

  public static void setAllconsultations(List patientgps,List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().setconsultations(patientgpx, _val); } }

  public static void addAllconsultations(List patientgps,Consultation _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().addconsultations(patientgpx, _val); } }


  public static void removeAllconsultations(List patientgps,Consultation _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().removeconsultations(patientgpx, _val); } }


  public static void unionAllconsultations(List patientgps, List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().unionconsultations(patientgpx, _val); } }


  public static void subtractAllconsultations(List patientgps, List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().subtractconsultations(patientgpx, _val); } }


  public void setreferrals(List referralsxx) { referrals = referralsxx;
    }
 
  public void addreferrals(Referral referralsxx) { referrals.add(referralsxx);
    }
 
  public void removereferrals(Referral referralsxx) { Vector _removedreferralsreferralsxx = new Vector();
  _removedreferralsreferralsxx.add(referralsxx);
  referrals.removeAll(_removedreferralsreferralsxx);
    }

  public static void setAllreferrals(List patientgps,List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().setreferrals(patientgpx, _val); } }

  public static void addAllreferrals(List patientgps,Referral _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().addreferrals(patientgpx, _val); } }


  public static void removeAllreferrals(List patientgps,Referral _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().removereferrals(patientgpx, _val); } }


  public static void unionAllreferrals(List patientgps, List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().unionreferrals(patientgpx, _val); } }


  public static void subtractAllreferrals(List patientgps, List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().subtractreferrals(patientgpx, _val); } }


  public String getId() { return Id; }

  public static List getAllId(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(patientgpx.getId())) { }
      else { result.add(patientgpx.getId()); } }
    return result; }

  public static List getAllOrderedId(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(patientgpx.getId()); } 
    return result; }

  public String getnhsNumber() { return nhsNumber; }

  public static List getAllnhsNumber(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(patientgpx.getnhsNumber())) { }
      else { result.add(patientgpx.getnhsNumber()); } }
    return result; }

  public static List getAllOrderednhsNumber(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(patientgpx.getnhsNumber()); } 
    return result; }

  public String getname1() { return name1; }

  public static List getAllname1(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(patientgpx.getname1())) { }
      else { result.add(patientgpx.getname1()); } }
    return result; }

  public static List getAllOrderedname1(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(patientgpx.getname1()); } 
    return result; }

  public String getname2() { return name2; }

  public static List getAllname2(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(patientgpx.getname2())) { }
      else { result.add(patientgpx.getname2()); } }
    return result; }

  public static List getAllOrderedname2(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(patientgpx.getname2()); } 
    return result; }

  public int getdob() { return dob; }

  public static List getAlldob(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(new Integer(patientgpx.getdob()))) { }
      else { result.add(new Integer(patientgpx.getdob())); } }
    return result; }

  public static List getAllOrdereddob(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(new Integer(patientgpx.getdob())); } 
    return result; }

  public String getaddr1() { return addr1; }

  public static List getAlladdr1(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(patientgpx.getaddr1())) { }
      else { result.add(patientgpx.getaddr1()); } }
    return result; }

  public static List getAllOrderedaddr1(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(patientgpx.getaddr1()); } 
    return result; }

  public String getaddr2() { return addr2; }

  public static List getAlladdr2(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(patientgpx.getaddr2())) { }
      else { result.add(patientgpx.getaddr2()); } }
    return result; }

  public static List getAllOrderedaddr2(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(patientgpx.getaddr2()); } 
    return result; }

  public String getpostcode() { return postcode; }

  public static List getAllpostcode(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(patientgpx.getpostcode())) { }
      else { result.add(patientgpx.getpostcode()); } }
    return result; }

  public static List getAllOrderedpostcode(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(patientgpx.getpostcode()); } 
    return result; }

  public boolean getisMale() { return isMale; }

  public static List getAllisMale(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(new Boolean(patientgpx.getisMale()))) { }
      else { result.add(new Boolean(patientgpx.getisMale())); } }
    return result; }

  public static List getAllOrderedisMale(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(new Boolean(patientgpx.getisMale())); } 
    return result; }

  public List getregisteredWith() { return (Vector) ((Vector) registeredWith).clone(); }

  public static List getAllregisteredWith(List patientgps)
  { List result = new Vector();
    for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      result = Set.union(result,patientgpx.getregisteredWith()); }
    return result; }

  public static List getAllOrderedregisteredWith(List patientgps)
  { List result = new Vector();
    for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      result = Set.union(result,patientgpx.getregisteredWith()); }
    return result; }

  public List getconsultations() { return (Vector) ((Vector) consultations).clone(); }

  public static List getAllconsultations(List patientgps)
  { List result = new Vector();
    for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      result = Set.union(result,patientgpx.getconsultations()); }
    return result; }

  public static List getAllOrderedconsultations(List patientgps)
  { List result = new Vector();
    for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      result = Set.union(result,patientgpx.getconsultations()); }
    return result; }

  public List getreferrals() { return (Vector) ((Vector) referrals).clone(); }

  public static List getAllreferrals(List patientgps)
  { List result = new Vector();
    for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      result = Set.union(result,patientgpx.getreferrals()); }
    return result; }

  public static List getAllOrderedreferrals(List patientgps)
  { List result = new Vector();
    for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      result = Set.union(result,patientgpx.getreferrals()); }
    return result; }

    public String toString()
  {   String result = "";
 
  result = name1 + " " + name2 + " " + nhsNumber;
    return result;
  }


    public void check1()
  {   if (this.getdob() <= 0) 
  {   System.out.println("" + ( "Patient " + this + " has no date of birth value" ));
}
  }

    public void check2()
  {   if (this.getname1().equals("")) 
  {   System.out.println("" + ( "Patient " + this + " has no first name (name1) value" ));
}
  }

    public void check3()
  {   if (this.getname2().equals("")) 
  {   System.out.println("" + ( "Patient " + this + " has no surname (name2) value" ));
}
  }

    public void check4()
  {   if (this.getaddr1().equals("")) 
  {   System.out.println("" + ( "Patient " + this + " has no address 1 value" ));
}
  }

    public void check5()
  {   if (this.getaddr2().equals("")) 
  {   System.out.println("" + ( "Patient " + this + " has no address 2 value" ));
}
  }

    public void check6(PatientGP p)
  {   if (!(p.getId().equals(this.getId())) && p.getname1().equals(this.getname1()) && p.getname2().equals(this.getname2()) && p.getdob() == this.getdob() && p.getisMale() == this.getisMale()) 
  {   System.out.println("" + ( "Duplicate patients?: " + this + " and " + p ));
}
  }

    public void check6outer()
  {  PatientGP patientgpx = this;
    List _range1 = Controller.inst().patientgps;
  for (int _i0 = 0; _i0 < _range1.size(); _i0++)
  { PatientGP p = (PatientGP) _range1.get(_i0);
       this.check6(p);
  }
  }


    public void displayreferrals1(Referral r)
  {   System.out.println("" + ( "Patient: " + this.getname1() + " " + this.getname2() + " was referred to " + r.getreferredTo() + " on " + r.getdate() ));

  }

    public void displayreferrals1outer()
  {  PatientGP patientgpx = this;
    List _range3 = Set.sortedBy(patientgpx.getreferrals(), Set.collect_0(patientgpx.getreferrals()));
  for (int _i2 = 0; _i2 < _range3.size(); _i2++)
  { Referral r = (Referral) _range3.get(_i2);
       this.displayreferrals1(r);
  }
  }


    public void displayconsultations1(Consultation c)
  {   System.out.println("" + ( "Patient: " + this + " with symptoms " + c.getsymptoms() + " had a consultation on " + c.getdate() + " with outcome " + c.getoutcome() ));

  }

    public void displayconsultations1outer()
  {  PatientGP patientgpx = this;
    List _range5 = Set.sortedBy(patientgpx.getconsultations(), Set.collect_1(patientgpx.getconsultations()));
  for (int _i4 = 0; _i4 < _range5.size(); _i4++)
  { Consultation c = (Consultation) _range5.get(_i4);
       this.displayconsultations1(c);
  }
  }



}


class Doctor
  implements SystemTypes
{
  private String name1 = ""; // internal
  private String name2 = ""; // internal
  private String surgery = ""; // internal
  private String staffNumber = ""; // internal

  public Doctor()
  {
    this.name1 = "";
    this.name2 = "";
    this.surgery = "";
    this.staffNumber = "";

  }



  public String toString()
  { String _res_ = "(Doctor) ";
    _res_ = _res_ + name1 + ",";
    _res_ = _res_ + name2 + ",";
    _res_ = _res_ + surgery + ",";
    _res_ = _res_ + staffNumber;
    return _res_;
  }

  public void setname1(String name1_x) { name1 = name1_x;  }


  public static void setAllname1(List doctors,String val)
{ for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      Controller.inst().setname1(doctorx,val); } }


  public void setname2(String name2_x) { name2 = name2_x;  }


  public static void setAllname2(List doctors,String val)
{ for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      Controller.inst().setname2(doctorx,val); } }


  public void setsurgery(String surgery_x) { surgery = surgery_x;  }


  public static void setAllsurgery(List doctors,String val)
{ for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      Controller.inst().setsurgery(doctorx,val); } }


  public void setstaffNumber(String staffNumber_x) { staffNumber = staffNumber_x;  }


  public static void setAllstaffNumber(List doctors,String val)
{ for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      Controller.inst().setstaffNumber(doctorx,val); } }


  public String getname1() { return name1; }

  public static List getAllname1(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      if (result.contains(doctorx.getname1())) { }
      else { result.add(doctorx.getname1()); } }
    return result; }

  public static List getAllOrderedname1(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      result.add(doctorx.getname1()); } 
    return result; }

  public String getname2() { return name2; }

  public static List getAllname2(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      if (result.contains(doctorx.getname2())) { }
      else { result.add(doctorx.getname2()); } }
    return result; }

  public static List getAllOrderedname2(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      result.add(doctorx.getname2()); } 
    return result; }

  public String getsurgery() { return surgery; }

  public static List getAllsurgery(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      if (result.contains(doctorx.getsurgery())) { }
      else { result.add(doctorx.getsurgery()); } }
    return result; }

  public static List getAllOrderedsurgery(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      result.add(doctorx.getsurgery()); } 
    return result; }

  public String getstaffNumber() { return staffNumber; }

  public static List getAllstaffNumber(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      if (result.contains(doctorx.getstaffNumber())) { }
      else { result.add(doctorx.getstaffNumber()); } }
    return result; }

  public static List getAllOrderedstaffNumber(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      result.add(doctorx.getstaffNumber()); } 
    return result; }


}


class Consultation
  implements SystemTypes
{
  private int date = 0; // internal
  private String outcome = ""; // internal
  private String symptoms = ""; // internal
  private Doctor doctor;

  public Consultation(Doctor doctor)
  {
    this.date = 0;
    this.outcome = "";
    this.symptoms = "";
    this.doctor = doctor;

  }

  public Consultation() { }



  public void setdate(int date_x) { date = date_x;  }


  public static void setAlldate(List consultations,int val)
{ for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      Controller.inst().setdate(consultationx,val); } }


  public void setoutcome(String outcome_x) { outcome = outcome_x;  }


  public static void setAlloutcome(List consultations,String val)
{ for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      Controller.inst().setoutcome(consultationx,val); } }


  public void setsymptoms(String symptoms_x) { symptoms = symptoms_x;  }


  public static void setAllsymptoms(List consultations,String val)
{ for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      Controller.inst().setsymptoms(consultationx,val); } }


  public void setdoctor(Doctor doctorxx) { doctor = doctorxx;
  }

  public static void setAlldoctor(List consultations,Doctor _val)
  { for (int _i = 0; _i < consultations.size(); _i++)
    { Consultation consultationx = (Consultation) consultations.get(_i);
      Controller.inst().setdoctor(consultationx, _val); } }

  public int getdate() { return date; }

  public static List getAlldate(List consultations)
  { List result = new Vector();
    for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      if (result.contains(new Integer(consultationx.getdate()))) { }
      else { result.add(new Integer(consultationx.getdate())); } }
    return result; }

  public static List getAllOrdereddate(List consultations)
  { List result = new Vector();
    for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      result.add(new Integer(consultationx.getdate())); } 
    return result; }

  public String getoutcome() { return outcome; }

  public static List getAlloutcome(List consultations)
  { List result = new Vector();
    for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      if (result.contains(consultationx.getoutcome())) { }
      else { result.add(consultationx.getoutcome()); } }
    return result; }

  public static List getAllOrderedoutcome(List consultations)
  { List result = new Vector();
    for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      result.add(consultationx.getoutcome()); } 
    return result; }

  public String getsymptoms() { return symptoms; }

  public static List getAllsymptoms(List consultations)
  { List result = new Vector();
    for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      if (result.contains(consultationx.getsymptoms())) { }
      else { result.add(consultationx.getsymptoms()); } }
    return result; }

  public static List getAllOrderedsymptoms(List consultations)
  { List result = new Vector();
    for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      result.add(consultationx.getsymptoms()); } 
    return result; }

  public Doctor getdoctor() { return doctor; }

  public static List getAlldoctor(List consultations)
  { List result = new Vector();
    for (int _i = 0; _i < consultations.size(); _i++)
    { Consultation consultationx = (Consultation) consultations.get(_i);
      if (result.contains(consultationx.getdoctor())) {}
      else { result.add(consultationx.getdoctor()); }
 }
    return result; }

  public static List getAllOrdereddoctor(List consultations)
  { List result = new Vector();
    for (int _i = 0; _i < consultations.size(); _i++)
    { Consultation consultationx = (Consultation) consultations.get(_i);
      if (result.contains(consultationx.getdoctor())) {}
      else { result.add(consultationx.getdoctor()); }
 }
    return result; }

    public String toString()
  {   String result = "";
 
  result = "Consultation on: " + date + " Symptoms: " + symptoms + " Outcome: " + outcome;
    return result;
  }



}


class Referral
  implements SystemTypes
{
  private int date = 0; // internal
  private String referredTo = ""; // internal
  private Doctor referrer;

  public Referral(Doctor referrer)
  {
    this.date = 0;
    this.referredTo = "";
    this.referrer = referrer;

  }

  public Referral() { }



  public String toString()
  { String _res_ = "(Referral) ";
    _res_ = _res_ + date + ",";
    _res_ = _res_ + referredTo;
    return _res_;
  }

  public void setdate(int date_x) { date = date_x;  }


  public static void setAlldate(List referrals,int val)
{ for (int i = 0; i < referrals.size(); i++)
    { Referral referralx = (Referral) referrals.get(i);
      Controller.inst().setdate(referralx,val); } }


  public void setreferredTo(String referredTo_x) { referredTo = referredTo_x;  }


  public static void setAllreferredTo(List referrals,String val)
{ for (int i = 0; i < referrals.size(); i++)
    { Referral referralx = (Referral) referrals.get(i);
      Controller.inst().setreferredTo(referralx,val); } }


  public void setreferrer(Doctor referrerxx) { referrer = referrerxx;
  }

  public static void setAllreferrer(List referrals,Doctor _val)
  { for (int _i = 0; _i < referrals.size(); _i++)
    { Referral referralx = (Referral) referrals.get(_i);
      Controller.inst().setreferrer(referralx, _val); } }

  public int getdate() { return date; }

  public static List getAlldate(List referrals)
  { List result = new Vector();
    for (int i = 0; i < referrals.size(); i++)
    { Referral referralx = (Referral) referrals.get(i);
      if (result.contains(new Integer(referralx.getdate()))) { }
      else { result.add(new Integer(referralx.getdate())); } }
    return result; }

  public static List getAllOrdereddate(List referrals)
  { List result = new Vector();
    for (int i = 0; i < referrals.size(); i++)
    { Referral referralx = (Referral) referrals.get(i);
      result.add(new Integer(referralx.getdate())); } 
    return result; }

  public String getreferredTo() { return referredTo; }

  public static List getAllreferredTo(List referrals)
  { List result = new Vector();
    for (int i = 0; i < referrals.size(); i++)
    { Referral referralx = (Referral) referrals.get(i);
      if (result.contains(referralx.getreferredTo())) { }
      else { result.add(referralx.getreferredTo()); } }
    return result; }

  public static List getAllOrderedreferredTo(List referrals)
  { List result = new Vector();
    for (int i = 0; i < referrals.size(); i++)
    { Referral referralx = (Referral) referrals.get(i);
      result.add(referralx.getreferredTo()); } 
    return result; }

  public Doctor getreferrer() { return referrer; }

  public static List getAllreferrer(List referrals)
  { List result = new Vector();
    for (int _i = 0; _i < referrals.size(); _i++)
    { Referral referralx = (Referral) referrals.get(_i);
      if (result.contains(referralx.getreferrer())) {}
      else { result.add(referralx.getreferrer()); }
 }
    return result; }

  public static List getAllOrderedreferrer(List referrals)
  { List result = new Vector();
    for (int _i = 0; _i < referrals.size(); _i++)
    { Referral referralx = (Referral) referrals.get(_i);
      if (result.contains(referralx.getreferrer())) {}
      else { result.add(referralx.getreferrer()); }
 }
    return result; }


}



public class Controller implements SystemTypes, ControllerInterface
{
  Vector patientgps = new Vector();
  Map patientgpIdindex = new HashMap(); // String --> PatientGP

  Vector doctors = new Vector();
  Map doctorstaffNumberindex = new HashMap(); // String --> Doctor

  Vector consultations = new Vector();
  Vector referrals = new Vector();
  private static Controller uniqueInstance; 


  private Controller() { } 


  public static Controller inst() 
    { if (uniqueInstance == null) 
    { uniqueInstance = new Controller(); }
    return uniqueInstance; } 


  public static void loadModel(String file)
  {
    try
    { BufferedReader br = null;
      File f = new File(file);
      try 
      { br = new BufferedReader(new FileReader(f)); }
      catch (Exception ex) 
      { System.err.println("No file: " + file); return; }
      Class cont = Class.forName("Controller");
      java.util.Map objectmap = new java.util.HashMap();
      while (true)
      { String line1;
        try { line1 = br.readLine(); }
        catch (Exception e)
        { return; }
        if (line1 == null)
        { return; }
        line1 = line1.trim();

        if (line1.length() == 0) { continue; }
        String left;
        String op;
        String right;
        if (line1.charAt(line1.length() - 1) == '"')
        { int eqind = line1.indexOf("="); 
          if (eqind == -1) { continue; }
          else 
          { left = line1.substring(0,eqind-1).trim();
            op = "="; 
            right = line1.substring(eqind+1,line1.length()).trim();
          }
        }
        else
        { StringTokenizer st1 = new StringTokenizer(line1);
          Vector vals1 = new Vector();
          while (st1.hasMoreTokens())
          { String val1 = st1.nextToken();
            vals1.add(val1);
          }
          if (vals1.size() < 3)
          { continue; }
          left = (String) vals1.get(0);
          op = (String) vals1.get(1);
          right = (String) vals1.get(2);
        }
        if (":".equals(op))
        { int i2 = right.indexOf(".");
          if (i2 == -1)
          { Class cl;
            try { cl = Class.forName("" + right); }
            catch (Exception _x) { System.err.println("No entity: " + right); continue; }
            Object xinst = cl.newInstance();
            objectmap.put(left,xinst);
            Class[] cargs = new Class[] { cl };
            Method addC = cont.getMethod("add" + right,cargs);
            if (addC == null) { continue; }
            Object[] args = new Object[] { xinst };
            addC.invoke(Controller.inst(),args);
          }
          else
          { String obj = right.substring(0,i2);
            String role = right.substring(i2+1,right.length());
            Object objinst = objectmap.get(obj); 
            if (objinst == null) 
            { continue; }
            Object val = objectmap.get(left);
            if (val == null) 
            { continue; }
            Class objC = objinst.getClass();
            Class typeclass = val.getClass(); 
            Object[] args = new Object[] { val }; 
            Class[] settypes = new Class[] { typeclass };
            Method addrole = Controller.findMethod(objC,"add" + role);
            if (addrole != null) 
            { addrole.invoke(objinst, args); }
            else { System.err.println("Error: cannot add to " + role); }
          }
        }
        else if ("=".equals(op))
        { int i1 = left.indexOf(".");
          if (i1 == -1) 
          { continue; }
          String obj = left.substring(0,i1);
          String att = left.substring(i1+1,left.length());
          Object objinst = objectmap.get(obj); 
          if (objinst == null) 
          { continue; }
          Class objC = objinst.getClass();
          Class typeclass; 
          Object val; 
          if (right.charAt(0) == '"' &&
              right.charAt(right.length() - 1) == '"')
          { typeclass = String.class;
            val = right.substring(1,right.length() - 1);
          } 
          else if ("true".equals(right) || "false".equals(right))
          { typeclass = boolean.class;
            if ("true".equals(right))
            { val = new Boolean(true); }
            else
            { val = new Boolean(false); }
          }
          else 
          { val = objectmap.get(right);
            if (val != null)
            { typeclass = val.getClass(); }
            else 
            { int i;
              double d;
              try 
              { i = Integer.parseInt(right);
                typeclass = int.class;
                val = new Integer(i); 
              }
              catch (Exception ee)
              { try
                { d = Double.parseDouble(right);
                  typeclass = double.class;
                  val = new Double(d);
                }
                catch (Exception ff)
                { continue; }
              }
            }
          }
          Object[] args = new Object[] { val }; 
          Class[] settypes = new Class[] { typeclass };
          Method setatt = Controller.findMethod(objC,"set" + att);
          if (setatt != null) 
          { setatt.invoke(objinst, args); }
          else { System.err.println("No attribute: " + att); }
        }
      }
    } catch (Exception e) { }
  }

  public static Method findMethod(Class c, String name)
  { Method[] mets = c.getMethods(); 
    for (int i = 0; i < mets.length; i++)
    { Method m = mets[i];
      if (m.getName().equals(name))
      { return m; }
    } 
    return null;
  }


  public void checkCompleteness()
  {   for (int _i = 0; _i < patientgps.size(); _i++)
  { PatientGP patientgp_x = (PatientGP) patientgps.get(_i);
    PatientGP patientgp_obj = (PatientGP) patientgpIdindex.get(patientgp_x.getId());
    if (patientgp_obj == patientgp_x) { }
    else if (patientgp_obj == null)
    { patientgpIdindex.put(patientgp_x.getId(),patientgp_x); }
    else
    { System.out.println("Error: multiple objects with id1 = " + patientgp_x.getId()); }
  }
  for (int _i = 0; _i < doctors.size(); _i++)
  { Doctor doctor_x = (Doctor) doctors.get(_i);
    Doctor doctor_obj = (Doctor) doctorstaffNumberindex.get(doctor_x.getstaffNumber());
    if (doctor_obj == doctor_x) { }
    else if (doctor_obj == null)
    { doctorstaffNumberindex.put(doctor_x.getstaffNumber(),doctor_x); }
    else
    { System.out.println("Error: multiple objects with id1 = " + doctor_x.getstaffNumber()); }
  }
  }


  public void saveModel(String file)
  { File outfile = new File(file); 
    PrintWriter out; 
    try { out = new PrintWriter(new BufferedWriter(new FileWriter(outfile))); }
    catch (Exception e) { return; } 
  for (int _i = 0; _i < patientgps.size(); _i++)
  { PatientGP patientgpx_ = (PatientGP) patientgps.get(_i);
    out.println("patientgpx_" + _i + " : PatientGP");
    out.println("patientgpx_" + _i + ".Id = \"" + patientgpx_.getId() + "\"");
    out.println("patientgpx_" + _i + ".nhsNumber = \"" + patientgpx_.getnhsNumber() + "\"");
    out.println("patientgpx_" + _i + ".name1 = \"" + patientgpx_.getname1() + "\"");
    out.println("patientgpx_" + _i + ".name2 = \"" + patientgpx_.getname2() + "\"");
    out.println("patientgpx_" + _i + ".dob = " + patientgpx_.getdob());
    out.println("patientgpx_" + _i + ".addr1 = \"" + patientgpx_.getaddr1() + "\"");
    out.println("patientgpx_" + _i + ".addr2 = \"" + patientgpx_.getaddr2() + "\"");
    out.println("patientgpx_" + _i + ".postcode = \"" + patientgpx_.getpostcode() + "\"");
    out.println("patientgpx_" + _i + ".isMale = " + patientgpx_.getisMale());
  }

  for (int _i = 0; _i < doctors.size(); _i++)
  { Doctor doctorx_ = (Doctor) doctors.get(_i);
    out.println("doctorx_" + _i + " : Doctor");
    out.println("doctorx_" + _i + ".name1 = \"" + doctorx_.getname1() + "\"");
    out.println("doctorx_" + _i + ".name2 = \"" + doctorx_.getname2() + "\"");
    out.println("doctorx_" + _i + ".surgery = \"" + doctorx_.getsurgery() + "\"");
    out.println("doctorx_" + _i + ".staffNumber = \"" + doctorx_.getstaffNumber() + "\"");
  }

  for (int _i = 0; _i < consultations.size(); _i++)
  { Consultation consultationx_ = (Consultation) consultations.get(_i);
    out.println("consultationx_" + _i + " : Consultation");
    out.println("consultationx_" + _i + ".date = " + consultationx_.getdate());
    out.println("consultationx_" + _i + ".outcome = \"" + consultationx_.getoutcome() + "\"");
    out.println("consultationx_" + _i + ".symptoms = \"" + consultationx_.getsymptoms() + "\"");
  }

  for (int _i = 0; _i < referrals.size(); _i++)
  { Referral referralx_ = (Referral) referrals.get(_i);
    out.println("referralx_" + _i + " : Referral");
    out.println("referralx_" + _i + ".date = " + referralx_.getdate());
    out.println("referralx_" + _i + ".referredTo = \"" + referralx_.getreferredTo() + "\"");
  }

  for (int _i = 0; _i < patientgps.size(); _i++)
  { PatientGP patientgpx_ = (PatientGP) patientgps.get(_i);
    List patientgp_registeredWith_Doctor = patientgpx_.getregisteredWith();
    for (int _j = 0; _j < patientgp_registeredWith_Doctor.size(); _j++)
    { out.println("doctorx_" + doctors.indexOf(patientgp_registeredWith_Doctor.get(_j)) + " : patientgpx_" + _i + ".registeredWith");
    }
    List patientgp_consultations_Consultation = patientgpx_.getconsultations();
    for (int _j = 0; _j < patientgp_consultations_Consultation.size(); _j++)
    { out.println("consultationx_" + consultations.indexOf(patientgp_consultations_Consultation.get(_j)) + " : patientgpx_" + _i + ".consultations");
    }
    List patientgp_referrals_Referral = patientgpx_.getreferrals();
    for (int _j = 0; _j < patientgp_referrals_Referral.size(); _j++)
    { out.println("referralx_" + referrals.indexOf(patientgp_referrals_Referral.get(_j)) + " : patientgpx_" + _i + ".referrals");
    }
  }
  for (int _i = 0; _i < consultations.size(); _i++)
  { Consultation consultationx_ = (Consultation) consultations.get(_i);
    out.println("consultationx_" + _i + ".doctor = doctorx_" + doctors.indexOf(((Consultation) consultations.get(_i)).getdoctor()));
  }
  for (int _i = 0; _i < referrals.size(); _i++)
  { Referral referralx_ = (Referral) referrals.get(_i);
    out.println("referralx_" + _i + ".referrer = doctorx_" + doctors.indexOf(((Referral) referrals.get(_i)).getreferrer()));
  }
    out.close(); 
  }


  public void saveXSI(String file)
  { File outfile = new File(file); 
    PrintWriter out; 
    try { out = new PrintWriter(new BufferedWriter(new FileWriter(outfile))); }
    catch (Exception e) { return; } 
    out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    out.println("<My:model xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\">");
    for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx_ = (PatientGP) patientgps.get(_i);
       out.print("<patientgps xsi:type=\"My:PatientGP\"");
    out.print(" Id=\"" + patientgpx_.getId() + "\" ");
    out.print(" nhsNumber=\"" + patientgpx_.getnhsNumber() + "\" ");
    out.print(" name1=\"" + patientgpx_.getname1() + "\" ");
    out.print(" name2=\"" + patientgpx_.getname2() + "\" ");
    out.print(" dob=\"" + patientgpx_.getdob() + "\" ");
    out.print(" addr1=\"" + patientgpx_.getaddr1() + "\" ");
    out.print(" addr2=\"" + patientgpx_.getaddr2() + "\" ");
    out.print(" postcode=\"" + patientgpx_.getpostcode() + "\" ");
    out.print(" isMale=\"" + patientgpx_.getisMale() + "\" ");
    out.print(" registeredWith = \"");
    List patientgp_registeredWith = patientgpx_.getregisteredWith();
    for (int _j = 0; _j < patientgp_registeredWith.size(); _j++)
    { out.print(" //@doctors." + doctors.indexOf(patientgp_registeredWith.get(_j)));
    }
    out.print("\"");
    out.print(" consultations = \"");
    List patientgp_consultations = patientgpx_.getconsultations();
    for (int _j = 0; _j < patientgp_consultations.size(); _j++)
    { out.print(" //@consultations." + consultations.indexOf(patientgp_consultations.get(_j)));
    }
    out.print("\"");
    out.print(" referrals = \"");
    List patientgp_referrals = patientgpx_.getreferrals();
    for (int _j = 0; _j < patientgp_referrals.size(); _j++)
    { out.print(" //@referrals." + referrals.indexOf(patientgp_referrals.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < doctors.size(); _i++)
    { Doctor doctorx_ = (Doctor) doctors.get(_i);
       out.print("<doctors xsi:type=\"My:Doctor\"");
    out.print(" name1=\"" + doctorx_.getname1() + "\" ");
    out.print(" name2=\"" + doctorx_.getname2() + "\" ");
    out.print(" surgery=\"" + doctorx_.getsurgery() + "\" ");
    out.print(" staffNumber=\"" + doctorx_.getstaffNumber() + "\" ");
    out.println(" />");
  }

    for (int _i = 0; _i < consultations.size(); _i++)
    { Consultation consultationx_ = (Consultation) consultations.get(_i);
       out.print("<consultations xsi:type=\"My:Consultation\"");
    out.print(" date=\"" + consultationx_.getdate() + "\" ");
    out.print(" outcome=\"" + consultationx_.getoutcome() + "\" ");
    out.print(" symptoms=\"" + consultationx_.getsymptoms() + "\" ");
    out.print(" doctor=\"");
    out.print("//@doctors." + doctors.indexOf(((Consultation) consultations.get(_i)).getdoctor()));
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < referrals.size(); _i++)
    { Referral referralx_ = (Referral) referrals.get(_i);
       out.print("<referrals xsi:type=\"My:Referral\"");
    out.print(" date=\"" + referralx_.getdate() + "\" ");
    out.print(" referredTo=\"" + referralx_.getreferredTo() + "\" ");
    out.print(" referrer=\"");
    out.print("//@doctors." + doctors.indexOf(((Referral) referrals.get(_i)).getreferrer()));
    out.print("\"");
    out.println(" />");
  }

    out.println("</My:model>");
    out.close(); 
  }



  public void addPatientGP(PatientGP oo) { patientgps.add(oo); }

  public PatientGP getPatientGPByPK(String Idx)
  {  return (PatientGP) patientgpIdindex.get(Idx); }

  public List getPatientGPByPK(List Idx)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < Idx.size(); _i++)
    { PatientGP patientgpx = getPatientGPByPK((String) Idx.get(_i));
      if (patientgpx != null) { res.add(patientgpx); }
    }
    return res; 
  }

  public void addDoctor(Doctor oo) { doctors.add(oo); }

  public Doctor getDoctorByPK(String staffNumberx)
  {  return (Doctor) doctorstaffNumberindex.get(staffNumberx); }

  public List getDoctorByPK(List staffNumberx)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < staffNumberx.size(); _i++)
    { Doctor doctorx = getDoctorByPK((String) staffNumberx.get(_i));
      if (doctorx != null) { res.add(doctorx); }
    }
    return res; 
  }

  public void addConsultation(Consultation oo) { consultations.add(oo); }

  public void addReferral(Referral oo) { referrals.add(oo); }



  public void createAllPatientGP(List patientgpx)
  { for (int i = 0; i < patientgpx.size(); i++)
    { PatientGP patientgpx_x = (PatientGP) patientgpx.get(i);
      if (patientgpx_x == null) { patientgpx_x = new PatientGP(); }
      patientgpx.set(i,patientgpx_x);
      addPatientGP(patientgpx_x);
    }
  }


  public PatientGP createPatientGP(String Idx)
  { 
    if (patientgpIdindex.get(Idx) != null) { return null; }
    PatientGP patientgpx = new PatientGP();
    addPatientGP(patientgpx);
    setId(patientgpx,Idx);
    setnhsNumber(patientgpx,"");
    setname1(patientgpx,"");
    setname2(patientgpx,"");
    setdob(patientgpx,0);
    setaddr1(patientgpx,"");
    setaddr2(patientgpx,"");
    setpostcode(patientgpx,"");
    setisMale(patientgpx,false);
    setregisteredWith(patientgpx,new Vector());
    setconsultations(patientgpx,new Vector());
    setreferrals(patientgpx,new Vector());
    patientgpIdindex.put(Idx,patientgpx);

    return patientgpx;
  }

  public void createAllDoctor(List doctorx)
  { for (int i = 0; i < doctorx.size(); i++)
    { Doctor doctorx_x = (Doctor) doctorx.get(i);
      if (doctorx_x == null) { doctorx_x = new Doctor(); }
      doctorx.set(i,doctorx_x);
      addDoctor(doctorx_x);
    }
  }


  public Doctor createDoctor(String staffNumberx)
  { 
    if (doctorstaffNumberindex.get(staffNumberx) != null) { return null; }
    Doctor doctorx = new Doctor();
    addDoctor(doctorx);
    setname1(doctorx,"");
    setname2(doctorx,"");
    setsurgery(doctorx,"");
    setstaffNumber(doctorx,staffNumberx);
    doctorstaffNumberindex.put(staffNumberx,doctorx);

    return doctorx;
  }

  public void createAllConsultation(List consultationx)
  { for (int i = 0; i < consultationx.size(); i++)
    { Consultation consultationx_x = (Consultation) consultationx.get(i);
      if (consultationx_x == null) { consultationx_x = new Consultation(); }
      consultationx.set(i,consultationx_x);
      addConsultation(consultationx_x);
    }
  }


  public Consultation createConsultation(Doctor doctorx)
  { 
    Consultation consultationx = new Consultation(doctorx);
    addConsultation(consultationx);
    setdate(consultationx,0);
    setoutcome(consultationx,"");
    setsymptoms(consultationx,"");
    setdoctor(consultationx,doctorx);

    return consultationx;
  }

  public void createAllReferral(List referralx)
  { for (int i = 0; i < referralx.size(); i++)
    { Referral referralx_x = (Referral) referralx.get(i);
      if (referralx_x == null) { referralx_x = new Referral(); }
      referralx.set(i,referralx_x);
      addReferral(referralx_x);
    }
  }


  public Referral createReferral(Doctor referrerx)
  { 
    Referral referralx = new Referral(referrerx);
    addReferral(referralx);
    setdate(referralx,0);
    setreferredTo(referralx,"");
    setreferrer(referralx,referrerx);

    return referralx;
  }


public void setId(PatientGP patientgpx, String Id_x) 
  { if (patientgpIdindex.get(Id_x) != null) { return; }
  patientgpIdindex.remove(patientgpx.getId());
  patientgpx.setId(Id_x);
  patientgpIdindex.put(Id_x,patientgpx);
    }


public void setnhsNumber(PatientGP patientgpx, String nhsNumber_x) 
  { patientgpx.setnhsNumber(nhsNumber_x);
    }


public void setname1(PatientGP patientgpx, String name1_x) 
  { patientgpx.setname1(name1_x);
    }


public void setname2(PatientGP patientgpx, String name2_x) 
  { patientgpx.setname2(name2_x);
    }


public void setdob(PatientGP patientgpx, int dob_x) 
  { patientgpx.setdob(dob_x);
    }


public void setaddr1(PatientGP patientgpx, String addr1_x) 
  { patientgpx.setaddr1(addr1_x);
    }


public void setaddr2(PatientGP patientgpx, String addr2_x) 
  { patientgpx.setaddr2(addr2_x);
    }


public void setpostcode(PatientGP patientgpx, String postcode_x) 
  { patientgpx.setpostcode(postcode_x);
    }


public void setisMale(PatientGP patientgpx, boolean isMale_x) 
  { patientgpx.setisMale(isMale_x);
    }


  public void setregisteredWith(PatientGP patientgpx, List registeredWithxx) 
  {     patientgpx.setregisteredWith(registeredWithxx);
      }


  public void addregisteredWith(PatientGP patientgpx, Doctor registeredWithxx) 
  { if (patientgpx.getregisteredWith().contains(registeredWithxx)) { return; }
      patientgpx.addregisteredWith(registeredWithxx);
    }


  public void removeregisteredWith(PatientGP patientgpx, Doctor registeredWithxx) 
  { patientgpx.removeregisteredWith(registeredWithxx);
    }


 public void unionregisteredWith(PatientGP patientgpx,List registeredWithx)
  { for (int _i = 0; _i < registeredWithx.size(); _i++)
    { Doctor doctorxregisteredWith = (Doctor) registeredWithx.get(_i);
      addregisteredWith(patientgpx,doctorxregisteredWith);
     } } 


 public void subtractregisteredWith(PatientGP patientgpx,List registeredWithx)
  { for (int _i = 0; _i < registeredWithx.size(); _i++)
    { Doctor doctorxregisteredWith = (Doctor) registeredWithx.get(_i);
      removeregisteredWith(patientgpx,doctorxregisteredWith);
     } } 


  public void setconsultations(PatientGP patientgpx, List consultationsxx) 
  {   List _oldconsultationsxx = patientgpx.getconsultations();
  for (int _i = 0; _i < consultationsxx.size(); _i++)
  { Consultation _xx = (Consultation) consultationsxx.get(_i);
    if (_oldconsultationsxx.contains(_xx)) { }
    else { PatientGP.removeAllconsultations(patientgps, _xx); }
  }
    patientgpx.setconsultations(consultationsxx);
      }


  public void addconsultations(PatientGP patientgpx, Consultation consultationsxx) 
  { if (patientgpx.getconsultations().contains(consultationsxx)) { return; }
    PatientGP.removeAllconsultations(patientgps,consultationsxx);
    patientgpx.addconsultations(consultationsxx);
    }


  public void removeconsultations(PatientGP patientgpx, Consultation consultationsxx) 
  { patientgpx.removeconsultations(consultationsxx);
    }


 public void unionconsultations(PatientGP patientgpx,List consultationsx)
  { for (int _i = 0; _i < consultationsx.size(); _i++)
    { Consultation consultationxconsultations = (Consultation) consultationsx.get(_i);
      addconsultations(patientgpx,consultationxconsultations);
     } } 


 public void subtractconsultations(PatientGP patientgpx,List consultationsx)
  { for (int _i = 0; _i < consultationsx.size(); _i++)
    { Consultation consultationxconsultations = (Consultation) consultationsx.get(_i);
      removeconsultations(patientgpx,consultationxconsultations);
     } } 


  public void setreferrals(PatientGP patientgpx, List referralsxx) 
  {   List _oldreferralsxx = patientgpx.getreferrals();
  for (int _i = 0; _i < referralsxx.size(); _i++)
  { Referral _xx = (Referral) referralsxx.get(_i);
    if (_oldreferralsxx.contains(_xx)) { }
    else { PatientGP.removeAllreferrals(patientgps, _xx); }
  }
    patientgpx.setreferrals(referralsxx);
      }


  public void addreferrals(PatientGP patientgpx, Referral referralsxx) 
  { if (patientgpx.getreferrals().contains(referralsxx)) { return; }
    PatientGP.removeAllreferrals(patientgps,referralsxx);
    patientgpx.addreferrals(referralsxx);
    }


  public void removereferrals(PatientGP patientgpx, Referral referralsxx) 
  { patientgpx.removereferrals(referralsxx);
    }


 public void unionreferrals(PatientGP patientgpx,List referralsx)
  { for (int _i = 0; _i < referralsx.size(); _i++)
    { Referral referralxreferrals = (Referral) referralsx.get(_i);
      addreferrals(patientgpx,referralxreferrals);
     } } 


 public void subtractreferrals(PatientGP patientgpx,List referralsx)
  { for (int _i = 0; _i < referralsx.size(); _i++)
    { Referral referralxreferrals = (Referral) referralsx.get(_i);
      removereferrals(patientgpx,referralxreferrals);
     } } 


public void setname1(Doctor doctorx, String name1_x) 
  { doctorx.setname1(name1_x);
    }


public void setname2(Doctor doctorx, String name2_x) 
  { doctorx.setname2(name2_x);
    }


public void setsurgery(Doctor doctorx, String surgery_x) 
  { doctorx.setsurgery(surgery_x);
    }


public void setstaffNumber(Doctor doctorx, String staffNumber_x) 
  { if (doctorstaffNumberindex.get(staffNumber_x) != null) { return; }
  doctorstaffNumberindex.remove(doctorx.getstaffNumber());
  doctorx.setstaffNumber(staffNumber_x);
  doctorstaffNumberindex.put(staffNumber_x,doctorx);
    }


public void setdate(Consultation consultationx, int date_x) 
  { consultationx.setdate(date_x);
    }


public void setoutcome(Consultation consultationx, String outcome_x) 
  { consultationx.setoutcome(outcome_x);
    }


public void setsymptoms(Consultation consultationx, String symptoms_x) 
  { consultationx.setsymptoms(symptoms_x);
    }


  public void setdoctor(Consultation consultationx, Doctor doctorxx) 
  {   if (consultationx.getdoctor() == doctorxx) { return; }
    consultationx.setdoctor(doctorxx);
      }


public void setdate(Referral referralx, int date_x) 
  { referralx.setdate(date_x);
    }


public void setreferredTo(Referral referralx, String referredTo_x) 
  { referralx.setreferredTo(referredTo_x);
    }


  public void setreferrer(Referral referralx, Doctor referrerxx) 
  {   if (referralx.getreferrer() == referrerxx) { return; }
    referralx.setreferrer(referrerxx);
      }



  public  List AllPatientGPtoString(List patientgpxs)
  { 
    List result = new Vector();
    for (int i = 0; i < patientgpxs.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgpxs.get(i);
      result.add(patientgpx.toString());
    }
    return result; 
  }

  public void check1(PatientGP patientgpx)
  {   patientgpx.check1();
   }

  public void check2(PatientGP patientgpx)
  {   patientgpx.check2();
   }

  public void check3(PatientGP patientgpx)
  {   patientgpx.check3();
   }

  public void check4(PatientGP patientgpx)
  {   patientgpx.check4();
   }

  public void check5(PatientGP patientgpx)
  {   patientgpx.check5();
   }

  public void check6(PatientGP patientgpx,PatientGP p)
  {   patientgpx.check6(p);
   }

  public void check6outer(PatientGP patientgpx)
  {   patientgpx.check6outer();
   }

  public void displayreferrals1(PatientGP patientgpx,Referral r)
  {   patientgpx.displayreferrals1(r);
   }

  public void displayreferrals1outer(PatientGP patientgpx)
  {   patientgpx.displayreferrals1outer();
   }

  public void displayconsultations1(PatientGP patientgpx,Consultation c)
  {   patientgpx.displayconsultations1(c);
   }

  public void displayconsultations1outer(PatientGP patientgpx)
  {   patientgpx.displayconsultations1outer();
   }

  public  List AllConsultationtoString(List consultationxs)
  { 
    List result = new Vector();
    for (int i = 0; i < consultationxs.size(); i++)
    { Consultation consultationx = (Consultation) consultationxs.get(i);
      result.add(consultationx.toString());
    }
    return result; 
  }



  public void killAllPatientGP(List patientgpxx)
  { for (int _i = 0; _i < patientgpxx.size(); _i++)
    { killPatientGP((PatientGP) patientgpxx.get(_i)); }
  }

  public void killPatientGP(PatientGP patientgpxx)
  { patientgps.remove(patientgpxx);
    patientgpIdindex.remove(patientgpxx.getId());
  }



  public void killAllDoctor(List doctorxx)
  { for (int _i = 0; _i < doctorxx.size(); _i++)
    { killDoctor((Doctor) doctorxx.get(_i)); }
  }

  public void killDoctor(Doctor doctorxx)
  { doctors.remove(doctorxx);
    Vector _1removeddoctorConsultation = new Vector();
    Vector _1removedreferrerReferral = new Vector();
    Vector _1qrangeregisteredWithPatientGP = new Vector();
    _1qrangeregisteredWithPatientGP.addAll(patientgps);
    for (int _i = 0; _i < _1qrangeregisteredWithPatientGP.size(); _i++)
    { PatientGP patientgpx = (PatientGP) _1qrangeregisteredWithPatientGP.get(_i);
      if (patientgpx.getregisteredWith().contains(doctorxx))
      { removeregisteredWith(patientgpx,doctorxx); }
    }
    Vector _1qrangedoctorConsultation = new Vector();
    _1qrangedoctorConsultation.addAll(consultations);
    for (int _i = 0; _i < _1qrangedoctorConsultation.size(); _i++)
    { Consultation consultationx = (Consultation) _1qrangedoctorConsultation.get(_i);
      if (consultationx != null && doctorxx.equals(consultationx.getdoctor()))
      { _1removeddoctorConsultation.add(consultationx);
        consultationx.setdoctor(null);
      }
    }
    Vector _1qrangereferrerReferral = new Vector();
    _1qrangereferrerReferral.addAll(referrals);
    for (int _i = 0; _i < _1qrangereferrerReferral.size(); _i++)
    { Referral referralx = (Referral) _1qrangereferrerReferral.get(_i);
      if (referralx != null && doctorxx.equals(referralx.getreferrer()))
      { _1removedreferrerReferral.add(referralx);
        referralx.setreferrer(null);
      }
    }
    doctorstaffNumberindex.remove(doctorxx.getstaffNumber());
    for (int _i = 0; _i < _1removeddoctorConsultation.size(); _i++)
    { killConsultation((Consultation) _1removeddoctorConsultation.get(_i)); }
    for (int _i = 0; _i < _1removedreferrerReferral.size(); _i++)
    { killReferral((Referral) _1removedreferrerReferral.get(_i)); }
  }



  public void killAllConsultation(List consultationxx)
  { for (int _i = 0; _i < consultationxx.size(); _i++)
    { killConsultation((Consultation) consultationxx.get(_i)); }
  }

  public void killConsultation(Consultation consultationxx)
  { consultations.remove(consultationxx);
    Vector _1qrangeconsultationsPatientGP = new Vector();
    _1qrangeconsultationsPatientGP.addAll(patientgps);
    for (int _i = 0; _i < _1qrangeconsultationsPatientGP.size(); _i++)
    { PatientGP patientgpx = (PatientGP) _1qrangeconsultationsPatientGP.get(_i);
      if (patientgpx.getconsultations().contains(consultationxx))
      { removeconsultations(patientgpx,consultationxx); }
    }
  }



  public void killAllReferral(List referralxx)
  { for (int _i = 0; _i < referralxx.size(); _i++)
    { killReferral((Referral) referralxx.get(_i)); }
  }

  public void killReferral(Referral referralxx)
  { referrals.remove(referralxx);
    Vector _1qrangereferralsPatientGP = new Vector();
    _1qrangereferralsPatientGP.addAll(patientgps);
    for (int _i = 0; _i < _1qrangereferralsPatientGP.size(); _i++)
    { PatientGP patientgpx = (PatientGP) _1qrangereferralsPatientGP.get(_i);
      if (patientgpx.getreferrals().contains(referralxx))
      { removereferrals(patientgpx,referralxx); }
    }
  }




  
    public void check() 
  { 

       List patientgpcheck1x = new Vector();
  patientgpcheck1x.addAll(Controller.inst().patientgps);
  for (int patientgpcheck1x_ind6 = 0; patientgpcheck1x_ind6 < patientgpcheck1x.size(); patientgpcheck1x_ind6++)
  { Controller.inst().check1((PatientGP) patientgpcheck1x.get(patientgpcheck1x_ind6)); }

       List patientgpcheck2x = new Vector();
  patientgpcheck2x.addAll(Controller.inst().patientgps);
  for (int patientgpcheck2x_ind7 = 0; patientgpcheck2x_ind7 < patientgpcheck2x.size(); patientgpcheck2x_ind7++)
  { Controller.inst().check2((PatientGP) patientgpcheck2x.get(patientgpcheck2x_ind7)); }

       List patientgpcheck3x = new Vector();
  patientgpcheck3x.addAll(Controller.inst().patientgps);
  for (int patientgpcheck3x_ind8 = 0; patientgpcheck3x_ind8 < patientgpcheck3x.size(); patientgpcheck3x_ind8++)
  { Controller.inst().check3((PatientGP) patientgpcheck3x.get(patientgpcheck3x_ind8)); }

       List patientgpcheck4x = new Vector();
  patientgpcheck4x.addAll(Controller.inst().patientgps);
  for (int patientgpcheck4x_ind9 = 0; patientgpcheck4x_ind9 < patientgpcheck4x.size(); patientgpcheck4x_ind9++)
  { Controller.inst().check4((PatientGP) patientgpcheck4x.get(patientgpcheck4x_ind9)); }

       List patientgpcheck5x = new Vector();
  patientgpcheck5x.addAll(Controller.inst().patientgps);
  for (int patientgpcheck5x_ind10 = 0; patientgpcheck5x_ind10 < patientgpcheck5x.size(); patientgpcheck5x_ind10++)
  { Controller.inst().check5((PatientGP) patientgpcheck5x.get(patientgpcheck5x_ind10)); }

       List patientgpcheck6outerx = new Vector();
  patientgpcheck6outerx.addAll(Controller.inst().patientgps);
  for (int patientgpcheck6outerx_ind11 = 0; patientgpcheck6outerx_ind11 < patientgpcheck6outerx.size(); patientgpcheck6outerx_ind11++)
  { Controller.inst().check6outer((PatientGP) patientgpcheck6outerx.get(patientgpcheck6outerx_ind11)); }


  }



    public void displayReferrals() 
  { 

       List patientgpdisplayreferrals1outerx = new Vector();
  patientgpdisplayreferrals1outerx.addAll(Controller.inst().patientgps);
  for (int patientgpdisplayreferrals1outerx_ind12 = 0; patientgpdisplayreferrals1outerx_ind12 < patientgpdisplayreferrals1outerx.size(); patientgpdisplayreferrals1outerx_ind12++)
  { Controller.inst().displayreferrals1outer((PatientGP) patientgpdisplayreferrals1outerx.get(patientgpdisplayreferrals1outerx_ind12)); }


  }



    public void displayConsultations() 
  { 

       List patientgpdisplayconsultations1outerx = new Vector();
  patientgpdisplayconsultations1outerx.addAll(Controller.inst().patientgps);
  for (int patientgpdisplayconsultations1outerx_ind13 = 0; patientgpdisplayconsultations1outerx_ind13 < patientgpdisplayconsultations1outerx.size(); patientgpdisplayconsultations1outerx_ind13++)
  { Controller.inst().displayconsultations1outer((PatientGP) patientgpdisplayconsultations1outerx.get(patientgpdisplayconsultations1outerx_ind13)); }


  }


 
}



