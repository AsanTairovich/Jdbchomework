package PeaksoftMoskov;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException {
        //Cities.connection().close();
        //createTable();
//        addCity("Bishkek",1055800,1699,"1825");
//        addCity("Osh",1020000,1499,"1745");
//        addCity("Razzakov",220000,349,"1825");
//        addCity("Batken",1055800,1285,"1845");
//        addCity("Jalal-Abad",12004,142,"1867");

        //createTable2();
//        addCountries("Kyrgyzstan",7999999,199499,"1100");
//        addCountries("Uzbekistan",34000000,2438743,"1300");
//        addCountries("Turkey",45000000,8979937,"1200");
//        addCountries("Russia",150000000,378964745,"1000");
//        addCountries("Kazakhstan",19000000,3786948,"1500");

       // createTable3();
//        addCityLeaders("Uson",23,"85 kg", 185);
//        addCityLeaders("Asan",23,"65 kg", 171);
//        addCityLeaders("Bakyt",23,"68 kg", 173);
//        addCityLeaders("Aibek",17,"73 kg", 178);
//        addCityLeaders("Meder", 22,"69 kg", 175);


       // System.out.println(getList());
        //System.out.println(getList2());
        System.out.println(getList3());
    }

                   /** Шаарлар **/
    public static void createTable() {
        String SQL = "CREATE TABLE cities(" +
                "id SERIAL PRIMARY KEY," +
                "name_city VARCHAR(30) NOT NULL," +
                "population INTEGER," +
                "areal INTEGER," +
                "year_construction VARCHAR(100) NOT NULL );";
        try (Connection connection1 = Cities.connection();
             Statement statement = connection1.createStatement()) {
            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addCity(String name_city, int population, int areal, String year_construction) {
        String SQL = "INSERT INTO cities (name_city,population,areal,year_construction)" +
                "VALUES(?,?,?,?)";
        try (Connection connection2 = Cities.connection();
             PreparedStatement statement = connection2.prepareStatement(SQL)) {
            statement.setString(1, name_city);
            statement.setInt(2, population);
            statement.setInt(3, areal);
            statement.setString(4, year_construction);
            statement.executeUpdate();
        } catch (SQLException s) {
            s.printStackTrace();
        }
           /** Олколор **/
    }
    public static void createTable2(){
        String SQL = "CREATE TABLE countries(" +
                "id SERIAL PRIMARY KEY," +
                "name_country VARCHAR(30) NOT NULL," +
                "population INTEGER," +
                "areal INTEGER," +
                "year_construction VARCHAR(100) NOT NULL );";
        try (Connection connection3 = Cities.connection();
            Statement statement = connection3.createStatement()) {
                statement.executeUpdate(SQL);
        }catch (SQLException e ){
            e.printStackTrace();
        }
    }
    public static void addCountries(String name_country, int population, int areal, String year_construction){
        String SQL = "INSERT INTO countries (name_country,population,areal,year_construction)" +
                "VALUES(?,?,?,?)";
        try (Connection connection4 = Cities.connection();
             PreparedStatement statement = connection4.prepareStatement(SQL)) {
            statement.setString(1, name_country);
            statement.setInt(2, population);
            statement.setInt(3, areal);
            statement.setString(4, year_construction);
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

                    /** Шаар башчылар **/
    public static void createTable3(){
        String SQL = "CREATE TABLE city_leaders("+
                "id SERIAL PRIMARY KEY,"+
                "name VARCHAR(50) NOT NULL,"+
                "age INTEGER,"+
                "weight VARCHAR(20) NOT NULL,"+
                "growth INTEGER);";
        try (Connection connection5 = Cities.connection();
             Statement statement = connection5.createStatement()) {
            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void addCityLeaders(String name, int age, String weight, int growth){
        String SQL = "INSERT INTO city_leaders (name,age, weight,growth)"+
                "VALUES(?,?,?,?)";
        try(Connection connection6 = Cities.connection();
        PreparedStatement preparedStatement = connection6.prepareStatement(SQL)) {
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,age);
            preparedStatement.setString(3,weight);
            preparedStatement.setInt(4,growth);
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static List<City> getList(){
        String SQL = "SELECT * FROM cities";
        List<City> city = new ArrayList<>();
        try (Connection connection = Cities.connection();
        Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()){
                City city1 = new City();
                city1.setId(resultSet.getInt("id"));
                city1.setNameCity(resultSet.getString("name_city"));
                city1.setPopulation(resultSet.getInt("population"));
                city1.setAreal(resultSet.getInt("areal"));
                city1.setYearConstruction(resultSet.getInt("year_construction"));
                city.add(city1);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return city;

    }
    public static  List<Country> getList2() {
        String SQL = "SELECT * FROM countries";
        List<Country> countries = new ArrayList<>();
        try (Connection connection = Cities.connection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                Country country = new Country();
                country.setId(resultSet.getInt("id"));
                country.setName_county(resultSet.getString("name_country"));
                country.setPopulation(resultSet.getInt("population"));
                country.setAreal(resultSet.getInt("areal"));
                country.setYearConstruction(resultSet.getInt("year_construction"));
                countries.add(country);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return countries;
    }
    public static  List<Leaders> getList3() {
        String SQL = "SELECT * FROM city_leaders";
        List<Leaders> leaders1 = new ArrayList<>();
        try (Connection connection = Cities.connection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SQL);
            while (resultSet.next()) {
                Leaders leaders = new Leaders();
                leaders.setId(resultSet.getInt("id"));
                leaders.setName(resultSet.getString("name"));
                leaders.setAge(resultSet.getInt("age"));
                leaders.setWeight(resultSet.getString("weight"));
                leaders.setGrowth(resultSet.getInt("growth"));
                leaders1.add(leaders);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return leaders1;
    }
}
