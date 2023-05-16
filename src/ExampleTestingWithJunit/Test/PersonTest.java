package Test;

import UnitTest.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Before
    public void setUp() throws Exception {
        // connect database
    }

    @After
    public void tearDown() throws Exception {
        //release connection
    }

    @Test
    public void getMySalary() {
        // query database
        int expectedResult = 40000000;
        Person person = new Person();
        int actualResult = person.getMySalary();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getMySalaryWithDayOff(){
        int expectedResult = 38000000;
        Person person = new Person();
        int actualResult = person.getMySalary();
        assertEquals(expectedResult,actualResult);
    }
}