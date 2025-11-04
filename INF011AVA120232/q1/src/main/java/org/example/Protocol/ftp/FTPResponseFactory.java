package org.example.Protocol.ftp;

import org.example.Protocol.factory.RequestFactory;
import org.example.Protocol.factory.ResponseFactory;
import org.example.Protocol.interfaces.Request;
import org.example.Protocol.interfaces.Response;

public class FTPResponseFactory implements ResponseFactory {
    @Override
    public Response createResponse() {
        return new FTPResponse();
    }
}
