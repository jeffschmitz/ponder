package er.awsplugin.enums;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSForwardException;
import com.webobjects.foundation.NSTimestamp;

import er.awsplugin.model.SESBounceNotification;
import er.awsplugin.model.SESComplaintNotification;
import er.corebl.mail.ERCMailStopReason;
import er.corebl.model.ERCMailAddress;
import er.corebl.model.ERCMailMessage;

public enum SESNotificationType {
	BOUNCE(ERCMailStopReason.BOUNCED) {
		@Override
		public void createNotificationRecords(EOEditingContext ec, NSDictionary<String, Object> json) {
			NSArray<NSDictionary<String, Object>> recipients = 
					(NSArray<NSDictionary<String, Object>>) json.valueForKeyPath("bounce.bouncedRecipients");
			SimpleDateFormat format = new SimpleDateFormat(JSON_DATE_FORMAT_STRING);
			
			for(NSDictionary<String, Object> recipientDict : recipients) {
				SESBounceNotification notification = SESBounceNotification.clazz.createAndInsertObject(ec);
				String email = (String) recipientDict.valueForKey("emailAddress");
				ERCMailAddress address = ERCMailAddress.clazz.addressForEmailString(ec, email);
				address.setStopReason(reasonForType());
				notification.setMailAddressRelationship(address);
				email = (String) json.valueForKeyPath("mail.source");
				address = ERCMailAddress.clazz.addressForEmailString(ec, email);
				notification.setSourceAddressRelationship(address);

				notification.setStatus((String) recipientDict.valueForKey("status"));
				notification.setAction((String) recipientDict.valueForKey("action"));
				notification.setDiagnosticCode((String) recipientDict.valueForKey("diagnosticCode"));
				notification.setReportingMTA((String) json.valueForKeyPath("bounce.reportingMTA"));
				notification.setBounceType((String) json.valueForKeyPath("bounce.bounceType"));
				notification.setBounceSubType((String) json.valueForKeyPath("bounce.bounceSubType"));

				notification.setAwsFeedbackID((String) json.valueForKeyPath("bounce.feedbackId"));
				String messageId = (String) json.valueForKeyPath("mail.messageId");
				notification.setAwsMessageID(messageId);
				ERCMailMessage message = ERCMailMessage.clazz.objectMatchingKeyAndValue(ec, ERCMailMessage.MESSAGE_ID_KEY, messageId);
				notification.setMailMessageRelationship(message);
				String dateString = (String) json.valueForKeyPath("bounce.timestamp");
				Date date;
				try {
					date = format.parse(dateString);
				} catch (ParseException e) {
					throw NSForwardException._runtimeExceptionForThrowable(e);
				}
				notification.setNotificationTimestamp(new NSTimestamp(date));
				dateString = (String) json.valueForKeyPath("mail.timestamp");
				try {
					date = format.parse(dateString);
				} catch (ParseException e) {
					throw NSForwardException._runtimeExceptionForThrowable(e);
				}
				notification.setMailTimestamp(new NSTimestamp(date));
			}
		}
	},
	COMPLAINT(ERCMailStopReason.COMPLAINT) {
		@Override
		public void createNotificationRecords(EOEditingContext ec, NSDictionary<String, Object> json) {
			NSArray<NSDictionary<String, Object>> recipients = 
					(NSArray<NSDictionary<String, Object>>) json.valueForKeyPath("complaint.complainedRecipients");
			SimpleDateFormat format = new SimpleDateFormat(JSON_DATE_FORMAT_STRING);
			
			for(NSDictionary<String, Object> recipientDict : recipients) {
				SESComplaintNotification notification = SESComplaintNotification.clazz.createAndInsertObject(ec);
				String email = (String) recipientDict.valueForKey("emailAddress");
				ERCMailAddress address = ERCMailAddress.clazz.addressForEmailString(ec, email);
				address.setStopReason(reasonForType());
				notification.setMailAddressRelationship(address);
				email = (String) json.valueForKeyPath("mail.source");
				address = ERCMailAddress.clazz.addressForEmailString(ec, email);
				notification.setSourceAddressRelationship(address);
				
				notification.setUserAgent((String) json.valueForKeyPath("complaint.userAgent"));
				notification.setComplaintFeedbackType((String) json.valueForKeyPath("complaint.complaintFeedbackType"));
				String dateString = (String) json.valueForKeyPath("complaint.arrivalDate");
				Date date;
				try {
					date = format.parse(dateString);
				} catch (ParseException e) {
					throw NSForwardException._runtimeExceptionForThrowable(e);
				}
				notification.setArrivalDate(new NSTimestamp(date));
				
				notification.setAwsFeedbackID((String) json.valueForKeyPath("complaint.feedbackId"));
				String messageId = (String) json.valueForKeyPath("mail.messageId");
				notification.setAwsMessageID(messageId);
				ERCMailMessage message = ERCMailMessage.clazz.objectMatchingKeyAndValue(ec, ERCMailMessage.MESSAGE_ID_KEY, messageId);
				notification.setMailMessageRelationship(message);
				dateString = (String) json.valueForKeyPath("complaint.timestamp");
				try {
					date = format.parse(dateString);
				} catch (ParseException e) {
					throw NSForwardException._runtimeExceptionForThrowable(e);
				}
				notification.setNotificationTimestamp(new NSTimestamp(date));
				dateString = (String) json.valueForKeyPath("mail.timestamp");
				try {
					date = format.parse(dateString);
				} catch (ParseException e) {
					throw NSForwardException._runtimeExceptionForThrowable(e);
				}
				notification.setMailTimestamp(new NSTimestamp(date));
			}
		}
	};
	
	private static final String JSON_DATE_FORMAT_STRING = "yyyy-MM-ddThh:mm:ss.SSSZ";
	
	private final ERCMailStopReason _reason;
	
	private SESNotificationType(ERCMailStopReason reason) {
		_reason = reason;
	}
	
	public ERCMailStopReason reasonForType() {
		return _reason;
	}

	public abstract void createNotificationRecords(EOEditingContext ec, NSDictionary<String, Object> json);
}
