package es.apba.infra.esb.aismanager.api.linecrossedevent;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/**
 * Class that represents a line crossed by a vessel event
 *
 * @author fsaucedo
 */
public class LineCrossedEvent {

    private String uuid;

    private String vesselImoCode;

    @JsonFormat(shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date timestamp;

    private String lineCrossedEventType;

    private String geographicalLineCode;

    public LineCrossedEvent() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getVesselImoCode() {
        return vesselImoCode;
    }

    public void setVesselImoCode(String vesselImoCode) {
        this.vesselImoCode = vesselImoCode;
    }    

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getLineCrossedEventType() {
        return lineCrossedEventType;
    }

    public void setLineCrossedEventType(String lineCrossedEventType) {
        this.lineCrossedEventType = lineCrossedEventType;
    }

    public String getGeographicalLineCode() {
        return geographicalLineCode;
    }

    public void setGeographicalLineCode(String geographicalLineCode) {
        this.geographicalLineCode = geographicalLineCode;
    }

    @Override
    public String toString() {
        return "LineCrossedEvent{"
                + "uuid=" + uuid
                + ", vesselImoCode=" + vesselImoCode
                + ", timestamp=" + timestamp
                + ", lineCrossedEventType=" + lineCrossedEventType
                + ", geographicalLineCode=" + geographicalLineCode + '}';
    }

}
