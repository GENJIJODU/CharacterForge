package com.STLSmash.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.STLSmash.client.STLSmashService;

public class STLSmashServiceImpl extends RemoteServiceServlet implements STLSmashService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}