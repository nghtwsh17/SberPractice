import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(
                    "src\\Задача ВС Java Сбер.csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<City> cityList = new ArrayList<>();
        try {
            while ((line = reader.readLine()) != null) {
                City city = new City();
                scanner = new Scanner(line);
                scanner.useDelimiter(";");
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    if (index == 0)
                        city.setIndex(Integer.parseInt(data));
                    else if (index == 1)
                        city.setName(data);
                    else if (index == 2)
                        city.setRegion(data);
                    else if (index == 3)
                        city.setDistrict(data);
                    else if (index == 4) {
                        city.setPopulatiob(Integer.parseInt(data));
                    } else if (index == 5) {
                        city.setDateOfFoundation(data);
                    }
                    index++;
                }
                index = 0;
                cityList.add(city);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (City e: cityList){
            System.out.println(e.getCityInfo());
        }
    }
}