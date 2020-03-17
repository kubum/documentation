import com.datadog.api.v2.client.api.PagerDutyIntegrationApi;

public class PagerDutyIntegrationApiExample {

    public static void main(String[] args) {
        PagerDutyIntegrationApi apiInstance = new PagerDutyIntegrationApi();
        PagerDutyServicesAndSchedules body = ; // PagerDutyServicesAndSchedules | 
        try {
            apiInstance.updatePagerDutyIntegration(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling PagerDutyIntegrationApi#updatePagerDutyIntegration");
            e.printStackTrace();
        }
    }
}