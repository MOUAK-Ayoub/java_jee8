package com.database;

import java.sql.*;

public class TutorialDao {

    public static final String URL = "jdbc:postgresql://localhost:5432/tutorial";

    private static final String USER = "postgres";

    private static final String PASSWORD = "Bat2020billy1994";

    public static final String SCHEMA = "schema";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public int insertRow(int recipeNumber,
                         String name,
                         String description,
                         String text) {
        String sql = " INSERT INTO " +
                SCHEMA + ".recipes VALUES(?,?,?,?) ";
        PreparedStatement stmt = null;
        int result = -1;
        try (Connection conn = getConnection()) {

            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, recipeNumber);
            stmt.setString(2, name);
            stmt.setString(3, description);
            stmt.setString(4, text);

            result = stmt.executeUpdate();
            if (result > 0) {
                System.out.println("-- Record created --");
            } else {
                System.out.println("!! Record NOT Created !!");
            }
        } catch (SQLException  e) {
            e.printStackTrace();
        }
        return result;
    }
}
