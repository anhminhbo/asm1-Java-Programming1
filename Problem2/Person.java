/*
  RMIT University Vietnam
  Course: COSC2081 Programming 1
  Semester: 2022B
  Assessment: Test 1
  Author: Nguyen Cuong Anh Minh
  ID: 3931605
  Created  date: 06/08/2022
  Acknowledgement: Acknowledge the resources that you use here.
*/
package Problem2;

public class Person {
    private String name;
    private String phone;
    private String email;
    private String address;

    private String organizationName;
    private String organizationPhone;
    private String organizationEmail;
    private String organizationAddress;

    public Person(String name, String phone, String email, String address,
                  String organizationName, String organizationPhone,
                  String organizationEmail, String organizationAddress) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.organizationName = organizationName;
        this.organizationPhone = organizationPhone;
        this.organizationEmail = organizationEmail;
        this.organizationAddress = organizationAddress;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationPhone() {
        return organizationPhone;
    }

    public void setOrganizationPhone(String organizationPhone) {
        this.organizationPhone = organizationPhone;
    }

    public String getOrganizationEmail() {
        return organizationEmail;
    }

    public void setOrganizationEmail(String organizationEmail) {
        this.organizationEmail = organizationEmail;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
