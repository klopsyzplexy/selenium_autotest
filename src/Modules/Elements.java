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

        repo.put("listMenuPersonal", "//a[contains(text(),'Personal Details')]");
        repo.put("listMenuContact", "//a[contains(text(),'Contact Details')]");
        repo.put("listMenuEmergency", "//a[contains(text(),'Emergency Contacts')]");
        repo.put("listMenuDependents", "//a[contains(text(),'Dependents')]");
        repo.put("listMenuImmigration", "//a[contains(text(),'Immigration')]");
        repo.put("listMenuJob", "//a[contains(text(),'Job')]");
        repo.put("listMenuSalary", "//a[contains(text(),'Salary')]");
        repo.put("listMenuTax", "//a[contains(text(),'Tax Exemptions')]");
        repo.put("listMenuReport", "//a[contains(text(),'Report-to')]");
        repo.put("listMenuQual", "//a[contains(text(),'Report-to')]");
        repo.put("listMenuMember", "//a[contains(text(),'Memberships')]");

        repo.put("listNick", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]");
        repo.put("otherID", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");
        repo.put("listLicenceNumber", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]");
        repo.put("listExpDate", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]");
        repo.put("ListSSN", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[2]/input[1]");
        repo.put("listSIN", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[3]/div[2]/div[1]/div[2]/input[1]");
        repo.put("listBirth", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
        repo.put("listMale", "//label[text()='Male']");
        repo.put("listFemale", "//label[text()='Female']");
        repo.put("listMilitary", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]");
        repo.put("listSmoker", "//label[text()='Yes']");
        repo.put("listSave1", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/button[1]");
        repo.put("listBloodType", "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");

    }
    public String get(String key){
        return repo.get(key);
    }
}
