package LogicalProgramming;

import java.util.Date;
import java.util.concurrent.TimeUnit;

class Stop_Watch
{
    public static void main(String[] args) throws InterruptedException 
    {
        long Start_Time = new Date().getTime();
 
        TimeUnit.SECONDS.sleep(5);
 
        long End_Time = new Date().getTime();
 
        long timeElapsed = End_Time - Start_Time;
 
        System.out.println("The time Elapsed between Start and Stop is-->: " + timeElapsed);
    }
}
