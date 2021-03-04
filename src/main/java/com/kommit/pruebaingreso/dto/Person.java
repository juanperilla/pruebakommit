package com.kommit.pruebaingreso.dto;

import org.json.JSONObject;

public class Person {

	private String name;
	private String height;
	private String mass;
	private String hair_color;
	private String skin_color;
	private String eye_color;
	private String birth_year;
	private String gender;
	private String homeworld;
	private String films;
	private String species;
	private String vehicles;
	private String starships;
	private String created;
	private String edited;
	private String url;
	
	
	
	public Person(String name, String height, String mass, String hair_color, String skin_color, String eye_color,
			String birth_year, String gender, String homeworld, String films, String species,
			String vehicles, String starships, String created, String edited, String url) {
		super();
		this.name = name;
		this.height = height;
		this.mass = mass;
		this.hair_color = hair_color;
		this.skin_color = skin_color;
		this.eye_color = eye_color;
		this.birth_year = birth_year;
		this.gender = gender;
		this.homeworld = homeworld;
		this.films = films;
		this.species = species;
		this.vehicles = vehicles;
		this.starships = starships;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}

	public Person() {
		
	}

	public Person(JSONObject jsonObject) {
		this.films = jsonObject.get("films").toString();
		this.homeworld = jsonObject.get("homeworld").toString();
		this.gender = jsonObject.get("gender").toString();
		this.skin_color = jsonObject.get("skin_color").toString();
		this.edited = jsonObject.get("edited").toString();
		this.created = jsonObject.get("created").toString();
		this.mass = jsonObject.get("mass").toString();
		this.vehicles = jsonObject.get("vehicles").toString();
		this.url = jsonObject.get("url").toString();
		this.hair_color = jsonObject.get("hair_color").toString();
		this.birth_year = jsonObject.get("birth_year").toString();
		this.eye_color = jsonObject.get("eye_color").toString();
		this.species = jsonObject.get("species").toString();
		this.starships = jsonObject.get("starships").toString();
		this.name = jsonObject.get("name").toString();
		this.height = jsonObject.get("height").toString();
		
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getHair_color() {
		return hair_color;
	}

	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}

	public String getSkin_color() {
		return skin_color;
	}

	public void setSkin_color(String skin_color) {
		this.skin_color = skin_color;
	}

	public String getEye_color() {
		return eye_color;
	}

	public void setEye_color(String eye_color) {
		this.eye_color = eye_color;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}

	public String getFilms() {
		return films;
	}

	public void setFilms(String films) {
		this.films = films;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getVehicles() {
		return vehicles;
	}

	public void setVehicles(String vehicles) {
		this.vehicles = vehicles;
	}

	public String getStarships() {
		return starships;
	}

	public void setStarships(String starships) {
		this.starships = starships;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getEdited() {
		return edited;
	}

	public void setEdited(String edited) {
		this.edited = edited;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
