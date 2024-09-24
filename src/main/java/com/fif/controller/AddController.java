package com.fif.controller;

import com.fif.model.Person;
import com.fif.service.PersonService;
import com.fif.service.impl.PersonServiceImpl;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.*;

public class AddController extends SelectorComposer<Component> {

    @Wire
    private Textbox usernamebox;

    @Wire
    private Textbox passwordbox;

    @Wire
    private Textbox fullnamebox;

    @Wire
    private Radiogroup gendergroup;

    @Wire
    private Datebox birthdatebox;

    @Wire
    private Combobox citybox;

    @Wire
    private Combobox provincebox;

    @Wire
    private Spinner luckynumberbox;

//    private PayloadUser = new ListModelList<>();
//
//    private PersonService personService = new PersonServiceImpl();
//
//    @Listen("onClick = #submitButton; onOk = window")
//    public void saveUser() {
//
//    }
}
