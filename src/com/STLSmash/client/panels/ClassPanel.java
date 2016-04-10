package com.STLSmash.client.panels;

import com.STLSmash.client.panels.details.ClassDetails;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import org.gwtbootstrap3.client.ui.TabPanel;
import org.gwtbootstrap3.client.ui.html.Div;

/**
 * Created by GENJIJODU on 3/10/2016.
 */
public class ClassPanel extends Composite {
    interface RacePanelUiBinder extends UiBinder<Div, ClassPanel> { }
    private static RacePanelUiBinder uiBinder = GWT.create(RacePanelUiBinder.class);

    @UiField
    TabPanel barbarianPanel;

    public ClassPanel() {
        initWidget(uiBinder.createAndBindUi(this));

        barbarianPanel.add(new ClassDetails());
    }

}
