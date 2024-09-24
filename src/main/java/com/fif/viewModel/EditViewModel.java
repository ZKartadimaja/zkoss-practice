package com.fif.viewModel;

import com.fif.model.Person;
import com.fif.repository.PersonRepository;
import com.fif.service.PersonService;
import com.fif.service.impl.PersonServiceImpl;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Executions;

import java.util.Date;

public class EditViewModel {
    private String id;
    private String username;
    private String password;
    private String fullName;
    private String gender;
    private Date birthdayDate;
    private String province;
    private String city;
    private int luckyNumber;

    PersonService personService = new PersonServiceImpl();

    @Init
    public void init() {
        this.id = Executions.getCurrent().getParameter("id");
        if (this.id == null || this.id.isEmpty()) {
            Executions.sendRedirect("helloworld.zul");
            return;
        }
        Person selectedUser = personService.getById(id);
        if (selectedUser == null)
            throw new RuntimeException("Please go through from Table");

        this.setFullName(selectedUser.getFullName());
        this.setGender(selectedUser.getGender());
        this.setBirthdayDate(selectedUser.getBirthdayDate());
        this.setCity(selectedUser.getCity());
        this.setProvince(selectedUser.getProvince());
        this.setLuckyNumber(selectedUser.getLuckyNumber());
    }

    @Command
    public void updateUser() {
        Person updatedUser = new Person(id, username, password, fullName, gender, birthdayDate, province, city, luckyNumber);
        personService.updateUser(updatedUser);
        Executions.sendRedirect("searchMvvm.zul");
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getLuckyNumber() {
        return luckyNumber;
    }

    public void setLuckyNumber(int luckyNumber) {
        this.luckyNumber = luckyNumber;
    }
}
