import java.util.*;

public class UC5
{
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int NUM_OF_WORKING_DAYS=20;

	public static void main(String args[])
	{
		int empHrs=0,empWage=0,totalWage=0;

        for(int i=0;i<NUM_OF_WORKING_DAYS;i++)
        {   
            int empCheck=((int)Math.floor(Math.random()+15))%3;
            //System.out.println(empCheck);
            
            switch(empCheck)
            {
                case IS_FULL_TIME:  empHrs=8;
                                    break;	
                case IS_PART_TIME:  empHrs=4;
                                    break;
                        default:    empHrs=0;
            }

            empWage=empHrs*EMP_RATE_PER_HOUR;
            System.out.println("Daily Employee Wage: "+empWage);
            
            totalWage=totalWage+empWage;
        }

        System.out.println("Total Wage: "+totalWage);
	}
}