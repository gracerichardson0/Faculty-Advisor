public class FacultyAdvisor{
   private String name;
   private String department;
   private int maxNumStudents;
   
   public FacultyAdvisor(){
   
   }
   
   public FacultyAdvisor(String name, String department, int maxNumStudents){
      this.name = name;
      this.department = department;
      this.maxNumStudents = maxNumStudents;
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
   
   public String getDepartment(){
      return this.department;
   }
   
   public boolean setDepartment(String department){
      if(!department.equals("")){
         this.department=department;
         return true;
      }else{
         return false;
      }
   }
   
   
   public int getNumStudents(){
      return this.maxNumStudents;
   }
   
   
   public boolean setNumStudents(){
      if(maxNumStudents < 200){
         this.maxNumStudents = maxNumStudents;
         return true;
      }else{
         return false;
      }
   }
   
   public String toString(){
      String output = "";
      
      output+= "\n[" + getClass().getName() + "]"
               +  "\nName: " + this.getName()
               +  "\nDepartment: " + this.getDepartment()
               +  "\nNumber of Students: " + this.getNumStudents();
               
      return output;
   }
}
