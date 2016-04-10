package com.STLSmash.client.panels.details;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import org.gwtbootstrap3.client.ui.html.Div;

/**
 * Created by GENJIJODU on 3/10/2016.
 */
public class ClassDetails extends Composite {
    interface ClassDetailsUiBinder extends UiBinder<Div, ClassDetails> { }
    private static ClassDetailsUiBinder uiBinder = GWT.create(ClassDetailsUiBinder.class);


    public ClassDetails() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
