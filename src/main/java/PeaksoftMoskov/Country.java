package PeaksoftMoskov;

public class Country {
    private int id;
    private String name_county;
    private int population;
    private int areal;
    private int yearConstruction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_county() {
        return name_county;
    }

    public void setName_county(String name_county) {
        this.name_county = name_county;
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
        return "Country " +
                " \n id " + id +
                " \n name_county " + name_county +
                " \n population " + population +
                " \n areal " + areal +
                " \n yearConstruction " + yearConstruction ;
    }
}
