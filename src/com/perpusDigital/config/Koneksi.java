package com.perpusDigital.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection koneksi;

    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/perpustakkan_digital";
                String user = "root";
                String pass = ""; // Sesuaikan dengan password MySQL Anda
                
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                System.err.println("Koneksi Database Gagal: " + e.getMessage());
            }
        }
        return koneksi;
    }
}