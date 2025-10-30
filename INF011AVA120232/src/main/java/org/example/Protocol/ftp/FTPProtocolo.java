package org.example.Protocol.ftp;

import org.example.Protocol.interfaces.Protocol;
import org.example.Protocol.interfaces.Request;
import org.example.Protocol.interfaces.Response;

public class FTPProtocolo implements Protocol {
    @Override
    public void open(){
        System.out.println("FTP ABRINDOO");
    }
    @Override
    public void message(Request request, Response response){
        System.out.println("FTP Lendo messagem");
    }
    @Override
    public void close(){
        System.out.println("FTP FECHANDO");
    }
}
