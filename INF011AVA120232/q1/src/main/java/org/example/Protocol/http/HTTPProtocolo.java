package org.example.Protocol.http;

import org.example.Protocol.interfaces.Protocol;
import org.example.Protocol.interfaces.Request;
import org.example.Protocol.interfaces.Response;

public class HTTPProtocolo implements Protocol {
    @Override
    public void open(){
        System.out.println("HTTP ABRINDOO");
    }
    @Override
    public void message(Request request, Response response){
        System.out.println("HTTP Lendo messagem");
    }
    @Override
    public void close(){
        System.out.println("HTTP FECHANDO");
    }
}
