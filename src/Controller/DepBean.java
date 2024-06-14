package Controller;

public class DepBean {
    private int id;
    private String depName;
    private String depLocation;
    
    public DepBean(int id, String depName, String depLocation) {
        this.id = id;
        this.depName = depName;
        this.depLocation = depLocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepLocation() {
        return depLocation;
    }

    public void setDepLocation(String depLocation) {
        this.depLocation = depLocation;
    }
}
