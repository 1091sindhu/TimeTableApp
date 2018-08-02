class faculty{
  //Here 6 denotes the number of classes per day...i.e., monday there will be 6 classes
  String[] mon=new String[6];
  String[] tue=new String[6];
  String[] wed=new String[6];
  String[] thu=new String[6];
  String[] fri=new String[6];
  String[] sat=new String[6];
  //Faculty preferences are set over here
  String[] pref=new String[3];
  String name="";
  public faculty(String name){
    this.name=name;
    for(int i=0;i<6;i++){
      mon[i]="-";
      tue[i]="-";
      wed[i]="-";
      thu[i]="-";
      fri[i]="-";
      sat[i]="-";
    }
  }
  public void setPreferences(String[] str){
    for(int i=0;i<3;i++){
      pref[i]=str[i];
    }
  }

}
