How to read a list and a hashmap from the standard application.yaml with Spring Boot.<br/>
<br/>
How to compile and execute :<br/>
mvn package<br/>
java -jar ./target/readListAndHashMapFromAYamlPropertiesFile-0.0.1-SNAPSHOT.jar<br/>
<br/>
<br/>
---application.yaml<br/>
myList:<br/>
&nbsp;&nbsp;-&nbsp;qwerty1<br/>
&nbsp;&nbsp;-&nbsp;qwerty2<br/>
<br/>
myHashMap:<br/>
&nbsp;&nbsp;myString1:&nbsp;qwerty3<br/>
&nbsp;&nbsp;myString2:&nbsp;qwerty4<br/>
---MyConfigurationBean.java<br/>
private List&lt;String&gt; myList = new ArrayList&lt;String&gt;();<br/>
private HashMap&lt;String, String&gt; myHashMap;<br/>
+getter and setter<br/>
---The class who displays the value of the application.yaml configuration<br/>
@Autowired<br/>
MyConfigurationBean myConf;<br/>
...<br/>
System.out.println(myConf.getMyList());<br/>
System.out.println(myConf.getMyHashMap());<br/>
<br/>
<br/>
The application will read the list and the hashmap ,yList and myHashMap in the standard application.yaml configuration file then display them in the terminal.<br/>


