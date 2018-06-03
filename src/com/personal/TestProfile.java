package com.personal;

public class TestProfile {
	public static void printProfile(IProfile profile) {
		profile.myBasicsInfo();
		profile.myHobbies();
	}
	public static void main(String[] args) {

		IProfile profile = new NandhuProfile();
		/*TestProfile.*/printProfile(profile);//class name doesn't need when calling a method in static
	}
}