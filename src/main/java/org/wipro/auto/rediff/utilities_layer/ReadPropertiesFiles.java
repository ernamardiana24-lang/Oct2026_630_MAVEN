package org.wipro.auto.rediff.utilities_layer;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesFiles 
{
	public static String read_config_prop_file(String key) throws Exception
	{
		FileReader fr = new FileReader ("./testdata/config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.getProperty(key).toString();			
	}

	
	public static String read_element_prop_file(String key) throws Exception
	{
		FileReader fr = new FileReader ("./testdata/element.properties");
		Properties prop = new Properties();
		prop.load(fr);
		String value = prop.getProperty(key);
		
		if (value == null)
		{
			throw new Exception("Property key not found" + key);
		}
		
		return value;
	}
}

