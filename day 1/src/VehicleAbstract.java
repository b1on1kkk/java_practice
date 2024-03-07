public abstract class VehicleAbstract {
    private int year_release;
    private String color;
    private String model;

    public VehicleAbstract(int year_release, String color, String model){
        this.year_release = year_release;
        this.color = color;
        this.model = model;
    }

    public int getYearRelease(){
        return this.year_release;
    }

    public String getColor(){
        return this.color;
    }

    public String getYearModel(){
        return this.model;
    }

}
