package com.superbapps.ui.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import javax.annotation.PostConstruct;

@SpringView
public class GroupPage extends VerticalLayout implements View {

    @PostConstruct
    void init() {
        Label title = new Label();
        title.setCaption("Group");
        title.setValue("Group view");
        addComponent(title);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
}
