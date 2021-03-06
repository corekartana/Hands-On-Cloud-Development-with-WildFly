package org.packt.swarm.petstore;

import org.wildfly.swarm.Swarm;

import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {
        Swarm swarm = new Swarm();

        ClassLoader cl = Main.class.getClassLoader();
        URL ymlConfig = cl.getResource("proxies.yml");

        swarm.withConfig(ymlConfig);
        swarm.start().deploy();
    }

}
