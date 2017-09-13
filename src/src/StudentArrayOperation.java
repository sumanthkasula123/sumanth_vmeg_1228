	import java.util.Date;
	public interface StudentArrayOperation {
	Scanner e=new Scanner(System.in);
	Student[] getStudents();
	int n=e.nextInt();
	int[] id=new array();
	char[] fullname=new array();
	date[] birthdate=new array();
	int[] avgmark=new array();
	for(int i=0;i<n;i++)
	{
		id[i]=e.nextInt();
		fullname[i]=e.nextLine();
		date[i]=e.nextDate();
		avgmark[i]=e.nextInt();
	}
	 int x=Student.length;
	void setStudents(Student[] students);
	x=students;
	  try
		 {
			 if(students==null)
		 }
	 catch(exception e)
	 {
		 System.out.println("IllegalArgumentException"+e);
	 }
	 
	Student getStudent(int index);
	
	int index=Student.student[];
	try
	{
	if(index<0||index>=students)
	}
catch(exception e1)
{
	system.out.println(e1+"IllegalArgumentException");
			
}
	void setStudent(Student student, int index);
	int index=e.nextInt();
	string student=nextLine();
	for(int j=0;i<x;i++)
	{
		if(Student[i]==Student[index])
			Student[i]=student;
	}
	try
	{
	if(index<0||index>=students)
	}
catch(exception e2)
{
	system.out.println(e2+"IllegalArgumentException");
			
}
	void add(Student student, int index);

	string student=e.nextLine();
	for(int k=0;k<x;k++)
	{
		string temp[]=Student[n+1];
		Student[n+1]=Student[n];
		Student[n]=temp[];
	}
	index=x;
	try
	{
	if(index<0)
	}
	catch(exception e3)
	{
	system.out.println(e3+"IllegalArgumentException");
			
	}
	void addFirst(Student student);
	
	 string student=e.nextLine();
	for(int k=0;k<x;k++)
	{
		string temp[]=Student[n+1];
		Student[n+1]=Student[n];
		Student[n]=temp[];
	}
	index=x;
	try
	{
	if(index<0)
	}
	catch(exception e3)
	{
	system.out.println(e3+"IllegalArgumentException");
			
	}
	void addLast(Student student);
	
	string student=e.nextLine();
	 for(int i=0;i<x;i++)
	 {
		 if(stduent(i)==null)
		 {
			 student(n+1)=student;
		 }
		 index=x;
	try
	{
	if(index<0)
	}
	catch(exception e4)
	{
	system.out.println(e4+"IllegalArgumentException");
			
	}
		 
	void remove(int index);
		int index=e.nextInt();
		for(int i=0;i<x;i++)
		{
			if(student[i]==null)
			{
				student[i]=x-1;
			}
			int n=student[i];
		}
		index=n;
		
	{
	if(index<0||index>=x)
	}
	catch(exception e5)
	{
	system.out.println(e5+"IllegalArgumentException");
			
	}
	void remove(Student student);
	
	for(int i=0;i<x;i++)
	{
		Student[0]==null;
	}
	try
	{
	if(student==null)
	}
	catch(exception e6)
	{
	system.out.println(e6+"IllegalArgumentException");
			
	}
	void removeFromIndex(int index);

	int index=nextInt();
	for(int i=0;i<x;i++)
	{
		if(Student[i]==Student[index])
		{
			student[i]==null;
		}
	}
	try
	{
	if(index<0||index>x)
	}
	catch(exception e7)
	{
	system.out.println(e7+"IllegalArgumentException");
			
	}
	void removeFromElement(Student student);
	int index=nextInt();
	for(int i=0;i<x;i++)
	{
		if(Student[i]!=Student[index])
		{
			student[i]==null;
		}
	}
	try
	{
	if(student==null)
	}
	catch(exception e8)
	{
	system.out.println(e8+"IllegalArgumentException");
			
	}
	
	/**
	 * Removes all elements to the specified index (except the element with the
	 * specified index) from this array if index lower than 0 or index
	 * higher/equal students.length method should throw IllegalArgumentException
	 *
	 * @param index
	 *            the index elements to should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void removeToIndex(int index);

	
	/**
	 * Removes all elements to the specified element (except the specified
	 * element) from this array if student == null method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 *            the element to elements should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void removeToElement(Student student);
	

	/**
	 * Performs Bubble Sort to this array
	 *
	 */
	void bubbleSort();

	
	/**
	 * Returns all students with birthday to the specified date if date == null,
	 * method should throw IllegalArgumentException
	 * 
	 * @param date
	 *            the date that specify birthday to find students who was born
	 *            before that date and in that date
	 * 
	 * @return the array of students who was born before/in specified date
	 * 
	 * @throws IllegalArgumentException
	 */
	Student[] getByBirthDate(Date date);

	
	/**
	 * Returns all students with birthday to the specified range of dates
	 * including specified dates if firstDate == null or lastDate == null,
	 * method should throw IllegalArgumentException
	 * 
	 * @param firstDate
	 *            the date that specify birthday to find students from
	 * @param lastDate
	 *            the date that specify birthday to find students to
	 * 
	 * @return the array of students who was born in specified range of dates
	 * 
	 * @throws IllegalArgumentException
	 */
	Student[] getBetweenBirthDates(Date firstDate, Date lastDate);

	
	/**
	 * Returns all students with birthday to the specified date and in several
	 * days after the specified date if date == null, method should throw
	 * IllegalArgumentException
	 * 
	 * @param date
	 *            the date that specify birthday to find students from
	 * @param days
	 *            the number of days that specify the end date
	 * 
	 * @return the array of students who has birthday in specified date and
	 *         several days after
	 * 
	 * @throws IllegalArgumentException
	 */
	Student[] getNearBirthDate(Date date, int days);
	

	/**
	 * Find student at the specified position and calculate his age (total
	 * years) if indexOfStudent == 0, method should throw
	 * IllegalArgumentException
	 * 
	 * @param indexOfStudent
	 *            the index to find student and calculate age
	 * 
	 * @return student full years
	 * 
	 * @throws IllegalArgumentException
	 */
	int getCurrentAgeByDate(int indexOfStudent);

	
	/**
	 * Returns all students with age equal the specified age
	 * 
	 * @param age the age to find students
	 * 
	 * @return the array of students of the specified age
	 */
	Student[] getStudentsByAge(int age);
	

	/**
	 * Finds the maximum average mark for all students in this array
	 * and returns all students who has the maximum average mark
	 * 
	 * @return the array of students who has maximum average mark
	 * 
	 */
	Student[] getStudentsWithMaxAvgMark();

	
	/**
	 * Finds element which is the next to the specified element
	 * if student == null, method should throw IllegalArgumentException
	 * 
	 * @param student the element to which take the next element
	 * 
	 * @throws IllegalArgumentException
	 */
	Student getNextStudent(Student student);

}
