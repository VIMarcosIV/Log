package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {

    static Logger log =  LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Se va a escribir un hola mundo");
        System.out.println("Hello world!");
        log.trace("Fin de programa");
        log.error("En caso de que el programa reviente haremos uso de estos mensajes de log.error");
        log.warn("En caso de que queramos dar un aviso de algo que pudiese ocurrir utilizar estos mensajes de log.warn");
    }
}