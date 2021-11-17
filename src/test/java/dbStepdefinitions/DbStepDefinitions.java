package dbStepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbStepDefinitions {
    String url="jdbc:sqlserver://184.168.194.58:1433;databaseName=qaconcorthotel; user=Ahmet_User;password=Ahmet123!";
    String username="Ahmet_User";
    String password="Ahmet123!";
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("kullanici CHQA databeseine baglanir")
    public void kullanici_chqa_databeseine_baglanir() throws SQLException {
    connection=DriverManager.getConnection(url,username,password);
    statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

    }
    @Given("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullanici_tablosundaki_verilerini_alir(String table, String field) throws SQLException {
        //SELECT Price FROM HOTELROOM
        String readQuery="SELECT "+field+" FROM "+table;

       resultSet=statement.executeQuery(readQuery);

    }
    @Given("kullanici {string} sutunundaki verileri okur ve istedigi islemleri yapar")
    public void kullanici_sutunundaki_verileri_okur_ve_istedigi_islemleri_yapar(String field) throws SQLException {

//        resultSet.first();
//        System.out.println(resultSet.getObject(field).toString());
//
//        System.out.println(resultSet.next());
//        System.out.println(resultSet.getObject(field).toString());
//        System.out.println(resultSet.last());
//        System.out.println(resultSet.getObject(field).toString());

        //tum liste icin
//
//        System.out.println(resultSet.getObject(field).toString());
//        while (resultSet.next()){
//
//            System.out.println(resultSet.getObject(field).toString());
//        }
//        resultSet.absolute(0);
//        while (resultSet.next()){
//
//            System.out.println(resultSet.getObject(field).toString());
//        }
//        resultSet.absolute(0);
//        while (resultSet.next()){
//            System.out.println(resultSet.getObject(field).toString());
//        }
        //varsa ilk 100 fiyati integer olarak bir liste olarak kaydedelim
        int sayac=1;
        resultSet.absolute(0);
        List<Integer> ilkYuzSayi=new ArrayList<>();
        while (sayac<=100 && resultSet.next()){
            ilkYuzSayi.add((int) resultSet.getDouble(field));
            sayac++;
        }

        System.out.print(ilkYuzSayi);
        System.out.print(ilkYuzSayi.size());

        //7.fiyatin  double olarak 620.0 oldugunu test edin
        resultSet.absolute(7);
        Assert.assertTrue(resultSet.getDouble(field)==620);

    }
}
