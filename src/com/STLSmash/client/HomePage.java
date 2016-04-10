package com.STLSmash.client;

import com.STLSmash.client.panels.*;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import org.gwtbootstrap3.client.ui.html.Div;

public class HomePage extends Composite {

    interface HomePageUiBinder extends UiBinder<Div, HomePage> { }
    private static HomePageUiBinder uiBinder = GWT.create(HomePageUiBinder.class);

    @UiField
    RacePanel racePanel;

    @UiField
    ClassPanel classPanel;

    @UiField
    StatsPanel statsPanel;

    @UiField
    BackgroundPanel backgroundPanel;

    @UiField
    EquipmentPanel equipmentPanel;

    public HomePage() {
        initWidget(uiBinder.createAndBindUi(this));

        init();

    }

    private void init() {
        initPanels();
    }

    private void initPanels() {
        racePanel = new RacePanel();
        classPanel = new ClassPanel();
        statsPanel = new StatsPanel();
        backgroundPanel = new BackgroundPanel();
        equipmentPanel = new EquipmentPanel();
    }

}