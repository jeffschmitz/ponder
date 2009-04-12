package er.r2d2w.components;

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.directtoweb.D2WContext;
import com.webobjects.directtoweb.ERD2WUtilities;
import com.webobjects.foundation.NSDictionary;

import er.directtoweb.components.ERD2WStatelessComponent;
import er.directtoweb.pages.ERD2WListPage;
import er.extensions.foundation.ERXValueUtilities;
import er.r2d2w.R2D2WDirectAction;

public class R2DRSSLink extends ERD2WStatelessComponent {

	public R2DRSSLink(WOContext context) {
        super(context);
    }

    public boolean displayRSSLink() {
    	D2WContext c = d2wContext();
		if(c != null && "list".equals(c.task()) && 
				ERXValueUtilities.booleanValue(c.valueForKey("shouldDisplayRSS"))) {
			return true;
		}
		return false;
	}

	public String directActionName() {
		return "RSS" + d2wContext().entity().name();
	}

	public NSDictionary<String, Object> queryDictionary() {
		ERD2WListPage lp = (ERD2WListPage)ERD2WUtilities.parentListPage(this);
		WODisplayGroup dg = lp.displayGroup();
		return R2D2WDirectAction.queryDictionaryForListPage(dg.dataSource(), dg.sortOrderings());
	}

	public String rssLink() {
		return context().directActionURLForActionNamed(directActionName(), queryDictionary(), false, 0, true);
	}
}