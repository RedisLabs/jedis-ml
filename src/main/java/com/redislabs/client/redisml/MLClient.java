package com.redislabs.client.redisml;

import redis.clients.jedis.commands.ProtocolCommand;
import redis.clients.util.SafeEncoder;

public class MLClient {
    public enum ModuleCommand implements ProtocolCommand {
        FOREST_ADD("FOREST.ADD"), FOREST_RUN("FOREST.RUN"), FOREST_TEST("FOREST.TEST");

        private final byte[] raw;

        ModuleCommand(String alt) {
            raw = SafeEncoder.encode(alt);
        }

        public byte[] getRaw() {
            return raw;
        }
    }
}



