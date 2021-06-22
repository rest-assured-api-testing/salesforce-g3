import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Account;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AccountTest extends BeforeClasses {

    @Test(groups = "Account")
    public void addAccount() throws JsonProcessingException {
        Account account = new Account();
        account.setName("ObjectTest2");
        apiRequest.method(ApiMethod.POST)
                .endpoint("/Account")
                .body(new ObjectMapper().writeValueAsString(account));

        ApiResponse apiResponse = ApiManager.executeWithBody(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_OK);
        apiResponse.getResponse().then().log().body();
    }

    @Test
    private void RequestDataServices() {
        given().urlEncodingEnabled(true)
                .get("https://fundacionjala4-dev-ed.my.salesforce.com/services/data/").
                then().
                assertThat().statusCode(HttpStatus.SC_OK).log().body();
    }
}
