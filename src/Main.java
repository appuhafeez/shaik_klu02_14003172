
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
                StudentGroup sg=new StudentGroup(0);
                String startDateString = "06/27/2007";
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
                Date startDate=null;
                try {
                    startDate = df.parse(startDateString);
                    String newDateString = df.format(startDate);
                    System.out.println(newDateString);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
               // Student student=new Student(3172, "hafeez", startDate, 20);
                Student student=null;
                sg.addFirst(student);
                Student st[]=sg.getStudents();
                System.out.println("id: "+st[0].getId()+"\nsize: "+st.length);
	}

}
