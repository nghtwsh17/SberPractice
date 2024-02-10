public class City {
    int index;
    String name;
    String region;
    String district;
    int population;


    public String getCityInfo (){
        System.out.println("--------------------------------------------------------------------");
    StringBuilder info = new StringBuilder();
    info.append("Город - " +getName() + ";").append(" Регион - " + getRegion() + ";").append(" Федеральный округ - " + getDistrict() + ";").append(" Население - " + getPopulatiob() + ";").append(" Дата основания - " + getDateOfFoundation() + ";");
        System.out.println("--------------------------------------------------------------------");
        return info.toString();
    }

    String dateOfFoundation;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulatiob() {
        return population;
    }

    public void setPopulatiob(int population) {
        this.population = population;
    }

    public String getDateOfFoundation() {
        return dateOfFoundation;
    }

    public void setDateOfFoundation(String dateOfFoundation) {
        this.dateOfFoundation = dateOfFoundation;
    }
}
