import javax.swing.JOptionPane;
   public class ProcessStudent{
      public static void main(String[] args){
         Student student = new Student();
                  
         addStudent(student);
         printStudent(student);
         
      }
      
      private static void addStudent(Student student){
         boolean valid = false;
         
         do{
            valid = student.setName(JOptionPane.showInputDialog("What is your name?"));
            if(!valid){
               JOptionPane.showMessageDialog(null, "Error!");
            }
         }while(!valid);
         
      }
      
      private static void printStudent(Student student){
         
         JOptionPane.showMessageDialog(null, student.toString());
      }
}