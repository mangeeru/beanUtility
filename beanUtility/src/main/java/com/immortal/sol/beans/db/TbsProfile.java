package com.immortal.sol.beans.db;

import java.util.Date;

public class TbsProfile {
	
	private Long	profile_id;

	private Integer	profile_type;

	private Integer	subscriber_category;

	private Integer	risk_category;

	private Long	parent_profile_id;

	private Integer	application_mode;

	private String	first_name;

	private String	middle_name;

	private String	last_name;

	private Date	date_of_birth;

	private Integer	gender;

	private String	occupation;

	private Integer	language_id;

	private Integer	country;

	private String	nationality;

	//private String	organisation;

	//private String	business_type;

	//private String	company_registration_id;

	private Date	company_established_date;

	//private Date	employed_date;

	private Integer	email_notification;

	private String	notification_email_id;

	private Integer	sms_notification;

	private String	sms_numbers;

	private String	contact_number_1;

	private String	contact_number_2;

	private String	contact_email_id;

	//private String	bill_currency;

	//private String	preferred_currency;

	//private Integer	statement_enabled;

	//private Integer	tax_code;

	//private Integer	bill_cycle_id;

	private String	create_user;

	private String	modify_user;

	private Date	create_date;

	private String	title;

	private Date	modify_date;

	private Integer	entity_id;

	//private Integer	access_level;

	private String	company_id;

	private String	vat_no;

	private String	fax;

	//private String	comment;

	//private String	customer_type;

	//private String	posid;

	//private String	teamid;

	//private String	third_party_login;

	//private String	contractid;

	//private String	wholesale_customer;

	//private String	secure_customer;

	private Integer	subscriber_sub_category;

	//private String	owner_group_id;

	//private String	company_name;

	private String	op_param_1;

	private String	op_param_2;

	private String	op_param_3;

	private String	op_param_4;

	private String	op_param_5;

	private String	op_param_6;

	private String	op_param_7;

	private String	op_param_8;

	private String	op_param_9;

	private String	op_param_10;

	private String	first_name_ol;

	private String	middle_name_ol;

	private String	last_name_ol;

	//private String	company_name_ol;

	//private String	operator_contact_id1;

	//private String	operator_contact_id2;
	
	private Integer	status;
	
	private Date deactivation_date;

	public Long getProfile_id() {
		return profile_id;
	}

	public void setProfile_id(Long profile_id) {
		this.profile_id = profile_id;
	}

	public Integer getProfile_type() {
		return profile_type;
	}

	public void setProfile_type(Integer profile_type) {
		this.profile_type = profile_type;
	}

	public Integer getSubscriber_category() {
		return subscriber_category;
	}

	public void setSubscriber_category(Integer subscriber_category) {
		this.subscriber_category = subscriber_category;
	}

	public Integer getRisk_category() {
		return risk_category;
	}

	public void setRisk_category(Integer risk_category) {
		this.risk_category = risk_category;
	}

	public Long getParent_profile_id() {
		return parent_profile_id;
	}

	public void setParent_profile_id(Long parent_profile_id) {
		this.parent_profile_id = parent_profile_id;
	}

	public Integer getApplication_mode() {
		return application_mode;
	}

	public void setApplication_mode(Integer application_mode) {
		this.application_mode = application_mode;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Integer getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(Integer language_id) {
		this.language_id = language_id;
	}

	public Integer getCountry() {
		return country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getCompany_established_date() {
		return company_established_date;
	}

	public void setCompany_established_date(Date company_established_date) {
		this.company_established_date = company_established_date;
	}

	public Integer getEmail_notification() {
		return email_notification;
	}

	public void setEmail_notification(Integer email_notification) {
		this.email_notification = email_notification;
	}

	public String getNotification_email_id() {
		return notification_email_id;
	}

	public void setNotification_email_id(String notification_email_id) {
		this.notification_email_id = notification_email_id;
	}

	public Integer getSms_notification() {
		return sms_notification;
	}

	public void setSms_notification(Integer sms_notification) {
		this.sms_notification = sms_notification;
	}

	public String getSms_numbers() {
		return sms_numbers;
	}

	public void setSms_numbers(String sms_numbers) {
		this.sms_numbers = sms_numbers;
	}

	public String getContact_number_1() {
		return contact_number_1;
	}

	public void setContact_number_1(String contact_number_1) {
		this.contact_number_1 = contact_number_1;
	}

	public String getContact_number_2() {
		return contact_number_2;
	}

	public void setContact_number_2(String contact_number_2) {
		this.contact_number_2 = contact_number_2;
	}

	public String getContact_email_id() {
		return contact_email_id;
	}

	public void setContact_email_id(String contact_email_id) {
		this.contact_email_id = contact_email_id;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public String getModify_user() {
		return modify_user;
	}

	public void setModify_user(String modify_user) {
		this.modify_user = modify_user;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getModify_date() {
		return modify_date;
	}

	public void setModify_date(Date modify_date) {
		this.modify_date = modify_date;
	}

	public Integer getEntity_id() {
		return entity_id;
	}

	public void setEntity_id(Integer entity_id) {
		this.entity_id = entity_id;
	}

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public String getVat_no() {
		return vat_no;
	}

	public void setVat_no(String vat_no) {
		this.vat_no = vat_no;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Integer getSubscriber_sub_category() {
		return subscriber_sub_category;
	}

	public void setSubscriber_sub_category(Integer subscriber_sub_category) {
		this.subscriber_sub_category = subscriber_sub_category;
	}

	public String getOp_param_1() {
		return op_param_1;
	}

	public void setOp_param_1(String op_param_1) {
		this.op_param_1 = op_param_1;
	}

	public String getOp_param_2() {
		return op_param_2;
	}

	public void setOp_param_2(String op_param_2) {
		this.op_param_2 = op_param_2;
	}

	public String getOp_param_3() {
		return op_param_3;
	}

	public void setOp_param_3(String op_param_3) {
		this.op_param_3 = op_param_3;
	}

	public String getOp_param_4() {
		return op_param_4;
	}

	public void setOp_param_4(String op_param_4) {
		this.op_param_4 = op_param_4;
	}

	public String getOp_param_5() {
		return op_param_5;
	}

	public void setOp_param_5(String op_param_5) {
		this.op_param_5 = op_param_5;
	}

	public String getOp_param_6() {
		return op_param_6;
	}

	public void setOp_param_6(String op_param_6) {
		this.op_param_6 = op_param_6;
	}

	public String getOp_param_7() {
		return op_param_7;
	}

	public void setOp_param_7(String op_param_7) {
		this.op_param_7 = op_param_7;
	}

	public String getOp_param_8() {
		return op_param_8;
	}

	public void setOp_param_8(String op_param_8) {
		this.op_param_8 = op_param_8;
	}

	public String getOp_param_9() {
		return op_param_9;
	}

	public void setOp_param_9(String op_param_9) {
		this.op_param_9 = op_param_9;
	}

	public String getOp_param_10() {
		return op_param_10;
	}

	public void setOp_param_10(String op_param_10) {
		this.op_param_10 = op_param_10;
	}

	public String getFirst_name_ol() {
		return first_name_ol;
	}

	public void setFirst_name_ol(String first_name_ol) {
		this.first_name_ol = first_name_ol;
	}

	public String getMiddle_name_ol() {
		return middle_name_ol;
	}

	public void setMiddle_name_ol(String middle_name_ol) {
		this.middle_name_ol = middle_name_ol;
	}

	public String getLast_name_ol() {
		return last_name_ol;
	}

	public void setLast_name_ol(String last_name_ol) {
		this.last_name_ol = last_name_ol;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getDeactivation_date() {
		return deactivation_date;
	}

	public void setDeactivation_date(Date deactivation_date) {
		this.deactivation_date = deactivation_date;
	}

	//private String short_name;
	

}
