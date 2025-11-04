package org.example.Protocol.ftp;

import org.example.Protocol.factory.ProtocoloFactory;
import org.example.Protocol.factory.RequestFactory;
import org.example.Protocol.interfaces.Protocol;
import org.example.Protocol.interfaces.Request;

public class FTPRequestFactory implements RequestFactory {
    @Override
    public Request createRequest() {
        return new FTPRequest();
    }
}
