import java.lang.*;
import java.io.*;
import java.util.*;
class Main {
  public static void main(String[] args)throws IOException {
    Random r=new Random();
    int days=r.nextInt(6);
    days=(days+24)%6;
    days--;
    int noon=r.nextInt(2);
    noon--;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of faculty");
    int fn=Integer.parseInt(br.readLine());
    faculty[] f=new faculty[fn];
    System.out.println("Please enter the faculty details according to priority from highest to lowest!");
    for(int i=0;i<fn;i++){
      System.out.println("Enter Faculty name");
      String name=br.readLine().trim();
      String[] str=new String[3];
      System.out.println("Enter faculty's first preference");
      str[0]=br.readLine().trim();
      System.out.println("Enter faculty's second preference");
      str[1]=br.readLine().trim();
      System.out.println("Enter faculty's last preference");
      str[2]=br.readLine().trim();
      f[i]=new faculty(name);
      f[i].setPreferences(str);
    }
    // faculty deails acquired...time to get section details
    System.out.println("Enter the number of Subjects");
    int sn=Integer.parseInt(br.readLine());
     System.out.println("Enter the number of Sections");
	int n=Integer.parseInt(br.readLine());
    section s[]=new section[n];
	for(int i=0;i<n;i++)
	s[i]=new section(sn);
    String[] str=new String[sn];
    System.out.println("Enter the names of subjects one after the other");
    for(int i=0;i<sn;i++){
      str[i]=br.readLine();
    }
int x;
for( x=0;x<n;x++)
{
    s[x].setAllSubjects(str);
    System.out.println("Enter the lab names one after the other");
    String[] stri=new String[2];
    for(int ii=0;ii<2;ii++){
      stri[ii]=br.readLine();
    }
    s[x].setAllLabs(stri);
    // subjects details also acquired and now its time to allocate the classes for section "without" referencing the facuty time table
    for(int day=0;day<6;day++){
      String[] ss=new String[6];
      for(int i=0;i<6;i++){
        ss[i]="--";
      }
      String[] subj=s[x].getAllSubjects();
      for(int i=0;i<subj.length;i++){
        if(ss[i].equals("--"))
        ss[i]=subj[(i+day)%subj.length];
      }
      if(day==0){
        s[x].setMonday(ss);
      }
      else if(day==1){
        s[x].setTuesday(ss);
      }
      else if(day==2){
        s[x].setWednesday(ss);
      }
      else if(day==3){
        s[x].setThursday(ss);
      }
      else if(day==4){
        s[x].setFriday(ss);
      }
      else if(day==5){
        s[x].setSaturday(ss);
      }
    }
    if(days==0){
      if(noon==0){
        s[x].mon[0]="Lab1";
        s[x].mon[1]="Lab1";
      }
      else{
        s[x].mon[4]="Lab1";
        s[x].mon[5]="Lab1";
      }
    }
    if(days==1){
      if(noon==0){
        s[x].tue[0]="Lab1";
        s[x].tue[1]="Lab1";
      }
      else{
        s[x].tue[4]="Lab1";
        s[x].tue[5]="Lab1";
      }
    }
    if(days==2){
      if(noon==0){
        s[x].wed[0]="Lab1";
        s[x].wed[1]="Lab1";
      }
      else{
        s[x].wed[4]="Lab1";
        s[x].wed[5]="Lab1";
      }
    }
    if(days==3){
      if(noon==0){
        s[x].thu[0]="Lab1";
        s[x].thu[1]="Lab1";
      }
      else{
        s[x].thu[4]="Lab1";
        s[x].thu[5]="Lab1";
      }
    }
    if(days==4){
      if(noon==0){
        s[x].fri[0]="Lab1";
        s[x].fri[1]="Lab1";
      }
      else{
        s[x].fri[4]="Lab1";
        s[x].fri[5]="Lab1";
      }
    }
    if(days==5){
      if(noon==0){
        s[x].sat[0]="Lab1";
        s[x].sat[1]="Lab1";
      }
      else{
        s[x].sat[4]="Lab1";
        s[x].sat[5]="Lab1";
      }
    }
    //========one lab allocated
    int day1=days,noon1=noon;
    days=(day1+3)%6;
    noon=(noon+4)%2;
    if(days==0){
      if(noon==0){
        s[x].mon[0]="Lab2";
        s[x].mon[1]="Lab2";
      }
      else{
        s[x].mon[4]="Lab2";
        s[x].mon[5]="Lab2";
      }
    }
    if(days==1){
      if(noon==0){
        s[x].tue[0]="Lab2";
        s[x].tue[1]="Lab2";
      }
      else{
        s[x].tue[4]="Lab2";
        s[x].tue[5]="Lab2";
      }
    }
    if(days==2){
      if(noon==0){
        s[x].wed[0]="Lab2";
        s[x].wed[1]="Lab2";
      }
      else{
        s[x].wed[4]="Lab2";
        s[x].wed[5]="Lab2";
      }
    }
    if(days==3){
      if(noon==0){
        s[x].thu[0]="Lab2";
        s[x].thu[1]="Lab2";
      }
      else{
        s[x].thu[4]="Lab2";
        s[x].thu[5]="Lab2";
      }
    }
    if(days==4){
      if(noon==0){
        s[x].fri[0]="Lab2";
        s[x].fri[1]="Lab2";
      }
      else{
        s[x].fri[4]="Lab2";
        s[x].fri[5]="Lab2";
      }
    }
    if(days==5){
      if(noon==0){
        s[x].sat[0]="Lab2";
        s[x].sat[1]="Lab2";
      }
      else{
        s[x].sat[4]="Lab2";
        s[x].sat[5]="Lab2";
      }
    }
    //now changing the lab names accordingly
    for(int i=0;i<6;i++){
      if(s[x].mon[i]=="Lab1"){
        s[x].mon[i]="Lab: "+s[x].lab[0];
      }
      else if(s[x].mon[i]=="Lab2"){
        s[x].mon[i]="Lab: "+s[x].lab[1];
      }
      if(s[x].tue[i]=="Lab1"){
        s[x].tue[i]="Lab: "+s[x].lab[0];
      }
      else if(s[x].tue[i]=="Lab2"){
        s[x].tue[i]="Lab: "+s[x].lab[1];
      }
      if(s[x].wed[i]=="Lab1"){
        s[x].wed[i]="Lab: "+s[x].lab[0];
      }
      else if(s[x].wed[i]=="Lab2"){
        s[x].wed[i]="Lab: "+s[x].lab[1];
      }
      if(s[x].thu[i]=="Lab1"){
        s[x].thu[i]="Lab: "+s[x].lab[0];
      }
      else if(s[x].thu[i]=="Lab2"){
        s[x].thu[i]="Lab: "+s[x].lab[1];
      }
      if(s[x].fri[i]=="Lab1"){
        s[x].fri[i]="Lab: "+s[x].lab[0];
      }
      else if(s[x].fri[i]=="Lab2"){
        s[x].fri[i]="Lab: "+s[x].lab[1];
      }
      if(s[x].sat[i]=="Lab1"){
        s[x].sat[i]="Lab: "+s[x].lab[0];
      }
      else if(s[x].sat[i]=="Lab2"){
        s[x].sat[i]="Lab: "+s[x].lab[1];
      }
    }
    // done making the timetable for a section and the timetable can be viewed by calling the appropriate functions in section class
    for(int day=0;day<6;day++){
      if(day==0){
        String[] mon=s[x].getMonday();
        for(int i=0;i<mon.length;i++){
          String csubj=mon[i];//current subject which we wanna deal with now
          int flag=0;
          for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[0])){
		if(f[j].mon[i].equals("-"))
		{
              //We can assign him the subject and then break the loop
              f[j].mon[i]=csubj;
              flag=1;
              break;
		}
            }
          }
          if(flag==0){
            for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[1])){
              //We can assign him the subject and then break the loop
             if(f[j].mon[i].equals("-")){
	 f[j].mon[i]=csubj;
              flag=1;
              break;}
            }
          }
          }
          if(flag==0){
            for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[2])){
        if(f[j].mon[i].equals("-")){   
	   //We can assign him the subject and then break the loop
              f[j].mon[i]=csubj;
              flag=1;
              break;}
            }
          }
          }
          if(flag==0){
            if(csubj.contains("Lab")){
              s[x].mon[i]="Lab --";
              continue;
            }
            s[x].mon[i]="Free Period";
          }
        }
      }
      else if(day==1){
        String[] tue=s[x].getTuesday();
        for(int i=0;i<tue.length;i++){
          String csubj=tue[i];//current subject which we wanna deal with now
          int flag=0;
          for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[0])){
              //We can assign him the subject and then break the loop
	if(f[j].tue[i].equals("-")) {     
       f[j].tue[i]=csubj;
              flag=1;
              break;}
            }
          }
          if(flag==0){
            for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[1])){
	if(f[j].tue[i].equals("-"))  {
              //We can assign him the subject and then break the loop
              f[j].tue[i]=csubj;
              flag=1;
              break;}
            }
          }
          }
          if(flag==0){
            for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[2])){
		if(f[j].tue[i].equals("-"))  {             
 //We can assign him the subject and then break the loop
              f[j].tue[i]=csubj;
              flag=1;
              break;}
            }
          }
          }
          if(flag==0){
            
            if(csubj.contains("Lab")){
              s[x].tue[i]="Lab --";
              continue;
            }
            s[x].tue[i]="Free Period";
          }
        }
      }
      else if(day==2){
        String[] wed=s[x].getWednesday();
        for(int i=0;i<wed.length;i++){
          String csubj=wed[i];//current subject which we wanna deal with now
          int flag=0;
          for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[0])){
		if(f[j].wed[i].equals("-"))  { 
              //We can assign him the subject and then break the loop
              f[j].wed[i]=csubj;
              flag=1;
              break;}
            }
          }
          if(flag==0){
            for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[1])){
              //We can assign him the subject and then break the loop
        if(f[j].wed[i].equals("-"))   {       
	f[j].wed[i]=csubj;
              flag=1;
              break;}
            }
          }
          }
          if(flag==0){
            for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[2])){
	if(f[j].wed[i].equals("-")) { 
              //We can assign him the subject and then break the loop
              f[j].wed[i]=csubj;
              flag=1;
              break;}
            }
          }
          }
          if(flag==0){
            
            if(csubj.contains("Lab")){
              s[x].wed[i]="Lab --";
              continue;
            }
            s[x].wed[i]="Free Period";
          }
        }
      }
      else if(day==3){
        String[] thu=s[x].getThursday();
        for(int i=0;i<thu.length;i++){
          String csubj=thu[i];//current subject which we wanna deal with now
          int flag=0;
          for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[0])){
        	if(f[j].thu[i].equals("-"))   {       
	//We can assign him the subject and then break the loop
              f[j].thu[i]=csubj;
              flag=1;
              break;}
            }
          }
          if(flag==0){
            for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[1])){
              //We can assign him the subject and then break the loop
        if(f[j].thu[i].equals("-")) {    
	   f[j].thu[i]=csubj;
              flag=1;
              break;}
            }
          }
          }
          if(flag==0){
            for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[2])){
              //We can assign him the subject and then break the loop
       if(f[j].thu[i].equals("-"))  {       
	f[j].thu[i]=csubj;
              flag=1;
              break;}
            }
          }
          }
          if(flag==0){
            
            if(csubj.contains("Lab")){
              s[x].thu[i]="Lab --";
              continue;
            }
            s[x].thu[i]="Free Period";
          }
        }
      }
      else if(day==4){
        String[] fri=s[x].getFriday();
        for(int i=0;i<fri.length;i++){
          String csubj=fri[i];//current subject which we wanna deal with now
          int flag=0;
          for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[0])){
		if(f[j].fri[i].equals("-")) { 
              //We can assign him the subject and then break the loop
              f[j].fri[i]=csubj;
              flag=1;
              break;}
            }
          }
          if(flag==0){
            for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[1])){
		if(f[j].fri[i].equals("-"))  { 
              //We can assign him the subject and then break the loop
              f[j].fri[i]=csubj;
              flag=1;
              break;}
            }
          }
          }
          if(flag==0){
            for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[2])){
		if(f[j].fri[i].equals("-")) { 
              //We can assign him the subject and then break the loop
              f[j].fri[i]=csubj;
              flag=1;
              break;}
            }
          }
          }
          if(flag==0){
            
            if(csubj.contains("Lab")){
              s[x].fri[i]="Lab --";
              continue;
            }
            s[x].fri[i]="Free Period";
          }
        }
      }
      else if(day==5){
        String[] sat=s[x].getSaturday();
        for(int i=0;i<sat.length;i++){
          String csubj=sat[i];//current subject which we wanna deal with now
          int flag=0;
          for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[0])){
		if(f[j].sat[i].equals("-")) { 
              //We can assign him the subject and then break the loop
              f[j].sat[i]=csubj;
              flag=1;
              break;}
            }
          }
          if(flag==0){
            for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[1])){
		if(f[j].sat[i].equals("-"))  { 
              //We can assign him the subject and then break the loop
              f[j].sat[i]=csubj;
              flag=1;
              break;}
            }
          }
          }
          if(flag==0){
            for(int j=0;j<fn;j++){
            if(csubj.contains(f[j].pref[2])){
		if(f[j].sat[i].equals("-"))  { 
              //We can assign him the subject and then break the loop
              f[j].sat[i]=csubj;
              flag=1;
              break;}
            }
          }
          }
          if(flag==0){
            
            if(csubj.contains("Lab")){
              s[x].sat[i]="Lab --";
              continue;
            }
            s[x].sat[i]="Free Period";
          }
        }
      }
    }
    //===faculty timetable created according to the section timetable and section timetable is also modified based on the availability of slots
    for(int i=0;i<fn;i++){
      System.out.println(f[i].name);
      System.out.println("Monday ->"+Arrays.toString(f[i].mon));
      System.out.println("Tuesday ->"+Arrays.toString(f[i].tue));
      System.out.println("Wednesday ->"+Arrays.toString(f[i].wed));
      System.out.println("Thursday ->"+Arrays.toString(f[i].thu));
      System.out.println("Friday ->"+Arrays.toString(f[i].fri));
      System.out.println("Saturday ->"+Arrays.toString(f[i].sat));
    }
    System.out.println("Section TimeTable is as follows");
    System.out.println("Monday ->"+Arrays.toString(s[x].mon));
      System.out.println("Tuesday ->"+Arrays.toString(s[x].tue));
      System.out.println("Wednesday ->"+Arrays.toString(s[x].wed));
      System.out.println("Thursday ->"+Arrays.toString(s[x].thu));
      System.out.println("Friday ->"+Arrays.toString(s[x].fri));
      System.out.println("Saturday ->"+Arrays.toString(s[x].sat));
    //===end of main function===
  }
}
}
