package es.apba.infra.esb.aismanager.api.geographicalline;

/**
 * Class that represents a geographical line to be controlled
 *
 * @author fsaucedo
 */
public class GeographicalLine {

    private String geographicalLineCode;
    private String description;
    private Coordinates startPoint;
    private Coordinates endPoint;

    public GeographicalLine() {
    }

    public String getGeographicalLineCode() {
        return geographicalLineCode;
    }

    public void setGeographicalLineCode(String geographicalLineCode) {
        this.geographicalLineCode = geographicalLineCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Coordinates getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Coordinates startPoint) {
        this.startPoint = startPoint;
    }

    public Coordinates getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Coordinates endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "GeographicalLine{"
                + "geographicalLineCode=" + geographicalLineCode
                + ", description=" + description
                + ", startPoint=" + startPoint
                + ", endPoint=" + endPoint + '}';
    }

}
