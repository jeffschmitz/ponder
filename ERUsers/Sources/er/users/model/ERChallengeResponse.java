package er.users.model;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSValidation;

import er.extensions.validation.ERXValidationException;
import er.extensions.validation.ERXValidationFactory;
import er.users.ERUsers;

public class ERChallengeResponse extends er.users.model.eogen._ERChallengeResponse {
	/**
	 * Do I need to update serialVersionUID? See section 5.6 <cite>Type Changes
	 * Affecting Serialization</cite> on page 51 of the <a
	 * href="http://java.sun.com/j2se/1.4/pdf/serial-spec.pdf">Java Object
	 * Serialization Spec</a>
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(ERChallengeResponse.class);

	public static final String CLEAR_ANSWER_KEY = "clearAnswer";
	
	public static final String VERIFY_ANSWER_KEY = "verifyAnswer";
	
	public static final String VERIFY_ANSWER_MATCHES = "verifyAnswerMatches";
	
	private transient String _verifyAnswer;

	public static final ERChallengeResponseClazz<ERChallengeResponse> clazz = new ERChallengeResponseClazz<ERChallengeResponse>();

	public static class ERChallengeResponseClazz<T extends ERChallengeResponse> extends
			er.users.model.eogen._ERChallengeResponse._ERChallengeResponseClazz<T> {
		/* more clazz methods here */
	}

	/**
	 * Initializes the EO. This is called when an EO is created, not when it is
	 * inserted into an EC.
	 */
	public void init(EOEditingContext ec) {
		super.init(ec);
	}

	/**
	 * Set's the answer to the challenge response from the clear text answer.
	 * This should only be set once.
	 * 
	 * @param clearAnswer
	 *            the clear text answer
	 */
	public void setClearAnswer(String clearAnswer) {
		log.debug("setting answer");
		if(answer() != null) {
			throw new IllegalArgumentException("The answer for this challenge response is already set: " + this);
		}
		String answer = ERUsers.sharedInstance().hashedPlaintext(clearAnswer);
		setAnswer(answer);
	}
	
	/**
	 * Sets the verifyAnswer
	 * @param value
	 */
	public void setVerifyAnswer(String verifyAnswer) {
		willChange();
		_verifyAnswer = verifyAnswer;
	}

	/**
	 * Overridden to handle requests for clearAnswer and verifyAnswer.
	 * @return null for clearAnswer or verifyAnswer
	 * @throws UnknownKeyException
	 */
	public Object handleQueryWithUnboundKey(String key) {
		if(CLEAR_ANSWER_KEY.equals(key) || VERIFY_ANSWER_KEY.equals(key)) {
			return null;
		}
		return super.handleQueryWithUnboundKey(key);
	}

	/**
	 * @param clearAnswer
	 *            the clear text answer to compare
	 * @return true if the hashing clearAnswer matches the stored hash
	 */
	public boolean hashMatches(String clearAnswer) {
		return ERUsers.sharedInstance().hashMatches(clearAnswer, answer());
	}
	
	/**
	 * Determines if the verify answer is not null and matches the hashed answer
	 * @param verifyAnswer the plain text answer
	 * @return true if the answer matches
	 */
	public boolean verifyAnswerMatches() {
		return !StringUtils.isBlank(_verifyAnswer) && hashMatches(_verifyAnswer);
	}

	/**
	 * Ensures that the clear answer is not null or empty.
	 * 
	 * @param clearAnswer the plain text answer
	 * @return the clearAnswer
	 * @throws NSValidation.ValidationException
	 */
	public String validateClearAnswer(String clearAnswer) {
		ERXValidationFactory factory = ERXValidationFactory.defaultFactory();
		if(!isNewObject()) {
			ERXValidationException ex = factory.createCustomException(this, "AnswerNotModifiableException");
			throw ex;
		}
		if(StringUtils.isBlank(clearAnswer)) {
			ERXValidationException ex = factory.createException(this, CLEAR_ANSWER_KEY, clearAnswer, ERXValidationException.NullPropertyException);
			throw ex;
		}
		return clearAnswer;
	}
}
