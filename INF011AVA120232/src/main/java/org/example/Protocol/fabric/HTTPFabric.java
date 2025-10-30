package org.example.Protocol.fabric;

import org.example.Protocol.http.HTTPProtocolo;
import org.example.Protocol.interfaces.Protocol;

public class HTTPFabric implements ProtocolFabric {
    @Override
    public Protocol createProtocol() {
        return new HTTPProtocolo();
    }
}
