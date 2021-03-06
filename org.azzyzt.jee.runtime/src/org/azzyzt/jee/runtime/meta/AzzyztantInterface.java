package org.azzyzt.jee.runtime.meta;

import org.azzyzt.jee.runtime.util.AuthorizationInterface;
import org.azzyzt.jee.runtime.util.StringConverterInterface;

public interface AzzyztantInterface {

	public StringConverterInterface getUsernameConverter();
	
	public AuthorizationInterface getAuthorizer();
	
}
