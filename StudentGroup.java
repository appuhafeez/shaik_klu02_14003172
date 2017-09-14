import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
            List<Student> sl=new ArrayList<Student>();
            try {
                for(int i=0;i<students.length;i++){
                   if(students[i]==null) {
                       throw new IllegalArgumentException("Exception input student is null");
                   }else{
                       sl.add(students[i]);
                   }
                }
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: "+e.getMessage());
            }
            this.students=sl.toArray(new Student[sl.size()]);
            
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
            try {
                if(index<0||index>=this.students.length){
                       throw new IllegalArgumentException("Exception input invalid index");
                }
            } catch (Exception e) {
                System.out.println("IllegalArgumentException: "+e.getMessage());
            }
                
		return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
             try {
             
                   if(student==null) {
                       throw new IllegalArgumentException("Exception input student is null");
                   }
                   if(index<0||index>=this.students.length){
                       throw new IllegalArgumentException("Exception input invalid index");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: "+e.getMessage());
            }
                this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
            try {
             
                   if(student==null) {
                       throw new IllegalArgumentException("Exception input student is null");
                   }
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: "+e.getMessage());
            }
            List<Student> sl=new ArrayList<Student>();
            sl.add(student);
            for(int i=0;i<this.students.length;i++)
                sl.add(this.students[i]);
            this.students=sl.toArray(new Student[sl.size()]);
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
                 try {
             
                   if(student==null) {
                       throw new IllegalArgumentException("Exception input student is null");
                   }
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: "+e.getMessage());
            }
            List<Student> sl=new ArrayList<Student>();
            
            for(int i=0;i<this.students.length;i++)
                sl.add(this.students[i]);
            sl.add(student);
            this.students=sl.toArray(new Student[sl.size()]);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
                     try {
             
                   if(student==null) {
                       throw new IllegalArgumentException("Exception input student is null");
                   }
                   if(index<0||index>=this.students.length){
                       throw new IllegalArgumentException("Exception input invalid index");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: "+e.getMessage());
            }
            List<Student> sl=new ArrayList<Student>();
            
            for(int i=0;i<this.students.length;i++){
                if(i==index){
                    sl.add(student);
                }
                sl.add(this.students[i]);
            }
            //sl.add(student);
            this.students=sl.toArray(new Student[sl.size()]);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
            try {
             
                
                   if(index<0||index>=this.students.length){
                       throw new IllegalArgumentException("Exception input invalid index");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: "+e.getMessage());
            }
            List<Student> sl=new ArrayList<Student>();
            
            for(int i=0;i<this.students.length;i++){
                
                sl.add(this.students[i]);
            }
            sl.remove(index);
            this.students=sl.toArray(new Student[sl.size()]);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
            try {
             
                   if(student==null) {
                       throw new IllegalArgumentException("Exception input student is null");
                   }
                   if(Arrays.asList(students).indexOf(student)<0){
                       throw new IllegalArgumentException("Exception input student not found");
                   }
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: "+e.getMessage());
            }
            List<Student> sl=new ArrayList<Student>();
            
            for(int i=0;i<this.students.length;i++){
                sl.add(this.students[i]);
            }
            sl.remove(student);
            //sl.add(student);
            this.students=sl.toArray(new Student[sl.size()]);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
                 try {
             
                
                   if(index<0||index>=this.students.length){
                       throw new IllegalArgumentException("Exception input invalid index");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: "+e.getMessage());
            }
            List<Student> sl=new ArrayList<Student>();
            
            for(int i=0;i<index;i++){
                
                sl.add(this.students[i]);
            }
            
            this.students=sl.toArray(new Student[sl.size()]);
                
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
                    try {
             
                
                   if(student==null) {
                       throw new IllegalArgumentException("Exception input student is null");
                   }
                   if(Arrays.asList(students).indexOf(student)<0){
                       throw new IllegalArgumentException("Exception input student not found");
                   }
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: "+e.getMessage());
            }
            List<Student> sl=new ArrayList<Student>();
            
            for(int i=0;students[i]!=student||i<students.length;i++){
                
                sl.add(this.students[i]);
            }
            
            this.students=sl.toArray(new Student[sl.size()]);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
                try {
             
                
                   if(index<0||index>=this.students.length){
                       throw new IllegalArgumentException("Exception input invalid index");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: "+e.getMessage());
            }
            List<Student> sl=new ArrayList<Student>();
            
            for(int i=index+1;i<students.length;i++){
                
                sl.add(this.students[i]);
            }
            
            this.students=sl.toArray(new Student[sl.size()]);
                
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
                // Add your implementation here
                    try {
             
                
                   if(student==null) {
                       throw new IllegalArgumentException("Exception input student is null");
                   }
                   if(Arrays.asList(students).indexOf(student)<0){
                       throw new IllegalArgumentException("Exception input student not found");
                   }
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: "+e.getMessage());
            }
            List<Student> sl=new ArrayList<Student>();
            
            for(int i=Arrays.asList(students).indexOf(student);i<students.length;i++){
                
                sl.add(this.students[i]);
            }
            
            this.students=sl.toArray(new Student[sl.size()]);
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
                
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
                List<Student> sl=new ArrayList<Student>();
                for(int i=0;i<students.length;i++){
                  //  if(getDiffYears(students[i].getBirthDate(), new Date())){
                        
                    //}
                }
		//return sl.toArray(new Student[sl.size()]);
                return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
                List<Student> sl=new ArrayList<Student>();
                for(int i=0;i<students.length;i++){
                    if(students[i].getAvgMark()==100)
                        sl.add(students[i]);
                }
		return sl.toArray(new Student[sl.size()]);
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
                 try {
             
                
                   if(student==null) {
                       throw new IllegalArgumentException("Exception input student is null");
                   }
                   if(Arrays.asList(students).indexOf(student)<0){
                       throw new IllegalArgumentException("Exception input student not found");
                   }
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: "+e.getMessage());
            }
		return students[Arrays.asList(students).indexOf(student)+1];
	}
        public static int getDiffYears(Date first, Date last) {
                Calendar a = getCalendar(first);
                Calendar b = getCalendar(last);
                int diff = b.get(YEAR) - a.get(YEAR);
                if (a.get(MONTH) > b.get(MONTH) || 
                    (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
                    diff--;
                }
                return diff;
        
        }
            public static Calendar getCalendar(Date date) {
                Calendar cal = Calendar.getInstance(Locale.US);
                cal.setTime(date);
                return cal;
            }
            
}
