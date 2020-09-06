package com.example.demo;

public class Beer {
	private String name;
	private String profileName;

	public Beer(String name) {
		this.name = name;
	}

	public Beer(String name, String profileName) {
		this.name = name;
		this.profileName = profileName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	@Override
	public String toString() {
		return "Beer [name=" + name + ", profileName=" + profileName + "]";
	}
}