
/**
 * The Station Class contains the variables relating to Train Timetable Information displayed to the User 
 * @author (Richard Dobie) 
 * @version (Version 01 08/05/15)
 */
public class Station
{
    // instance variables - replace the example below with your own
    private String stationName;
    private int platformNo;
    private int departureHour;
    private int departureMinute;
    
     /**
     * Constructor for objects of class Station
     */
    public Station()
    {
        // initialise instance variables
        this.stationName = "";
        this.platformNo = 0;
        this.departureHour = 0;
        this.departureMinute = 0;
    }

    /**
     * Constructor for objects of class Station
     */
    public Station(String stationName,int platformNo,int departureHour,int departureMinute )
    {
        // initialise instance variables
        this.stationName = stationName;
        this.platformNo = platformNo;
        this.departureHour = departureHour;
        this.departureMinute = departureMinute;
    }

    /**
     * return stationName
     */
    public String getStationName()
    {
        return stationName;   
    }

    /**
     * Set new stationName
     */
    public void setStationName(String stationName)
    {
        this.stationName = stationName;
    }

    /**
     * return platformNo
     */
    public int getPlatformNo()
    {
        return platformNo;   
    }

    /**
     * Set new platformNo
     */
    public void setPlatformNo(int platformNo)
    {
        this.platformNo = platformNo;
    }

    /**
     * return departureHour
     */
    public int getDepartureHour()
    {
        return departureHour;   
    }

    /**
     * Set new departureHour
     */
    public void setDepartureHour(int departureHour)
    {
        this.departureHour = departureHour;
    }

    /**
     * return departureMinute
     */
    public int getDepartureMinute()
    {
        return departureMinute;   
    }

    /**
     * Set new departureMinute
     */
    public void setDepartureMinute(int departureMinute)
    {
        this.departureMinute = departureMinute;
    }

    /**
     *Search Results Displayed in the GUI of possible trains available that match Search Criteria
     */
    public String toString() {
        String result = "<html><br><html>";

        result = result + "Destination:" + stationName + "&nbsp;&nbsp;&nbsp;&nbsp;"  + "Platform number: " + platformNo + "&nbsp;&nbsp;&nbsp;&nbsp;" + "Departure Time: " + departureHour  + "&nbsp;&nbsp;&nbsp;&nbsp;" + departureMinute ;

        return result;
    }

    //constructor and set/get to be added
}
