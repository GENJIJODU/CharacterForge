package com.STLSmash.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("STLSmashService")
public interface STLSmashService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use STLSmashService.App.getInstance() to access static instance of STLSmashServiceAsync
     */
    public static class App {
        private static STLSmashServiceAsync ourInstance = GWT.create(STLSmashService.class);

        public static synchronized STLSmashServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
