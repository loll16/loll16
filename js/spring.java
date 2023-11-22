import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FormProcessorApplication {

    public static void main(String[] args) {
        SpringApplication.run(FormProcessorApplication.class, args);
    }
}

@RestController
class FormController {

    @PostMapping("/signup")
    public String processFormData(@RequestBody FormData formData) {
        // Handle the form data here
        System.out.println("Received form data: " + formData);

        // You can save the data to a database using JPA or any other persistence method here
        // For simplicity, we're just printing the data in this example

        return "Form data processed successfully!";
    }
}

class FormData {
    private BasicInfo basicInfo;
    private ContactInfo contactInfo;
    private BirthInfo birthInfo;
    private LoginInfo loginInfo;

    // Getter and setter methods for the above fields

    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public BirthInfo getBirthInfo() {
        return birthInfo;
    }

    public void setBirthInfo(BirthInfo birthInfo) {
        this.birthInfo = birthInfo;
    }

    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }

    @Override
    public String toString() {
        return "FormData{" +
                "basicInfo=" + basicInfo +
                ", contactInfo=" + contactInfo +
                ", birthInfo=" + birthInfo +
                ", loginInfo=" + loginInfo +
                '}';
    }
}

class BasicInfo {
    private String firstName;
    private String lastName;

    // Getter and setter methods for firstName and lastName
}

class ContactInfo {
    private String email;
    private String phone;

    // Getter and setter methods for email and phone
}

class BirthInfo {
    private String date;
    private String gender;

    // Getter and setter methods for date and gender
}

class LoginInfo {
    private String username;
    private String password;

    // Getter and setter methods for username and password
}
