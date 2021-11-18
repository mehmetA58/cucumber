package dbStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;

public class DbUtilStepDefinitions {

    @Given("kullanici DBUtil ile CHQA databeseine baglanir")
    public void kullanici_db_util_ile_chqa_databeseine_baglanir() {
        DBUtils.getConnection();
    }
    @Given("kullanici DBUtil ile {string} tablosundaki {string} verilerini alir")
    public void kullanici_db_util_ile_tablosundaki_verilerini_alir(String table, String field) {
        String readQuery="SELECT "+ field +" FROM "+ table;
        DBUtils.executeQuery(readQuery);
    }
    @Given("kullanici DBUtil ile {string} sutunundaki {int}.fiyatin {int} oldugunu test eder")
    public void kullanici_db_util_ile_sutunundaki_fiyatin_oldugunu_test_eder(String field, Integer satirNo, Integer expectedPrice) throws Exception {



        DBUtils.getResultset().first();
        int satirSayisi=DBUtils.getRowCount();
        int aktifSatirNumarasi = 0;
        System.out.println(satirSayisi);
        DBUtils.getResultset().first();
        while(aktifSatirNumarasi<satirSayisi){
            System.out.println(aktifSatirNumarasi+" .satirdaki fiyat : "+DBUtils.getResultset().getObject(field));
            aktifSatirNumarasi++;
            DBUtils.getResultset().next();
        }
        DBUtils.getResultset().absolute(satirNo);
        int actualDeger= (int) DBUtils.getResultset().getDouble(field);
        Assert.assertTrue(actualDeger==expectedPrice);

    }

    @Then("DBU IDHotel degeri {int} olan kaydin Email degerini {string} yapar")
    public void dbuIDHotelDegeriOlanKaydinEmailDegeriniYapar(int IDHotelNo, String yeniEmail) throws SQLException {

        String updateQuery="UPDATE tHOTEL SET Email='"+yeniEmail+"' WHERE IDHotel="+IDHotelNo;
        DBUtils.executeQuery(updateQuery);





        String readQuery= "SELECT Email FROM tHOTEL";

        DBUtils.executeQuery(readQuery);

        int aktifSatirNumarasi=1;
        DBUtils.getResultset().first();

        while (aktifSatirNumarasi<100){

            Object satirdakiObje=DBUtils.getResultset().getObject("Email");
            System.out.println(aktifSatirNumarasi + ".satirdaki Email :" + satirdakiObje.toString());
            DBUtils.getResultset().next();
            aktifSatirNumarasi++;
        }





    }
}
