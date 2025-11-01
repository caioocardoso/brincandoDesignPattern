package org.example.Protocol.Fabric;

import org.example.Protocol.http.HTTPProtocolo;
import org.example.Protocol.http.HTTPRequest;
import org.example.Protocol.http.HTTPResponse;
import org.example.Protocol.interfaces.Protocol;
import org.example.Protocol.interfaces.Request;
import org.example.Protocol.interfaces.Response;

public class HTTPFabric implements ProtocolFabric{
    @Override
    public Protocol createProtocol() {
        return new HTTPProtocolo();
    }

    @Override
    public Request createRequest() {
        return new HTTPRequest();
    }

    @Override
    public Response createResponse() {
        return new HTTPResponse();
    }
}
