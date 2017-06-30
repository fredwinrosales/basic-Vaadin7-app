package com;

import com.google.gwt.user.client.ui.SubmitButton;
import com.vaadin.data.validator.IntegerRangeValidator;
import com.vaadin.data.validator.NullValidator;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

/**
 * Created by frosales on 30/06/2017.
 */
public class CreatePerson extends UI {
    @Override
    public void init(VaadinRequest request){
        VerticalLayout layout = new VerticalLayout();
        setContent(layout);

        FormLayout form = new FormLayout();
        TextField fieldName = new TextField("Name");
        fieldName.setIcon(FontAwesome.USER);
        fieldName.setRequired(true);
        fieldName.addValidator(new NullValidator("Must be given", false));
        form.addComponent(fieldName);

        TextField fieldEmail = new TextField("E-mail");
        fieldEmail.setIcon(FontAwesome.SEND);
        form.addComponent(fieldEmail);

        form.addComponent(fieldEmail);

        HorizontalLayout okbar = new HorizontalLayout();
        okbar.setHeight("25px");
        form.addComponent(okbar);

        okbar.addComponent(new Button("Guardar"));
        okbar.addComponent(new Button("Cancelar"));

        layout.addComponent(form);

    }
}
