package com.STLSmash.client.panels;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import org.gwtbootstrap3.client.ui.PanelBody;
import org.gwtbootstrap3.client.ui.html.Div;

/**
 * Created by GENJIJODU on 3/10/2016.
 */
public class StatsPanel extends Composite {
    interface StatsPanelUiBinder extends UiBinder<Div, StatsPanel> { }
    private static StatsPanelUiBinder uiBinder = GWT.create(StatsPanelUiBinder.class);

    @UiField
    PanelBody table;

    public StatsPanel() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
