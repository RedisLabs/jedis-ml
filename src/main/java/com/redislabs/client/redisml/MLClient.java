package com.redislabs.client.redisml;

import redis.clients.jedis.commands.ProtocolCommand;
import redis.clients.util.SafeEncoder;

public class MLClient {
    public enum ModuleCommand implements ProtocolCommand {
        FOREST_ADD("ML.FOREST.ADD"),
        FOREST_RUN("ML.FOREST.RUN"),
        FOREST_TEST("ML.FOREST.TEST"),
        LINREG_SET("ML.LINREG.SET"),
        LINREG_PREDICT("ML.LINREG.PREDICT"),
        LOGREG_SET("ML.LOGREG.SET"),
        LOGREG_PREDICT("ML.LOGREG.PREDICT"),
        MATRIX_SET("ML.MATRIX.SET"),
        MATRIX_MULTIPLY("ML.MATRIX.MULTIPLY"),
        MATRIX_ADD("ML.MATRIX.ADD"),
        MATRIX_SCALE("ML.MATRIX.SCALE"),
        MATRIX_PRINT("ML.MATRIX.PRINT"),
        MATRIX_TEST("ML.MATRIX.TEST"),
        KMEANS_SET("ML.KMEANS.SET"),
        KMEANS_PREDICT("ML.KMEANS.PREDICT");

        private final byte[] raw;

        ModuleCommand(String alt) {
            raw = SafeEncoder.encode(alt);
        }

        public byte[] getRaw() {
            return raw;
        }
    }
}



