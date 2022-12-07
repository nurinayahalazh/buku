package program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Utama {
    
    Connection connect;
    Statement sttmnt;
    ResultSet rslt;
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        try {
            String url = "jdbc:mysql://localhost:3306/buku";
            String user = "root";
            String password = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url,user,password);
            System.out.println("Koneksi Berhasil");
        }catch (Exception e) {
            System.err.println("Koneksi Gagal " +e.getMessage());     
        }return koneksi;
    }
        
    public static void main(String[] args) {
        getKoneksi();
        Masuk login = new Masuk();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(Masuk.EXIT_ON_CLOSE);
        
    }
    
}
