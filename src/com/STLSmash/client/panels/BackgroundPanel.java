package com.STLSmash.client.panels;

import com.STLSmash.client.panels.details.BackgroundDetails;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import org.gwtbootstrap3.client.ui.PanelBody;
import org.gwtbootstrap3.client.ui.TabPanel;
import org.gwtbootstrap3.client.ui.html.Div;

/**
 * Created by GENJIJODU on 3/10/2016.
 */
public class BackgroundPanel extends Composite {
    interface BackgroundPanelUiBinder extends UiBinder<Div, BackgroundPanel> { }
    private static BackgroundPanelUiBinder uiBinder = GWT.create(BackgroundPanelUiBinder.class);

    @UiField
    TabPanel acolytePanel;

    public BackgroundPanel() {
        initWidget(uiBinder.createAndBindUi(this));

        acolytePanel.add(new BackgroundDetails());
    }

}
