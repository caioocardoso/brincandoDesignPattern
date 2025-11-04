package org.example.Protocol.http;

import org.example.Protocol.factory.RequestFactory;
import org.example.Protocol.factory.ResponseFactory;
import org.example.Protocol.interfaces.Request;
import org.example.Protocol.interfaces.Response;

public class HTTPResponseFactory implements ResponseFactory {
    @Override
    public Response createResponse() {
        return new HTTPResponse();
    }
}
