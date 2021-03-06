package entity;

public class employeeInfoTab {

	private int employeeNumber;
	private String employeePwd;
	private String employeeName;
	private String employeeID;
	private String employeeGender;
	private String employeeTel;
	private String employeeAddress;
	private String employeeOutTime;
	private int rankID;
	private int departmentID;

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeePwd() {
		return employeePwd;
	}

	public void setEmployeePwd(String employeePwd) {
		this.employeePwd = employeePwd;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public String getEmployeeTel() {
		return employeeTel;
	}

	public void setEmployeeTel(String employeeTel) {
		this.employeeTel = employeeTel;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeOutTime() {
		return employeeOutTime;
	}

	public void setEmployeeOutTime(String employeeOutTime) {
		this.employeeOutTime = employeeOutTime;
	}

	public int getRankID() {
		return rankID;
	}

	public void setRankID(int rankID) {
		this.rankID = rankID;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departmentID;
		result = prime * result
				+ ((employeeAddress == null) ? 0 : employeeAddress.hashCode());
		result = prime * result
				+ ((employeeGender == null) ? 0 : employeeGender.hashCode());
		result = prime * result
				+ ((employeeID == null) ? 0 : employeeID.hashCode());
		result = prime * result
				+ ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + employeeNumber;
		result = prime * result
				+ ((employeeOutTime == null) ? 0 : employeeOutTime.hashCode());
		result = prime * result
				+ ((employeePwd == null) ? 0 : employeePwd.hashCode());
		result = prime * result
				+ ((employeeTel == null) ? 0 : employeeTel.hashCode());
		result = prime * result + rankID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employeeInfoTab other = (employeeInfoTab) obj;
		if (departmentID != other.departmentID)
			return false;
		if (employeeAddress == null) {
			if (other.employeeAddress != null)
				return false;
		} else if (!employeeAddress.equals(other.employeeAddress))
			return false;
		if (employeeGender == null) {
			if (other.employeeGender != null)
				return false;
		} else if (!employeeGender.equals(other.employeeGender))
			return false;
		if (employeeID == null) {
			if (other.employeeID != null)
				return false;
		} else if (!employeeID.equals(other.employeeID))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeeNumber != other.employeeNumber)
			return false;
		if (employeeOutTime == null) {
			if (other.employeeOutTime != null)
				return false;
		} else if (!employeeOutTime.equals(other.employeeOutTime))
			return false;
		if (employeePwd == null) {
			if (other.employeePwd != null)
				return false;
		} else if (!employeePwd.equals(other.employeePwd))
			return false;
		if (employeeTel == null) {
			if (other.employeeTel != null)
				return false;
		} else if (!employeeTel.equals(other.employeeTel))
			return false;
		if (rankID != other.rankID)
			return false;
		return true;
	}

}
