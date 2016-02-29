package be.nabu.libs.wsdl.api;

import org.w3c.dom.Element;

public interface PolicyProviderBinding {
	public PolicyProvider parse(Element element);
	public void format(PolicyProvider instance, Element parent);
}
