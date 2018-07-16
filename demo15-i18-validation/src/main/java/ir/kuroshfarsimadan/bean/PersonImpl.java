package ir.kuroshfarsimadan.bean;

//standardeja jsr303-annotaatioita
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
//hibernatevalidaattorin oma annotaatio
import org.hibernate.validator.constraints.Email;
//itse tehty validaattoriannotaatio

import ir.kuroshfarsimadan.bean.validation.CapitalDistrict;

public class PersonImpl implements Person {

	private int id;

	@Size(min = 1, max = 255)
	private String firstname;

	@Size(min = 1, max = 255)
	private String lastname;

	@Size(min = 1, max = 255)
	@Email
	private String email;

	@Size(min = 1, max = 255)
	private String address;

	@Pattern(regexp = "\\d{5}")
	private String postalcode;

	@Size(min = 1, max = 255)
	@CapitalDistrict
	private String postaloffice;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname
	 *            the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the postalcode
	 */
	public String getPostalcode() {
		return postalcode;
	}

	/**
	 * @param postalcode
	 *            the postalcode to set
	 */
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	/**
	 * @return the postaloffice
	 */
	public String getPostaloffice() {
		return postaloffice;
	}

	/**
	 * @param postaloffice
	 *            the postaloffice to set
	 */
	public void setPostaloffice(String postaloffice) {
		this.postaloffice = postaloffice;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonImpl [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", address=" + address + ", postalcode=" + postalcode + ", postaloffice=" + postaloffice + "]";
	}

}
