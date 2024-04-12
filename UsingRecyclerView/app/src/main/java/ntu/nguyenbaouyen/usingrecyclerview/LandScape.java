package ntu.nguyenbaouyen.usingrecyclerview;

public class LandScape {
    String landImageFileName;
    String landCation;

    public String getLandImageFileName() {
        return landImageFileName;
    }

    public LandScape(String landImageFileName, String landCation) {
        this.landImageFileName = landImageFileName;
        this.landCation = landCation;
    }

    public void setLandImageFileName(String landImageFileName) {
        this.landImageFileName = landImageFileName;
    }

    public String getLandCation() {
        return landCation;
    }

    public void setLandCation(String landCation) {
        this.landCation = landCation;
    }
}
