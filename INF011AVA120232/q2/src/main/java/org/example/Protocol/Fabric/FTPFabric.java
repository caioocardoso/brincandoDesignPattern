package org.example.Protocol.Fabric;

import org.example.Protocol.ftp.FTPProtocolo;
import org.example.Protocol.ftp.FTPRequest;
import org.example.Protocol.ftp.FTPResponse;
import org.example.Protocol.interfaces.Protocol;
import org.example.Protocol.interfaces.Request;
import org.example.Protocol.interfaces.Response;

public class FTPFabric implements ProtocolFabric{
    @Override
    public Protocol createProtocol() {
        return new FTPProtocolo();
    }

    @Override
    public Request createRequest() {
        return new FTPRequest();
    }

    @Override
    public Response createResponse() {
        return new FTPResponse();
    }
}
