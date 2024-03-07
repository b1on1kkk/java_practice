public class Airplane extends VehicleAbstract {
    
    private String producer;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(int year_release, String color, String model, String producer, int length, int weight, int fuel){
        super(year_release, color, model);
        this.producer = producer;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public int getFuel(){
        return this.fuel;
    }

    public int getLength(){
        return this.length;
    }

    public String fillUp(int liters){
        this.fuel += liters;
        
        return "Airplane was filled up";
    }

    public static Airplane compareAirplanes(Airplane air_plane_1, Airplane air_plane_2){
        if(air_plane_1.getLength() > air_plane_2.getLength()){
            return air_plane_1;
        }

        return air_plane_2;
    }

    public String info(){
        return "Producer" + this.producer;
        // and more...
    }


}
