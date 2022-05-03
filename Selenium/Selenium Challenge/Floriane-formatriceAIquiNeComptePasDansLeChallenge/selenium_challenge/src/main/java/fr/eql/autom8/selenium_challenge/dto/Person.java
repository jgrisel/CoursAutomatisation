package fr.eql.autom8.selenium_challenge.dto;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String firstName;
	private String lastName;
	private String companyName;
	private String role;
	private String address;
	private String email;
	private String phoneNumber;

	public static List<Person> createEnglishPersons() {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("John", "Smith", "IT Solutions", "Analyst", "98 North Road", "jsmith@itsolutions.co.uk", "40716543298"));
		persons.add(new Person("Jane", "Dorsey", "MediCare", "Medical Engineer", "11 Crown Street", "jdorsey@mc.com", "40791345621"));
		persons.add(new Person("Albert", "Kipling", "Waterfront", "Accountant", "22 Guild Street", "kipling@waterfront.com", "40735416854"));
		persons.add(new Person("Michael", "Robertson", "MediCare", "IT Specialist", "17 Farburn Terrace", "mrobertson@mc.com", "40733652145"));
		persons.add(new Person("Doug", "Derrick", "Timepath Inc.", "Analyst", "99 Shire Oak Road", "dderrick@timepath.co.uk", "40799885412"));
		persons.add(new Person("Jessie", "Marlowe", "Aperture Inc.", "Scientist", "27 Cheshire Street", "jmarlowe@aperture.us", "40733154268"));
		persons.add(new Person("Stan", "Hamm", "Sugarwell", "Advisor", "10 Dam Road", "shamm@sugarwell.org", "40712462257"));
		persons.add(new Person("Michelle", "Norton", "Aperture Inc.", "Scientist", "13 White Rabbit Street", "mnorton@aperture.us", "40731254562"));
		persons.add(new Person("Stacy", "Shelby", "TechDev", "HR Manager", "19 Pineapple Boulevard", "sshelby@techdev.com", "40741785214"));
		persons.add(new Person("Lara", "Palmer", "Timepath Inc.", "Programmer", "87 Orange Street", "lpalmer@timepath.co.uk", "40731653845"));
		return persons;
	}

	public static List<Person> createJapanesePerson() {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person( "隆司","井上", "東京千代田（株）", "財務部", "東京都", "takashi.j@itsolutions.co.uk", "40791345621"));
		persons.add(new Person( "信弘","佐藤", "（株）北海札幌", "人事部", "北海道", "s.shin@mc.com", "40722345600"));
		persons.add(new Person("美佐子","林",  "九州福岡（株）", "情報部", "福岡", "misa.hayashi@waterfront.com", "40735416854"));
		persons.add(new Person( "理恵子","花田", "（株）香川松山", "営業", "香川", "h.rie@mc.com", "40733652145"));
		persons.add(new Person( "りさ","佐藤", "（株）大阪難波", "ITソリューション", "大阪", "r-sato@timepath.co.uk", "40799885412"));
		persons.add(new Person( "優斗","町田", "愛知名古屋（株）", "代理店", "名古屋", "you.mati@aperture.us", "40733154268"));
		persons.add(new Person( "ハマー","高橋", "（株）秋田海産", "アドバイザー", "秋田", "h.hama@sugarwell.org", "40712462257"));
		persons.add(new Person( "ロドリゲス","シェルビー", "（株）富山商店", "業務部", "富山", "s-rodo@aperture.us", "40731254562"));
		persons.add(new Person("美恵","那須",  "（株）高知松山", "総務部", "高知", "na_emi@techdev.com", "40741785214"));
		persons.add(new Person( "パーマー","ララ", "（株）長野信越", "情報システム", "長野", "rara.p@timepath.co.uk", "40731653845"));
		return persons;
	}


	public Person(String firstName, String lastName, String companyName, String role, String address, String email,
			String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.role = role;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", companyName=" + companyName + ", role="
				+ role + ", address=" + address + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}



}
