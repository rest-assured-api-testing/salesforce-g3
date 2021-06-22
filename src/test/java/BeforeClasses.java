import api.ApiManager;
import api.ApiMethod;
import api.ApiRequest;
import api.ApiResponse;
import io.github.cdimascio.dotenv.Dotenv;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BeforeClasses {
    public static Dotenv dotenv = Dotenv.configure().ignoreIfMalformed().ignoreIfMissing().load();
    public ApiRequest apiRequest;

    @BeforeSuite
    public void login() {
        apiRequest = new ApiRequest()
                .baseUri(dotenv.get("LOGIN"))
                .endpoint("/token")
                .addPathParam("password", dotenv.get("PASSWORD"))
                .addPathParam("username", "edsonarios@freeorg01.com")
                .addPathParam("client_id", dotenv.get("CLIENT_ID"))
                .addPathParam("client_secret", dotenv.get("CLIENT_SECRET"))
                .addPathParam("grant_type", "password")
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .method(ApiMethod.POST);
        ApiResponse apiResponse = ApiManager.execute(apiRequest);
    }

    @BeforeMethod(onlyForGroups = "Accounts")
    public void AccountsSettings() {
        apiRequest.baseUri(dotenv.get("URI"))
                .method(ApiMethod.GET);
    }

}
