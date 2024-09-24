package com.fif.viewModel;

import com.fif.model.Person;
import com.fif.repository.PersonRepository;
import com.fif.service.PersonService;
import com.fif.service.impl.PersonServiceImpl;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.ListModelList;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class SearchViewModel {
    private String id;
    private String username;
    private String password;
    private String fullName;
    private String gender;
    private Date birthdayDate;
    private String province;
    private String city;
    private int luckyNumber;

    private String keyword;

    private List<Person> personList = new ListModelList<Person>();

    private Person selectedPerson;

    private PersonService personService = new PersonServiceImpl();

    @Command
    public void search(){
        personList.clear();
        personList.addAll(personService.search(keyword));

        UUID.randomUUID().toString();
    }

    @Command
    public void add() {
        personService.add(UUID.randomUUID().toString(), this.username, this.password, this.fullName, this.gender, this.birthdayDate, this.province, this.city, this.luckyNumber);
        System.out.println(this.username);
        System.out.println(this.password);
        System.out.println(this.fullName);
        System.out.println(this.gender);
        System.out.println(this.birthdayDate);
        System.out.println(this.province);
        System.out.println(this.city);
        System.out.println(this.luckyNumber);
        Executions.sendRedirect("searchMvvm.zul");
    }

    @Command
    public void deleteById(@BindingParam("id") String id) {
        personService.deletePerson(id);
        personList.clear();
        personList.addAll(PersonRepository.personList);

        // Log the details of the person being deleted
        System.out.println("--------------------");
        System.out.println("Deleting the following user:");
        System.out.println("Id: " + selectedPerson.getId());
        System.out.println("Username: " + selectedPerson.getUsername());
        System.out.println("Gender: " + selectedPerson.getGender());
        System.out.println("Birthday Date: " + selectedPerson.getBirthdayDate());
        System.out.println("City: " + selectedPerson.getCity());
        System.out.println("Province: " + selectedPerson.getProvince());
        System.out.println("Lucky Number: " + selectedPerson.getLuckyNumber());
        System.out.println("--------------------");
        System.out.println("User deleted successfully.");

        // Remove the selected person from the list
//        boolean removed = personList.remove(selectedPerson);
//        if (removed) {
//            System.out.println("User deleted successfully.");
//            selectedPerson = null; // Clear the selection after deletion
//        } else {
//            System.out.println("User not found in the list.");
//        }
    }

    @Command
    public void updateById(@BindingParam("id") String id) {
        Executions.sendRedirect("/edit.zul?id=" + id);
    }

    public void setKeyword(String keyword) {this.keyword = keyword; }

    public String getKeyword() {
        return keyword;
    }


    public List<Person> getPersonList(){
        return personList;
    }

    public void setSelectedPerson(Person selectedPerson) {
        this.selectedPerson = selectedPerson;
    }

    public Person getSelectedPerson(){
        return selectedPerson;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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
