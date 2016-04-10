package com.STLSmash.client.panels.details;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import org.gwtbootstrap3.client.ui.TabPanel;
import org.gwtbootstrap3.client.ui.html.Div;

/**
 * Created by GENJIJODU on 3/10/2016.
 */
public class BackgroundDetails extends Composite {
    interface BackgroundDetailsUiBinder extends UiBinder<Div, BackgroundDetails> { }
    private static BackgroundDetailsUiBinder uiBinder = GWT.create(BackgroundDetailsUiBinder.class);


    public BackgroundDetails() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
