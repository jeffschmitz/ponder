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
  public static final ERXKey<org.joda.time.DateTime> DATE_CREATED = new ERXKey<org.joda.time.DateTime>("dateCreated");
  public static final String DATE_CREATED_KEY = DATE_CREATED.key();
  public static final ERXKey<String> EMAIL_ADDRESS = new ERXKey<String>("emailAddress");
  public static final String EMAIL_ADDRESS_KEY = EMAIL_ADDRESS.key();
  public static final ERXKey<org.joda.time.DateTime> LAST_SEEN = new ERXKey<org.joda.time.DateTime>("lastSeen");
  public static final String LAST_SEEN_KEY = LAST_SEEN.key();
  public static final ERXKey<String> PASSWORD = new ERXKey<String>("password");
  public static final String PASSWORD_KEY = PASSWORD.key();
  public static final ERXKey<String> SALT = new ERXKey<String>("salt");
  public static final String SALT_KEY = SALT.key();
  public static final ERXKey<String> USERNAME = new ERXKey<String>("username");
  public static final String USERNAME_KEY = USERNAME.key();

  // Relationships
  public static final ERXKey<er.users.model.ERChallengeResponse> CHALLENGE_RESPONSES = new ERXKey<er.users.model.ERChallengeResponse>("challengeResponses");
  public static final String CHALLENGE_RESPONSES_KEY = CHALLENGE_RESPONSES.key();
  public static final ERXKey<er.users.model.ERCredential> CREDENTIALS = new ERXKey<er.users.model.ERCredential>("credentials");
  public static final String CREDENTIALS_KEY = CREDENTIALS.key();
  public static final ERXKey<er.users.model.ERResetRequest> RESET_REQUESTS = new ERXKey<er.users.model.ERResetRequest>("resetRequests");
  public static final String RESET_REQUESTS_KEY = RESET_REQUESTS.key();

  public static class _ERUserClazz<T extends er.users.model.ERUser> extends ERXGenericRecord.ERXGenericRecordClazz<T> {
    /* more clazz methods here */
  }

  private static final Logger LOG = Logger.getLogger(_ERUser.class);

  public er.users.model.ERUser.ERUserClazz clazz() {
    return er.users.model.ERUser.clazz;
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

  public String emailAddress() {
    return (String) storedValueForKey(_ERUser.EMAIL_ADDRESS_KEY);
  }

  public void setEmailAddress(String value) {
    if (_ERUser.LOG.isDebugEnabled()) {
    	_ERUser.LOG.debug( "updating emailAddress from " + emailAddress() + " to " + value);
    }
    takeStoredValueForKey(value, _ERUser.EMAIL_ADDRESS_KEY);
  }

  public org.joda.time.DateTime lastSeen() {
    return (org.joda.time.DateTime) storedValueForKey(_ERUser.LAST_SEEN_KEY);
  }

  public void setLastSeen(org.joda.time.DateTime value) {
    if (_ERUser.LOG.isDebugEnabled()) {
    	_ERUser.LOG.debug( "updating lastSeen from " + lastSeen() + " to " + value);
    }
    takeStoredValueForKey(value, _ERUser.LAST_SEEN_KEY);
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

  public String salt() {
    return (String) storedValueForKey(_ERUser.SALT_KEY);
  }

  public void setSalt(String value) {
    if (_ERUser.LOG.isDebugEnabled()) {
    	_ERUser.LOG.debug( "updating salt from " + salt() + " to " + value);
    }
    takeStoredValueForKey(value, _ERUser.SALT_KEY);
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

  public NSArray<er.users.model.ERResetRequest> resetRequests() {
    return (NSArray<er.users.model.ERResetRequest>)storedValueForKey(_ERUser.RESET_REQUESTS_KEY);
  }

  public NSArray<er.users.model.ERResetRequest> resetRequests(EOQualifier qualifier) {
    return resetRequests(qualifier, null, false);
  }

  public NSArray<er.users.model.ERResetRequest> resetRequests(EOQualifier qualifier, boolean fetch) {
    return resetRequests(qualifier, null, fetch);
  }

  public NSArray<er.users.model.ERResetRequest> resetRequests(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<er.users.model.ERResetRequest> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(er.users.model.ERResetRequest.USER_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = er.users.model.ERResetRequest.clazz.objectsMatchingQualifier(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = resetRequests();
      if (qualifier != null) {
        results = (NSArray<er.users.model.ERResetRequest>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<er.users.model.ERResetRequest>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToResetRequests(er.users.model.ERResetRequest object) {
    includeObjectIntoPropertyWithKey(object, _ERUser.RESET_REQUESTS_KEY);
  }

  public void removeFromResetRequests(er.users.model.ERResetRequest object) {
    excludeObjectFromPropertyWithKey(object, _ERUser.RESET_REQUESTS_KEY);
  }

  public void addToResetRequestsRelationship(er.users.model.ERResetRequest object) {
    if (_ERUser.LOG.isDebugEnabled()) {
      _ERUser.LOG.debug("adding " + object + " to resetRequests relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToResetRequests(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _ERUser.RESET_REQUESTS_KEY);
    }
  }

  public void removeFromResetRequestsRelationship(er.users.model.ERResetRequest object) {
    if (_ERUser.LOG.isDebugEnabled()) {
      _ERUser.LOG.debug("removing " + object + " from resetRequests relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromResetRequests(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _ERUser.RESET_REQUESTS_KEY);
    }
  }

  public er.users.model.ERResetRequest createResetRequestsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( er.users.model.ERResetRequest.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _ERUser.RESET_REQUESTS_KEY);
    return (er.users.model.ERResetRequest) eo;
  }

  public void deleteResetRequestsRelationship(er.users.model.ERResetRequest object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _ERUser.RESET_REQUESTS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllResetRequestsRelationships() {
    Enumeration<er.users.model.ERResetRequest> objects = resetRequests().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteResetRequestsRelationship(objects.nextElement());
    }
  }


}