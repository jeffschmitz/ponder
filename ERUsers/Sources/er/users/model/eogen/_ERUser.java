// DO NOT EDIT.  Make changes to er.users.model.ERUser.java instead.
package er.users.model.eogen;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

import er.extensions.eof.*;
import er.extensions.foundation.*;


@SuppressWarnings("all")
public abstract class _ERUser extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "ERUser";

  // Attributes
  public static final ERXKey<String> ACTIVATE_USER_TOKEN = new ERXKey<String>("activateUserToken");
  public static final String ACTIVATE_USER_TOKEN_KEY = ACTIVATE_USER_TOKEN.key();
  public static final ERXKey<er.users.model.enums.ERUserActivationStatus> ACTIVATION_STATUS = new ERXKey<er.users.model.enums.ERUserActivationStatus>("activationStatus");
  public static final String ACTIVATION_STATUS_KEY = ACTIVATION_STATUS.key();
  public static final ERXKey<org.joda.time.DateTime> DATE_CREATED = new ERXKey<org.joda.time.DateTime>("dateCreated");
  public static final String DATE_CREATED_KEY = DATE_CREATED.key();
  public static final ERXKey<String> PASSWORD = new ERXKey<String>("password");
  public static final String PASSWORD_KEY = PASSWORD.key();
  public static final ERXKey<org.joda.time.DateTime> RESET_REQUEST_DATE = new ERXKey<org.joda.time.DateTime>("resetRequestDate");
  public static final String RESET_REQUEST_DATE_KEY = RESET_REQUEST_DATE.key();
  public static final ERXKey<String> RESET_TOKEN = new ERXKey<String>("resetToken");
  public static final String RESET_TOKEN_KEY = RESET_TOKEN.key();
  public static final ERXKey<String> SUBTYPE = new ERXKey<String>("subtype");
  public static final String SUBTYPE_KEY = SUBTYPE.key();
  public static final ERXKey<String> USERNAME = new ERXKey<String>("username");
  public static final String USERNAME_KEY = USERNAME.key();

  // Relationships
  public static final ERXKey<er.users.model.ERChallengeResponse> CHALLENGE_RESPONSES = new ERXKey<er.users.model.ERChallengeResponse>("challengeResponses");
  public static final String CHALLENGE_RESPONSES_KEY = CHALLENGE_RESPONSES.key();
  public static final ERXKey<er.users.model.ERCredential> CREDENTIALS = new ERXKey<er.users.model.ERCredential>("credentials");
  public static final String CREDENTIALS_KEY = CREDENTIALS.key();
  public static final ERXKey<er.corebl.model.ERCMailAddress> MAIL_ADDRESS = new ERXKey<er.corebl.model.ERCMailAddress>("mailAddress");
  public static final String MAIL_ADDRESS_KEY = MAIL_ADDRESS.key();
  public static final ERXKey<er.corebl.model.ERCPreference> PREFERENCES = new ERXKey<er.corebl.model.ERCPreference>("preferences");
  public static final String PREFERENCES_KEY = PREFERENCES.key();
  public static final ERXKey<er.auth.model.ERRole> ROLES = new ERXKey<er.auth.model.ERRole>("roles");
  public static final String ROLES_KEY = ROLES.key();

  public static class _ERUserClazz<T extends er.users.model.ERUser> extends ERXGenericRecord.ERXGenericRecordClazz<T> {
    /* more clazz methods here */
  }

  private static final Logger LOG = Logger.getLogger(_ERUser.class);

  public er.users.model.ERUser.ERUserClazz clazz() {
    return er.users.model.ERUser.clazz;
  }
  
  public String activateUserToken() {
    return (String) storedValueForKey(_ERUser.ACTIVATE_USER_TOKEN_KEY);
  }

  public void setActivateUserToken(String value) {
    if (_ERUser.LOG.isDebugEnabled()) {
    	_ERUser.LOG.debug( "updating activateUserToken from " + activateUserToken() + " to " + value);
    }
    takeStoredValueForKey(value, _ERUser.ACTIVATE_USER_TOKEN_KEY);
  }

  public er.users.model.enums.ERUserActivationStatus activationStatus() {
    return (er.users.model.enums.ERUserActivationStatus) storedValueForKey(_ERUser.ACTIVATION_STATUS_KEY);
  }

  public void setActivationStatus(er.users.model.enums.ERUserActivationStatus value) {
    if (_ERUser.LOG.isDebugEnabled()) {
    	_ERUser.LOG.debug( "updating activationStatus from " + activationStatus() + " to " + value);
    }
    takeStoredValueForKey(value, _ERUser.ACTIVATION_STATUS_KEY);
  }

  public org.joda.time.DateTime dateCreated() {
    return (org.joda.time.DateTime) storedValueForKey(_ERUser.DATE_CREATED_KEY);
  }

  public void setDateCreated(org.joda.time.DateTime value) {
    if (_ERUser.LOG.isDebugEnabled()) {
    	_ERUser.LOG.debug( "updating dateCreated from " + dateCreated() + " to " + value);
    }
    takeStoredValueForKey(value, _ERUser.DATE_CREATED_KEY);
  }

  public String password() {
    return (String) storedValueForKey(_ERUser.PASSWORD_KEY);
  }

  public void setPassword(String value) {
    if (_ERUser.LOG.isDebugEnabled()) {
    	_ERUser.LOG.debug( "updating password from " + password() + " to " + value);
    }
    takeStoredValueForKey(value, _ERUser.PASSWORD_KEY);
  }

  public org.joda.time.DateTime resetRequestDate() {
    return (org.joda.time.DateTime) storedValueForKey(_ERUser.RESET_REQUEST_DATE_KEY);
  }

  public void setResetRequestDate(org.joda.time.DateTime value) {
    if (_ERUser.LOG.isDebugEnabled()) {
    	_ERUser.LOG.debug( "updating resetRequestDate from " + resetRequestDate() + " to " + value);
    }
    takeStoredValueForKey(value, _ERUser.RESET_REQUEST_DATE_KEY);
  }

  public String resetToken() {
    return (String) storedValueForKey(_ERUser.RESET_TOKEN_KEY);
  }

  public void setResetToken(String value) {
    if (_ERUser.LOG.isDebugEnabled()) {
    	_ERUser.LOG.debug( "updating resetToken from " + resetToken() + " to " + value);
    }
    takeStoredValueForKey(value, _ERUser.RESET_TOKEN_KEY);
  }

  public String subtype() {
    return (String) storedValueForKey(_ERUser.SUBTYPE_KEY);
  }

  public void setSubtype(String value) {
    if (_ERUser.LOG.isDebugEnabled()) {
    	_ERUser.LOG.debug( "updating subtype from " + subtype() + " to " + value);
    }
    takeStoredValueForKey(value, _ERUser.SUBTYPE_KEY);
  }

  public String username() {
    return (String) storedValueForKey(_ERUser.USERNAME_KEY);
  }

  public void setUsername(String value) {
    if (_ERUser.LOG.isDebugEnabled()) {
    	_ERUser.LOG.debug( "updating username from " + username() + " to " + value);
    }
    takeStoredValueForKey(value, _ERUser.USERNAME_KEY);
  }

  public er.corebl.model.ERCMailAddress mailAddress() {
    return (er.corebl.model.ERCMailAddress)storedValueForKey(_ERUser.MAIL_ADDRESS_KEY);
  }
  
  public void setMailAddress(er.corebl.model.ERCMailAddress value) {
    takeStoredValueForKey(value, _ERUser.MAIL_ADDRESS_KEY);
  }

  public void setMailAddressRelationship(er.corebl.model.ERCMailAddress value) {
    if (_ERUser.LOG.isDebugEnabled()) {
      _ERUser.LOG.debug("updating mailAddress from " + mailAddress() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setMailAddress(value);
    }
    else if (value == null) {
    	er.corebl.model.ERCMailAddress oldValue = mailAddress();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _ERUser.MAIL_ADDRESS_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _ERUser.MAIL_ADDRESS_KEY);
    }
  }
  public NSArray<er.users.model.ERChallengeResponse> challengeResponses() {
    return (NSArray<er.users.model.ERChallengeResponse>)storedValueForKey(_ERUser.CHALLENGE_RESPONSES_KEY);
  }

  public NSArray<er.users.model.ERChallengeResponse> challengeResponses(EOQualifier qualifier) {
    return challengeResponses(qualifier, null, false);
  }

  public NSArray<er.users.model.ERChallengeResponse> challengeResponses(EOQualifier qualifier, boolean fetch) {
    return challengeResponses(qualifier, null, fetch);
  }

  public NSArray<er.users.model.ERChallengeResponse> challengeResponses(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<er.users.model.ERChallengeResponse> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(er.users.model.ERChallengeResponse.USER_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = er.users.model.ERChallengeResponse.clazz.objectsMatchingQualifier(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = challengeResponses();
      if (qualifier != null) {
        results = (NSArray<er.users.model.ERChallengeResponse>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<er.users.model.ERChallengeResponse>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToChallengeResponses(er.users.model.ERChallengeResponse object) {
    includeObjectIntoPropertyWithKey(object, _ERUser.CHALLENGE_RESPONSES_KEY);
  }

  public void removeFromChallengeResponses(er.users.model.ERChallengeResponse object) {
    excludeObjectFromPropertyWithKey(object, _ERUser.CHALLENGE_RESPONSES_KEY);
  }

  public void addToChallengeResponsesRelationship(er.users.model.ERChallengeResponse object) {
    if (_ERUser.LOG.isDebugEnabled()) {
      _ERUser.LOG.debug("adding " + object + " to challengeResponses relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToChallengeResponses(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _ERUser.CHALLENGE_RESPONSES_KEY);
    }
  }

  public void removeFromChallengeResponsesRelationship(er.users.model.ERChallengeResponse object) {
    if (_ERUser.LOG.isDebugEnabled()) {
      _ERUser.LOG.debug("removing " + object + " from challengeResponses relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromChallengeResponses(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _ERUser.CHALLENGE_RESPONSES_KEY);
    }
  }

  public er.users.model.ERChallengeResponse createChallengeResponsesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( er.users.model.ERChallengeResponse.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _ERUser.CHALLENGE_RESPONSES_KEY);
    return (er.users.model.ERChallengeResponse) eo;
  }

  public void deleteChallengeResponsesRelationship(er.users.model.ERChallengeResponse object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _ERUser.CHALLENGE_RESPONSES_KEY);
  }

  public void deleteAllChallengeResponsesRelationships() {
    Enumeration<er.users.model.ERChallengeResponse> objects = challengeResponses().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteChallengeResponsesRelationship(objects.nextElement());
    }
  }

  public NSArray<er.users.model.ERCredential> credentials() {
    return (NSArray<er.users.model.ERCredential>)storedValueForKey(_ERUser.CREDENTIALS_KEY);
  }

  public NSArray<er.users.model.ERCredential> credentials(EOQualifier qualifier) {
    return credentials(qualifier, null, false);
  }

  public NSArray<er.users.model.ERCredential> credentials(EOQualifier qualifier, boolean fetch) {
    return credentials(qualifier, null, fetch);
  }

  public NSArray<er.users.model.ERCredential> credentials(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<er.users.model.ERCredential> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(er.users.model.ERCredential.USER_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = er.users.model.ERCredential.clazz.objectsMatchingQualifier(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = credentials();
      if (qualifier != null) {
        results = (NSArray<er.users.model.ERCredential>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<er.users.model.ERCredential>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToCredentials(er.users.model.ERCredential object) {
    includeObjectIntoPropertyWithKey(object, _ERUser.CREDENTIALS_KEY);
  }

  public void removeFromCredentials(er.users.model.ERCredential object) {
    excludeObjectFromPropertyWithKey(object, _ERUser.CREDENTIALS_KEY);
  }

  public void addToCredentialsRelationship(er.users.model.ERCredential object) {
    if (_ERUser.LOG.isDebugEnabled()) {
      _ERUser.LOG.debug("adding " + object + " to credentials relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToCredentials(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _ERUser.CREDENTIALS_KEY);
    }
  }

  public void removeFromCredentialsRelationship(er.users.model.ERCredential object) {
    if (_ERUser.LOG.isDebugEnabled()) {
      _ERUser.LOG.debug("removing " + object + " from credentials relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromCredentials(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _ERUser.CREDENTIALS_KEY);
    }
  }

  public er.users.model.ERCredential createCredentialsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( er.users.model.ERCredential.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _ERUser.CREDENTIALS_KEY);
    return (er.users.model.ERCredential) eo;
  }

  public void deleteCredentialsRelationship(er.users.model.ERCredential object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _ERUser.CREDENTIALS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllCredentialsRelationships() {
    Enumeration<er.users.model.ERCredential> objects = credentials().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteCredentialsRelationship(objects.nextElement());
    }
  }

  public NSArray<er.corebl.model.ERCPreference> preferences() {
    return (NSArray<er.corebl.model.ERCPreference>)storedValueForKey(_ERUser.PREFERENCES_KEY);
  }

  public NSArray<er.corebl.model.ERCPreference> preferences(EOQualifier qualifier) {
    return preferences(qualifier, null);
  }

  public NSArray<er.corebl.model.ERCPreference> preferences(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<er.corebl.model.ERCPreference> results;
      results = preferences();
      if (qualifier != null) {
        results = (NSArray<er.corebl.model.ERCPreference>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<er.corebl.model.ERCPreference>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToPreferences(er.corebl.model.ERCPreference object) {
    includeObjectIntoPropertyWithKey(object, _ERUser.PREFERENCES_KEY);
  }

  public void removeFromPreferences(er.corebl.model.ERCPreference object) {
    excludeObjectFromPropertyWithKey(object, _ERUser.PREFERENCES_KEY);
  }

  public void addToPreferencesRelationship(er.corebl.model.ERCPreference object) {
    if (_ERUser.LOG.isDebugEnabled()) {
      _ERUser.LOG.debug("adding " + object + " to preferences relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToPreferences(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _ERUser.PREFERENCES_KEY);
    }
  }

  public void removeFromPreferencesRelationship(er.corebl.model.ERCPreference object) {
    if (_ERUser.LOG.isDebugEnabled()) {
      _ERUser.LOG.debug("removing " + object + " from preferences relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromPreferences(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _ERUser.PREFERENCES_KEY);
    }
  }

  public er.corebl.model.ERCPreference createPreferencesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( er.corebl.model.ERCPreference.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _ERUser.PREFERENCES_KEY);
    return (er.corebl.model.ERCPreference) eo;
  }

  public void deletePreferencesRelationship(er.corebl.model.ERCPreference object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _ERUser.PREFERENCES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllPreferencesRelationships() {
    Enumeration<er.corebl.model.ERCPreference> objects = preferences().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePreferencesRelationship(objects.nextElement());
    }
  }

  public NSArray<er.auth.model.ERRole> roles() {
    return (NSArray<er.auth.model.ERRole>)storedValueForKey(_ERUser.ROLES_KEY);
  }

  public NSArray<er.auth.model.ERRole> roles(EOQualifier qualifier) {
    return roles(qualifier, null);
  }

  public NSArray<er.auth.model.ERRole> roles(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<er.auth.model.ERRole> results;
      results = roles();
      if (qualifier != null) {
        results = (NSArray<er.auth.model.ERRole>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<er.auth.model.ERRole>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToRoles(er.auth.model.ERRole object) {
    includeObjectIntoPropertyWithKey(object, _ERUser.ROLES_KEY);
  }

  public void removeFromRoles(er.auth.model.ERRole object) {
    excludeObjectFromPropertyWithKey(object, _ERUser.ROLES_KEY);
  }

  public void addToRolesRelationship(er.auth.model.ERRole object) {
    if (_ERUser.LOG.isDebugEnabled()) {
      _ERUser.LOG.debug("adding " + object + " to roles relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToRoles(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _ERUser.ROLES_KEY);
    }
  }

  public void removeFromRolesRelationship(er.auth.model.ERRole object) {
    if (_ERUser.LOG.isDebugEnabled()) {
      _ERUser.LOG.debug("removing " + object + " from roles relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromRoles(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _ERUser.ROLES_KEY);
    }
  }

  public er.auth.model.ERRole createRolesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( er.auth.model.ERRole.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _ERUser.ROLES_KEY);
    return (er.auth.model.ERRole) eo;
  }

  public void deleteRolesRelationship(er.auth.model.ERRole object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _ERUser.ROLES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllRolesRelationships() {
    Enumeration<er.auth.model.ERRole> objects = roles().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRolesRelationship(objects.nextElement());
    }
  }


}
