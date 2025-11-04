package org.example.Protocol.factory;

import org.example.Protocol.interfaces.Protocol;
import org.example.Protocol.interfaces.Request;
import org.example.Protocol.interfaces.Response;

public interface ProtocoloFactory {
    public Protocol createProtocol();
}
