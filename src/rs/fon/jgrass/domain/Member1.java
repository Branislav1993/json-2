package rs.fon.jgrass.domain;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Member1 {

	@SerializedName("id")
	private int memberId;

	@SerializedName("firstName")
	private String name;

	@SerializedName("lastName")
	private String surname;

	@SerializedName("birthDate")
	private Date dateOfBirth;

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Member1 [memberId=" + memberId + ", name=" + name + ", surname=" + surname + ", dateOfBirth="
				+ dateOfBirth + "]";
	}

}
