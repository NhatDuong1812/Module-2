import java.io.Serializable;
public class Contract implements Serializable {
    private String phoneNumber;
    private String groupName;
    private String name;
    private String gender;
    private String address;
    private String dateOfBirth;
    private String emailAdress;


    public Contract( String phoneNumber, String groupName , String name , String gender , String address , String dateOfBirth , String emailAdress ) {
        this.phoneNumber = phoneNumber;
        this.groupName = groupName;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.emailAdress = emailAdress;
    }

    public Contract() {} ;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    @Override
    public String toString() {
        return " Phone: " + getPhoneNumber() + "" + " Group: " + getGroupName() + " Name: " + getName() + " Gender: " + getGender() + " Address: " + getAddress() + "\n";
    }

}



