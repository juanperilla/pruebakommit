package com.kommit.pruebaingreso;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kommit.pruebaingreso.dto.Person;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import dnl.utils.text.table.TextTable;

public class Application {

	public static void main(String[] args) {
		
		String host = "https://swapi.dev/api/people/" ;
		
		String [] query = args[0].split(" ");
		
		String property = query[5];
		String value = query[7].substring(1, query[7].length()-1);
		
		try {

			HttpResponse <JsonNode> response = Unirest.get(host+"?page=1").asJson();
				
			
				String nextUrl;
				
				List<JSONObject> personsMaleGender = new ArrayList<JSONObject>();
				
				boolean flag = true;
				do {
					JSONObject obj = response.getBody().getObject();
					JSONArray array = new JSONArray(obj.get("results").toString());
					
					for(int i = 0; i < array.length(); i++) {
						JSONObject person = array.getJSONObject(i);
						if(person.get(property).toString().equals(value)) {
							personsMaleGender.add(person);
						}
					}
					
					nextUrl = obj.get("next").toString();
					if(nextUrl.equals("null"))
						flag = false;
					else 
						response = Unirest.get(nextUrl).asJson();
				}while(flag);

				List<Person> foundPersons = new ArrayList<Person>();
				for(JSONObject jsonObject : personsMaleGender) {
					foundPersons.add(new Person(jsonObject));
				}
				Object[][] resultTable = new Object[foundPersons.size()][16];
				for(int i = 0; i < foundPersons.size(); i++) {
					Person aux = foundPersons.get(i);
					resultTable[i][0] = aux.getFilms();
					resultTable[i][1] = aux.getHomeworld();
					resultTable[i][2] = aux.getGender();
					resultTable[i][3] = aux.getSkin_color();
					resultTable[i][4] = aux.getEdited();
					resultTable[i][5] = aux.getCreated();
					resultTable[i][6] = aux.getMass();
					resultTable[i][7] = aux.getVehicles();
					resultTable[i][8] = aux.getUrl();
					resultTable[i][9] = aux.getHair_color();
					resultTable[i][10] = aux.getBirth_year();
					resultTable[i][11] = aux.getEye_color();
					resultTable[i][12] = aux.getSpecies();
					resultTable[i][13] = aux.getStarships();
					resultTable[i][14] = aux.getName();
					resultTable[i][15] = aux.getHeight();
				}
				String[] columnNames = {"films","homeworld","gender","skin_color","edited","created","mass","vehicles","url","hair_color","birth_year","eye_color","species","starships","name","height"};
				TextTable table = new TextTable(columnNames, resultTable);
				table.printTable();
		} catch (UnirestException e) {
			e.printStackTrace();
		}
	}
	
}
