package org.example.Protocol.http;

import org.example.Protocol.factory.ProtocoloFactory;
import org.example.Protocol.factory.RequestFactory;
import org.example.Protocol.interfaces.Protocol;
import org.example.Protocol.interfaces.Request;

public class HTTPResquestFactory implements RequestFactory {
    @Override
    public Request createRequest() {
        return new HTTPRequest();
    }
}
