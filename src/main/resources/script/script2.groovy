import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.HashMap;
import java.io.*;


def Message processData(Message message) {
      
      //Retrieve Body 
      def body = message.getBody();
      
      //Function to fetch application url of HCI Tenant
   //   String IT_SYSTEM_ID = System.getenv("IT_SYSTEM_ID");
      String TENANT_NAME = System.getenv("TENANT_NAME");
      String IT_TENANT_UX_DOMAIN = System.getenv("IT_TENANT_UX_DOMAIN");
     
      
      
      //Logic to retrieve only Tenant Name      
     String TMN_URL =TENANT_NAME+"."+"integrationsuite"+"."+IT_TENANT_UX_DOMAIN;
      
      //Set the Tenant name to Property
      message.setProperty("TenantURL",TMN_URL);
      
            
      return message;
}