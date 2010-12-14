package er.r2d2w.components.misc;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;

import er.extensions.appserver.navigation.ERXNavigationMenuItem;

public class R2DNavigationMenuItem extends ERXNavigationMenuItem {
    public R2DNavigationMenuItem(WOContext context) {
        super(context);
    }

	@SuppressWarnings("unchecked")
	public NSDictionary<String, String> queryDictionary() {
		NSMutableDictionary<String, String> queryDictionary = 
			navigationItem().queryBindings().mutableClone();
		queryDictionary.setObjectForKey(context().contextID(), "__cid");
		return queryDictionary;
	}

	public WOActionResults action() {
		WOActionResults result = 
			(WOActionResults)valueForKeyPath(navigationItem().action());
		return result;
	}

	public boolean hasDirectAction() {
		String actionClass = navigationItem().directActionClass();
		String directActionName = navigationItem().directActionName();
		return (directActionName != null && directActionName.trim().length() > 0) 
			|| (actionClass != null && actionClass.trim().length() > 0) ;
	}
	
}