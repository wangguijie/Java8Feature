package com.learn.date;
import java.time.ZonedDateTime;
import java.time.ZoneId;
 
public class TimeLearn {
   public static void main(String args[]){
      TimeLearn java8tester = new TimeLearn();
      java8tester.testZonedDateTime();
   }
    
   public void testZonedDateTime(){
    
      // ��ȡ��ǰʱ������
      ZonedDateTime date1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
      System.out.println("date1: " + date1);
        
      ZoneId id = ZoneId.of("Europe/Paris");
      System.out.println("ZoneId: " + id);
        
      ZoneId currentZone = ZoneId.systemDefault();
      System.out.println("����ʱ��: " + currentZone);
   }
}