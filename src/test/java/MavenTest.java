import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class MavenTest {
    @Test
    public void firstTestCase() {
        String url = "https://reqres.in/api/users?page=2";
        given()
                .when()
                .get(url)
                .then()
                .assertThat()
                .statusCode(200);
    }
}
