package com.knmodicollege.collegement;

import com.knmodicollege.collegement.dao.CourseDao;
import com.knmodicollege.collegement.dao.impl.CoursesDaoimpl;
import com.knmodicollege.collegement.model.Course;
import com.knmodicollege.collegement.util.DataBaseUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //to create tables if not exists
    	DataBaseUtil.createTables();
    	/*---- Creating course data ---*/
    	Course courseData = new Course("course107","Core Java", "programming in Java", 90, 20, 60);
    	CourseDao cdi = new CoursesDaoimpl();
    	
    	/*--- inserting course into the table -----*/
    	int rows = cdi.save(courseData);
    	if(rows > 0)
    	{
    		System.out.println("Data Inserted");
    	}
    	else
    	{
    		System.out.println("Unable to insert data");
    	}
    }
}
