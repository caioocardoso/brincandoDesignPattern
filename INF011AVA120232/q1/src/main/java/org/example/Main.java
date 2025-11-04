package org.example;

import org.example.Protocol.factory.ProtocoloFactory;
import org.example.Protocol.factory.RequestFactory;
import org.example.Protocol.factory.ResponseFactory;
import org.example.Protocol.ftp.FTPProtocoloFactory;
import org.example.Protocol.ftp.FTPRequestFactory;
import org.example.Protocol.ftp.FTPResponseFactory;
import org.example.Protocol.interfaces.Protocol;
import org.example.Protocol.interfaces.Request;
import org.example.Protocol.interfaces.Response;

public class Main {
    public static void main(String[] args) {
        new Main().run(new FTPProtocoloFactory(), new FTPResponseFactory(), new FTPRequestFactory());
    }

    public void run(ProtocoloFactory protocoloFactory, ResponseFactory responseFactory, RequestFactory requestFactory){
        Protocol protocolo = protocoloFactory.createProtocol();
        Response response = responseFactory.createResponse();
        Request request = requestFactory.createRequest();
        protocolo.open();
        protocolo.message(request, response);
        protocolo.close();
    }
}