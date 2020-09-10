package com.cts.apis;




	import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.json.simple.JSONObject;
import org.junit.Assert;

import com.google.common.collect.Ordering;
import com.google.gson.JsonObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.internal.http.Method;
import com.jayway.restassured.mapper.ObjectMapper;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.junit.Assert.assertTrue;

	public class Apibank {
		List<String> ID;
	    List<String> Holdertype;
	    static List<String> Bala;
	    static List<String> Accno;
	    List<String> allacc;
		

		public static void apiPostRequest(String title, String Type,String Holdertype,String AccountNo,String Balance) throws IOException

	    {
			
			  Path path = Paths.get("src/test/resources/api.body/data.json");

	          String json = new String(Files.readAllBytes(path));

	         json=json.replace("titleArg", title).replace("typeArg", Type).replace("HolderArg", Holdertype).replace("AccountArg", AccountNo).replace("BalanceArg", Balance);
	         
			
			
	        com.jayway.restassured.response.Response response=given().relaxedHTTPSValidation().body(json.toString()).when().post("http://18.222.188.206:3333/accounts");
	        
	        	          response.then().assertThat().statusCode(201);
	        	          response.prettyPrint();

			

	        

	}
		public static void apiRequest(String title) throws IOException

	    {

	          Path path = Paths.get("src/test/resources/api.body/puttitle.json");

	          String json = new String(Files.readAllBytes(path));

	         json=json.replace("titleArg", title);
	         

	          com.jayway.restassured.response.Response response=given().relaxedHTTPSValidation().when().body(json).put("http://18.222.188.206:3333/accounts/11");
	          
	          response.then().assertThat().statusCode(200);
	    response.prettyPrint();
	}
		
		
		
	
	public static void getRequest()
	{
		Response resp = RestAssured.get("http://18.222.188.206:3333/accounts");

	}
	public static void thenStatusCode()
	
	{
		Response resp = RestAssured.get("http://18.222.188.206:3333/accounts");
		int code=resp.getStatusCode();
	
		System.out.println("Status code is"+code);
		String codedis= resp.asString();
		Assert.assertEquals(200, code);
	}
	
	
	
	public static void dataDetails()
	{
		Response resp = RestAssured.get("http://18.222.188.206:3333/accounts");
		String data = resp.asString();
	
		System.out.println("Data is"+data);
	}
	
	public static	void updateUserDetailsTest(String title, String Type,String Holdertype,String AccountNo,String Balance) {
    RequestSpecification request=RestAssured.given();
    
    request.header("Content-Type","application/json");
    
    JSONObject json= new JSONObject();
   
    json.put(title,title);
    json.put(Type,Type);
    json.put(Holdertype,Holdertype);
    json.put(AccountNo,AccountNo);
    json.put(Balance,Balance);
    //json.put("id", "66");
    
    request.body(json.toJSONString());
    
  Response response0=  request.post("http://18.222.188.206:3333/accounts");
  //Response resp1 = RestAssured.get("http://18.222.188.206:3333/accounts?id=3&id=4");
	String postdata = response0.asString();

	System.out.println("Data is"+postdata);
  
  //response0.prettyPrint();
	
 }

	
	
	public static void deleteAccount()
	
	{
		 RequestSpecification request=RestAssured.given();
		 Response response=  request.delete("http://18.222.188.206:3333/accounts/io");
		 
	}
	public static void idDetails()
	
	{
		Response resp1 = RestAssured.get("http://18.222.188.206:3333/accounts?id=3&id=4");
		
	}

public static void idStatusCode()
{
	Response resp1 = RestAssured.get("http://18.222.188.206:3333/accounts?id=3&id=4");
	int code1=resp1.getStatusCode();

	System.out.println("Status code is"+code1);
	String codedis1= resp1.asString();
	Assert.assertEquals(200, code1);
}
	
public static void idDataDetails()
{
	Response resp1 = RestAssured.get("http://18.222.188.206:3333/accounts?id=3&id=4");
	String iddata = resp1.asString();

	System.out.println("Data is"+iddata);
}



public static void jointAccDetails()

{
	Response resp2 = RestAssured.get("http://18.222.188.206:3333/accounts?Holder type=joint");
	
}

public static void jointAccStatusCode()
{
Response resp2 = RestAssured.get("http://18.222.188.206:3333/accounts?Holder type=joint");
int code2=resp2.getStatusCode();

System.out.println("Status code is"+code2);
String codedis= resp2.asString();
Assert.assertEquals(200, code2);
}

public static void jointAccDataDetails()
{
Response resp2 = RestAssured.get("http://18.222.188.206:3333/accounts?Holder type=joint");
String jadata = resp2.asString();

System.out.println("Data is"+jadata);
}



//public static void SortDetails()
//{
//	
//	
//	final String Type[] =  {"joint", "Savings",
//		    "Current","basic"};
//	List<String> list=Arrays.asList(Type);
//	Collections.sort(list);
//	 com.jayway.restassured.response.Response response=given().relaxedHTTPSValidation().when().body(Type).get("http://18.222.188.206:3333/accounts/11");
//     
//     response.then().assertThat().statusCode(200);
//response.prettyPrint();
		
	
//	RestAssured.basePath = "http://18.222.188.206:3333/accounts";
//	Response response = given()
//	        .queryParam("sort", "Type")
//	        .contentType(ContentType.JSON)
//	        .accept(ContentType.JSON)
//	        .when().get()
//	        .then().statusCode(200).extract().response();
//	List<String> jsonResponse = response.jsonPath().getList("Type");
//	
////	assertTrue(Ordering.natural().isOrdered(jsonResponse));
	 
	
	

//public static boolean isInOrder(List<Integer> stringList, Ordering<Comparable> natural) {
//	// TODO Auto-generated method stub
//	
//	List<String> id = given()
//	        .when()
//	        .get("http://18.222.188.206:3333/accounts")
//	        .then()
//	        .extract()
//	        .jsonPath()
//	        .getList("id");
//
//	List<Integer> integerList = id
//	        .stream()
//	        .map(x-> Integer.parseInt(x))
//	        .collect(Collectors.toList());
//
//	boolean isInDescOrder = isInOrder(integerList, Ordering.natural());
//	return false;
//}

public static void sortAccDetails()

{
	Response resps = RestAssured.get("http://18.222.188.206:3333/accounts?_sort=title&_order=asc");
	
}

public static void sortAccStatusCode()
{
Response resps = RestAssured.get("http://18.222.188.206:3333/accounts?_sort=title&_order=asc");
int codes=resps.getStatusCode();

System.out.println("Status code is"+codes);
String codedissort= resps.asString();
Assert.assertEquals(200, codes);
}

public static void sortAccDataDetails()
{
Response resps = RestAssured.get("http://18.222.188.206:3333/accounts?_sort=title&_order=asc");
String sortdata = resps.asString();

System.out.println("sort Data is"+sortdata);
}



public static void PaginationDetails()
{
	Response resppage = RestAssured.get("http://18.222.188.206:3333/accounts?_page=3");
}
public static void PagniationStatusCode()
{
	Response resppage = RestAssured.get("http://18.222.188.206:3333/accounts?_page=3");
	int codepage=resppage.getStatusCode();

	System.out.println("Status code is"+codepage);
	String codedispage= resppage.asString();
	Assert.assertEquals(200, codepage);
}
public static void Paginationdatadetails()
{
	Response resppage = RestAssured.get("http://18.222.188.206:3333/accounts?_page=3");
	String pagedata = resppage.asString();

	System.out.println("paginated data is"+pagedata);	
}





public static void accountEnd(int arg1)
{
    int sum=0;
     int s;
     int i=0;
      Response  response=RestAssured.get("http://18.222.188.206:3333/accounts");
        Accno=response.jsonPath().getList("AccountNo");
        while(i<=Accno.size())
        {
            try
            {
            if(Accno.get(i)!=null)
            {
            s=Integer.parseInt(Accno.get(i));
                    if(s%100==arg1)
            {
                sum++;
            }
        }
            }
            catch(Exception e)
            {
               
            }
            i++;
       
    }
        System.out.println("The number of accounts number ending with 02 = "+sum);
}


public static void balanceDetails(int arg1)

{int sum=0;
 int s;
 int i=0;
  Response  response=RestAssured.get("http://18.222.188.206:3333/accounts");
    Bala=response.jsonPath().getList("Balance");
    while(i<=Bala.size())
    {
        try
        {
        if(Bala.get(i)!=null)
        {
        s=Integer.parseInt(Bala.get(i));
                if(s>arg1)
        {
            sum++;
        }
    }
        }
        catch(Exception e)
        {
           
        }
        i++;
   
}System.out.println("The number of accounts with balance 200000= "+sum);
}



//public class apimethods {
//	   
//    Response response;
//    List<String> ID;
//    List<String> Holdertype;
//    List<String> Bala;
//    List<String> Accno;
//    List<String> allacc;
//    public  void fnapigetvalues()
//    {
//com.jayway.restassured.response.Response response= given().relaxedHTTPSValidation().when().get("http://18.222.188.206:3333/accounts");
//response.then().assertThat().statusCode(200);
//response.prettyPrint();
//    }
//    public void fnapipostvalues(String title,String type,String Holdertype,String accno,String Balance ) throws IOException
//    {
//        Path path=Paths.get("src/test/resources/api/body/body.json");
//        String json=new String(Files.readAllBytes(path));
//        json=json.replace("titleArg",title).replace("typeArge",type).replace("HolderArge", Holdertype).replace("AccountArg",accno).replace("Balarge", Balance);
//        com.jayway.restassured.response.Response response= given().relaxedHTTPSValidation().when().body(json).post("http://18.222.188.206:3333/accounts");
//        response.then().assertThat().statusCode(201);
//        response.prettyPrint();
//        }
//   
//    public void fncountacc()
//    {int count=0;
//    response=RestAssured.get("http://18.222.188.206:3333/accounts");
//    ID=response.jsonPath().getList("id");
//    for(int i=0;i<=ID.size();i++)
//    {
//        count++;
//    }
//    System.out.println("The total number of accounts present in this page="+count);
//    }
//   
//   
//   
//    public void fnjointacc()
//    {
//        int c=0;
//        response=RestAssured.get("http://18.222.188.206:3333/accounts");
//        Holdertype=response.jsonPath().getList("'Holder type'");
//        System.out.println(Holdertype);
//        for(int i=0;i<Holdertype.size();i++)
//        {
//        if(Holdertype.get(i)!=null)
//        {
//        if(Holdertype.get(i).equalsIgnoreCase("joint"))
//        {
//            c++;
//        }
//        }
//        }
//        System.out.println("The total number of accounts that are of the type joint = "+c);
//       
//       
//    }
////    public void fnbalance(int arg1)
////   
////    {int sum=0;
////     int s;
////     int i=0;
////        response=RestAssured.get("http://18.222.188.206:3333/accounts");
////        Bala=response.jsonPath().getList("Balance");
////        while(i<=Bala.size())
////        {
////            try
////            {
////            if(Bala.get(i)!=null)
////            {
////            s=Integer.parseInt(Bala.get(i));
////                    if(s>arg1)
////            {
////                sum++;
////            }
////        }
////            }
////            catch(Exception e)
////            {
////               
////            }
////            i++;
////       
////    }System.out.println("The number of accounts with balance 200000= "+sum);
////    }
////   
////    public void fnaccountend(int arg1)
////    {
////        int sum=0;
////         int s;
////         int i=0;
////            response=RestAssured.get("http://18.222.188.206:3333/accounts");
////            Accno=response.jsonPath().getList("AccountNo");
////            while(i<=Accno.size())
////            {
////                try
////                {
////                if(Accno.get(i)!=null)
////                {
////                s=Integer.parseInt(Accno.get(i));
////                        if(s%100==arg1)
////                {
////                    sum++;
////                }
////            }
////                }
////                catch(Exception e)
////                {
////                   
////                }
////                i++;
////           
////        }
////            System.out.println("The number of accounts number ending with 02 = "+sum);
////    }
//   
//    public void fnacc3and4(int arg1,int arg2)
//    {
//                                                                                             
//        com.jayway.restassured.response.Response response= given().relaxedHTTPSValidation().when().get("http://18.222.188.206:3333/accounts"+"?id="+arg1+"&id="+arg2);
//        response.then().assertThat().statusCode(200);
//        response.prettyPrint();
//       
//       
//    }
//    public void fnsort()
//    {
//        com.jayway.restassured.response.Response response= given().relaxedHTTPSValidation().when().get("http://18.222.188.206:3333/accounts?_sort=title&_order=asc");
//        response.then().assertThat().statusCode(200);
//        System.out.println("The accounts that are sorted according to it's title is displayed below:");
//        response.prettyPrint();
//       
//    }
//   
//    public void fnpage()
//    {
//        com.jayway.restassured.response.Response response= given().relaxedHTTPSValidation().when().get("http://18.222.188.206:3333/accounts?_page=3");
//        response.then().assertThat().statusCode(200);
//        System.out.println("The list of accounts in the page 3 is displayed below:");
//        response.prettyPrint();
//    }
//   
//}
//   
//
//
//
}