package com.example.application.views.helloworld;

import com.example.application.views.main.MainView;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

import org.vaadin.tarek.CollapsibleSplitLayout;

@Route(value = "hello", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Hello World")
public class HelloWorldView extends HorizontalLayout {

    public HelloWorldView() {
        CollapsibleSplitLayout cs = new CollapsibleSplitLayout();
        cs.setSizeFull();
        cs.addToPrimary(new Span("Primary"));
        cs.addToSecondary(new Span("Secondary"));
        add(cs);

    }

}
