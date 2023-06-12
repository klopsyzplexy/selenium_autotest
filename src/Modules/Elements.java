package Modules;

import java.util.HashMap;
import java.util.Map;

public class Elements {
    Map<String, String> repo = new HashMap<>();
    public Elements() {
        //Add Employee
        repo.put("addEmployee", "//*[contains(text(), 'Add')]");
        repo.put("addFirstName", "//input[@name='firstName']");
        repo.put("addMiddleName", "//input[@name='middleName']");
        repo.put("addLastName", "//input[@name='lastName']");
        repo.put("addID", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]//input[1]");
        repo.put("createLogin", "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
        repo.put("addUsername", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]");
        repo.put("addPassword", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[1]//input[1]");
        repo.put("confirmPassword", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[2]//input[1]");
        repo.put("statusEn", "//label[text()='Enabled']");
        repo.put("statusDis", "//label[text()='Disabled']");
        repo.put("addSave", "//button[@type='submit']");
        repo.put("addCancel", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]");
        repo.put("userDropdown", "//span[@class='oxd-userdropdown-tab']");
        repo.put("logout", "//a[contains(text(),'Logout')]");
    }
    public String get(String key){
        return repo.get(key);
    }
}
