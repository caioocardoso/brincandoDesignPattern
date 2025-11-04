package org.example.Protocol.ftp;

import org.example.Protocol.factory.ProtocoloFactory;
import org.example.Protocol.interfaces.Protocol;

public class FTPProtocoloFactory implements ProtocoloFactory {
    @Override
    public Protocol createProtocol() {
        return new FTPProtocolo();
    }
}
