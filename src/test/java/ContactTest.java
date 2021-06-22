import api.ApiFeature;
import api.ApiManager;
import api.ApiMethod;
import api.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Contact;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactTest extends BeforeClasses{
    @Test
    public void shouldAddNewContact() throws JsonProcessingException {
        Contact newContact = new Contact();
        newContact.setEmail("testEmail@gmail.com");
        newContact.setLastName("Perez");
        apiRequest.method(ApiMethod.POST)
                .endpoint(ApiFeature.CONTACT)
                .body(new ObjectMapper().writeValueAsString(newContact));

        ApiResponse apiResponse = ApiManager.executeWithBody(apiRequest);
        Assert.assertEquals(apiResponse.getStatusCode(), HttpStatus.SC_CREATED);
        apiResponse.getResponse().then().log().body();
    }
}
