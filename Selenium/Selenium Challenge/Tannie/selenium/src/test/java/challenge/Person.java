package challenge;

import java.util.HashMap;

public class Person extends HashMap<String,String>{

    public Person(String fName, String lName, String cName, String rName, String adress, String email, String pNumber){
        super();
        this.put("labelFirstName", fName);
        this.put("labelLastName", lName);
        this.put("labelCompanyName", cName);
        this.put("labelRole", rName);
        this.put("labelAddress", adress);
        this.put("labelEmail", email);
        this.put("labelPhone", pNumber);
    }
    
}
