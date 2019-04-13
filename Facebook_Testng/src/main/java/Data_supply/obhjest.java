package Data_supply;

import com.functions.Excel_handling;

public class obhjest {
	
	public static Config_data_supply  getconfig() {
		Config_data_supply config = new Config_data_supply();
		return config;
	}
	
	public static Excel_handling  getcelldata()  {
		Excel_handling getfbdata = new Excel_handling();
		return getfbdata;
	}

}
