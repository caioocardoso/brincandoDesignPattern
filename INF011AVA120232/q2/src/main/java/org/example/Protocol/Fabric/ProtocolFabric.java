package org.example.Protocol.Fabric;

import org.example.Protocol.interfaces.Protocol;
import org.example.Protocol.interfaces.Request;
import org.example.Protocol.interfaces.Response;

public interface ProtocolFabric {
    public Protocol createProtocol();
    public Request createRequest();
    public Response createResponse();
}
