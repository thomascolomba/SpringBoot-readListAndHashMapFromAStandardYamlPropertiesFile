package readListAndHashMapFromAYamlPropertiesFile.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class MyConfigurationBean {
    private List<String> myList = new ArrayList<String>();
    private HashMap<String, String> myHashMap;
	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public HashMap<String, String> getMyHashMap() {
		return myHashMap;
	}
	public void setMyHashMap(HashMap<String, String> myHashMap) {
		this.myHashMap = myHashMap;
	}
}