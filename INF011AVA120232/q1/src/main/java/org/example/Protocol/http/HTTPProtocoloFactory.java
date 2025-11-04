package org.example.Protocol.http;

import org.example.Protocol.factory.ProtocoloFactory;
import org.example.Protocol.ftp.FTPProtocolo;
import org.example.Protocol.interfaces.Protocol;

public class HTTPProtocoloFactory implements ProtocoloFactory {
    @Override
    public Protocol createProtocol() {
        return new HTTPProtocolo();
    }
}
