package com.STLSmash.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface STLSmashServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
