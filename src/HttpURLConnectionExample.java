import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;


public class HttpURLConnectionExample {
	private final String USER_AGENT = "Mozilla/5.0";
	 
	public static void main(String[] args) throws Exception {
 
		HttpURLConnectionExample http = new HttpURLConnectionExample();
 
		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet();
 
		System.out.println("\nTesting 2 - Send Http POST request");
		http.sendPost();
 
	}
 
	// HTTP GET request
	private void sendGet() throws Exception {
 
		String url = "http://www.google.com/search?q=mkyong";
 
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		// optional default is GET
		con.setRequestMethod("GET");
 
		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
 
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 
		//print result
		System.out.println(response.toString());
 
	}
 
	// HTTP POST request
	private void sendPost() throws Exception {
 
		String url = "http://dev.fortwarehouse.com:8950/wsn_v2/index.cfm?fuseaction=orders.search";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
 
		String urlParameters = "All_Sellers=7312%2C4168%2C261%2C4206%2C7314%2C6310%2C4235%2C7313%2C6312%2C4232%2C7343%2C6311%2C7318%2C4151%2C186%2C4234%2C191%2C3657&Search_Type=basic&Customer_State=&Seller=4168&Brand_Name=&Order_Type=&Order_Number=&Tracking_Number=&Order_From_Date=&Order_To_Date=&Requested_Ship_Date_From=&Requested_Ship_Date_To=&Order_Upload_Start_Date=&Order_Upload_End_Date=&Depletion_From_Date=&Depletion_To_Date=&Ship_From_Date=&Ship_To_Date=&Warehouse_Location=&Product=++&Customer_First_Name=&Customer_Last_Name=&Recipient_Company=&Customer_City=&Customer_Postal_Code=&Postal_Code_From=&Postal_Code_To=&Labels_Setting=all&Status_2=&Status_3=&Shipment_Type=all&Report_Format=order&Search=Search&validations=%3CwddxPacket+version%3D%271.0%27%3E%3Cheader%2F%3E%3Cdata%3E%3Carray+length%3D%2713%27%3E%3Cstruct%3E%3Cvar+name%3D%27validators%27%3E%3Cstring%3Edefined%3C%2Fstring%3E%3C%2Fvar%3E%3Cvar+name%3D%27name%27%3E%3Cstring%3ESeller%3C%2Fstring%3E%3C%2Fvar%3E%3C%2Fstruct%3E%3Cstruct%3E%3Cvar+name%3D%27validators%27%3E%3Cstring%3Edate%7Cbok%3C%2Fstring%3E%3C%2Fvar%3E%3Cvar+name%3D%27name%27%3E%3Cstring%3EOrder_From_Date%3C%2Fstring%3E%3C%2Fvar%3E%3C%2Fstruct%3E%3Cstruct%3E%3Cvar+name%3D%27validators%27%3E%3Cstring%3Edate%7Cbok%3C%2Fstring%3E%3C%2Fvar%3E%3Cvar+name%3D%27name%27%3E%3Cstring%3ERequested_Ship_Date_From%3C%2Fstring%3E%3C%2Fvar%3E%3C%2Fstruct%3E%3Cstruct%3E%3Cvar+name%3D%27validators%27%3E%3Cstring%3Edate%7Cbok%3C%2Fstring%3E%3C%2Fvar%3E%3Cvar+name%3D%27name%27%3E%3Cstring%3ERequested_Ship_Date_To%3C%2Fstring%3E%3C%2Fvar%3E%3C%2Fstruct%3E%3Cstruct%3E%3Cvar+name%3D%27validators%27%3E%3Cstring%3Edate%7Cbok%3C%2Fstring%3E%3C%2Fvar%3E%3Cvar+name%3D%27name%27%3E%3Cstring%3EOrder_Upload_Start_Date%3C%2Fstring%3E%3C%2Fvar%3E%3C%2Fstruct%3E%3Cstruct%3E%3Cvar+name%3D%27validators%27%3E%3Cstring%3Edate%7Cbok%3C%2Fstring%3E%3C%2Fvar%3E%3Cvar+name%3D%27name%27%3E%3Cstring%3EOrder_Upload_End_Date%3C%2Fstring%3E%3C%2Fvar%3E%3C%2Fstruct%3E%3Cstruct%3E%3Cvar+name%3D%27validators%27%3E%3Cstring%3Edate%7Cbok%3C%2Fstring%3E%3C%2Fvar%3E%3Cvar+name%3D%27name%27%3E%3Cstring%3EDepletion_From_Date%3C%2Fstring%3E%3C%2Fvar%3E%3C%2Fstruct%3E%3Cstruct%3E%3Cvar+name%3D%27validators%27%3E%3Cstring%3Edate%7Cbok%3C%2Fstring%3E%3C%2Fvar%3E%3Cvar+name%3D%27name%27%3E%3Cstring%3EDepletion_To_Date%3C%2Fstring%3E%3C%2Fvar%3E%3C%2Fstruct%3E%3Cstruct%3E%3Cvar+name%3D%27validators%27%3E%3Cstring%3Edate%7Cbok%3C%2Fstring%3E%3C%2Fvar%3E%3Cvar+name%3D%27name%27%3E%3Cstring%3EShip_From_Date%3C%2Fstring%3E%3C%2Fvar%3E%3C%2Fstruct%3E%3Cstruct%3E%3Cvar+name%3D%27validators%27%3E%3Cstring%3Edate%7Cbok%3C%2Fstring%3E%3C%2Fvar%3E%3Cvar+name%3D%27name%27%3E%3Cstring%3EShip_To_Date%3C%2Fstring%3E%3C%2Fvar%3E%3C%2Fstruct%3E%3Cstruct%3E%3Cvar+name%3D%27validators%27%3E%3Cstring%3Eblank%3C%2Fstring%3E%3C%2Fvar%3E%3Cvar+name%3D%27name%27%3E%3Cstring%3EShipment_Type%3C%2Fstring%3E%3C%2Fvar%3E%3C%2Fstruct%3E%3Cstruct%3E%3Cvar+name%3D%27validators%27%3E%3Cstring%3Eif%7CShipment_Type%3Dwsnet%7Cblank%3C%2Fstring%3E%3C%2Fvar%3E%3Cvar+name%3D%27name%27%3E%3Cstring%3EShipment%3C%2Fstring%3E%3C%2Fvar%3E%3C%2Fstruct%3E%3Cstruct%3E%3Cvar+name%3D%27validators%27%3E%3Cstring%3Eblank%3C%2Fstring%3E%3C%2Fvar%3E%3Cvar+name%3D%27name%27%3E%3Cstring%3EReport_Format%3C%2Fstring%3E%3C%2Fvar%3E%3C%2Fstruct%3E%3C%2Farray%3E%3C%2Fdata%3E%3C%2FwddxPacket%3E";
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();
 
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 
		//print result
		System.out.println(response.toString());
		if(response.toString().matches("/*FDXAPI0006*/") == true){
			System.out.println("There is order #FDXAPI0006");
		}
		else{
			System.out.println("No such order");
		}
 
	}

}
