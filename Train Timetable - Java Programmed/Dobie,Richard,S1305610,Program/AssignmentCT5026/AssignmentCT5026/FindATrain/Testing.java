import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Testing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Testing
{
    // instance variables - replace the example below with your own
    public void testCases01(){
        Station s1= new Station();
        
        s1.setStationName("Liverpool");
        System.out.println("Test Result of set and get Station Name:" + s1.getStationName());
        
        s1.setPlatformNo(1);
        System.out.println("Test Result of set and get Station Name:" + s1.getPlatformNo());
        
        s1.setDepartureHour(10);
        System.out.println("Test Result of set and get Station Name:" + s1.getDepartureHour());
        
        s1.setDepartureHour(10);
        System.out.println("Test Result of set and get Station Name:" + s1.getDepartureHour());
    }
    
    public void testCases2(){
        StationList s2 = new StationList();
        
        s2.showAllData();
        
    }
    
    public void testCases3(){
        StationList s3 = new StationList();
        ArrayList<Station> result;
        System.out.println("Expecting :: Result will be Empty");
        result = s3.searchTrainTimes("Bristol Temple Meads",07,"Before");
        s3.showResult(result);
        System.out.println("Expecting :: Result will be 8");
        result = s3.searchTrainTimes("Bristol Temple Meads", 10, "After");
        s3.showResult(result);
        
    }
    
    public void testCases4(){
        StationList s4 = new StationList();
        ArrayList<Station> result;
        System.out.println("Expecting :: Result will be ");
        result = s4.searchTrainTimes("Liverpool",11,"Before");
        s4.showResult(result);
        //
        
    }
    
    
}
