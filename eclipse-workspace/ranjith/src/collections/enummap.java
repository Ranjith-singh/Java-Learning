package collections;

import java.util.EnumMap;
import java.util.Map;

class day
{
  String mon,tues,wed;	
}

public class enummap {
	
	enum month
	{
		jan,feb,mar,apr;
	}

//we use the keyword enum because it extends enummap	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<month,Integer> map=new EnumMap<month,Integer>(month.class);
		//Map<day,Integer> map1=new EnumMap<day,Integer>(day.class);
		map.put(month.jan,10);
		map.put(month.feb,20);
		map.put(month.mar,30);
		System.out.println(map);
		Map<month,Character> map1=new EnumMap<month,Character>(month.class);
		map1.put(month.jan,'a');
		map1.put(month.feb,'b');
		System.out.println(map1);
	}
}
