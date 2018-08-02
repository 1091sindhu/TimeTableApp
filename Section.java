class section{
  String[] subjects;
  String[] lab;
  String[] mon=new String[6];
  String[] tue=new String[6];
  String[] wed=new String[6];
  String[] thu=new String[6];
  String[] fri=new String[6];
  String[] sat=new String[6];
  public section(int s){
    subjects=new String[s];
    lab=new String[2];
  }
  public void setAllLabs(String str[]){
    for(int i=0;i<2;i++){
      lab[i]=str[i];
    }
  }
  public void setAllSubjects(String str[]){
    for(int i=0;i<str.length;i++){
      subjects[i]=str[i];
    }
  }
  public String[] getAllSubjects(){
    return subjects;
  }
  public String[] getAllLabs(){
    return lab;
  }
  public  String[] getMonday(){
    return mon;
  }
  public  String[] getTuesday(){
    return tue;
  }
  public  String[] getWednesday(){
    return wed;
  }
  public  String[] getThursday(){
    return thu;
  }
  public  String[] getFriday(){
    return fri;
  }
  public  String[] getSaturday(){
    return sat;
  }
  public void setMonday(String s[]){
    for(int i=0;i<s.length;i++){
      mon[i]=s[i];
    }
  }
  public void setTuesday(String s[]){
    for(int i=0;i<s.length;i++){
      tue[i]=s[i];
    }
  }
  public void setWednesday(String s[]){
    for(int i=0;i<s.length;i++){
      wed[i]=s[i];
    }
  }
  public void setThursday(String s[]){
    for(int i=0;i<s.length;i++){
      thu[i]=s[i];
    }
  }
  public void setFriday(String s[]){
    for(int i=0;i<s.length;i++){
      fri[i]=s[i];
    }
  }
  public void setSaturday(String s[]){
    for(int i=0;i<s.length;i++){
      sat[i]=s[i];
    }
  }
  
}
