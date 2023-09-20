package Sanitytesting;

import static io.restassured.RestAssured.given;
import java.io.FileInputStream;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.internal.util.IOUtils;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import io.restassured.http.ContentType;
import java.io.File;



public class cellannotation {
private static final int maxLength = 0;

    @Test(priority=1)
    void Tileloading() {
        System.out.println("Sending GET request to tile loading ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
        .when()
            .get("https://apollo2.humanbrain.in/iipsrv1/fcgi-bin/iipsrv.fcgi?FIF=/data/storageIIT/humanbrain/analytics/52/NISL/B_52_MTB10-SL_59-ST_NISL-SE_358_lossless.jp2&GAM=1.5&WID=512&RGN=0.780408495071639,0.2752265397020427,0.026013616502387968,0.019659038550145908&CVT=jpeg")
            .then()
            .statusCode(200)
            .log().all();
    }

    @Test(priority=2)
    void Ep1Loading() {
        System.out.println("Sending POST request to ep1 loading ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
            .formParam("iipsrv", "https://apollo2.humanbrain.in/iipsrv1/fcgi-bin/iipsrv.fcgi?FIF=/data/storageIIT/humanbrain/analytics/118/NISL/B_118_FB10-SL_357-ST_NISL-SE_1069_lossless.jp2&GAM=1.5&WID=512&RGN=0.9016450822541127,0.5707915273132664,0.0056002800140007,0.0046405815228720846&CVT=jpeg")
        .when()
            .post("https://apollo2.humanbrain.in/ml/predictions/ep1")
        .then()
            .statusCode(200)
            .log().all();
    }
    @Test(priority=3)
    void Ep4Loading() {
        System.out.println("Sending POST request to ep4 loading ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
            .formParam("iipsrv", "https://apollo2.humanbrain.in/iipsrv1/fcgi-bin/iipsrv.fcgi?FIF=/data/storageIIT/humanbrain/analytics/118/NISL/B_118_FB10-SL_357-ST_NISL-SE_1069_lossless.jp2&GAM=1.5&WID=512&RGN=0.9016450822541127,0.5707915273132664,0.0056002800140007,0.0046405815228720846&CVT=jpeg")
        .when()
            .post("https://apollo2.humanbrain.in/ml/predictions/ep4")
        .then()
            .statusCode(200)
            .log().all();
    }
    @Test(priority=4)
    void Ep7Loading() {
        System.out.println("Sending POST request to ep7 loading ");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
            .formParam("iipsrv", "https://apollo2.humanbrain.in/iipsrv1/fcgi-bin/iipsrv.fcgi?FIF=/data/storageIIT/humanbrain/analytics/118/NISL/B_118_FB10-SL_357-ST_NISL-SE_1069_lossless.jp2&GAM=1.5&WID=512&RGN=0.9016450822541127,0.5707915273132664,0.0056002800140007,0.0046405815228720846&CVT=jpeg")
        .when()
            .post("https://apollo2.humanbrain.in/ml/predictions/ep7")
        .then()
            .statusCode(200)
            .log().all();
    }
    @Test(priority=5)
    void save() {
        System.out.println("Sending POST request to save ");
       
        
    File file = new File("src/test/resources/celldetectionSaveapi.txt");
        given()
            .auth()
            .preemptive()
            .basic("admin", "admin")
            .contentType(ContentType.JSON) 
            .body(file)
        .when()
            .post("https://apollo2.humanbrain.in/GW/save_pixel_additions_status_wp")
        .then()
            .statusCode(200)
            .log().all();

    }
}
