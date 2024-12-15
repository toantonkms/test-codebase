package org.jongo;

import java.util.ArrayList;
import java.util.HashMap;
import org.bson.Document;
import com.mongodb.util.JSON;

public static void main(String[] args) {
  HashMap<String, Object> parameters = new HashMap<>();
  parameters.put("entityId", "1");
  parameters.put("headerDepartment", "1");
  parameters.put("comments", "Test Comments");
  parameters.put("formDate", "01/01/2016");
  parameters.put("lineItems", new ArrayList<HashMap<String, String>>());
  parameters.put("AEX_PROCESS_ID", 1);
  Document document = new Document(parameters);
  String message = document.toJson();
  System.out.println("message " + message);
}
public class Test {

}
