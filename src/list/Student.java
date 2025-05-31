package list;

public class Student {
	private int registrationNo;
	private String name;
	private long phoneNo;
	private String qualification;
	private String emailId;

	public Student(int registrationNo, String name, long phoneNo, String qualification, String emailId) {
		super();
		this.registrationNo = registrationNo;
		this.name = name;
		this.phoneNo = phoneNo;
		this.qualification = qualification;
		this.emailId = emailId;
	}

	public int getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(int registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Student [registrationNo=" + registrationNo + ", name=" + name + ", phoneNo=" + phoneNo
				+ ", qualification=" + qualification + ", emailId=" + emailId + "]";
	}

}
