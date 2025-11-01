package org.example;

import org.example.Protocol.ftp.FTPProtocolo;
import org.example.Protocol.ftp.FTPRequest;
import org.example.Protocol.ftp.FTPResponse;
import org.example.Protocol.http.HTTPProtocolo;
import org.example.Protocol.interfaces.Protocol;

public class Main {
    public static void main(String[] args) {

        Protocol protocolo = new HTTPProtocolo();
        protocolo.open();
        protocolo.message(new FTPRequest(), new FTPResponse());
        protocolo.close();
    }
}