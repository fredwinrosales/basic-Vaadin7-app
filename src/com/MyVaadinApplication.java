package com;

import com.google.common.collect.Lists;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;
import java.util.Collection;

/**
 * Created by frosales on 30/06/2017.
 */
public class MyVaadinApplication extends UI {
    @Override
    public void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        setContent(layout);
        // Have some data
        Collection<Person> people = Lists.newArrayList(
                new Person("Nicolaus Copernicus", 1543),
                new Person("Galileo Galilei", 1564),
                new Person("Johannes Kepler", 1571));

        // Have a container of some type to contain the data
        BeanItemContainer<Person> container =
                new BeanItemContainer<Person>(Person.class, people);

        // Create a grid bound to the container
        Grid grid = new Grid(container);
        grid.setColumnOrder("name", "bornYear");
        layout.addComponent(grid);
    }
}
