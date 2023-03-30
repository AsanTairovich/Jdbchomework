package PeaksoftMoskov;

public class City {
    private int id;
    private String name_city;
    private int population;
    private int areal;
    private int yearConstruction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCity() {
        return name_city;
    }

    public void setNameCity(String nameCity) {
        this.name_city = nameCity;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getAreal() {
        return areal;
    }

    public void setAreal(int areal) {
        this.areal = areal;
    }

    public int getYearConstruction() {
        return yearConstruction;
    }

    public void setYearConstruction(int yearConstruction) {
        this.yearConstruction = yearConstruction;
    }

    @Override
    public String toString() {
        return "City \n " +
                "id " + id +
                " \n nameCity " + name_city +
                " \n population " + population +
                " \n areal " + areal +
                " \n yearConstruction " + yearConstruction;
    }
}
