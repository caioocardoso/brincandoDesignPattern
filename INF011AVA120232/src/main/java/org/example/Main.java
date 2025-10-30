package org.example;

import org.example.Protocol.fabric.FTPFabric;
import org.example.Protocol.fabric.ProtocolFabric;
import org.example.Protocol.ftp.FTPRequest;
import org.example.Protocol.ftp.FTPResponse;
import org.example.Protocol.interfaces.Protocol;

public class Main {
    public static void main(String[] args) {
        ProtocolFabric fabrica = new FTPFabric();

        Protocol protocolo = fabrica.createProtocol();;
        protocolo.open();
        protocolo.message(new FTPRequest(), new FTPResponse());
        protocolo.close();
    }
}