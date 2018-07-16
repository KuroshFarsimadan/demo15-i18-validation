package ir.kuroshfarsimadan.bean.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CapitalDistrictValidator implements
		ConstraintValidator<CapitalDistrict, String> {

	public void initialize(CapitalDistrict paakaupunkiseutu) {

	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null || value.length() == 0) {
			return true;
		}
		return value.equalsIgnoreCase("Quebec City")
				|| value.equalsIgnoreCase("Ottawa")
				|| value.equalsIgnoreCase("Montreal")
				|| value.equalsIgnoreCase("Test");
	}
}