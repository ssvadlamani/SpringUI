package com.spring.saas.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserVO implements UserDetails,
CredentialsContainer, Serializable{
	
	


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The password. */
	private String password;

	/** The username. */
	private String username;

	/** The type. */
	private String type;

	/** The account non expired. */
	private boolean accountNonExpired;

	/** The account non locked. */
	private boolean accountNonLocked;

	/** The credentials non expired. */
	private boolean credentialsNonExpired;

	/** The enabled. */
	private boolean enabled;

	// private String userName;
	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The temporary pwd. */
	private boolean temporaryPwd;

	/** The email address. */
	private String emailAddress;

	// private String phoneNumber;
	/** The account_enabled. */
	private boolean account_enabled;

	/** The account_locked. */
	private boolean account_locked;

	/** The account_expired. */
	private boolean account_expired;

	/** The created_by. */
	private String created_by;

	/** The created_on. */
	private String created_on;

	/** The modified_by. */
	private String modified_by;

	/** The modified_on. */
	private Date modified_on;

	/** The new password. */
	private String newPassword;

	/** The confirm password. */
	private String confirmPassword;

	/** The old password. */
	private String oldPassword;

	/** The roles. */
	private List<RoleVO> roles;

	/** The regions. */
	private List<String> regions;

	/** The privileges. */
	private List<PrivilegesVO> privileges;

	/** The user questions. */
	private List<SecurityQuestionsVO> userQuestions;

	/** The system questions. */
	private List<SecurityQuestionsVO> systemQuestions;


	/** The role list. */
	private List<String> roleList;

	/** The privileges list. */
	private List<String> privilegesList;

	/** The authorities. */
	private Collection<GrantedAuthority> authorities;

	/** The is password modified. */
	private boolean isPasswordModified;

	/** The is security question modified. */
	private boolean isSecurityQuestionModified;

	/** The successful processed records. */
	private int successfulProcessedRecords;

	/** The id. */
	private Long id;

	/** The id no. */
	private String idNo;

	/** The user list. */
	private List<Integer> userList;

	
	/** Login Failure count for user */
	private Long loginFailureCount;

	/** Time stamp of last Login Failure */
	private Timestamp lastLoginFailureOn;

	/**
	 * Gets the pos response.
	 *
	 * @return the pos response
	 */



	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#getAuthorities()
	 */
	public Collection<GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return this.authorities;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Checks if is temporary pwd.
	 *
	 * @return true, if is temporary pwd
	 */
	public boolean isTemporaryPwd() {
		return this.temporaryPwd;
	}

	/**
	 * Sets the temporary pwd.
	 *
	 * @param isTemporaryPwd the new temporary pwd
	 */
	public void setTemporaryPwd(boolean isTemporaryPwd) {
		this.temporaryPwd = isTemporaryPwd;
	}

	/**
	 * Gets the email address.
	 *
	 * @return the email address
	 */
	public String getEmailAddress() {
		return this.emailAddress;
	}

	/**
	 * Sets the email address.
	 *
	 * @param emailAddress the new email address
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/*
	 * public String getPhoneNumber() { return phoneNumber; }
	 * 
	 * public void setPhoneNumber(String phoneNumber) { this.phoneNumber =
	 * phoneNumber; }
	 */

	/**
	 * Checks if is account_enabled.
	 *
	 * @return true, if is account_enabled
	 */
	public boolean isAccount_enabled() {
		return this.account_enabled;
	}

	/**
	 * Sets the account_enabled.
	 *
	 * @param account_enabled the new account_enabled
	 */
	public void setAccount_enabled(boolean account_enabled) {
		this.account_enabled = account_enabled;
	}

	/**
	 * Checks if is account_locked.
	 *
	 * @return true, if is account_locked
	 */
	public boolean isAccount_locked() {
		return this.account_locked;
	}

	/**
	 * Sets the account_locked.
	 *
	 * @param account_locked the new account_locked
	 */
	public void setAccount_locked(boolean account_locked) {
		this.account_locked = account_locked;
	}

	/**
	 * Checks if is account_expired.
	 *
	 * @return true, if is account_expired
	 */
	public boolean isAccount_expired() {
		return this.account_expired;
	}

	/**
	 * Sets the account_expired.
	 *
	 * @param account_expired the new account_expired
	 */
	public void setAccount_expired(boolean account_expired) {
		this.account_expired = account_expired;
	}

	/**
	 * Gets the regions.
	 *
	 * @return the regions
	 */
	public List<String> getRegions() {
		return this.regions;
	}

	/**
	 * Sets the regions.
	 *
	 * @param regions the new regions
	 */
	public void setRegions(List<String> regions) {
		this.regions = regions;
	}

	/**
	 * Gets the created_by.
	 *
	 * @return the created_by
	 */
	public String getCreated_by() {
		return this.created_by;
	}

	/**
	 * Sets the created_by.
	 *
	 * @param created_by the new created_by
	 */
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	/**
	 * Gets the created_on.
	 *
	 * @return the created_on
	 */
	public String getCreated_on() {
		return this.created_on;
	}

	/**
	 * Sets the created_on.
	 *
	 * @param created_on the new created_on
	 */
	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}

	/**
	 * Gets the modified_by.
	 *
	 * @return the modified_by
	 */
	public String getModified_by() {
		return this.modified_by;
	}

	/**
	 * Sets the modified_by.
	 *
	 * @param modified_by the new modified_by
	 */
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	/**
	 * Gets the modified_on.
	 *
	 * @return the modified_on
	 */
	public Date getModified_on() {
		return this.modified_on;
	}

	/**
	 * Gets the privileges list.
	 *
	 * @return the privileges list
	 */
	public List<String> getPrivilegesList() {
		return this.privilegesList;
	}

	/**
	 * Sets the privileges list.
	 *
	 * @param privilegesList the new privileges list
	 */
	public void setPrivilegesList(
			List<String> privilegesList) {
		this.privilegesList = privilegesList;
	}

	/**
	 * Sets the modified_on.
	 *
	 * @param modified_on the new modified_on
	 */
	public void setModified_on(Date modified_on) {
		this.modified_on = modified_on;
	}

	/**
	 * Gets the new password.
	 *
	 * @return the new password
	 */
	public String getNewPassword() {
		return this.newPassword;
	}

	/**
	 * Sets the new password.
	 *
	 * @param newPassword the new new password
	 */
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Sets the account non expired.
	 *
	 * @param accountNonExpired the new account non expired
	 */
	public void setAccountNonExpired(
			boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	/**
	 * Sets the account non locked.
	 *
	 * @param accountNonLocked the new account non locked
	 */
	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	/**
	 * Sets the credentials non expired.
	 *
	 * @param credentialsNonExpired the new credentials non expired
	 */
	public void setCredentialsNonExpired(
			boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	/**
	 * Sets the enabled.
	 *
	 * @param enabled the new enabled
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Gets the confirm password.
	 *
	 * @return the confirm password
	 */
	public String getConfirmPassword() {
		return this.confirmPassword;
	}

	/**
	 * Sets the confirm password.
	 *
	 * @param confirmPassword the new confirm password
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/**
	 * Gets the old password.
	 *
	 * @return the old password
	 */
	public String getOldPassword() {
		return this.oldPassword;
	}

	/**
	 * Sets the old password.
	 *
	 * @param oldPassword the new old password
	 */
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	/**
	 * Gets the roles.
	 *
	 * @return the roles
	 */
	public List<RoleVO> getRoles() {
		return this.roles;
	}

	/**
	 * Sets the roles.
	 *
	 * @param roles the new roles
	 */
	public void setRoles(List<RoleVO> roles) {
		this.roles = roles;
	}

	/**
	 * Gets the privileges.
	 *
	 * @return the privileges
	 */
	public List<PrivilegesVO> getPrivileges() {
		return this.privileges;
	}

	/**
	 * Sets the privileges.
	 *
	 * @param privileges the new privileges
	 */
	public void setPrivileges(List<PrivilegesVO> privileges) {
		this.privileges = privileges;
	}

	/**
	 * Gets the user questions.
	 *
	 * @return the user questions
	 */
	public List<SecurityQuestionsVO> getUserQuestions() {
		return this.userQuestions;
	}

	/**
	 * Sets the user questions.
	 *
	 * @param userQuestions the new user questions
	 */
	public void setUserQuestions(
			List<SecurityQuestionsVO> userQuestions) {
		this.userQuestions = userQuestions;
	}

	/**
	 * Gets the system questions.
	 *
	 * @return the system questions
	 */
	public List<SecurityQuestionsVO> getSystemQuestions() {
		return this.systemQuestions;
	}

	/**
	 * Sets the system questions.
	 *
	 * @param systemQuestions the new system questions
	 */
	public void setSystemQuestions(
			List<SecurityQuestionsVO> systemQuestions) {
		this.systemQuestions = systemQuestions;
	}
	
	/**
	 * Gets the role list.
	 *
	 * @return the role list
	 */
	public List<String> getRoleList() {
		return this.roleList;
	}

	/**
	 * Sets the role list.
	 *
	 * @param roleList the new role list
	 */
	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}


	/**
	 * Gets the successful processed records.
	 *
	 * @return the successful processed records
	 */
	public int getSuccessfulProcessedRecords() {
		return this.successfulProcessedRecords;
	}

	/**
	 * Sets the successful processed records.
	 *
	 * @param successfulProcessedRecords the new successful processed records
	 */
	public void setSuccessfulProcessedRecords(
			int successfulProcessedRecords) {
		this.successfulProcessedRecords = successfulProcessedRecords;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the user list.
	 *
	 * @return the user list
	 */
	public List<Integer> getUserList() {
		return this.userList;
	}

	/**
	 * Sets the user list.
	 *
	 * @param userList the new user list
	 */
	public void setUserList(List<Integer> userList) {
		this.userList = userList;
	}

	/**
	 * Sets the authorities.
	 *
	 * @param authorities the new authorities
	 */
	public void setAuthorities(
			Collection<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	/*
	 * This method is used to add authorities.
	 * 
	 * @param simpleAuthority
	 */
	/**
	 * Adds the authorities.
	 *
	 * @param simpleAuthority the simple authority
	 */
	public void addAuthorities(
			SimpleGrantedAuthority simpleAuthority) {
		Collections.addAll(this.authorities,
				simpleAuthority);

	}

	/**
	 * Sets the checks if is password modified.
	 *
	 * @param isPasswordModified the new checks if is password modified
	 */
	public void setIsPasswordModified(
			boolean isPasswordModified) {
		this.isPasswordModified = isPasswordModified;
	}

	/**
	 * Gets the checks if is password modified.
	 *
	 * @return the checks if is password modified
	 */
	public boolean getIsPasswordModified() {
		return this.isPasswordModified;
	}

	/**
	 * Sets the checks if is security question modified.
	 *
	 * @param isSecurityQuestionModified the new checks if is security question modified
	 */
	public void setIsSecurityQuestionModified(
			boolean isSecurityQuestionModified) {
		this.isSecurityQuestionModified = isSecurityQuestionModified;
	}

	/**
	 * Gets the checks if is security question modified.
	 *
	 * @return the checks if is security question modified
	 */
	public boolean getIsSecurityQuestionModified() {
		return this.isSecurityQuestionModified;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#getPassword()
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#getUsername()
	 */
	public String getUsername() {
		return this.username;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonExpired()
	 */
	public boolean isAccountNonExpired() {
		return this.accountNonExpired;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonLocked()
	 */
	public boolean isAccountNonLocked() {
		return this.accountNonLocked;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isCredentialsNonExpired()
	 */
	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isEnabled()
	 */
	public boolean isEnabled() {
		return this.enabled;
	}

	/**
	 * This method is used to set property erase credentials.
	 */
	public void eraseCredentials() {

	}

	/**
	 * Gets the id no.
	 *
	 * @return the id no
	 */
	public String getIdNo() {
		return this.idNo;
	}

	/**
	 * Sets the id no.
	 *
	 * @param idNo the new id no
	 */
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * This method gives the unique hash code for the object.
	 *
	 * @return int
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ (this.id == null ? 0 : this.id.hashCode());
		result = prime
				* result
				+ (this.username == null ? 0
						: this.username.hashCode());
		return result;
	}

	/**
	 * This method is used to compare if the object is equal to the specified
	 * object.
	 *
	 * @param obj with which comparison needs to be made
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final UserVO other = (UserVO) obj;
		if (this.id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!this.id.equals(other.id)) {
			return false;
		}
		if (this.username == null) {
			if (other.username != null) {
				return false;
			}
		} else if (!this.username.equals(other.username)) {
			return false;
		}
		return true;
	}

	/**
	 * Sets the loginFailureCount.
	 * 
	 * @param loginFailureCount the loginFailureCount to set
	 */
	public void setLoginFailureCount(Long loginFailureCount) {
		this.loginFailureCount = loginFailureCount;
	}

	/**
	 * Gets the loginFailureCount.
	 * 
	 * @return the loginFailureCount
	 */
	public Long getLoginFailureCount() {
		return loginFailureCount;
	}

	/**
	 * Sets the lastLoginFailureOn.
	 * 
	 * @param lastLoginFailureOn the lastLoginFailureOn to set
	 */
	public void setLastLoginFailureOn(Timestamp lastLoginFailureOn) {
		this.lastLoginFailureOn = lastLoginFailureOn;
	}

	/**
	 * Gets the lastLoginFailureOn.
	 * 
	 * @return the lastLoginFailureOn
	 */
	public Timestamp getLastLoginFailureOn() {
		return lastLoginFailureOn;
	}


}
