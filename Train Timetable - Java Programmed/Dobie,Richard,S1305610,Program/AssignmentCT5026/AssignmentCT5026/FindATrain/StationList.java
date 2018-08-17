import java.util.ArrayList;
import java.util.Iterator;
/**
 * The TrainList Class contains The Dataset used by the Program aswell as the Searching Algorithm 
 * @author (Richard Dobie) 
 * @version (Version 1 08/05/15)
 */
public class StationList
{
    // instance variables - replace the example below with your own
    private ArrayList<Station> stationList = new ArrayList<Station>();

    /**
     * Constructor for objects of class TrainList
     * This Constructor contains the Dataset used in the Software
     */
    public StationList()
    {
        //your data add comes here
        Station s_01 = new Station("Bristol Temple Meads", 1, 8, 00);
        Station s_02 = new Station("Cardiff", 1, 8, 15);
        Station s_03 = new Station("Dursley", 1, 8, 30);
        Station s_04 = new Station("Edinburgh", 2, 8, 45);
        Station s_05 = new Station("Gloucester", 1, 9, 00);
        Station s_06 = new Station("Liverpool", 2, 9, 15);
        
        Station s_07 = new Station("Bristol Temple Meads", 1, 9, 30);
        Station s_08 = new Station("Cardiff", 1, 9, 45);
        Station s_09 = new Station("Dursley", 1, 10, 00);
        Station s_10 = new Station("Edinburgh", 2, 10, 15);
        Station s_11 = new Station("Gloucester", 1, 10, 30);
        Station s_12 = new Station("Liverpool", 2, 10, 45);
        
        Station s_13 = new Station("Bristol Temple Meads", 1, 11, 00);
        Station s_14 = new Station("Cardiff", 1, 11, 15);
        Station s_15 = new Station("Dursley", 1, 11, 30);
        Station s_16 = new Station("Edinburgh", 2, 11, 45);
        Station s_17 = new Station("Gloucester", 1, 12, 00);
        Station s_18 = new Station("Liverpool", 2, 12, 15);
        
        Station s_19 = new Station("Bristol Temple Meads", 1, 12, 30);
        Station s_20 = new Station("Cardiff", 1, 12, 45);
        Station s_21 = new Station("Dursley", 1, 13, 00);
        Station s_22 = new Station("Edinburgh", 2, 13, 15);
        Station s_23 = new Station("Gloucester", 1, 13, 30);
        Station s_24 = new Station("Liverpool", 2, 13, 45);
        
        Station s_25 = new Station("Bristol Temple Meads", 1, 14, 00);
        Station s_26 = new Station("Cardiff", 1, 14, 15);
        Station s_27 = new Station("Dursley", 1, 14, 30);
        Station s_28 = new Station("Edinburgh", 2, 14, 45);
        Station s_29 = new Station("Gloucester", 1, 15, 00);
        Station s_30 = new Station("Liverpool", 2, 15, 15);
        
        Station s_31 = new Station("Bristol Temple Meads", 1, 15, 30);
        Station s_32 = new Station("Cardiff", 1, 15, 45);
        Station s_33 = new Station("Dursley", 1,16, 00);
        Station s_34 = new Station("Edinburgh", 2, 16, 15);
        Station s_35 = new Station("Gloucester", 1, 16, 30);
        Station s_36 = new Station("Liverpool", 2, 16, 45);
        
        Station s_37 = new Station("Bristol Temple Meads", 1, 17, 00);
        Station s_38 = new Station("Cardiff", 1, 17, 15);
        Station s_39 = new Station("Dursley", 1, 17, 30);
        Station s_40 = new Station("Edinburgh", 2, 17, 45);
        Station s_41 = new Station("Gloucester", 1, 18, 00);
        Station s_42 = new Station("Liverpool", 2, 18, 15);
        
        Station s_43 = new Station("Bristol Temple Meads", 1, 18, 30);
        Station s_44 = new Station("Cardiff", 1, 18, 45);
        Station s_45 = new Station("Dursley", 1, 19, 00);
        Station s_46 = new Station("Edinburgh", 2, 19, 15);
        Station s_47 = new Station("Gloucester", 1, 19, 30);
        Station s_48 = new Station("Liverpool", 2, 19, 45);
        
        Station s_49 = new Station("Bristol Temple Meads", 1, 20, 00);
        Station s_50 = new Station("Cardiff", 1, 20, 15);
        Station s_51 = new Station("Dursley", 1, 20, 30);
        Station s_52 = new Station("Edinburgh", 2, 20, 45);
        Station s_53 = new Station("Gloucester", 1, 21, 00);
        Station s_54 = new Station("Liverpool", 2, 21, 15);
        
        Station s_55 = new Station("Bristol Temple Meads", 1, 21, 30);
        Station s_56 = new Station("Cardiff", 1, 21, 45);
        Station s_57 = new Station("Dursley", 1, 22, 00);
        Station s_58 = new Station("Edinburgh", 2, 22, 15);
        Station s_59 = new Station("Gloucester", 1, 22, 30);
        Station s_60 = new Station("Liverpool", 2, 22, 45);
        
        stationList.add(s_01);
        stationList.add(s_02);
        stationList.add(s_03);
        stationList.add(s_04);
        stationList.add(s_05);
        stationList.add(s_06);
        stationList.add(s_07);
        stationList.add(s_08);
        stationList.add(s_09);
        stationList.add(s_10);
        stationList.add(s_11);
        stationList.add(s_12);
        stationList.add(s_13);
        stationList.add(s_14);
        stationList.add(s_15);
        stationList.add(s_16);
        stationList.add(s_17);
        stationList.add(s_18);
        stationList.add(s_19);
        stationList.add(s_20);
        stationList.add(s_21);
        stationList.add(s_22);
        stationList.add(s_23);
        stationList.add(s_24);
        stationList.add(s_25);
        stationList.add(s_26);
        stationList.add(s_27);
        stationList.add(s_28);
        stationList.add(s_29);
        stationList.add(s_30);
        stationList.add(s_31);
        stationList.add(s_32);
        stationList.add(s_33);
        stationList.add(s_34);
        stationList.add(s_35);
        stationList.add(s_36);
        stationList.add(s_37);
        stationList.add(s_39);
        stationList.add(s_40);
        stationList.add(s_41);
        stationList.add(s_42);
        stationList.add(s_43);
        stationList.add(s_44);
        stationList.add(s_45);
        stationList.add(s_46);
        stationList.add(s_47);
        stationList.add(s_48);
        stationList.add(s_49);
        stationList.add(s_50);
        stationList.add(s_51);
        stationList.add(s_52);
        stationList.add(s_53);
        stationList.add(s_54);
        stationList.add(s_55);
        stationList.add(s_56);
        stationList.add(s_57);
        stationList.add(s_58);
        stationList.add(s_59);
        stationList.add(s_60);


        
    }
    
    /**
     * Constructor for Searching Algorithm
     * This Constructor contains the Searching Algorithm used to return results to users Searches
     */

    public ArrayList<Station> searchTrainTimes ( String stationName,int deparH, String befAft) {
      ArrayList<Station> result = new ArrayList<>();
        
      Station station;
      String s_name;
      int hh;
      int mm;
      
      AdditionalTestData();
      
      Iterator<Station> iterator = stationList.iterator();
      
      // record start time
      long sTime = System.currentTimeMillis();
      while (iterator.hasNext()) {
 
         station = iterator.next();
         s_name = station.getStationName();
         hh = station.getDepartureHour();
         mm = station.getDepartureMinute();
         
         System.out.println("Searching..........: " + stationName + "----" + deparH);
         
         if( befAft.compareTo( "After" ) == 0) {
            if( s_name.compareTo( stationName ) == 0 &&  hh >= deparH  )
                result.add(station);
         }
         
          if( befAft.compareTo( "Before" ) == 0) {
            if( s_name.compareTo( stationName ) == 0 &&  hh <= deparH)
                result.add(station);
         }
       }
       
       long eTime = System.currentTimeMillis();
       
       long timeNeeded = eTime - sTime;
       System.out.println("Time needed:" + timeNeeded);
       
      return result;  
    }
    public void AdditionalTestData(){
        for (int i = 0; i<1000; i++){
            
            //your data add comes here
        Station s_01 = new Station("Bristol Temple Meads", 1, 8, 00);
        Station s_02 = new Station("Cardiff", 1, 8, 15);
        Station s_03 = new Station("Dursley", 1, 8, 30);
        Station s_04 = new Station("Edinburgh", 2, 8, 45);
        Station s_05 = new Station("Gloucester", 1, 9, 00);
        Station s_06 = new Station("Liverpool", 2, 9, 15);
        
        Station s_07 = new Station("Bristol Temple Meads", 1, 9, 30);
        Station s_08 = new Station("Cardiff", 1, 9, 45);
        Station s_09 = new Station("Dursley", 1, 10, 00);
        Station s_10 = new Station("Edinburgh", 2, 10, 15);
        Station s_11 = new Station("Gloucester", 1, 10, 30);
        Station s_12 = new Station("Liverpool", 2, 10, 45);
        
        Station s_13 = new Station("Bristol Temple Meads", 1, 11, 00);
        Station s_14 = new Station("Cardiff", 1, 11, 15);
        Station s_15 = new Station("Dursley", 1, 11, 30);
        Station s_16 = new Station("Edinburgh", 2, 11, 45);
        Station s_17 = new Station("Gloucester", 1, 12, 00);
        Station s_18 = new Station("Liverpool", 2, 12, 15);
        
        Station s_19 = new Station("Bristol Temple Meads", 1, 12, 30);
        Station s_20 = new Station("Cardiff", 1, 12, 45);
        Station s_21 = new Station("Dursley", 1, 13, 00);
        Station s_22 = new Station("Edinburgh", 2, 13, 15);
        Station s_23 = new Station("Gloucester", 1, 13, 30);
        Station s_24 = new Station("Liverpool", 2, 13, 45);
        
        Station s_25 = new Station("Bristol Temple Meads", 1, 14, 00);
        Station s_26 = new Station("Cardiff", 1, 14, 15);
        Station s_27 = new Station("Dursley", 1, 14, 30);
        Station s_28 = new Station("Edinburgh", 2, 14, 45);
        Station s_29 = new Station("Gloucester", 1, 15, 00);
        Station s_30 = new Station("Liverpool", 2, 15, 15);
        
        Station s_31 = new Station("Bristol Temple Meads", 1, 15, 30);
        Station s_32 = new Station("Cardiff", 1, 15, 45);
        Station s_33 = new Station("Dursley", 1,16, 00);
        Station s_34 = new Station("Edinburgh", 2, 16, 15);
        Station s_35 = new Station("Gloucester", 1, 16, 30);
        Station s_36 = new Station("Liverpool", 2, 16, 45);
        
        Station s_37 = new Station("Bristol Temple Meads", 1, 17, 00);
        Station s_38 = new Station("Cardiff", 1, 17, 15);
        Station s_39 = new Station("Dursley", 1, 17, 30);
        Station s_40 = new Station("Edinburgh", 2, 17, 45);
        Station s_41 = new Station("Gloucester", 1, 18, 00);
        Station s_42 = new Station("Liverpool", 2, 18, 15);
        
        Station s_43 = new Station("Bristol Temple Meads", 1, 18, 30);
        Station s_44 = new Station("Cardiff", 1, 18, 45);
        Station s_45 = new Station("Dursley", 1, 19, 00);
        Station s_46 = new Station("Edinburgh", 2, 19, 15);
        Station s_47 = new Station("Gloucester", 1, 19, 30);
        Station s_48 = new Station("Liverpool", 2, 19, 45);
        
        Station s_49 = new Station("Bristol Temple Meads", 1, 20, 00);
        Station s_50 = new Station("Cardiff", 1, 20, 15);
        Station s_51 = new Station("Dursley", 1, 20, 30);
        Station s_52 = new Station("Edinburgh", 2, 20, 45);
        Station s_53 = new Station("Gloucester", 1, 21, 00);
        Station s_54 = new Station("Liverpool", 2, 21, 15);
        
        Station s_55 = new Station("Bristol Temple Meads", 1, 21, 30);
        Station s_56 = new Station("Cardiff", 1, 21, 45);
        Station s_57 = new Station("Dursley", 1, 22, 00);
        Station s_58 = new Station("Edinburgh", 2, 22, 15);
        Station s_59 = new Station("Gloucester", 1, 22, 30);
        Station s_60 = new Station("Liverpool", 2, 22, 45);
        
        stationList.add(s_01);
        stationList.add(s_02);
        stationList.add(s_03);
        stationList.add(s_04);
        stationList.add(s_05);
        stationList.add(s_06);
        stationList.add(s_07);
        stationList.add(s_08);
        stationList.add(s_09);
        stationList.add(s_10);
        stationList.add(s_11);
        stationList.add(s_12);
        stationList.add(s_13);
        stationList.add(s_14);
        stationList.add(s_15);
        stationList.add(s_16);
        stationList.add(s_17);
        stationList.add(s_18);
        stationList.add(s_19);
        stationList.add(s_20);
        stationList.add(s_21);
        stationList.add(s_22);
        stationList.add(s_23);
        stationList.add(s_24);
        stationList.add(s_25);
        stationList.add(s_26);
        stationList.add(s_27);
        stationList.add(s_28);
        stationList.add(s_29);
        stationList.add(s_30);
        stationList.add(s_31);
        stationList.add(s_32);
        stationList.add(s_33);
        stationList.add(s_34);
        stationList.add(s_35);
        stationList.add(s_36);
        stationList.add(s_37);
        stationList.add(s_39);
        stationList.add(s_40);
        stationList.add(s_41);
        stationList.add(s_42);
        stationList.add(s_43);
        stationList.add(s_44);
        stationList.add(s_45);
        stationList.add(s_46);
        stationList.add(s_47);
        stationList.add(s_48);
        stationList.add(s_49);
        stationList.add(s_50);
        stationList.add(s_51);
        stationList.add(s_52);
        stationList.add(s_53);
        stationList.add(s_54);
        stationList.add(s_55);
        stationList.add(s_56);
        stationList.add(s_57);
        stationList.add(s_58);
        stationList.add(s_59);
        stationList.add(s_60);
            
            
        }
}

public void showAllData(){
    Iterator iterator = stationList.iterator();
    String s = "";
    while (iterator.hasNext()){
        Station s_ = (Station)iterator.next();
        System.out.println(s_.toString());

}
}

public void showResult(ArrayList<Station>result){
    Iterator iterator = stationList.iterator();
    String s = "";
    while (iterator.hasNext()){
        Station s_ = (Station)iterator.next();
        System.out.println(s_.toString());

}
}
}