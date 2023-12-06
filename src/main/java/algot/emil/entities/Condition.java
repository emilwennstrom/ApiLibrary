package algot.emil.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Condition extends BaseEntity {

	private String bodySite;
	private String clinicalStatus;
	private String verificationStatus;
	private String category;
	private String severity;
	private String code;
	private String evidence;

	@ManyToOne
	private Patient patient;

	public String getBodySite() {
		return bodySite;
	}

	public void setBodySite(String bodySite) {
		this.bodySite = bodySite;
	}

	public String getClinicalStatus() {
		return clinicalStatus;
	}

	public void setClinicalStatus(String clinicalStatus) {
		this.clinicalStatus = clinicalStatus;
	}

	public String getVerificationStatus() {
		return verificationStatus;
	}

	public void setVerificationStatus(String verificationStatus) {
		this.verificationStatus = verificationStatus;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEvidence() {
		return evidence;
	}

	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}
