package com.igorKraskovski.telegram;

import com.igorKraskovski.entity.City;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connect {
    private static final String URL = "jdbc:postgresql://localhost/TelegramBot";
    private Connection connection;
    private ResultSet resultSet;

    public Connect() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, "postgres", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public City getCityByCityName(String cityName) {
        City city = new City();
        try (PreparedStatement preparedStatement = this.connection.prepareStatement(
                "select * from city where city_name = ?"
        )) {
            preparedStatement.setObject(1, cityName);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                city.setId(resultSet.getLong("id"));
                city.setCityName(resultSet.getString("city_name"));
                city.setDescription(resultSet.getString("description"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return city;
    }
}
