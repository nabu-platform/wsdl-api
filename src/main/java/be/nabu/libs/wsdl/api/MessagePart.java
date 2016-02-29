package be.nabu.libs.wsdl.api;

import be.nabu.libs.types.api.Element;
import be.nabu.libs.types.api.Type;

/**
 * The "name" of the message part allows you to reference it
 * It is only really used in RPC though, in document style we use the name of the element
 */
public interface MessagePart extends Fragment {
	/**
	 * In document style, we define an element
	 */
	public Element<?> getElement();
	/**
	 * In RPC style we define a type
	 */
	public Type getType();
}
