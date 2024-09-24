//package com.fif.controller;
//
//import com.fif.model.Person;
//import com.fif.service.PersonService;
//import com.fif.service.impl.PersonServiceImpl;
//import org.zkoss.zk.ui.Component;
//import org.zkoss.zk.ui.select.SelectorComposer;
//import org.zkoss.zk.ui.select.annotation.Listen;
//import org.zkoss.zk.ui.select.annotation.Wire;
//import org.zkoss.zul.Label;
//import org.zkoss.zul.ListModelList;
//import org.zkoss.zul.Listbox;
//import org.zkoss.zul.Textbox;
//
//import java.util.Set;
//
//public class SearchController extends SelectorComposer<Component> {
//    private static final long serialVersionUID = 1L;
//
//    @Wire
//    private Textbox keywordBox;
//
//    @Wire
//    private Listbox personListbox;
//
//    @Wire
//    private Label fullNameLabel;
//
//    @Wire
//    private Label genderLabel;
//
//    @Wire
//    private Label birthdayDateLabel;
//
//    @Wire
//    private Label cityLabel;
//
//    @Wire
//    private Label provinceLabel;
//
//    @Wire
//    private Label luckyNumberLabel;
//
//    private ListModelList<Person> dataModel = new ListModelList<>();
//
////    private PersonService personService = new PersonServiceImpl();
//
////    public SearchController() {
////        dataModel.addAll(personService.findAll());
////    }
//
//    @Override
//    public void doAfterCompose(Component comp) throws Exception {
//        super.doAfterCompose(comp);
//        personListbox.setModel(dataModel);
//    }
//
//    @Listen("onClick = #searchButton; onOK = window")
//    public void search() {
//        String keyword = keywordBox.getValue();
//        dataModel.clear();
//        dataModel.addAll(personService.search(keyword));
//    }
//
//    @Listen("onSelect = #personListbox")
//    public void showDetail() {
//        Set<Person> selection = dataModel.getSelection();
//        Person selected = selection.iterator().next();
//        fullNameLabel.setValue(selected.getFullName());
//        genderLabel.setValue(selected.getGender());
//        birthdayDateLabel.setValue(String.valueOf(selected.getBirthdayDate()));
//        cityLabel.setValue(selected.getCity());
//        provinceLabel.setValue(selected.getProvince());
//        luckyNumberLabel.setValue(String.valueOf(selected.getLuckyNumber()));
//    }
//}
