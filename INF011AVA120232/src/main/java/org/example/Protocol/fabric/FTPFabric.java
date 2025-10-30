package org.example.Protocol.fabric;

import org.example.Protocol.ftp.FTPProtocolo;
import org.example.Protocol.interfaces.Protocol;

public class FTPFabric implements ProtocolFabric {
    @Override
    public Protocol createProtocol() {
        return new FTPProtocolo();
    }
}
