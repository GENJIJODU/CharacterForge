package com.STLSmash.client.panels.details;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import org.gwtbootstrap3.client.ui.html.Div;

/**
 * Created by GENJIJODU on 3/10/2016.
 */
public class RaceDetails extends Composite {
    interface RaceDetailsUiBinder extends UiBinder<Div, RaceDetails> { }
    private static RaceDetailsUiBinder uiBinder = GWT.create(RaceDetailsUiBinder.class);


    public RaceDetails() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
