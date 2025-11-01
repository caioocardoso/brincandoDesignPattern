package org.example;

import org.example.Protocol.Fabric.FTPFabric;
import org.example.Protocol.Fabric.HTTPFabric;
import org.example.Protocol.Fabric.ProtocolFabric;
import org.example.Protocol.ftp.FTPProtocolo;
import org.example.Protocol.ftp.FTPRequest;
import org.example.Protocol.ftp.FTPResponse;
import org.example.Protocol.http.HTTPProtocolo;
import org.example.Protocol.interfaces.Protocol;

public class Main {
    public static void main(String[] args) {
        ProtocolFabric fabric = new FTPFabric();

        Protocol protocolo = fabric.createProtocol();
        protocolo.open();
        protocolo.message(fabric.createRequest() , fabric.createResponse());
        protocolo.close();
    }
}