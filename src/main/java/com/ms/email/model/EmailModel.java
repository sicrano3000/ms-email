package com.ms.email.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ms.email.enums.StatusEmail;

@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {

	private static final long serialVersionUID = -3268973120166342678L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long emailId;
	
	private String ownerRef;
	
	private String emailFrom;
	
	private String emailTo;
	
	private String subject;
	
	@Column(columnDefinition = "TEXT")
	private String text;
	
	private LocalDateTime sendDateEmail;
	
	private StatusEmail statusEmail;
	
	public EmailModel() {
	}
	
	public EmailModel(Long emailId, String ownerRef, String emailFrom, String emailTo, String subject, String text,
			LocalDateTime sendDateEmail, StatusEmail statusEmail) {
		this.emailId = emailId;
		this.ownerRef = ownerRef;
		this.emailFrom = emailFrom;
		this.emailTo = emailTo;
		this.subject = subject;
		this.text = text;
		this.sendDateEmail = sendDateEmail;
		this.statusEmail = statusEmail;
	}

	public Long getEmailId() {
		return emailId;
	}
	public void setEmailId(Long emailId) {
		this.emailId = emailId;
	}

	public String getOwnerRef() {
		return ownerRef;
	}
	public void setOwnerRef(String ownerRef) {
		this.ownerRef = ownerRef;
	}

	public String getEmailFrom() {
		return emailFrom;
	}
	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}
	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getSendDateEmail() {
		return sendDateEmail;
	}
	public void setSendDateEmail(LocalDateTime sendDateEmail) {
		this.sendDateEmail = sendDateEmail;
	}

	public StatusEmail getStatusEmail() {
		return statusEmail;
	}
	public void setStatusEmail(StatusEmail statusEmail) {
		this.statusEmail = statusEmail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailFrom == null) ? 0 : emailFrom.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((emailTo == null) ? 0 : emailTo.hashCode());
		result = prime * result + ((ownerRef == null) ? 0 : ownerRef.hashCode());
		result = prime * result + ((sendDateEmail == null) ? 0 : sendDateEmail.hashCode());
		result = prime * result + ((statusEmail == null) ? 0 : statusEmail.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		EmailModel other = (EmailModel) obj;
		if (emailFrom == null) {
			if (other.emailFrom != null)
				return false;
		} else if (!emailFrom.equals(other.emailFrom))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (emailTo == null) {
			if (other.emailTo != null)
				return false;
		} else if (!emailTo.equals(other.emailTo))
			return false;
		if (ownerRef == null) {
			if (other.ownerRef != null)
				return false;
		} else if (!ownerRef.equals(other.ownerRef))
			return false;
		if (sendDateEmail == null) {
			if (other.sendDateEmail != null)
				return false;
		} else if (!sendDateEmail.equals(other.sendDateEmail))
			return false;
		if (statusEmail != other.statusEmail)
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmailModel [emailId=" + emailId + ", ownerRef=" + ownerRef + ", emailFrom=" + emailFrom + ", emailTo="
				+ emailTo + ", subject=" + subject + ", text=" + text + ", sendDateEmail=" + sendDateEmail
				+ ", statusEmail=" + statusEmail + "]";
	}
	
}
