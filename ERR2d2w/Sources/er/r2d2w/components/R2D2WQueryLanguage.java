package er.r2d2w.components;

import com.webobjects.appserver.WOContext;

import er.directtoweb.components.ERDCustomQueryComponent;

public class R2D2WQueryLanguage extends ERDCustomQueryComponent {
    private String labelID;

	public R2D2WQueryLanguage(WOContext context) {
        super(context);
    }

	public void reset() {
		labelID = null;
		super.reset();
	}
	
	/**
	 * @return the labelID
	 */
	public String labelID() {
		if(labelID == null) {
			labelID = "id" + context().elementID();
		}
		return labelID;
	}

}