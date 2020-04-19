package es.apba.infra.esb.aismanager.util;

import java.util.UUID;

/**
 * Producer of UUIDs
 *
 * @author fsaucedo
 */
public class UuidProducer {

    public String getUUID() {
        return UUID.randomUUID().toString();
    }

}
