public class Student{
   private String name;
   private FacultyAdvisor facAdvisor;
   
   public Student(){
      this.facAdvisor = new FacultyAdvisor("Nick's Teacher", "IT Department", 33);
   }
   
   public String getName(){
      return this.name;
   }
   
   public boolean setName(String name){
      if(!name.equals("")){
         this.name=name;
         return true;
      }else{
         return false;
      }
   }
  
   public FacultyAdvisor getFacAdvisor(){ return this.facAdvisor; }

   public String toString(){
      return "[" + getClass().getName() + "]"
      + "\nName: " + this.getName()
      + "\n"+this.facAdvisor.toString();
   }
}


   